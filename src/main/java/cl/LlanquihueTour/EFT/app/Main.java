package cl.LlanquihueTour.EFT.app;

import cl.LlanquihueTour.EFT.data.GestorDatos;
import cl.LlanquihueTour.EFT.model.Tours;

import java.util.ArrayList;

public class Main {
    static void main(String[] args) {
        Menu menu = new Menu();
        GestorDatos gestor1 = new GestorDatos();

        ArrayList<Tours> lista = new ArrayList<>();
        Menu.mostarMenu(lista, gestor1);
        }
    }

