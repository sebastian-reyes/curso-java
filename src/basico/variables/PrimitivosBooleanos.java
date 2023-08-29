package basico.variables;

public class PrimitivosBooleanos {
    public static void main(String[] args) {
        boolean datoLogico = true;
        System.out.println("dato lógico: " + datoLogico);

        double d = 9854.3e-3; //9.8543
        System.out.println(d);
        float f = 1.2345e2f; //123.45
        System.out.println(f);

        datoLogico = d > f;
        System.out.println(datoLogico);

        boolean esIgual = 3 - 2 == 1;
        System.out.println(esIgual);
    }
}
