import java.util.Scanner;
public class NumeroMagico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Dime un numero y te dire tu numero magico: ");
        n = sc.nextInt();
        Magia(n);
        sc.close();
    }
    static void Magia(int n) {
        int nMagico = (n + 33 - 10) * n;
        System.out.println("Tu numero magico es el: "+nMagico);
    }
}