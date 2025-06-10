package Tp8.Punto4;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Pedido> pedidos = new ArrayList<>();
        Pedido pedido1 = new Pedido(1, LocalDate.of(2025, 1, 1));
        pedido1.agregarProducto(new Producto<>("SKU123", "prducto1", 10.00));

        Pedido pedido2 = new Pedido(2, LocalDate.of(2025, 2, 2));
        pedido2.agregarProducto(new Producto<>("SKU124", "prducto2", 20.00));

        pedidos.add(pedido1);
        pedidos.add(pedido2);

        Buscador<Pedido, Integer> buscador = new Buscador<>();
        Pedido encontrado = buscador.buscar(pedidos, 1);
        System.out.println("Pedido encontrado: " + encontrado);
    }
}
