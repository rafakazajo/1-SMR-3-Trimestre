package Examenes;
import java.util.Scanner;

public class CalculadoraRCA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precio;
        double descuento;
        double precioDescuento;
        System.out.print("Dime el precio del producto: ");
        precio = sc.nextDouble();
        System.out.print("Dime el decuento que se aplica: ");
        descuento = sc.nextDouble();
        precioDescuento = precioDescontado (precio, descuento);
        System.out.println("El precio con descuento es: " +precioDescuento);
        sc.close();
    }
    static double precioDescontado(double precio, double descuento) {
        double precioDesc;
        precioDesc = precio - (precio*(descuento/100));
        return (precioDesc);
    }
}
