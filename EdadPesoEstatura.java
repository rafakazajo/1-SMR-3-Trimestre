public class EdadPesoEstatura {
    public static void main(String[] args) {
        int edad [] = new int[5];
        edad[0] = 4;
        edad[1] = 7;
        edad[2] = 14;
        edad[3] = 17;
        edad[4] = 18;
        int peso [] = new int[5];
        peso[0] = 62;
        peso[1] = 74;
        peso[2] = 84;
        peso[3] = 99;
        peso[4] = 100;
        double estat [] = new double[5];
        estat[0] = 1.5;
        estat[1] = 1.75;
        estat[2] = 1.89;
        estat[3] = 2.10;
        estat[4] = 1.45;
        System.out.println("La longuitud de la tabla edad es: " +edad.length);
        System.out.println("La longuitud de la tabla peso es: " +peso.length);
        System.out.println("La longuitud de la tabla estat es: " +estat.length);
        System.out.println("La referencia de la tabla edad es: " +edad);
        System.out.println("La referencia de la tabla peso es: " +peso);
        System.out.println("La referencia de la tabla estat es: " +estat);
        System.out.println("La primera persona tiene: " +edad[0]+ " años, pesa: " +peso[0]+ " KG y mide: " +estat[0]+ " M");
        System.out.println("La segunda persona tiene: " +edad[1]+ " años, pesa: " +peso[1]+ " KG y mide: " +estat[1]+ " M");
        System.out.println("La tercera persona tiene: " +edad[2]+ " años, pesa: " +peso[2]+ " KG y mide: " +estat[2]+ " M");
        System.out.println("La cuarta persona tiene: " +edad[3]+ " años, pesa: " +peso[3]+ " KG y mide: " +estat[3]+ " M");
        System.out.println("La quinta persona tiene: " +edad[4]+ " años, pesa: " +peso[4]+ " KG y mide: " +estat[4]+ " M");
    }
}