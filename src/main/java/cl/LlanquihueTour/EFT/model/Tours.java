package cl.LlanquihueTour.EFT.model;

import cl.LlanquihueTour.EFT.data.GestorDatos;

import java.util.ArrayList;

public class Tours {
    private int id;
    private String nombre;
    private String tipo;
    private Direccion direccion;
    private int precioEstimado;

    private ArrayList<Tours> listaTours;

    public Tours(int id,String nombre, String tipo,Direccion direccion, int precioEstimado) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.direccion = direccion;
        this.precioEstimado = precioEstimado;
        this.listaTours = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public int getPrecioEstimado() {
        return precioEstimado;
    }

    public void setPrecioEstimado(int precioEstimado) {
        this.precioEstimado = precioEstimado;
    }

    public ArrayList<Tours> getListaTours() {
        return listaTours;
    }

    public void setListaTours(ArrayList<Tours> listaTours) {
        this.listaTours = listaTours;
    }
    public void agregarTour(GestorDatos gestor,Tours tours){
        listaTours.add(tours);
        gestor.GuardarTours(this.listaTours);
    }
    public void eliminarTour (GestorDatos gestor,Tours tours){
        listaTours.removeIf(tr -> tr.getNombre().equals(tours.getNombre()));
        gestor.GuardarTours(this.listaTours);
    }
    public  Tours buscarTours(String nombre){
        return listaTours.stream()
                .filter(tr -> tr.getNombre().equals(nombre))
                .findFirst()
                .orElse(null);
    }

}
