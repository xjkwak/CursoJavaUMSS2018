package bo.edu.umss.cs.ceis;

public class Main {

    public static void main(String[] args) {

        System.out.println(mayor(3,7));
        System.out.println(mayor(113,23));
    }

    public static int mayor (int a, int b) {

        int mayor = a;

        if (b > a) {
            mayor = b;
        }

        return mayor;
    }

    public static void primeraClase() {
        System.out.println("Bienvenidos UMSS!!!");

        int x = 3;

        System.out.println(x++);
        System.out.println(x);

        Object xx = "Holaaa";

        //xx = 3D;

        if (xx instanceof String) {
            System.out.println(xx + " Es una cadena");
        }
        else if (xx instanceof Integer) {
            System.out.println(xx + " Es un entero!");
        }
        else {
            System.out.println(xx + " No es nada!");
        }
    }
}
