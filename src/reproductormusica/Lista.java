package reproductormusica;

import java.io.File;
import javax.swing.DefaultListModel;
import javax.swing.JList;

public class Lista {

    public static class Nodo {

        private final File valor;
        private final String nombre;
        private final String artista;
        private final String tipo;
        Nodo siguiente;

        public Nodo(File valor, String nombre, String artista, String tipo) {
            this.valor = valor;
            this.nombre = nombre;
            this.artista = artista;
            this.tipo = tipo;
            this.siguiente = null;
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

        public void setSiguiente(Nodo siguiente) {
            this.siguiente = siguiente;
        }
    }

    // Lista class
    Nodo primero;
    Nodo ultimo;

    public Lista() {
        this.primero = null;
        this.ultimo = null;
    }

    public void insertar(Nodo nodo) {
        if (primero == null) {
            primero = nodo;
            nodo.siguiente = nodo;
            ultimo = nodo;
        } else {
            nodo.siguiente = primero;
            ultimo.siguiente = nodo;
            ultimo = nodo;
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
            model.addElement("No hay canciones agregadas aún.");
        }

        return model;
    }
}
