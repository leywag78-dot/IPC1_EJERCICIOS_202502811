
package tarea9;

public class Tarea9 {

    public static void main(String[] args) {
        
        //Parte 1//
        System.out.println("--------Parte 1 de la lista simple------\n");
        ListaEstudiantes lista = new ListaEstudiantes();
        
        lista.agregarFinal("202300001", "Ana Garcia", 85.5);
        lista.agregarFinal("202300002", "Carlos Lopez", 72.0);
        lista.agregarFinal("202300003", "Maria Perez", 91.0);
        lista.agregarInicio("202300000", "Juan Mendez", 60.0);
        
        lista.imprimirLista();
        
        NodoEstudiante enc = lista.buscarPorCarnet("202300002");
        if (enc != null)
            System.out.println("Encontrado: " + enc.nombre + " | Nota: " + enc.nota);

        System.out.printf("Promedio: %.2f%n", lista.obtenerPromedio());

        NodoEstudiante mejor = lista.obtenerMejorNota();
        if (mejor != null)
            System.out.println("Mejor nota: " + mejor.nombre + " (" + mejor.nota + ")");

        lista.eliminarPorCarnet("202300000");
        lista.imprimirLista();
        
        
        //Parte 2//
        System.out.println("------------Parte 2 Lista Doble-----------\n");
        ListaDobleEstudiantes doble = new ListaDobleEstudiantes();
        
        doble.insertarOrdenado("202300010", "Luis Ramos",    78.0);
        doble.insertarOrdenado("202300011", "Sofia Torres",  95.5);
        doble.insertarOrdenado("202300012", "Diego Flores",  55.0);
        doble.insertarOrdenado("202300013", "Valeria Cruz",  88.0);
        doble.insertarOrdenado("202300014", "Pedro Molina",  55.0);

        doble.imprimirAdelante();
        doble.imprimirAtras();

        doble.agregarInicio("202300020", "Elena Vásquez", 10.0);
        doble.agregarFinal("202300021",  "Roberto Díaz",  99.0);

        doble.eliminarPorCarnet("202300020");
        doble.eliminarPorCarnet("202300021"); 
        doble.eliminarPorCarnet("202300012"); 

        doble.imprimirAdelante();
        doble.imprimirAtras();
    }
    
}
