package reproductormusica;

import java.io.File;
import javax.swing.DefaultListModel;
import javax.swing.JList;

public class Lista {

    //Creando la clase de Nodo
    public static class Nodo {

        private File valor;
        private final String nombre;
        private final String artista;
        private final String tipo;
        Nodo siguiente;
        Nodo anterior;

        public Nodo(File valor, String nombre, String artista, String tipo) {
            this.valor = valor;
            this.siguiente = null;
            this.nombre = nombre;
            this.artista= artista;
            this.tipo = tipo;
            this.siguiente = null;
        }

        public Nodo getAnterior() {
            return anterior;
        }

        public File getValor() {
            return valor;
        }

        public Nodo getSiguiente() {
            return siguiente;
        }

        public String getNombre() {
            return nombre;
        }

        public String getArtista() {
            return artista;
        }

        public String getTipo() {
            return tipo;
        }

        public void setValor(File valor) {
            this.valor = valor;
        }

        public void setSiguiente(Nodo siguiente) {
            this.siguiente = siguiente;
        }

    }

    //Clase de lista
    Nodo primero;
    private int posicion;

    public Lista() {
        this.primero = null;
        this.posicion = 0;
    }

    public void insertar(File valor, String nombre, String artista, String tipo) {
        Nodo nodo = new Nodo(valor, nombre, artista, tipo);

        if (primero == null) {
            primero = nodo;
            nodo.siguiente = nodo;
        } else {
            nodo.siguiente = primero.siguiente;
            primero.siguiente = nodo;
            primero = nodo;
        }
    }

    public DefaultListModel<String> listar() {

        DefaultListModel<String> model = new DefaultListModel<>();

        if (primero != null) {
            Nodo actual = primero;

            do {
                model.addElement(actual.getValor().toString());
                actual = actual.siguiente;
                
            } while (actual != primero);
        } else {
            model.addElement("No hay canciones agregadas aun.");
        }

        return model;
    }

}
