package Examenes;
import java.util.Arrays;
public class EncuestaRCA {
    public static void main(String[] args) {
        int num[];
        num = new int [500];
        int uno = 0;
        int dos = 0;
        int tres = 0;
        int cuatro = 0;
        int cinco = 0;
        for (int i = 0; i < num.length; i++) {
            num[i] = (int)(Math.random()*5) +1;
        if (num[i] == 1) {
            uno++;
        } else if (num[i] == 2) {
            dos++;
        } else if (num[i] == 3) {
            tres++;
        } else if (num[i] == 4) {
            cuatro++;
        } else if (num[i] == 5) {
            cinco++;
        }
    }
    System.out.println(+uno+ " personas han votado con un 1");
    System.out.println(+dos+ " personas han votado con un 2");
    System.out.println(+tres+ " personas han votado con un 3");
    System.out.println(+cuatro+ " personas han votado con un 4");
    System.out.println(+cinco+ " personas han votado con un 5");
    System.out.println("Esta es la tabla de satisfaccion: ");
    System.out.println(Arrays.toString(num));
    System.out.println("Esta es la tabla de satisfaccion ordenada: ");
    Arrays.sort(num);
    System.out.println(Arrays.toString(num));
    }
}