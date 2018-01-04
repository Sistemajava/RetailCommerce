package retailpos;

import Clases.Conexion;
import clases.Usuario;
import java.sql.SQLException;
import javax.swing.JFrame;

public class RetailPOS {

    public static void main(String[] args) throws SQLException {
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        Conexion.conectar();

        // boolean valida = Usuario.agregarUsuario("0013",3,"0001");
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame login = new frmAcceso();
        login.setLocationRelativeTo(null);
        login.setResizable(false);
        login.setVisible(true);

        //LISTADO DE CAMPOS DE USUARIO:
        //    ResultSet listadousuario = Usuario.listarUsuarios("0001");
        //    while (listadousuario.next()) {
        //nombre de las columnas:
        //        System.out.println("USUARIO : " + listadousuario.getString(1) + "/" + listadousuario.getString(2) + "/" + listadousuario.getString(3));
        //    }
        //   Conexion.desconectar();
    }

}
