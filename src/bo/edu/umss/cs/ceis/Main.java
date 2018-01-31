package bo.edu.umss.cs.ceis;

public class Main {

    public static void main(String[] args) {

        Fecha hoy = new Fecha(30, 1, 2018);

        hoy.mostrarFechaCorta();



        /*System.out.println(mayor(5, 4));
        System.out.println(mayor(113,23));*/

        /*mostrarNaturales(8);
        mostrarLinea(100);
        mostrarTriangulo(100);*/
    }

    public static void mostrarTriangulo(int numero) {
        for (int y = 1; y <= numero; y++) {
            mostrarLinea(y);
            System.out.println();
        }
    }

    public static void mostrarLinea(int num) {

        for (int x = 1; x <= num; x++) {
            System.out.print("*");
        }

    }

    public static void mostrarNaturales(int n) {

        for (int x = 1; x <= n; x++) {
            System.out.println(x);
        }
    }

    public static int mayor(int a, int b) {

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
        } else if (xx instanceof Integer) {
            System.out.println(xx + " Es un entero!");
        } else {
            System.out.println(xx + " No es nada!");
        }
    }
}
