package tarea9;

public class ListaEstudiantes {
    private NodoEstudiante head;

    public ListaEstudiantes() {
        this.head = null;
    }

    public void agregarInicio(String carnet, String nombre, double nota) {
        NodoEstudiante nuevo = new NodoEstudiante(carnet, nombre, nota);
        nuevo.siguiente = head;
        head = nuevo;
    }

    public void agregarFinal(String carnet, String nombre, double nota) {
        NodoEstudiante nuevo = new NodoEstudiante(carnet, nombre, nota);
        if (head == null) { head = nuevo; return; }
        NodoEstudiante actual = head;
        while (actual.siguiente != null) actual = actual.siguiente;
        actual.siguiente = nuevo;
    }

    public boolean eliminarPorCarnet(String carnet) {
        if (head == null) return false;
        if (head.carnet.equals(carnet)) { head = head.siguiente; return true; }
        NodoEstudiante actual = head;
        while (actual.siguiente != null) {
            if (actual.siguiente.carnet.equals(carnet)) {
                actual.siguiente = actual.siguiente.siguiente;
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    public NodoEstudiante buscarPorCarnet(String carnet) {
        NodoEstudiante actual = head;
        while (actual != null) {
            if (actual.carnet.equals(carnet)) return actual;
            actual = actual.siguiente;
        }
        return null;
    }

    public void imprimirLista() {
        if (head == null) { System.out.println("La lista está vacía."); return; }
        System.out.println("---- Lista de Estudiantes ----");
        NodoEstudiante actual = head;
        int i = 1;
        while (actual != null) {
            System.out.println(i + ". Carnet: " + actual.carnet
                    + " | Nombre: " + actual.nombre
                    + " | Nota: " + actual.nota);
            actual = actual.siguiente;
            i++;
        }
        System.out.println("============================");
    }

    public double obtenerPromedio() {
        if (head == null) return 0.0;
        double suma = 0.0;
        int count = 0;
        NodoEstudiante actual = head;
        while (actual != null) { suma += actual.nota; count++; actual = actual.siguiente; }
        return suma / count;
    }

    public NodoEstudiante obtenerMejorNota() {
        if (head == null) return null;
        NodoEstudiante mejor = head;
        NodoEstudiante actual = head.siguiente;
        while (actual != null) {
            if (actual.nota > mejor.nota) mejor = actual;
            actual = actual.siguiente;
        }
        return mejor;
    }
}