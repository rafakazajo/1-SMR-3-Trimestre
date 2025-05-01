import java.util.Scanner;
public class EnterosFuncion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame dos numeros y te dire todos los numeros del menor al mayor");
        System.out.print("Dime un numero: ");
        int n = sc.nextInt();
        System.out.print("Dime otro numero: ");
        int n1 = sc.nextInt();
        entero(n, n1);
        sc.close();
    }
    static void entero(int n, int n1) {
        int mayor = n > n1 ? n : n1;
        int menor = n < n1 ? n : n1;    
        for (int b = menor; b <= mayor; b++) { 
            System.out.println(b);
        }
    }
    }