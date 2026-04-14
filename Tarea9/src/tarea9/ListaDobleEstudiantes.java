
package tarea9;

public class ListaDobleEstudiantes {
    private NodoEstudianteDoble head;
    private NodoEstudianteDoble tail;

    public ListaDobleEstudiantes() {
        this.head = null;
        this.tail = null;
    }

    // O(1)
    public void agregarInicio(String carnet, String nombre, double nota) {
        NodoEstudianteDoble nuevo = new NodoEstudianteDoble(carnet, nombre, nota);
        if (head == null) { head = nuevo; tail = nuevo; return; }
        nuevo.siguiente = head;
        head.anterior = nuevo;
        head = nuevo;
    }

    // O(1)
    public void agregarFinal(String carnet, String nombre, double nota) {
        NodoEstudianteDoble nuevo = new NodoEstudianteDoble(carnet, nombre, nota);
        if (tail == null) { head = nuevo; tail = nuevo; return; }
        nuevo.anterior = tail;
        tail.siguiente = nuevo;
        tail = nuevo;
    }

    // O(n) — maneja los 4 casos: único, head, tail, intermedio
    public boolean eliminarPorCarnet(String carnet) {
        if (head == null) return false;
        NodoEstudianteDoble actual = head;
        while (actual != null) {
            if (actual.carnet.equals(carnet)) {
                if (actual == head && actual == tail) { head = null; tail = null; }
                else if (actual == head)              { head = head.siguiente; head.anterior = null; }
                else if (actual == tail)              { tail = tail.anterior; tail.siguiente = null; }
                else {
                    actual.anterior.siguiente = actual.siguiente;
                    actual.siguiente.anterior = actual.anterior;
                }
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    // O(n)
    public void imprimirAdelante() {
        if (head == null) { System.out.println("La lista está vacía."); return; }
        System.out.println("=== Lista ===");
        NodoEstudianteDoble actual = head;
        int i = 1;
        while (actual != null) {
            System.out.println(i + ". Carnet: " + actual.carnet
                    + " | Nombre: " + actual.nombre
                    + " | Nota: " + actual.nota);
            actual = actual.siguiente;
            i++;
        }
        System.out.println("==========================");
    }

    // O(n)
    public void imprimirAtras() {
        if (tail == null) { System.out.println("La lista está vacía."); return; }
        System.out.println("=== Lista ===");
        NodoEstudianteDoble actual = tail;
        int i = 1;
        while (actual != null) {
            System.out.println(i + ". Carnet: " + actual.carnet
                    + " | Nombre: " + actual.nombre
                    + " | Nota: " + actual.nota);
            actual = actual.anterior;
            i++;
        }
        System.out.println("==========================");
    }

    // O(n) — inserta manteniendo orden ascendente por nota
    public void insertarOrdenado(String carnet, String nombre, double nota) {
        NodoEstudianteDoble nuevo = new NodoEstudianteDoble(carnet, nombre, nota);
        if (head == null)      { head = nuevo; tail = nuevo; return; }
        if (nota <= head.nota) { nuevo.siguiente = head; head.anterior = nuevo; head = nuevo; return; }
        if (nota >= tail.nota) { nuevo.anterior = tail; tail.siguiente = nuevo; tail = nuevo; return; }
        NodoEstudianteDoble actual = head.siguiente;
        while (actual != null && actual.nota < nota) actual = actual.siguiente;
        NodoEstudianteDoble previo = actual.anterior;
        previo.siguiente = nuevo;
        nuevo.anterior   = previo;
        nuevo.siguiente  = actual;
        actual.anterior  = nuevo;
    }
}
