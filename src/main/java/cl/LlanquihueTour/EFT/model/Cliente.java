package cl.LlanquihueTour.EFT.model;

import java.util.ArrayList;

public class Cliente extends Persona{
    private String fechaDeReserva;
    private String tipoDeServicioElegido;

    public Cliente(String rut, String nombre, int edad,Direccion direccion, String fechaDeReserva, String tipoDeServicioElegido) {
        super(rut, nombre, edad,direccion);
        this.fechaDeReserva = fechaDeReserva;
        this.tipoDeServicioElegido = tipoDeServicioElegido;
    }

    public String getFechaDeReserva() {
        return fechaDeReserva;
    }

    public void setFechaDeReserva(String fechaDeReserva) {
        this.fechaDeReserva = fechaDeReserva;
    }

    public String getTipoDeServicioElegido() {
        return tipoDeServicioElegido;
    }

    public void setTipoDeServicioElegido(String tipoDeServicioElegido) {
        this.tipoDeServicioElegido = tipoDeServicioElegido;
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }
}
