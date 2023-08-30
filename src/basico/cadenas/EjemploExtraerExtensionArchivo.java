package basico.cadenas;

public class EjemploExtraerExtensionArchivo {
    //Función
    static String obtenerExtension(String archivo) {
        int i = archivo.lastIndexOf(".");
        var extension = archivo.substring(i+1);
        return extension;
    }

    public static void main(String[] args) {
        String archivo1 = "hola_mundo.js";
        String archivo2 = "index.html";
        String archivo3 = "video.mp4";
        String archivo4 = "controller.alumnos.ts";
        System.out.println(obtenerExtension(archivo1));
        System.out.println(obtenerExtension(archivo2));
        System.out.println(obtenerExtension(archivo3));
        System.out.println(obtenerExtension(archivo4));
    }
}
