package bo.edu.umss.cs.ceis;

public class Fecha {
    int dia;
    int mes;
    int año;

    public Fecha(int a, int b, int c) {
        dia = a;
        mes = b;
        año = c;
    }

    public void mostrarFechaCorta() {
        String corta = dia + "/" + mes + "/" + año;
        System.out.println(corta);
    }
}
