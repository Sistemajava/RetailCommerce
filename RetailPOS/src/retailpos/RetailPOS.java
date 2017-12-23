package retailpos;

import Clases.Conexion;
import clases.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RetailPOS {

    public static void main(String[] args) throws SQLException {

        Conexion.conectar();        
        ResultSet listaU = Usuario.listarUsuarios("0002");
        System.out.println("se llama metodo listar.");
        while (listaU.next()) {
            String id_usua = listaU.getString(1);
            String usu_nombre = listaU.getString(2);
            System.out.println("USUARIO ID :" + id_usua + "  ->   " + usu_nombre);
        }

        Conexion.desconectar();

    }

}
