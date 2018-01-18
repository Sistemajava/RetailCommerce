package retailpos;

import Clases.Conexion;
import java.sql.SQLException;
import javax.swing.JFrame;

public class RetailPOS {

    public static void main(String[] args) throws SQLException {        
        Conexion.conectar();

        JFrame.setDefaultLookAndFeelDecorated(true);
       // JFrame login = new frmAcceso();
       // login.setLocationRelativeTo(null);
       // login.setResizable(false);
       // login.setVisible(true);
       
       Conexion.CONEXION_USERID_OK = "0001";
       JFrame menuprin = new frmMenuPrincipal();
       menuprin.setLocationRelativeTo(null);
       menuprin.setResizable(false);
       menuprin.setVisible(true);

    }

}
