package Teoria;

public class Clone {
    //Clone, Equals, Comparable, Comparator


    //////
    /*Clone
    Si hacemos esto
        Objeto o1 = new Objeto();
        Objeto o2 = o1;
    lo que estamos haciendo es copiar la referencia de o1 en o2. Si cambiamos o1
    cambia o2 y viceversa.

    Para copiar objetos usamos el clone.
    El clone hace una copia del objeto (con sus atributos incluidos) bajo una referencia nueva.

    Atributos NO mutables: primitivos y strings.
    Atributos mutables: objetos (alumno, ingrediente, persona...) y colecciones, listas, arrays...

    Cuando clonamos un objeto, se copian tal cual los 'atributos NO mutables', pero
    de los 'atributos mutables' se copia sólo la referencia.
    Es decir, cuando cambiemos el valor noMutable1 del Objeto2 (clonado del 1) a (2),
    el noMutable1 del Objeto1 sigue siendo (1) p.ej.
    Pero si cambiamos el valor mutable1 del o2 (clonado) (imaginemos que es un array de notas
    y le ponemos notas nuevas al o2), el mutable1 del Objeto1 tambien va a cambiar y no queremos que eso ocurra.

    Para evitar eso, además de hacer o2 = o1.clone(); hay que clonar también los objetos
    o atributos mutables.

    Ejemplo1:
    Clone normal, copiamos los datos de un objeto en uno nuevo.

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    Ejemplo2:
    Clone de un objeto que contiene atributos mutables
    (array de primitivos, array de objetos, lista y objetos)
    //Constructor de ejemplo
    public Objeto (String noMutable1, int noMutable2, int [] mutable1, Alumno [] mutable 2,
                    List<Alumno> mutable3, Alumno mutable4) {

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        1. Array de enteros
        //creamos un array nuevo, donde vamos a clonar el anterior (le damos mismo length)
        int [] arrayInt = new int[mutable1.length]

        //bucle que recorra el array y lo copie en el nuevo
        for(int i = 0; i < array.length; i++) {
            array[i] = mutable1[i];
        }

        2. Array de objetos
        //creamos array de objetos nuevo (cuando digo objeto me refiero a una clase
        específica: Alumno, Ingrediente, etc...)
        Objeto [] arrayObjeto = new Objeto[mutable2.length];

        //bucle que recorra el array, copiando en cada posicion clones de cada
        objeto
        for (int i = 0; i < arrayObjeto.length; i++) {
            arrayObjeto[i] = (Clase) mutable2[i].clone();
            Hay que hacer un .clone() del objeto que contiene el array, para eso
            previamente hay que ir a la clase de ese objeto (p.ej: alumno) e implementar
            la interfaz Cloneable junto con el @Override del clone
            Además, hay que hacer un cast a la clase del objeto, es este caso sería
            un cast a Alumno --> (Alumno) mutable2[i].clone() Esto se hace porque
            el metodo clone devuelve un Objeto y nosotros queremos un Alumno
        }

        3. Lista
        //creamos lista nueva del objeto que corresponja (ej:Alumno)
        List<Objeto> lista = new ArrayList<>();

        //hacemos un foreach y clonamos los objetos de cada posicion
        for (Objeto objeto: mutable3) {
            lista.add( (Clase)objeto.clone() );
            //añadimos el objeto haciendo un .clone() Previamente hay que implementar
            interfaz Cloneable y @Override en el objeto que estemos clonando y hacer
            un cast a la clase de la que sea el objeto. p.ej: (Alumno) objeto.clone();
        }

        4. Objeto
        //Hacemos un clone, habiendo implementado anteriormente el Cloneable en el objeto original
        y casteando
        Objeto objetoClon = (Clase) mutable4.clone();

        //ahora devolvemos un nuevo objeto, con el mismo valor en los
        atributos no mutables y con los mutables copiados "a mano" para evitar
        copiar la referencia

        return new NombreClase(noMutable1, noMutable2, arrayInt, arrayObjeto, lista, objetoClon);

        En el return hay que devolver un Objeto de la clase que sea, p.ej: Persona, Ingrediente...
        Es la clase de la que estamos haciendo el clon
    }

    //En cada clase en la que se haga un @Override de clone() hay que implementar la interfaz
    Cloneable. Ejemplo:

    public class NombreClase implements Cloneable{

        //atributos

        //constructor

        //metodos

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

    }

    */



}
