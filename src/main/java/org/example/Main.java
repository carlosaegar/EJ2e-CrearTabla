package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {

        String url ="jdbc:oracle:thin:@localhost:1521:xe";
        String usuario = "RIBERA";
        String contraseña = "ribera";

        try(Connection conn = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conn.createStatement()){

            String sql = "CREATE TABLE empleado(" +
                    "id NUMBER PRIMARY KEY, " +
                    "nombre VARCHAR2(100), " +
                    "salario NUMBER(10, 2))";
            statement.executeUpdate(sql);
            System.out.println("Tabla 'EMPLEADO' creada");



        }catch(SQLException e ){
            System.out.println("Error al crear la tabla" + e.getMessage());
        }

    }
}
