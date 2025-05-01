import java.util.Scanner;
public class EdadCanina {
    static int edadCanina(int edad){
        return edad *7;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;
        int edadPerro;
        System.out.print("Dime cuantos años tienes y te dire cuanto equivale en años de perro: ");
        edad = sc.nextInt();
        edadPerro = edadCanina(edad);
        System.out.println("Tu edad en años de perros son: " +edadPerro);
        sc.close();
    }
}