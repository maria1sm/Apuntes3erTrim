package Teoria;

public class ComparableComparator {

    /*
    Comparable y Comparator son interfaces que permiten implementar los metodos
    compareTo() y compare()

    La diferencia entre ellos es que Comparable se implementa directamente en la
    clase del objeto y al hacer @Override convertimos esas reglas de comparación en
    el orden natural de ordenación. Cuando hagamos un Sort o usemos una colleción
    que ordene automáticamente los elementos, usará el Comparable (compareTo) por
    defecto.

    Cuando queramos hacer un override de estas interfaces, hay que implementarlas en
    la firma de la clase. Usaremos el nombre de la clase también:

    implements Comparable<NombreClase>
    implements Comparator<NombreClase>

    //Tipos de datos a comparar
    Cuando usamos Comparable usamos this.atributo y con Comparator hacemos o1.atributo
    Si usamos Comparator, al ser la firma del metodo compare(Objeto o1, Objeto o2)
    hay que especificar. Siempre será o1, o2 y al hacer el return es cuando cambia el orden

    1. Strings
    Usamos el compareTo por defecto:
    return o1.dato.compareTo(o2.dato);
    Nos va a comparar strings y los ordenará alfabeticamente

    2. int
    ordenar de menor a mayor:
    return o1.edad - o2.edad;

    para ordenar de mayor a menor:
    return o2.edad - o1.edad;

    3. float
    La firma del metodo sigue siendo int, al igual que con Strings, pero como altura es
    un float, tenemos que hacer cast y quitarle los decimales, pero redondeando para arriba
    en caso de ser positivo y para abajo en caso de ser negativo, para eso usamos
    Math.signum, que simplemente devuelve -1 para valores negativos, + 1 para positivos y 0
    cuando es 0.
    @Override
    public int compare(Alumno a1, Alumno a2) {
        if (a1 == null || a2 == null) {
            throw new IllegalArgumentException("Argumento nulo");
        }
        return (int) Math.signum(a1.altura - a2.altura);
    }

    //Comparator
    Para implementar Comparator hay que crear una clase nueva, con un nombre que
    indique qué ordenación sigue: "Ordenacion" + criterio + sentido (Asc/Desc) + "Comparator"
    Ejemplo: OrderByEdadAscComparator

    1. En la firma implementamos la interfaz Comparator<NombreClase>
    El nombre de la clase es la del objeto original que estamos comparando,
    no "OrderByEdadAscComparator".

    2. Hacemos @Override
    @Override
    public int compare(Alumno o1, Alumno o2) {
        if(o1 == null || o2 == null) {
            throw new IllegalArgumentException("Argumento nulo");
        }
        return o1.edad - o2.edad;
    }

    3. Opcionalmente generamos el reversed, que cambia el sentido (p.ej: de asc a desc)
    Lo genera intelliJ
    @Override
    public Comparator<Alumno> reversed() {
        return Comparator.super.reversed();
    }

    Para ordenar listas tenemos el .sort() y para Set hay que volver a instanciar
    el objeto y pasarle el criterio de comparacion. Explicado en ListasColecciones.

    */
}
