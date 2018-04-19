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
public class Bebidas {

    private int precio;

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }
    private String nombre;

    public Bebidas(int precio, String nombre) {
        this.precio = precio;
        this.nombre = nombre;
    }
}
