package retailpos;

import Clases.Comuna;
import Clases.Conexion;
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
       
         
        ResultSet listasucu = Sucursal.listarSucursal("0002");
        while (listasucu.next()) {
            //nombre de las columnas:
            System.out.println("SUCURSAL : "+listasucu.getString(1)+"/"+listasucu.getString(2)+"/"+listasucu.getString(3));
        }
        
     //   Conexion.desconectar();
    }
}
