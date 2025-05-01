import java.util.Scanner;
public class ImprimeEco {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Dime cuantas veces quieres que diga eco: ");
        num = sc.nextInt();
        eco(num);
        while (num!=0) {
            System.out.print("Dime cuantas veces quieres que diga eco (0 para parar): ");
            num = sc.nextInt();
            eco(num);
        }
        sc.close();
    }
    static void eco(int num1) {
        for (int num2 = 1; num2 <= num1; num2++) {
            System.out.println("eco");
        }
    }
}