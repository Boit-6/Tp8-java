package Tp8.Punto3;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Pedido> pedidos = new ArrayList<>();
        Pedido pedido1 = new Pedido(1, LocalDate.of(2025, 1, 1));
        pedido1.agregarProducto(new Producto<>("SKU123", "producto1", 10.00));
        pedido1.agregarProducto(new Producto<>(1, "producto2", 20.00));

        Pedido pedido2 = new Pedido(2, LocalDate.of(2025, 2, 2));
        pedido2.agregarProducto(new Producto<>("SKU124", "producto3", 30.00));

        pedidos.add(pedido1);
        pedidos.add(pedido2);

        pedidos.sort(Comparator.naturalOrder());
        System.out.println("Pedidos ordenados por total:");
        for (Pedido pedido : pedidos) {
            System.out.println(pedido);
        }
    }
}
