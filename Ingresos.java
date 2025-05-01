public class Ingresos {
    public static void main(String[] args) {        
    int ingresos[];
    ingresos = new int [1001];
    ingresos[0] = 40;
    for (int i = 1; i < ingresos.length; i++) {
        int a = i - 1;
        ingresos[i] = ingresos[a] + 10;
        }
        System.out.println("Estos son los ingresos de los primeros 10 dias");
        for (int i = 1; i < 11; i++) {
            System.out.println("Los ingresos del dia " +i+ " son: " +ingresos[i]);
        }
        System.out.println("");
        System.out.println("Estos son los ingresos de los ultimos 10 dias");
        for (int i = (ingresos.length - 10); i < ingresos.length; i++) {
            System.out.println("Los ingresos del dia " +i+ " son: " +ingresos[i]);
        }
        System.out.println("");
        int ingres = ingresos[ingresos.length - 1] + 10;
        System.out.println("Los ingresos del dia 1001 son: " +ingres);
    }
}