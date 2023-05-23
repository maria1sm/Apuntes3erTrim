package Teoria;

import java.util.ArrayList;

public class HerenciasAtributosModificadores {
    public static void main(String[] args) {
        //HERENCIAS Y ATRIBUTOS

        //////
        /*Abstract: Cuando no vamos a instanciar objetos de una clase, la clase es abstracta.
        A su vez, si no vamos a implementar un metodo en esa clase pero sí lo vamos a declarar (para que sea
        desarrollado en clases hijas), el metodo debe ser abstracto, ponemos solo la firma.
        Cuando una clase tiene un metodo abstracto, la clase debe ser abstract. El resto de metodos no
        tienen por qué ser abstractos/
         */

        //////
        /*Extends: significa que esa clase hereda de otra clase padre. Hereda metodos y atributos*/


        //////
        /*Implements: lo mismo que extends, pero para interfaces*/


        //////
        /*Interfaz: es como una clase abstracta, no podemos instanciar objetos de una interfaz y
        todos los metodos que incluyamos deben contener solo la firma. Se usa para que todas las clases que
        implementen la interfaz sigan una serie de normas fijas, dan uniformidad.

        Ejemplo1: queremos una clase Lucha
        que permita que los personajes, sean de la clase que sea, puedan luchar, pero no queremos que ningun personaje
        pueda ser unicamente luchador.
        Ejemplo2: tenemos una aplicacion de bibliotecas y queremos que cada biblioteca, a parte de sus atributos y
        metodos propios tengan unos comunes, dando uniformidad a todas las bilbiotecas que usen la app
        */


        //////
        /*Instanciar objetos:
        1.
        Clase nombre1 = new Clase (atributos constructor)

        2.
        ClasePadre nombre2 = new ClaseHija (atributos constructor)

        Cuando hacemos la segunda opción estamos haciendo que solo se puedan usar los metodos de la clase padre,
        pero por dentro, el objeto sigue siendo de la clase hija. Si hacemos un instanceof ClaseHija va a devolver true.
        Al igual que si hacemos un nombre2.getClass(), nos dirá que es ClaseHija.

        Esto es útil tanto para declarar objetos y limitar los métodos que se usan en ese objeto.
        Tambien se puede usar al declarar atributos. Al hacer public ClasePadre nombre2; estamos dando libertad para que
        dentro de ese atributo se declare cualquier clase hija. Por ejemplo: en un colegio, si estamos guardando al personal del centro
        podemos poner public HashSet<Personal> personal; y guardar dentro tanto profesores,
        como personal de limpieza, administrativos, etc.
        */


        //////
        /*Final y static

        Final:
            - Una clase es final cuando no tiene clases hijas
            - Un atributo es final cuando:
                - Si es un atributo no mutable: no va a cambiar su valor.
                - Si es un objeto: solo se va a instanciar una vez, su valor puede cambiar, pero su referencia
                siempre va a ser la misma
            - Un metodo es final cuando no se puede hacer override en clases hijas que lo implementen.

        Static:
            - Un atributo es static cuando es igual para todas las instancias de la clase, es decir,
            (cada vez que hacemos un new Clase) el atributo puede cambiar su valor, pero si en
            alumno1.setAtributoStatic(2) cambiamos el valor a 2, en alumno2 ese atributo tambien va a cambiar a dos.
            Por ejemplo: el ejemplo de id para material de una biblioteca que puso Jorge (ejemplo mas adelante)
            - Un metodo es static cuando, al igual que con el atributo, el metodo pertenece a una clase y no a
            la instancia de una clase. Un metodo estatico se puede usar sin haber instanciado
            previamente objetos de esa clase. (No termino de entender esto bien al 100%, pero en
            general en el examen entran metodos NO estáticos)
        */


        //////
        /*Modificadores de acceso
        - Private: solo se puede acceder desde la misma clase. Si queremos acceder a un atributo private desde
        fuera hay que hacer un getter con otro modificador (public, default...)
        - Default: si no ponemos nada se pone en default. Se puede acceder desde la clase y desde el
        mismo paquete (carpeta), es decir, podemos acceder desde otras clases del mismo paquete.
        - Protected: Misma clase, mismo paquete y subclase, desde la clase que hereda (extienda) de la clase padre,
        podemos acceder al atributo, metodo o constructor.
        - Public: podemos acceder desde cualquier sitio

        Para el examen, al no trabajar con paquetes en princpio da igual entre uno y otro.
        Solo hay que saber que los atributos se suelen poner en private o default (joaquin uso mucho este)
        y los metodos se ponen en public.

        ¡¡Cuidado!! porque podría entrar a propósito lo de los paquetes
        y entonces hay que tenerlo en cuenta.
        */

    }
}