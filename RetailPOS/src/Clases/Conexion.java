/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Statement;
import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.util.Calendar;

/**
 *
 * @author
 */
public class Conexion {

    /*
     * Varialbes para conexion Remota a otra BD desde la Internet.
     */
    public static String bd = "maty2907_BEMP001";
    //public static String bd = "bdretail";
    public static String login = "maty2907_retail";
    //public static String login = "root";
    public static String password = "comercio123.";
    //public static String password = "";
    public static int port = 3306;
    public static String host = "192.254.250.166";
    //public static String host = "localhost";
    public static String url = "jdbc:mysql://" + host + ":" + port + "/" + bd;

    /*
     *  Variables estaticas para poder utilizarlas como variables generales desde cualquier clase, frame.
     */
    public static Connection conn;
    public static Statement sentencia;
    public static String CONEXION_USERID_OK;
    public static String CONEXION_USERID_KO;
    public static String CONEXION_USERID_AN;

    public static void conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, login, password);
            if (conn != null) {
                System.out.println("Conectó a :" + url);
            }
        } catch (SQLException ex) {
            System.out.println("Conexion.conn : " + Conexion.conn);
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "No existe conexión con la Base de Datos BdRetail \nRevise si tiene conexion a internet",
                    "Mensaje del sistema", 3);
            System.exit(0);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, ex);
            System.exit(0);
        }
    }

    public static void desconectar() throws SQLException {
        System.out.println("Desconectó de la BD");
        conn.close();
    }

}
