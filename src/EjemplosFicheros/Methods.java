package EjemplosFicheros;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Methods {
    public static void copiaArchivo(File inputFile) throws IOException {
        File outputFile = new File("copia_de_" + inputFile.getName());
        int c;

        FileReader in = new FileReader(inputFile);
        FileWriter out = new FileWriter(outputFile);

        while ((c = in.read()) != -1) {
            out.write(c);
        }
        in.close();
        out.close();
    }

    public static void escribirEnArchivoSobrescribiendo(File archivo, String texto) throws IOException {
        FileWriter fileWriter = new FileWriter(archivo);
        PrintWriter printWriter = new PrintWriter(fileWriter);

        printWriter.println(texto);

        printWriter.close();
        fileWriter.close();
    }

    public static void escribirAlFinalDelArchivo(File archivo, String texto) throws IOException {
        FileWriter fileWriter = new FileWriter(archivo, true);
        PrintWriter printWriter = new PrintWriter(fileWriter);

        printWriter.println(texto);

        printWriter.close();
        fileWriter.close();
    }

    public static void leerArchivo(File archivo) throws IOException {
        FileReader fileReader = new FileReader(archivo);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;

        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

        bufferedReader.close();
        fileReader.close();
    }

    public static void modificarArchivo(File archivo, String lineaACambiar, String lineaAEscribir) throws IOException {
        FileReader fileReader = new FileReader(archivo);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        List<String> lineas = new ArrayList<>();

        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
            if (line.equals(lineaACambiar)) {
                lineas.add(lineaAEscribir);
            } else {
                lineas.add(line);
            }
        }

        System.out.println(lineas);

        FileWriter fileWriter = new FileWriter(archivo);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (String str: lineas) {
            bufferedWriter.write(str);
            bufferedWriter.newLine();
        }

        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
        fileReader.close();
        fileWriter.close();
    }

    public static void escribirManualmente() throws IOException{
        File ficherito = new File("escribir.txt");
        FileReader fileReader = new FileReader(ficherito);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        FileWriter fileWriter = new FileWriter("copia_de_escribir.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        List<String> lineas = new ArrayList<>();
        String str;

        while ((str = bufferedReader.readLine()) != null) {
            lineas.add(str);
        }

        for (String linea: lineas) {
            bufferedWriter.write(linea);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        fileReader.close();
        bufferedWriter.close();
        fileWriter.close();

        FileWriter fileWriter2 = new FileWriter("escribir.txt");
        BufferedWriter bf = new BufferedWriter(fileWriter2);

        Scanner sc = new Scanner(System.in);
        String inputUsuario = "";

        System.out.println("Que quieres escribir:");
        inputUsuario = sc.nextLine();
        while (!inputUsuario.equals("STOP")) {
            bf.write(inputUsuario);
            bf.newLine();
            System.out.println("Que quieres escribir:");
            inputUsuario = sc.nextLine();
        }

        bf.close();
        fileWriter2.close();
    }
}
