package EjemplosFicheros2;

import java.io.*;

public class FicherosGestor {
    public void leerFicheroAlumnos() {
        try {
            File file = new File("Alumnos.csv");
            FileReader fr = new FileReader(file);
            BufferedReader bf = new BufferedReader(fr);
            String line;
            while ((line = bf.readLine()) != null) {
                String[] attr = line.split(",");
                //crearAlumno(attr[0], attr[1], attr[2]);
            }

            bf.close();
            fr.close();
            System.out.println("Fichero cargado correctamente.");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void leerFicheroAsignaturas() {
        try {
            File file = new File("Asignaturas.csv");
            FileReader fr = new FileReader(file);
            BufferedReader bf = new BufferedReader(fr);
            String line;
            while ((line = bf.readLine()) != null) {
                String[] attr = line.split(",");
                //crearAsignatura(attr[0], attr[1], Integer.parseInt(attr[2]));
            }

            bf.close();
            fr.close();
            System.out.println("Fichero cargado correctamente.");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void leerFicheroMatriculaciones() {
        try {
            File file = new File("Matriculaciones.csv");
            FileReader fr = new FileReader(file);
            BufferedReader bf = new BufferedReader(fr);
            String line;
            while ((line = bf.readLine()) != null) {
                String[] attr = line.split(",");
                //matricular(attr[0], attr[1]);
            }

            bf.close();
            fr.close();
            System.out.println("Fichero cargado correctamente.");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void guardarFichero() {
        try {
            File file1 = new File("Alumnos.csv");
            File file2 = new File("Asignaturas.csv");
            File file3 = new File("Matriculaciones.csv");

            FileWriter fw = new FileWriter(file1);
            BufferedWriter bw = new BufferedWriter(fw);

            for(Alumno al : alumnos) {
                bw.write(al.getDni()+ "," + al.getNombre() + "," + al.getApellidos());
                bw.newLine();
            }
            bw.close();
            fw.close();
            System.out.println("Fichero guardado correctamente.");

            fw = new FileWriter(file2);
            bw = new BufferedWriter(fw);

            for(Asignatura as : asignaturas) {
                bw.write(as.getCodigo()+ "," + as.getNombre() + "," + as.getCreditos());
                bw.newLine();
            }
            bw.close();
            fw.close();
            System.out.println("Fichero guardado correctamente.");

            fw = new FileWriter(file3);
            bw = new BufferedWriter(fw);

            for(Alumno al : alumnos) {
                for(Asignatura as : al.getAsignaturasMatriculadas()) {
                    bw.write(al.getDni() + "," + as.getCodigo());
                    bw.newLine();
                }
            }
            bw.close();
            fw.close();
            System.out.println("Fichero guardado correctamente.");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
