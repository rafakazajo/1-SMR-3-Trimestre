import java.util.Scanner;
public class Mayor {
static int maximo(int a, int b) {
        int max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        return (max);
    }
    public static void main(String[] args) {
        int valor1;
        int valor2;
        int mayor;
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime el primer valor: ");
        valor1 = sc.nextInt();
        System.out.println("Dime el segundo valor: ");
        valor2 = sc.nextInt();
        mayor = maximo (valor1, valor2);
        System.out.println("El valor mayor es: " +mayor);
        sc.close();
    }
}