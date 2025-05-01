import java.util.Arrays;
public class Contar {
    public static void main(String[] args) {
        int num[];
        num = new int [500];
        int posit = 0;
        int neg = 0;
        int cero = 0;
        for (int i = 0; i < num.length; i++) {
            num[i] = (int)(Math.random()*201) -100;
    }
               System.out.println("Estos son los numeros: ");
            System.out.println(Arrays.toString(num));
    for (int i = 0; i < num.length; i++) {
        if (num[i] > 0) {
            posit++;
        } else if (num[i] < 0) {
            neg++;      
        } else {
            cero++;
    }
}
System.out.println("Hay " +posit+ " numeros positivos");
System.out.println("Hay " +neg+ " numeros negativos");
System.out.println("Hay " +cero+ " numeros ceros");
}
}