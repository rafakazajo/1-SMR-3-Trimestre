import java.util.Arrays;
public class RellenaPares {
    public static void main(String[] args) {
        int pares[] = new int[10];
        int i = 0;
        int valor;
        int suma = 0;
        while (i < pares.length) {
            valor = (int) (Math.random()*100)+1;
            if (valor % 2 == 0) {
                pares[i] = valor;
                System.out.println("La posicion: " +i+ " tiene el valor: " +valor);
                i++;
            } else {
                System.out.println("EL numero aleatorio ha sido impar: " +valor);
            }
            for (i = 0; i < pares.length; i++) {
                System.out.println("La suma es: " +suma);
                System.out.println("La tabla original tiene estos valores " +Arrays.toString(pares));
                System.out.println("La ordenamos y...");
                Arrays.sort(pares);
                System.out.println("Ahora esta asi: " +Arrays.toString(pares));
            }
        }
    }
}