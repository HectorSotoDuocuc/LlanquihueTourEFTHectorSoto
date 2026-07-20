package cl.LlanquihueTour.EFT.model;

import cl.LlanquihueTour.EFT.util.RutInvalidoExcepcion;

public class Persona {
    protected String rut;
    protected String nombre;
    protected int edad;
    protected Direccion direccion;

    public Persona(String rut, String nombre, int edad, Direccion direccion) throws RutInvalidoExcepcion {

        if (!rut.matches("[0-9]+-[0-9kK]")) {
            throw new RutInvalidoExcepcion("Formato de Rut Incorrito, Verifique Formato");
        }
        this.rut = rut;
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
}
