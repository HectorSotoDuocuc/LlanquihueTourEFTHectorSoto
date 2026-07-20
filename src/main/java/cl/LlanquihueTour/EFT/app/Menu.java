package cl.LlanquihueTour.EFT.app;

import cl.LlanquihueTour.EFT.data.GestorDatos;
import cl.LlanquihueTour.EFT.model.Direccion;
import cl.LlanquihueTour.EFT.model.Tours;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    static Scanner sn = new Scanner(System.in);

    GestorDatos gestorMenu = new GestorDatos();

public static void mostarMenu(ArrayList<Tours> listaTours, GestorDatos gestorMenu) {
    boolean salir = false;
    while (!salir) {
        System.out.println("Menu Principal");
        System.out.println("1. Agregar Tours");
        System.out.println("2. Eliminar Tours");
        System.out.println("3. Buscar Tours");
        System.out.println("4. Agregar Persona");
        System.out.println("5. Eliminar Persona");
        System.out.println("6. Buscar Persona");
        System.out.println("7. Salir");

        System.out.println("Selecione una Opcion");
        int opcion;
        opcion = sn.nextInt();
        switch (opcion) {
            case 1:
                agregarTour(listaTours);
                break;
            case 2:
                eliminarTour(listaTours,gestorMenu);
                break;
            case 3:
                buscarTour(listaTours);
            case 4:
                System.out.println("Que Tipo de Persona Quiere Agregar:");
                System.out.println("1.Cliente");
                System.out.println("2.Guia");
                System.out.println("3.Proveedor");
                int opcion1;
                opcion1 = sn.nextInt();
                switch (opcion1) {
                    case 1:

                }
        }

    }
}
public static Tours agregarTour(ArrayList<Tours> AgregarLista){
    System.out.println("Ingrese Nuevo Tour");
    System.out.println("ID Del Tour");
    int id = sn.nextInt();
    sn.nextLine();
    System.out.println("Nombre Del Tour");
    String nombre = sn.nextLine();
    System.out.println("Tipo De Tour");
    String tipo = sn.nextLine();
    System.out.println("Dirrecion");
    System.out.println( "Ingresa la calle");
    String calle = sn.nextLine();
    System.out.println( "Ingresa el nuemero de la calle");
    int numero = sn.nextInt();
    sn.nextLine();
    System.out.println( "Ingresa la comuna");
    String comuna = sn.nextLine();
    System.out.println( "Ingresa la Ciudad");
    String ciudad = sn.nextLine();
    System.out.println("Ingrese Precio estimado");
    int precioEstimado = sn.nextInt();
    sn.nextLine();

    Tours nuevoTour = new Tours(id,nombre,tipo,new Direccion(calle,numero,comuna,ciudad),precioEstimado);
    AgregarLista.add(nuevoTour);
    GestorDatos.GuardarTours(AgregarLista);
    return nuevoTour;
    }
    public static void eliminarTour(ArrayList<Tours> Eliminarlista, GestorDatos gestor) {
        System.out.println("Ingrese la id para eliminar el tour:");
        int id = sn.nextInt();
        sn.nextLine();

        Tours eliminado = gestor.eliminarTour(Eliminarlista, id);

        if (eliminado != null){
            System.out.println(eliminado.getId() + eliminado.getNombre() + "Fue eliminado con exito");
        }else {
            System.out.println("No se ha encontrado ningun tour con ese nombre.");
        }
    }
    public static void buscarTour(ArrayList<Tours> listaBuscar){
        System.out.println("Ingrese El ID Del Tour:");
        int idbuscar = sn.nextInt();
        sn.nextLine();

        Tours encontrado = GestorDatos.buscarPanoramaId(listaBuscar, idbuscar);

        if (encontrado !=null) {
            System.out.println("Tour Encontrado:");

            System.out.println(encontrado);
        }else {
            System.out.println("No se ha encontrado ningun Tour con esa id" + idbuscar);
        }
    }

}
