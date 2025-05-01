import java.util.Arrays;
public class Stock {
    public static void main(String[] args) {
        int num[];
        num = new int [500];
        int fuera = 0;
        int bajo = 0;
        for (int i = 0; i < num.length; i++) {
            num[i] = (int)(Math.random()*101);
    }
    System.out.println(Arrays.toString(num));
    for (int i = 0; i < num.length; i++) {
        if (num[i] == 0) {
            fuera++;
        } else if (num[i] < 10) {
            bajo++;
        }
    }
    System.out.println("Hay " +fuera+ " fuera de stock");
    System.out.println("Hay " +bajo+ " bajo de stock");
}
}