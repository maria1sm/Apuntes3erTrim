package EjemplosFicheros;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Prueba {
    public static void main(String[] args) {
        File file = new File("in.txt");
        try {
            Methods.copiaArchivo(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        File fileCopy = new File("copia_de_in.txt");
        try {
            Methods.escribirEnArchivoSobrescribiendo(fileCopy, "Aqui ponia 'Hola alumnos', pero yo lo he " +
                    "sobreescrito por esto.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            Methods.escribirAlFinalDelArchivo(fileCopy, "Esto lo he añadido sin sobreescribir.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            Methods.leerArchivo(fileCopy);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            Methods.modificarArchivo(fileCopy, "Esto lo he añadido sin sobreescribir.",
                    "He modificado esta linea donde ponía 'Esto lo he añadido sin sobreescribir.' por esto.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            Methods.escribirManualmente();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
