package basico.variables;

public class PrimitivosFloat {

    static float varFlotante = 45.45f;
    public static void main(String[] args) {
        float numeroFloat = 1.0f;
        float numeroFloat2 = 3f;
        System.out.println("número float:" + numeroFloat);
        System.out.println("número float 2:" + numeroFloat2);
        System.out.println("float correspondiente en byte a = "+ Float.BYTES);

        double realDouble = 3.4823E39;
        System.out.println("real double = "+ realDouble);

        //Float varFlotante
        System.out.println("varFlotante: "+ varFlotante);
    }
}
