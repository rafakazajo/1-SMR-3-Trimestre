public class VariablesTabla {
    public static void main(String[] args) {
    int tabla1 [];
    int tabla2 [];
    int tabla3 [];
    tabla1 = new int [5];
    tabla1[0] = 1;
    tabla1[1] = 2;
    tabla1[2] = 3;
    tabla1[3] = 4;
    tabla1[4] = 5;
    tabla2 = tabla1;
    tabla3 = tabla1;
    for (int i = 0 ; i < tabla1.length; i++) {
        System.out.println("La tabla1, tiene estos valores: " +tabla1[i]);
    }
    for (int i = 0; i < tabla2.length; i++) {
        System.out.println("La tabla2, tiene estos valores: " +tabla2[i]);
    }
    for (int i = 0; i < tabla3.length; i++) {
        System.out.println("La tabla3, tiene estos valores: " +tabla3[i]);
    }
}
}