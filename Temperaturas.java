import java.util.Arrays;
public class Temperaturas {
    public static void main(String[] args) {
        int grados[];
        grados = new int [1000];
        for (int i = 0; i < grados.length; i++) {
            grados[i] = (int)(Math.random()*51) -10;
        }
            System.out.println("La tabla de temperaturas ha quedado asi: ");
            System.out.println(Arrays.toString(grados));
            int menor = 40;
            int posicionMenor = 0;
            for (int i = 0; i < grados.length; i++) {
                if (grados[i] <= menor) {
                    menor = grados[i];
                    posicionMenor = i;
                }
                }
            int mayor = -10;
            int posicionMayor = 0;
            for (int i = 0; i < grados.length; i++) {
                if (grados[i] >= mayor) {
                    mayor = grados[i];
                    posicionMayor = i;
                }
            }
            System.out.println("La temperatura menor ha sido: " +menor+ " y esta en la posicion: " +posicionMenor);
            System.out.println("La temperatura mayor ha sido: " +mayor+ " y esta en la posicion: " +posicionMayor);
            int suma = 0;
            int media;
            for (int i = 0; i < grados.length; i++) {
                suma += grados[i];
            }
            media = suma / grados.length;
            System.out.println("La media de temperatura es: " +media);
            System.out.println("La tabla ordenada es: ");
            Arrays.sort(grados);
            System.out.println(Arrays.toString(grados));
        
    }
}