/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menurestaurante;

/**
 *
 * @author Estudiantes
 */
public class Postres {

    private String nombre;
    private int precio;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public Postres(int precio, String nombre) {
        this.precio = precio;
        this.nombre = nombre;
    }
}
