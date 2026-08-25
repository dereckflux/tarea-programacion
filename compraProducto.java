import java.util.Scanner;

public class compraProducto {

    public static void main(String[] args) {
         Scanner deri = new Scanner(System.in); 
         double subtotal;
         double precioUnitario;
         int cantidad;
         String nombreProducto;
         String telefonoCliente;
         String cedulaCliente;
         String nombreCliente;
         double descuento;
         double total;
         double montoEntregado;
         double cambio;
         double faltante;
 
        // ===== Entrada de datos del cliente =====
 
        System.out.print("Nombre del cliente: "); // Mostramos un mensaje pidiendo el nombre, sin salto de línea al final (print, no println)
        nombreCliente = deri.nextLine(); 
 
        System.out.print("Cedula del cliente: "); // Pedimos la cédula del cliente
        cedulaCliente = deri.nextLine(); 
 
        System.out.print("Telefono del cliente: "); // Pedimos el teléfono del cliente
        telefonoCliente = deri.nextLine(); 
 
        // ===== Entrada de datos del producto =====
 
        System.out.print("Nombre del producto: "); // Pedimos el nombre del producto que se está comprando
        nombreProducto = deri.nextLine(); 
 
        System.out.print("Precio unitario del producto: "); // Pedimos el precio de una sola unidad del producto
        precioUnitario = deri.nextDouble(); 
 
        System.out.print("Cantidad de unidades: "); // Pedimos cuántas unidades compra el cliente
        cantidad = deri.nextInt(); 
 
        deri.nextLine();
        // ^ Importante: después de leer un número con nextInt()/nextDouble() queda pendiente el salto de línea (Enter)
        //   en el "buffer" del teclado. Esta línea lo descarta para que el próximo nextLine() no lea una línea vacía.
 
        // ===== Proceso: cálculos de la compra =====
 
        subtotal = precioUnitario * cantidad; // Calculamos el subtotal multiplicando precio por cantidad
        descuento = subtotal * 0.10; // Calculamos el descuento didáctico: el 10% del subtotal
        total = subtotal - descuento; // Calculamos el total a pagar restando el descuento al subtotal
 
        // ===== Entrada del pago =====
 
        System.out.print("\nMonto entregado por el cliente: $"); // "\n" agrega una línea en blanco antes del mensaje, para separar visualmente
        montoEntregado = deri.nextDouble(); // Leemos cuánto dinero entrega el cliente para pagar
 
        // ===== Salida: impresión de la factura =====
 
        System.out.println("\n================================"); // Imprimimos una línea decorativa; "\n" deja un espacio antes
        System.out.println("         FACTURA DE VENTA");        // Título centrado de la factura
        System.out.println("================================"); // Otra línea decorativa para cerrar el encabezado
 
        System.out.println("Cliente:  " + nombreCliente);  // Concatenamos texto fijo con la variable nombreCliente usando "+"
        System.out.println("Cedula:   " + cedulaCliente);  // Mostramos la cédula guardada anteriormente
        System.out.println("Telefono: " + telefonoCliente); // Mostramos el teléfono del cliente
 
        System.out.println("--------------------------------"); // Línea separadora entre datos del cliente y del producto
 
        System.out.println("Producto: " + nombreProducto); // Mostramos el nombre del producto comprado
        System.out.printf("Precio unitario: $%.2f%n", precioUnitario);
        // ^ printf permite dar formato: %.2f muestra el número con 2 decimales, %n es un salto de línea
 
        System.out.println("Cantidad: " + cantidad); // Mostramos cuántas unidades se compraron
 
        System.out.println("--------------------------------"); // Línea separadora entre producto y montos
 
        System.out.printf("Subtotal:          $%.2f%n", subtotal);   // Mostramos el subtotal con 2 decimales
        System.out.printf("Descuento (10%%):   $%.2f%n", descuento); // "%%" es necesario para imprimir un símbolo "%" literal en printf
        System.out.printf("Total a pagar:     $%.2f%n", total);      // Mostramos el total final a pagar
 
        System.out.println("--------------------------------"); // Línea separadora antes del resultado del pago
 
        System.out.printf("Monto entregado:   $%.2f%n", montoEntregado); // Mostramos cuánto dinero entregó el cliente
 
        // ===== Proceso y salida final: comparación del pago =====
 
        if (montoEntregado >= total) { // Si el dinero entregado alcanza o supera el total...
            cambio = montoEntregado - total; // ...calculamos el cambio que se le debe devolver al cliente
            System.out.printf("Cambio:            $%.2f%n", cambio); // Mostramos el cambio calculado
        } else { // Si el dinero entregado NO alcanza para cubrir el total...
            faltante = total - montoEntregado; // ...calculamos cuánto dinero falta
            System.out.printf("Dinero insuficiente. Falta: $%.2f%n", faltante); // Informamos al usuario cuánto falta
        }
 
        System.out.println("================================"); // Línea decorativa final que cierra la factura
    }
}
