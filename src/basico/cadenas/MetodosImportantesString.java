package basico.cadenas;

public class MetodosImportantesString {
    public static void main(String[] args) {
        String nombre = "Sebastián";
        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"sebastian\") = " + nombre.equals("sebastian"));
        System.out.println("nombre.equals(\"Sebastián\") = " + nombre.equals("Sebastián"));
        System.out.println("nombre.compareTo(\"Sebastián\") = " + nombre.compareTo("Sebastián"));
        System.out.println("nombre.compareTo(\"sebastian\") = " + nombre.compareTo("sebastian"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(nombre.length() - 1) = " + nombre.charAt(nombre.length() - 1));

        System.out.println(nombre.substring(2));
        System.out.println(nombre.substring(2, 4));
        System.out.println(nombre.substring(nombre.length() - 2));

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas replace = " + trabalenguas.replace("a", "."));
        System.out.println(trabalenguas);
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a'));
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a'));
        System.out.println(trabalenguas.lastIndexOf('z'));
        System.out.println(trabalenguas.contains("guas"));
        System.out.println("Comienza con (traba) = " + trabalenguas.startsWith("tra"));
        System.out.println("Termina con (lenguas) = "+ trabalenguas.endsWith("lenguas"));
        System.out.println("   trabalenguas ");
        System.out.println("   trabalenguas ".trim());
    }
}
