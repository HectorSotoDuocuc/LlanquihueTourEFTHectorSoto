package cl.LlanquihueTour.EFT.data;
import cl.LlanquihueTour.EFT.model.Persona;

import java.util.ArrayList;

public class GestorPersonas {
    private ArrayList<Persona> listaPersonas;

    public GestorPersonas() {
        this.listaPersonas = GestorDatos.CargarPersonas();
    }

    // Método para agregar
    public void agregarPersona(Persona p) {
        listaPersonas.add(p);
        GestorDatos.GuardarPersonas(this.listaPersonas); // Guardamos la lista actualizada
    }

    // Método para eliminar
    public void eliminarPersona(String idBuscar) {
        listaPersonas.removeIf(p -> p.getId().equals(idBuscar));
        GestorDatos.GuardarPersonas(this.listaPersonas); // Guardamos la lista actualizada
    }
}

