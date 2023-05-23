package EjemplosFicheros;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Muchos tipos de aplicaciones necesitas leer de una determinada fuente o enviar los datos a un determinado destino

        //Esta E/S en java se hace mediante flujos (streams). Los datos se envían en serie a través de flujo.

        //Se puede trabajar de la misma forma con todos los flujos, independientemente de su fuente o destino.

        //En la clase de hoy vamos a centrarnos en los flujos de caracteres (con sufijos Reader y Writer).

        /*
            Los streams para archivos se manejan con los objetos asociados a la clase File para leer y escribir un archivo
            (FileReader y FileWriter).
         */

        //1º Paso. Instanciar objetos de la clase File que represente a los archivos de entrada y de salida
        File inputFile = new File("in.txt");
        File outputFile = new File("out.txt");

        //2º Paso. Declaramos la variable entera c donde guardaremos el ascii del caracter
        int c;

        //3º paso. Instanciamos el FileReader y el FileWriter (flujos de E/S), que usaremos para leer y escribir
        // respectivamente. Tiene que estar asociado al recurso.
        try {
            FileReader in = new FileReader(inputFile);
            FileWriter out = new FileWriter(outputFile);

            /*Mientras al leer el ascii de un caracter no nos salga -1, vamos a imprimir el caracter por consola y
            escribirlo en el archivo de salida */
            while ((c = in.read()) != -1) {
                System.out.print((char) c);
                out.write(c);
            }
            System.out.println();
            //Finalmente debemos cerrar los flujos de E/S.
            in.close();
            out.close();
        } catch (IOException e) {
            System.err.println("No se encuentra el archivo.");
        }

        /*Cuidado! FileWriter borra el texto del archivo! Para evitar esto y escribir al final:*/
        try {
            FileWriter fileWriter = new FileWriter(outputFile, true);
            fileWriter.write("!");
            fileWriter.close();
        } catch (IOException e) {
            System.err.println("Error al abrir out.txt.");
        }

        /*Hemos usado hasta ahora flujos de entrada y de salida. Vamos a usar ahora flujos de procesamiento.
          Estos se construyen a partir de flujos de datos y los extienden proporcionando métodos de más alto nivel.*/
        try {
            File newFile = new File("miNuevoFichero.txt");
            FileWriter fileWriter = new FileWriter(newFile);
            //Lo construimos a partir de FileWriter.
            PrintWriter printWriter = new PrintWriter(fileWriter);

            //Imprimimos lo que queremos escribir en el archivo.
            printWriter.println("Esto es la linea 1.");

            printWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            System.err.println("Error al crear miNuevoFichero.txt.");
        }

        /*
            Queremos modificar una linea intermedia de un txt. Pero si hacemos:

            FileReader fileReader = new FileReader("fichero.txt");
            FileWriter fileWriter = new FileWriter("fichero.txt");

            se sobreescribe el archivo fichero.txt y se quedaría vacío. Si hacemos:

            FileReader fileReader = new FileReader("fichero.txt");
            FileWriter fileWriter = new FileWriter("fichero.txt", true);

            escribiriamos al final de la línea, por tanto no podríamos modificar el texto intermedio.

            Tenemos dos soluciones:
                -Crear un fichero temporal en el que copiaremos el archivo original con la modificación que queremos hacer.
                -Guardar las lineas en una colección, hacer la modificación, escribir en el archivo dichas lineas.

            Nosotros vamos a optar por la segunda opción, aunque es bastante probable que tambien os pidan la primera opción.
            (Recomendable que el alumno práctique la primera opción).

        */

        try {
            File ficheroContador = new File("contador.txt");
            FileReader fileReader = new FileReader(ficheroContador);

            //Construimos el flujo de procesamiento a partir del FileReader
            BufferedReader bufferedReader = new BufferedReader(fileReader);


            String line;
            List<String> lineas = new ArrayList<>();

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                if (line.equals("Esto es la linea 4.")) {
                    lineas.add("Esto es la modificacion de la linea 4.");
                } else {
                    lineas.add(line);
                }
            }

            System.out.println(lineas);

            //En el siguiente punto el archivo quedará vacío:
            FileWriter fileWriter = new FileWriter(ficheroContador);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            //Recorreremos la lista e iremos escribiendolas en el archivo
            for (String str: lineas) {
                bufferedWriter.write(str);
                bufferedWriter.newLine();
            }

            //bufferedWriter.flush(); //Asegurarnos de que los datos han sido enviados, pero no queramos cerrar el flujo
            bufferedReader.close();
            bufferedWriter.close();
            fileReader.close();
            fileWriter.close();
        } catch (IOException e) {
            System.err.println("No se encuentra el archivo contador");
        }

    }
}