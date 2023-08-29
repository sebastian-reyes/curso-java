package basico.variables;

public class Primitivos {

    public static void main(String[] args) {

        byte numeroByte = 127;
        System.out.println("número Byte:" + numeroByte);
        System.out.println(Byte.BYTES);
        System.out.println(Byte.SIZE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println("----------------------");

        short numeroShort = 32767;
        System.out.println("número Short:" + numeroShort);
        System.out.println(Short.BYTES);
        System.out.println(Short.SIZE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println("----------------------");

        int numeroInt = 2147483647;
        System.out.println("número Integer:" + numeroInt);
        System.out.println(Integer.BYTES);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println("----------------------");

        long numeroLong = 9223372036854775807L;
        System.out.println("número Long:" + numeroLong);
        System.out.println(Long.BYTES);
        System.out.println(Long.SIZE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println("----------------------");

        // Desde Java 10 se implementa var, puede tomar cualquier valor
        var numeroVar = 127;
        var stringVar = "sebastián";
    }
}
