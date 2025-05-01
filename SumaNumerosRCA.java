package Examenes;

import java.util.Scanner;

public class SumaNumerosRCA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int sumaN;
        System.out.print("Dime un numero y te dire la suma de todos sus positivos hasta el 0: ");
        num = sc.nextInt();
        sumaN = sumaNumeros (num);
        System.out.println("La suma de todos los numeros positivos es: " +sumaN);
        sc.close();
    }
    static int sumaNumeros(int num) {
    int n1 = num;
while (num > 1) {
    n1 = n1 + (num - 1);
    num--;
}
    return (n1);
    }
}