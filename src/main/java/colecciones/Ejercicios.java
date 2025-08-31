package colecciones;

import modelo.Pedido;
import java.util.*;

public class Ejercicios {

    public static void listas() {
        ArrayList<Pedido> pedidos = new ArrayList<>();
        pedidos.add(new Pedido("Ana", "Pizza", 45));
        pedidos.add(new Pedido("Luis", "Hamburguesa", 30));
        pedidos.add(new Pedido("Marta", "Sushi", 60));
        pedidos.add(new Pedido("Diego", "Helado", 25));
        pedidos.add(new Pedido("Carlos", "Taco", 15));

        System.out.println("ArrayList original:");
        pedidos.forEach(System.out::println);

        pedidos.add(0, new Pedido("Urgente1", "Pizza", 55));
        pedidos.add(0, new Pedido("Urgente2", "Sushi", 70));

        System.out.println("\nArrayList con urgentes al inicio:");
        pedidos.forEach(System.out::println);

        LinkedList<Pedido> pedidosLinked = new LinkedList<>(pedidos);
        System.out.println("\nLinkedList:");
        pedidosLinked.forEach(System.out::println);
    }

    public static void conjunto() {
        HashSet<Pedido> setPedidos = new HashSet<>();
        Pedido p1 = new Pedido("Ana", "Pizza", 45);
        Pedido p2 = new Pedido("Luis", "Hamburguesa", 30);
        Pedido p3 = new Pedido("Marta", "Sushi", 60);

        setPedidos.add(p1);
        setPedidos.add(p2);
        setPedidos.add(p3);
        setPedidos.add(p1); 

        System.out.println("\nHashSet (sin duplicados):");
        setPedidos.forEach(System.out::println);
    }

    public static void mapas() {
        HashMap<String, List<Pedido>> pedidosPorCliente = new HashMap<>();

        pedidosPorCliente.put("Ana", Arrays.asList(new Pedido("Ana", "Pizza", 45), new Pedido("Ana", "Taco", 15)));
        pedidosPorCliente.put("Luis", Arrays.asList(new Pedido("Luis", "Hamburguesa", 30)));
        pedidosPorCliente.put("Marta", Arrays.asList(new Pedido("Marta", "Sushi", 60), new Pedido("Marta", "Ensalada", 25)));

        System.out.println("\nPedidos de Ana:");
        pedidosPorCliente.get("Ana").forEach(System.out::println);

        System.out.println("\nTotal por cliente:");
        pedidosPorCliente.forEach((cliente, lista) -> {
            double total = lista.stream().mapToDouble(Pedido::getTotal).sum();
            System.out.println(cliente + ": $" + total);
        });
    }
}
