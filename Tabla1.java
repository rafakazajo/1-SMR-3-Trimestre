public class Tabla1 {
    public static void main(String[] args) {
        int edad [];
        edad = new int [6];
        int [] estatura;
        estatura = new int [4];
        int peso [] = {2,3, 4, 54, -2};
        System.out.println("La longuitud de la tabla edad es: " +edad.length);
        System.out.println("La referencia de la tabla edad es: " +edad);
        for (int i = 0 ; i < edad.length; i++) {
            System.out.println("La tabla edad, tiene estos valores: " +edad[i]);
        }
        System.out.println("");
        System.out.println("La referemcia de la tabla estatura es: " +estatura);
        System.out.println("La longuitud de la tabla estatura es: " +estatura.length);
        for (int i = 0; i < estatura.length; i++) {
            System.out.println("La tabla estatura, tiene estos valores: " +estatura[i]);
        }
        System.out.println("");
        System.out.println("La referencia de la tabla peso es: " +peso);
        System.out.println("La longuitud de la tabla peso es: " +peso.length);
        for (int i = 0; i < peso.length; i++) {
            System.out.println("La tabla peso, tiene estos valores: " +peso[i]);
        }
    }
}