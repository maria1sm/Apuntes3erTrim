package Teoria;

public class ListasColeccionesIteradores {

    /*
    Por un lado tenemos los arrays, donde se implementaba el for para iterar
    y metodos como .length() para saber el tamaño. Además, el tamaño de los
    arrays no cambiaba una vez instanciado, sino que para "cambiarlo" había
    que crear un nuevo array de otra dimensión y copiar los valores del array
    antiguo en el nuevo

    Para las colecciones las cosas son diferentes, el tamaño cambia.

    Se organiza de la siguiente manera:
    Collection<> - I
        Set<> - I
            SortedSet<> - I
                TreeSet<> - C
            AbstractSet<> - I
                HashSet<> - C
        List<> - I
            ArrayList<> - C
            Vector<> - C
        Queue<> - I
            Deque<> - C


    Map<> - I
        SortedMap<> - C
    Separado de Collection está Map: son como diccionarios


    Set: NO duplicado
        No contiene elementos duplicados (sabe si un elemento esta duplicado
        según el criterio del equals). Puede contener como máximo un objeto null.

        Metodos:
            .add(Element)           añade un elemento
            .addAll(Collection)     añade todos los elementos de otra coleccion
            .clear()                elimina todos los elementos del Set
            .remove(Objeto)         elimina un elemento especifico del Set (si no esta en el set, devuelve false)
            .removeAll(Collection)  elimina del Set todos los elementos contenidos en otra colleccion especifica
            .contains(Objeto)       te dice si un objeto está en el set
            .containsAll(Collection)Ej: set1.contains(set2), devuelve true si todos los elementos de set2
                                    estan tambien en set1. set1 puede tener otros elementos extra
            .isEmpty()              devuelve true si el Set está vacío
            .iterator()             itera los elementos y te los devuelve
            .size()                 devuelve el tamaño del Set
            .toArray()              convierte en un array los elementos del Set

            podemos usar tambien forEach


        TreeSet: Ordenado y NO duplicados
            Implementa la interfaz TreeMap y SortedSet
            Además de NO contener elementor duplicados (al ser un Set),
            los elementos se ordenan por ordenación natural, es decir,
            se ordenan por defecto por el compareTo (Comparable<>).
            Si queremos darle otro orden podemos usar el compare (Comparator).

            Orden natural: creamos un TreeSet sin especificar orden
            Set<Clase> set = new TreeSet();

            Orden específico:
            Set<Clase> set = new TreeSet(new NombreComparator());

            Cambiar orden:
            Si queremos cambiar el orden cuando ya hemos creado el TreeSet,
            hay que declarar un nuevoTreeSet.

            Set<Clase> setNuevoOrden = new TreeSet(new NombreComparator());
            setNuevoOrden.addAll(set); //añadimos los elementos del setOriginal
            set = setNuevoOrden;

            //si en lugar de cambiar de ordenNatural a ordenEspecifico queremos que
            sea al reves, se  repiten los pasos pero en new TreeSet() ponemos los
            paréntesis vacíos y cojerá el orden natural

        HashSet: NO ordenado y NO duplicado
            Los elementos no estan ordenados ni tampoco duplicados.
            Puede haber elementos nulos.


    List: Ordenada y Duplicada
        La diferencia entre List y Set es que podemos elegir la posicion en la que insertamos el
        elemento.

        Cuidado! El orden por defecto de la lista no es el natural o el del compator, sino el orden
        en el que introduzcas los elementos.

        Metodos:
            .add(Element)           Añade el elemento en la siguiente posicion
            .add(index, Element)    Añade el elemento en la posicion especificada
            .addAll(Collection)     Añade a la lista todos los elementos de una collecion
            .addAll(index, Collection)Añade a la lista todos los elementos de una collecion, a partir de una posicion
            .clear()                Elimina todos los elementos
            .contains(Objeto)       Devuelve true si (usando el equals) el elemento está en la lista
            .containsAll(Collection)Ej: lista1.contains(lista2), devuelve true si todos los elementos de lista2
                                    estan tambien en lista1. lista1 puede tener otros elementos extra
            .isEmpty()              Devuelve true si esta vacia
            .iterator()             Itera y devuelve los elementos en el orden en el que estan
            .get(index)             Devuelve el elemento en la posicion especificada
            .IndexOf(Object)        Devuelve la posicion de un elemento en la lista, si no está devuelve un -1
            .lastIndexOf(Object)    Igual que indexOf, pero devuelve en su ultima ocurrencia (si se repite varias veces, la ultima vez)
            .remove(index)          Elimina el elemento de una posicion especifica
            .remove(Objeto)         Elimina un objeto especifico, si aparece 2 veces, elimina solo el primero
            .removeAll(Collection)  Elimina solo los elementos de la lista que tambien se encuentren en la Collection.
            .retainAll(Collection)  Elimina todos los elementos, menos los que tambien estén en la Collection.
                                    Devuelve True si hay elementos que se repiten, es decir, si borra algo.
            .set(index, elemento)   Reemplaza lo que haya en la posicion especificada por el el elemento que le pasamos.
            .size()                 Te dice el tamaño
            .sort()                 Te ordena por el orden natural o por el Comparator .sort(new NombreComparator)
            .subList(index1, index2)Te devuelve una porcion de la lista, desde index1(incluido) hasta index2(sin incluir)
            .toArray()              Devuelve la lista como un array


          Añadir elementos al inicializar:
          List lista = new ArrayList<>(List.of(
             "Primero",
                (2),
                3f,
                Double.valueOf(4),
                'M',
                false,
                new int [] {0,1,2,3,4,5,6,7,8,9}
            ));

          Tipos de lista:
            ArrayList: es como un array de capacidad variable
            LinkedList: Esta linkeada de manera doble, es decir, tiene dos punteros. Antes y despues del elemento
            Vector: Parecido a la LinkedList

            Dudo que entre la Linked y Vector.


    Queue: Interfaz que implementa Collection. Tiene como subinterfaz Deque.
    ArrayDeque es la clase que implementa Queue y Deque. Los metodos son parecidos
    a los de List. Por el nombre se intuye lo que hacen, es como si estuviera diseñado para
    una baraja de cartas.


    Map: Es una interfaz. Diseñada para almacenar una llave(key) y un valor.
    Las keys NO se pueden repetir, los valores sí.
        Metodos:
            .clear()                Elimina todas las entradas del mapa
            .containsKey(Key)       Devuelve true si la key esta en el mapa
            .containsValue(Value)   Igual pero con el valor
            .size()                 Devuelve el numero de entradas (Elementos key, value)
            .values()               Devuelve una Collection de los valores del mapa
            .keySet()               Te devuelve un Set de las keys que hay en el mapa
            .entry(Key, Value)      Devuelve la entrada de un mapa que contenga una llave y un valor especifico
            .entrySet()             Devuelve un Set con el mapa
            .get(Key)               Devuelve el valor asociado a esa key
            .isEmpty()              Te dice si esta vacio o no
            .put(key, value)        Añade una entrada al mapa, con un key y value especificos
            .putAll(Map)            Introduce todas las entradas de un mapa en otro
            .putIfAbsent(key, value)Añade una entrada si esa llave no existe todavia
                                    o si el valor de la llave existente es null (cambia el valor por el nuevo)
                                    Si añade o modifica la entrada, devuelve null. Si no la modifica, devuelve el valor
                                    asociado a la key actualmente.
            .remove(key)            Elimina la entrada asociada a esa key
            .remove(key, value)     Elimina una entrada para una key, solo si tambien coincide el valor
            .replace(key, value)    Reemplaza el valor de una entrada especifica. Tiene que estar asociada
                                    a un valor previamente
            .replace(key, oldValue, newValue)
                                    Reemplaza el valor de una entrada especifica, solo si tenia un
                                    valor especifico

    HasMap: permite tanto keys nulas como valores nulos
    Hastable
    TreeMap

    //¿Como iterar Map?
    Usamos un foreach y convertimos el mapa en un Set usando .entrySet()
    El entrySet devuelve un set, el tipo de objeto a iterar es un Map.Entry, que es una interfaz
    que trabaja con los set que devuelve .entrySet()
    En <'Key', 'Value'> ponemos la clase del Key (Integer, String...) y del Value (Alumno, Persona...)

    for(Map.entry<Key, Value> entrada: nombreMapa.entrySet()) {
        System.out.println(entrada.getKey() + ": " + entrada.getValue());
    }

    .getKey() y .getValue() son metodos de Map.Entry
    Otros metodos:
        .comparingByKey()       Ordena el Map.Entry por orden segun Key (pordemos poner un Comparator en los parentesis)
        .comparingByValue()     Ordena el Map.Entry por orden segun Value
        .setValue(Value)        Reemplaza el valor de esa entrada por el valor que le pasemos

    //Iterator
    Funciona con un puntero que se coloca antes de los elementos

    //Guardamos la collection (lista, vector, set...) en un iterator
    Iterator elementos = collection.iterator()

    //Hacemos un bucle y usamos .hasNext(), que comprueba que delante del puntero
    haya otro elemento. Cuando llega al final no hay mas elementos y termina.

    while(elementos.hasNext()) {
        //usamos .next() para mover el cursor y posicionarnos en el siguiente elemento
        //Hay que hacer cast a la clase del elemento, porque .next() devuelve un Object
        Clase elem = (Clase)elementos.next();

        //Hacemos lo que queramos en cada interaccion
        System.out.println("Elemento 1: " + elem)
    }


    El bucle termina cuando llega al final. Es importance hacer el .next()
    desde la primera iteracion, porque el cursor empieza apuntando fuera de
    los elementos, no en el primero

    //Iterar al reves:

    Iterator elementos2 = nombreCollection.iterator(nombreCollection.size());

    while(elementos2.hasPrevious()) {
        elementos2.previous();
    }

    //Enumerator
    Es como Iterator

    Enumeration elementos3 = nombreCollection.elements();

    while(elementos3.hasMoreElements()) {
        elementos3.nextElement();
    }








     */

}
