package problema02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Enlace {

    private Connection conn;

    public void establecerConexion() {

        try {
            // db parameters  
            String url = "jdbc:sqlite:bd/base001.base";
            // create a connection to the database  
            conn = DriverManager.getConnection(url);
            // System.out.println(conn.isClosed());
            // System.out.println("Connection to SQLite has been established.");  

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public Connection obtenerConexion() {
        return conn;
    }

    public ArrayList<Calificacion> obtenerDataCalificaciones() {
        ArrayList<Calificacion> lista = new ArrayList<>();
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from estudiante;";

            ResultSet rs = statement.executeQuery(data);
            while (rs.next()) {
                Calificacion miC = new Calificacion(rs.getString("nombre"),
                        rs.getString("apellido"), rs.getDouble("calificacion1"),
                        rs.getDouble("calificacion2"), rs.getDouble("calificacion3"));
                miC.calcularPromedio();
                lista.add(miC);
            }

            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: insertarCalificaciones");
            System.out.println(e.getMessage());

        }
        return lista;
    }

}
