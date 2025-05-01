package Examenes;
public class RadarRCA {
    public static void main(String[] args) {
        int num[];
        num = new int [1000];
        int menor = 0;
        int mayor = 0;
        int maximo = 60;
        int posicionMaximo = 0;
        for (int i = 0; i < num.length; i++) {
            num[i] = (int)(Math.random()*121) +60;
            if (num[i] < 80) {
                menor++;
            } else if (num[i] > 120) {
                mayor++;
            }
            if (num[i] >= maximo) {
                maximo = num[i];
                posicionMaximo = i;
}
    }
    System.out.println(+menor+ " coches iban a menos de 80 km/h");
    System.out.println(+mayor+ " coches iban a mas de 120 km/h");
    System.out.println("La maxima velocidad registrada fue: " +maximo+ " km/h y fue el coche nº " +posicionMaximo);
}
}