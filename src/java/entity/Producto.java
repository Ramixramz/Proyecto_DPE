
/*
Autor:Ramiro
Fecha creación:07/03/2022
Fecha actualización: 07/03/2022
Descripción: Se crea una clase de nombre producto.

 */
package entity;

import java.util.ArrayList;

/**
 *
 * @author labtw08
 */
public class Producto {

    private String codigo;
    private String nombre;
    private Double precio;
    private String descripcion;

    public Producto() {
    }

    public Producto(String codigo, String nombre, Double precio, String descripcion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public static void main(String[] args) {

        int i;
        int n = 3;

        Producto p1 = new Producto();
        Producto p2 = new Producto();
        Producto p3 = new Producto();

        Usuario usr1 = new Usuario();
        Usuario usr2 = new Usuario();
        Usuario usr3 = new Usuario();

        ArrayList<Producto> sport = new ArrayList<>();
        ArrayList<Usuario> usr = new ArrayList<>();

        p1.setCodigo("456");
        p1.setNombre("Pants");
        p1.setPrecio(50.00);
        p1.setDescripcion("negro");

        p2.setCodigo("4789");
        p2.setNombre("Short");
        p2.setPrecio(100.00);
        p2.setDescripcion("Bermuda");

        p3.setCodigo("5559");
        p3.setNombre("Playera");
        p3.setPrecio(150.00);
        p3.setDescripcion("Deportiva");

        usr1.setCodigo("4589");
        usr1.setNombreUsuario("Alexis");
        usr1.setContraseña("alex12");
        usr1.setNombre("Alejandro");
        usr1.setEdad(22);
        usr1.setSexo("Masculino");

        usr2.setCodigo("2224");
        usr2.setNombreUsuario("David");
        usr2.setContraseña("Davis456");
        usr2.setNombre("David");
        usr2.setEdad(20);
        usr2.setSexo("Masculino");

        usr3.setCodigo("5555");
        usr3.setNombreUsuario("Maria");
        usr3.setContraseña("Mari123");
        usr3.setNombre("Maria");
        usr3.setEdad(20);
        usr3.setSexo("Femenino");

        sport.add(p1);
        sport.add(p2);
        sport.add(p3);

        usr.add(usr1);
        usr.add(usr2);
        usr.add(usr3);

        for (i = 0; i < n; i++) {
            System.out.println("codigo" + sport.get(i).getCodigo());
            System.out.println("Nombre" + sport.get(i).getNombre());
            System.out.println("Precio" + sport.get(i).getPrecio());
            System.out.println("Descripcion" + sport.get(i).getDescripcion());

        }

        for (i = 0; i < n; i++) {
            System.out.println("codigo" + usr.get(i).getCodigo());
            System.out.println("Nombre" + usr.get(i).getNombreUsuario());
            System.out.println("Precio" + usr.get(i).getContraseña());
            System.out.println("Descripcion" + usr.get(i).getNombre());
            System.out.println("Descripcion" + usr.get(i).getEdad());
            System.out.println("Descripcion" + usr.get(i).getSexo());

        }

    }

}
