/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author Luis Mario
 */
public class Opcion {
    private String nombre;
    private Node contenido;

    public Opcion(String nombre, Node contenido) {
        this.nombre = nombre;
        this.contenido = contenido;
    }

    public String getNombre() {
        return nombre;
    }

    public Node getContenido() {
        return contenido;
    }

    public AnchorPane obtenerVista() {
        // Puedes personalizar cómo se presenta la vista de la opción dentro del AnchorPane
        AnchorPane anchorPane = new AnchorPane();
        anchorPane.getChildren().add(contenido);
        // Puedes configurar la disposición y otros detalles según tus necesidades

        return anchorPane;
    }
}
