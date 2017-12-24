package retailpos;

import Clases.Conexion;
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
        

        
        ResultSet listaU = Usuario.listarUsuarios("0002");
        System.out.println("se llama metodo listar.");
        while (listaU.next()) {
            //nombre de las columnas:
            String id_usua = listaU.getString(1);
            String id_perfil = listaU.getString(2);
            String usu_nombre = listaU.getString(3);
            String usu_apell1 = listaU.getString(4);
            String usu_apell2 = listaU.getString(5);
            String usu_dni = listaU.getString(6);
            String usu_passw = listaU.getString(7);
            String usu_estado = listaU.getString(8);
            String usu_fec_esta = listaU.getString(9);
            String usu_ind_jefe = listaU.getString(10);
            String usu_fec_alta = listaU.getString(11);
            String usu_fec_lic_desde = listaU.getString(12);
            String usu_fec_lic_hasta = listaU.getString(13);
            String usu_conexion = listaU.getString(14);
            String usu_fec_bloq = listaU.getString(15);
            String usu_hor_bloq = listaU.getString(16);
            String usu_tst_creacion = listaU.getString(17);
            String usu_tst_modific = listaU.getString(18);
            String usu_usr_creacion = listaU.getString(19);
            String usu_usr_modific = listaU.getString(20);

            System.out.println(
                    "\n--DATOS DE USUARIO--"
                    + "\nUSUARIO ID :" + id_usua
                    + "\nPerfil" + id_perfil
                    + "\nNombre: " + usu_nombre
                    + "\nApellido 1: " + usu_apell1
                    + "\nApellido 2: " + usu_apell2
                    + "\nDni: " + usu_dni
                    + "\nPassword: " + usu_passw
                    + "\nEstado: " + usu_estado
                    + "\nFecha estado: " + usu_fec_esta
                    + "\nIndice jefe: " + usu_ind_jefe
                    + "\nFecha alta: " + usu_fec_alta
                    + "\nFecha inicio licencia: " + usu_fec_lic_desde
                    + "\nFecha fin licencia: " + usu_fec_lic_hasta
                    + "\nConexion: " + usu_conexion
                    + "\nFecha bloqueo: " + usu_fec_bloq
                    + "\nHora bloqueo: " + usu_hor_bloq
                    + "\nTST creacion: " + usu_tst_creacion
                    + "\nTST modificacion: " + usu_tst_modific
                    + "\nUSR creacion: " + usu_usr_creacion
                    + "\nUSR modificacion: " + usu_usr_modific);
        }
     //   Conexion.desconectar();
    }
}
