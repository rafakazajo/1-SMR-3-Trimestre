import java.util.Scanner;
public class NumerSuerte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int numSuerte;
        System.out.print("Dime un numero y te dire si es tu numero de la suerte o no: ");
        num = sc.nextInt();
        numSuerte = suerte(num);
        if (numSuerte == 1) {
            System.out.println("El numero " +num+ " es tu numero de la suerte");
        } else if (numSuerte == 0) {
            System.out.println("El numero " +num+ " no es tu numero de la suerte");
        }
        sc.close();
    }
    static int suerte(int num){
        int si;
        int no;
        if (num % 7 == 0 || String.valueOf(num).contains("7")) {
            si = 1;
            return (si);
        } else {
            no = 0;
            return (no);
        }
    }
}