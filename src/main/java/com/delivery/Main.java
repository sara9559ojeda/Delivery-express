package com.delivery;

import colecciones.Ejercicios;
import colecciones.Utilidades;
import modelo.Pedido;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Ejercicios.listas();
        Ejercicios.conjunto();
        Ejercicios.mapas();

        List<Pedido> todosPedidos = Arrays.asList(
            new Pedido("Sara", "Pizza", 45),
            new Pedido("María", "Hamburguesa", 30),
            new Pedido("Marta", "Pizza", 60),
            new Pedido("Diego", "Helado", 25)
        );

        System.out.println("\nPedidos de Pizza:");
        Utilidades.filtrar(todosPedidos, p -> p.getProducto().equalsIgnoreCase("Pizza"))
                  .forEach(System.out::println);

        System.out.println("\nPedidos con total > 50:");
        Utilidades.filtrar(todosPedidos, p -> p.getTotal() > 50)
                  .forEach(System.out::println);
    }
}
