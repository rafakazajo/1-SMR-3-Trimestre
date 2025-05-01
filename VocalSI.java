import java.util.Scanner;
public class VocalSI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String vocal;
        int siNo;
        System.out.print("Dime una letra y te dire si es vocal: ");
        vocal = sc.nextLine();
        int letras = vocal.length();
        siNo = esVocal(vocal);
        if (letras != 1) {
        System.out.println("Solo necesito una letra");
        } else {
            if (siNo == 1) {
                System.out.println("Es una vocal");
            } else if (siNo == 0) {
                System.out.println("No es una vocal");
            }
        }
        sc.close();
        }
        static int esVocal(String vocal){
            int si;
            int no;
            if (String.valueOf(vocal).contains("a") || String.valueOf(vocal).contains("e") || String.valueOf(vocal).contains("i") || String.valueOf(vocal).contains("o") || String.valueOf(vocal).contains("u") || String.valueOf(vocal).contains("A") || String.valueOf(vocal).contains("E") || String.valueOf(vocal).contains("I") || String.valueOf(vocal).contains("O") || String.valueOf(vocal).contains("U")) {
                si = 1;
                return (si);
            } else {
                no = 0;
                return (no);
            }
        }
    }