/*
Autor:Ramiro
Fecha creación:07/03/2022
Fecha actualización: 07/03/2022
Descripción: Se crea una clase de nombre Persona.

 */
package entity;

/**
 *
 * @author labtw08
 */
public class Persona {

    private String nombre;
    private String sexo;
    private int    edad;

    public Persona() {
    }

    public Persona(String nombre, String sexo, int edad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

     
    
}
