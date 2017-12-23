/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retailpos;

import Clases.Conexion;
import java.sql.SQLException;

/**
 *
 * @author Peter
 */
public class RetailPOS {
    
    public static void main(String[] args) throws SQLException{

        Conexion.conectar();
        Conexion.desconectar();
    }
    
}
