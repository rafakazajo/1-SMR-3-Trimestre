public class NumerosAleatorios {
    public static void main(String[] args) {
        int valores[];
        valores = new int[10];
        for (int i = 0; i < valores.length; i++) {
            valores[i] = (int)(Math.random()*100 +1);
            System.out.println("El valor de la posicion:" +i+ "es: " +valores[i]);
        }
        int suma = 0;
        for (int i = 1; i < valores.length; i++) {
            suma += valores[i];
        }
        System.out.println("La suma de los valores aleatorios es: " +suma);
    }
}