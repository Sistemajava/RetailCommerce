package retailpos;

import Clases.Comuna;
import Clases.Conexion;
import Clases.Perfil;
import Clases.Sucursal;
import clases.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;

public class RetailPOS {

    public static void main(String[] args) throws SQLException {
        Conexion.conectar();

        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame login = new frmAcceso();
        login.setLocationRelativeTo(null);
        login.setResizable(false);
        login.setVisible(true);

        //LISTADO DE CAMPOS DE USUARIO:
        ResultSet listadousuario = Usuario.listarUsuarios("0001");
        while (listadousuario.next()) {
            //nombre de las columnas:
            System.out.println("USUARIO : " + listadousuario.getString(1) + "/" + listadousuario.getString(2) + "/" + listadousuario.getString(3));
        }

        //LISTADO DE CAMPOS DE SUCURSAL:
        ResultSet listasucu = Sucursal.listarSucursal("0002");
        while (listasucu.next()) {
            //nombre de las columnas:
            System.out.println("SUCURSAL : " + listasucu.getString(1) + "/" + listasucu.getString(2) + "/" + listasucu.getString(3));
        }

        //LISTADO DE CAMPOS DE PERFIL:
        ResultSet listadoperfil = Perfil.listarPerfil("1");
        while (listadoperfil.next()) {
            //nombre de las columnas:
            System.out.println("PERFIL : " + listadoperfil.getString(1) + "/" + listadoperfil.getString(2) + "/" + listadoperfil.getString(3));
        }

        //   Conexion.desconectar();
    }
}
