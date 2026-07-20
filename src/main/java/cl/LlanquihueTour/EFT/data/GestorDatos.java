package cl.LlanquihueTour.EFT.data;

import cl.LlanquihueTour.EFT.model.Direccion;
import cl.LlanquihueTour.EFT.model.Tours;
import cl.LlanquihueTour.EFT.model.Persona;
import cl.LlanquihueTour.EFT.model.Cliente;
import cl.LlanquihueTour.EFT.model.Guia;
import cl.LlanquihueTour.EFT.model.Proveedor;

import java.io.*;
import java.util.*;
public class GestorDatos {
    private static final String TOURS_FILE = "resources/Tours.txt";
    private static final String PERSONAS_FILE = "resources/Personas.txt";
    public GestorDatos() {crearDirectorio();}

    public void crearDirectorio(){
        File file = new File(TOURS_FILE);
        File file1 = new File(PERSONAS_FILE);
        File carpetaContenedora = file.getParentFile();
        File carpetaContenedora2 = file1.getParentFile();

        if (carpetaContenedora !=null && !carpetaContenedora.exists()) {
            carpetaContenedora.mkdirs();
        }
        if (carpetaContenedora2 !=null && !carpetaContenedora2.exists()) {
            carpetaContenedora2.mkdirs();
        }
        }
        public static void GuardarTours(ArrayList<Tours> listaTours) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(TOURS_FILE))){
            for (Tours tour : listaTours) {
                bw.write(tour.getId() + ";" + tour.getNombre() + ";" + tour.getTipo() + ";" + tour.getDireccion() +
                        ";" + tour.getPrecioEstimado());
                bw.newLine();
            }
            System.out.println("Tours Guardados Con Exitos en el Archivo.");
        }catch (IOException e){
            System.out.println("Ocurrio Un error al Guardar el Tour");
        }
        }
        public static void leer_archivoTours(ArrayList<Tours> lista){
        try {
            BufferedReader leer = new BufferedReader(new BufferedReader(new FileReader("resources/Tours.txt")));
            String linea = "";
            while ((linea = leer.readLine()) != null){
                String[] bloques = linea.split(";");
                int id = Integer.parseInt(bloques[0].trim());
                String nombre = bloques[1].trim();
                String tipo = bloques[2].trim();
                String calle = bloques[3].trim();
                int numero = Integer.parseInt(bloques[4].trim());
                String comuna = bloques[5].trim();
                String cuidad = bloques[6].trim();
                int precioEstimado = Integer.parseInt(bloques[7].trim());

                Tours nuevoTour = new Tours(id,nombre,tipo,new Direccion(calle,numero,comuna,cuidad),precioEstimado);
                lista.add(nuevoTour);
            }
            leer.close();
        }catch (FileNotFoundException e){
            System.out.println("Error no se encuentra el archivo" + e.getMessage());
        }catch (IOException e) {
            System.out.println("Error al leer el archivo " + e.getMessage());
        }
        }
        public static Tours eliminarTour(ArrayList<Tours> lista, int idBuscar){
         lista.removeIf(tr -> tr.getId() == idBuscar);
            GestorDatos.GuardarTours(lista);
            return null;
        }
        public static Tours buscarPanoramaId(ArrayList<Tours> lista, int idBuscar){
        for (Tours tr : lista) {
            if (tr.getId() == idBuscar){
                return tr;
            }
        }
            return null;
        }
    public static void GuardarPersonas(ArrayList<Persona> listaPersonas) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(PERSONAS_FILE))){
            for (Persona p : listaPersonas) {
                String lineaBase = p.getRut() + p.getNombre() + p.getEdad() + p.getDireccion();
                if (p instanceof Cliente) {
                    Cliente c = (Cliente) p;
                    bw.write("Cliente;" + lineaBase + ";" + c.getFechaDeReserva() + ";" + c.getTipoDeServicioElegido());
                }else if (p instanceof Guia) {
                    Guia g = (Guia) p;
                    bw.write("Guia;" + lineaBase + ";" + g.getIdTrabajador() + ";" + g.getTipoDeGuia());
            }else if (p instanceof Proveedor) {
                    Proveedor pr = (Proveedor) p;
                    bw.write("Proveedor:;" + lineaBase + ";" + pr.getTipoDeProducto() + ";" + pr.getTipoDeProveedor());
                }
            }
        }catch (IOException e) {
            System.out.println("Ocurrió un error al guardar los datos en el archivo.");
        }
    }
    }

