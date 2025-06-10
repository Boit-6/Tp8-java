package Tp8.Punto2;


public class main {
    public static void main(String[] args) {
        Carrito<Producto<?>> carrito = new Carrito<>();
        carrito.agregarProducto(new Producto<>("SKU123", "producto1", 10.00));
        carrito.agregarProducto(new Producto<>(1, "producto2", 20.00));

        System.out.println("Productos en el carrito:");
        carrito.mostrarProductos();
        System.out.println("Total: " + carrito.obtenerTotal());
    }
}
