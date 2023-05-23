package Teoria;

public class Equals {
    /*
    //EQUALS
     El equals sirve para saber si un objeto es igual a otro
     Si usamos el que te genera por defecto intelliJ lo que ocurre es que
     comprueba que los atributos de los dos objetos sean los mismos, pero
     no siempre es lo que nos interesa.
     Por ejemplo: si tenemos una Persona con nombre, apellidos, edad, altura y dni
     lo mejor es usar el dni como atributo definitivo para diferenciar un objeto de otro.

     Si tuvieramos una clase Persona con nombre, apellido1, apellido2, altura y edad,
     nos interesa usar para el equals tanto nombre como apellido1 y apellido2.
     Depende de lo que nos pidan.

     Ejemplo1:
     public boolean equals(Object o) {
        //1.Comprobamos que el objeto que hemos metido en el equals no es null
        if (o == null){
            return false;
        }

        //2. Comprobamos que el objeto es una instancia de la clase Alumno en este caso
        if (!(o instanceof Alumno)) {
            return false;
        }

        //Hacemos un cast de objeto a la clase que use el equals y lo guardamos
        en una variable de esa clase
        Alumno al = (Alumno) o;

        //devolvemos el resultado de hacer un equals entre un objeto y otro.
        devuelve true o false
        return this.dni.equals(al.dni);
    }
    Ejemplo2:
    //igual que el anterior, pero esta vez estamos usando varios atributos para el
    equals, deben cumplirse todos

    public boolean equals(Object o) {
        if (o == null) return false;
        if (!(o instanceof Alumno)) return false;
        Alumno al = (Alumno) o;
        return nombre.equals(al.nombre) && apellido1.equals(al.apellido1) && apellido2.equals(al.apellido2);
    }

    //HASHCODE
    El hashCode es un identificador unico, lo generamos automaticamente junto al equals.

    Ejemplo:
    HashCode para el Equals de dni
    @Override
    public int hashCode() {
        return Objects.hash(dni);
        (//return dni.hashCode(); //otra forma de hacerlo)
    }
     */
}
