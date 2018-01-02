/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Emilio
 */
public class Comuna {

    //ATRIBUTOS:
    private String com_id_com;
    private int com_id_reg;
    private String com_nombre;

    /**
     * Constructor clase con acceso a base de datos
     *
     * @param id_comuna
     * @throws SQLException
     */
    public Comuna(String id_comuna) throws SQLException {
        String sql = "select com_id_com, "
                + "com_id_reg, "
                + "com_nombre"
                + "from EMDTCOM where com_id_com = '" + id_comuna + "';";
        ResultSet objRes;
        Conexion.sentencia = Conexion.conn.prepareStatement(sql);
        objRes = Conexion.sentencia.executeQuery(sql);

        while (objRes.next()) {
            //Atributos de la clase:
            setCom_id_com((String) objRes.getObject(1));
            setCom_id_reg((int) objRes.getObject(2));
            setCom_nombre((String) objRes.getObject(3));
        }
    }

    //GET Y SET
    public String getCom_id_com() {
        return com_id_com;
    }

    public void setCom_id_com(String com_id_com) {
        this.com_id_com = com_id_com;
    }

    public int getCom_id_reg() {
        return com_id_reg;
    }

    public void setCom_id_reg(int com_id_reg) {
        this.com_id_reg = com_id_reg;
    }

    public String getCom_nombre() {
        return com_nombre;
    }

    public void setCom_nombre(String com_nombre) {
        this.com_nombre = com_nombre;
    }

    /**
     * METODO LISTAR
     *
     * @param id_comuna
     * @return
     * @throws SQLException
     */
    public static ResultSet listarComuna(String id_comuna) throws SQLException {
        ResultSet objRes;

        String sql = "select com_id_com, "
                + "com_id_reg, "
                + "com_nombre"
                + " from EMDTCOM where com_id_com = '" + id_comuna + "';";
        Conexion.sentencia = Conexion.conn.prepareStatement(sql);
        objRes = Conexion.sentencia.executeQuery(sql);
        return objRes;
    }

    /**
     * 02-01-2018 METODO INGRESAR COMUNA
     *
     * @param id_comuna
     * @param id_region
     * @return
     * @throws java.sql.SQLException
     */
    public static boolean agregarComuna(String id_comuna, String id_region) throws SQLException {
        boolean resultado = false;

        try {
            String sql = "insert into EMDTCOM ("
                    + "com_id_com,"
                    + "com_id_reg,"
                    + "com_nombre)"
                    + "VALUES ('" + id_comuna + "'," + id_region + ", 'Quilpue');";
            Conexion.sentencia = Conexion.conn.prepareStatement(sql);
            Conexion.sentencia.execute(sql);
            resultado = true;
        } catch (Exception e) {
            resultado = false;
        }
        return resultado;
    }
}
