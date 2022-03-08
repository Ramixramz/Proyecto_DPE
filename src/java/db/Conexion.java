/*
Autor:Ramiro
Fecha creación:08/03/2022
Fecha actualización: 07/03/2022
Descripción: Se crea una clase de nombre Conexión.

 */
package db;

import java.sql.Connection;

/**
 *
 * @author labtw08
 */
public class Conexion {
    private  Connection connection;
    private String url;
    private  String user;
    private  String pwd;

    
   
    public Conexion() {
    }

    public Connection getConector() {
        return connection;
    }

    public Connection getDesconectar() {
        return connection;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

  public static void main(String[] args) {
      
  }    
    
    
}
