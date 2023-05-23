package Teoria;

public class ExcepcionesTryCatch {
    /*
    //EXCEPCIONES
    Las excepciones son fallos que lanza el programa cuando hay algun error.
    Estan las excepciones que lanza java por defecto, p.ej: cuando introducimos un
    string en el escaner de int. Tiene un nombre especifico (ArithmeticException)

    Cuando estamos programando un metodo podemos lanzar una excepcion de java
    bajo una condicion específica.
    Ejemplo:

    if (a == null) {
        throw new IllegalArgumentExcepction("El objeto no puede ser null");
    }

    Esto hace que si en el metodo nos meten un objeto null, el metodo no continue.

    //TRY-CATCH
    Si no queremos que el programa casque al usar este metodo, debemos usar un
    try catch que captura esta excepcion especifica o cualquiera (Exception e).

    try {
        metodo(null)
        resto de operaciones...
    } catch (IllegalArgumentException e) {
        e.printStackTrace();
    }

    De esta manera dejamos que el programa continue a pesar de que el metodo falle y
    si metemos otras operaciones (p. ej: cosas que usen el resultado del metodo
    anterior) no se van a completar tampoco. Si el metodo NO lanza la excepcion,
    las operaciones sí se completan.

    e.printStackTrace() lo que hace es imprimir en rojo el nombre de la excepcion
    y el mensaje que pusimos en el throw

    //EXCEPCIONES PERSONALIZADAS
    Para dar mas informacion sobre los posibles fallos de nuestro programa, en lugar
    de hacer throw de una excepcion generica, vamos a lanzar una excepcion propia

    Hay que crear una clase que se llame nombre + Exception y que extienda de Exception

    Ejemplo:
    public class RegistroClienteException extends Exception{
        public RegistroClienteException(String message) {
            super(message);
        }
    }

    Cuando lancemos esta excepcion en un metodo, debemos poner en la firma del metodo
    un 'throws NombreDeLaExcepcion' y en el main debemos capturar la posible excepcion,
    y nos va a marcar en rojo que es posible que la lance

    A veces, dentro del catch, en lugar de un e.printStackTrace() podemos querer
    lanzar otra excepcion.
    Por ejemplo, en un registro de cliente, si cualquier cosa falla,
    en el catch ponemos (Exception e) para capturar cualquier excepcion
    y lanzamos otra excepcion con throws new RegistroClienteException ("Fallo en el registo").

    Es en el main cuando debemos capturar la excepcion de RegistroCliente e imprimir
    el error con e.printStackTrace();

    //El throws Exception en la firma del metodo vamos a saber cuando ponerlo,
    porque el programa nos lo va a chivar (normalmente)


    */

}
