package Tp8.Punto1;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Producto<?>> productos = new ArrayList<>();

        productos.add(new Producto<String>("SKU123", "prducto1", 10.00));
        productos.add(new Producto<Integer>(101, "prducto2", 20.00));
        productos.add(new Producto<String>("SKU456", "prducto3", 30.00));
        productos.add(new Producto<Integer>(102, "prducto4", 40.00));

        for (Producto<?> producto : productos) {
            System.out.println(producto);
        }
    }
}
