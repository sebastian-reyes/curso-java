package basico.variables;

public class Caracteres {
    public static void main(String[] args) {
        char caracter = 'a';
        char caracterUnicode = '\u0040';
        char decimal = 64;
        char simbolo = '@';
        System.out.println("caracter: " + caracter);
        System.out.println("unicode:" + caracterUnicode);
        System.out.println("decimal:" + decimal);
        System.out.println("simbolo:" + simbolo);

        System.out.println("char corresponde en byte: " + Character.BYTES);
        System.out.println("char corresponde en bites: " + Character.SIZE);
        System.out.println("Character.MAX_VALUE: " + Character.MAX_VALUE);
        System.out.println("Character.MIN_VALUE: " + Character.MIN_VALUE);
    }
}
