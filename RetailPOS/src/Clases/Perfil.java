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
public class Perfil {

    //ATRIBUTOS:
    private String per_id_per;
    private String per_nombre_per;
    private char per_estado;
    private String per_fec_esta;
    private char per_aut_info;
    private char per_aut_vent;
    private char per_aut_gest;
    private char per_aut_cmpr;
    private String per_tst_creacion;
    private String per_tst_modific;
    private String per_usr_creacion;
    private String per_usr_modific;

    /**
     * Constructor clase con acceso a base de datos
     *
     * @param id_perfil
     * @throws SQLException
     */
    public Perfil(String id_perfil) throws SQLException {
        String sql = "select per_id_per, "
                + "per_nombre_per, "
                + "per_estado,"
                + "per_fec_esta,"
                + "per_aut_info,"
                + "per_aut_vent,"
                + "per_aut_gest,"
                + "per_aut_cmpr,"
                + "per_tst_creacion,"
                + "per_tst_modific,"
                + "per_usr_creacion,"
                + "per_usr_modific"
                + "from EMDTPER where com_id_com = '" + id_perfil + "';";
        ResultSet objRes;
        Conexion.sentencia = Conexion.conn.prepareStatement(sql);
        objRes = Conexion.sentencia.executeQuery(sql);

        while (objRes.next()) {
            //Atributos de la clase:
            setPer_id_per((String) objRes.getObject(1));
            setPer_nombre_per((String) objRes.getObject(2));
            setPer_estado(String.valueOf(objRes.getObject(3)).charAt(0));
            setPer_fec_esta(String.valueOf(objRes.getDate(4)));
            setPer_aut_info(String.valueOf(objRes.getObject(5)).charAt(0));
            setPer_aut_vent(String.valueOf(objRes.getObject(6)).charAt(0));
            setPer_aut_gest(String.valueOf(objRes.getObject(7)).charAt(0));
            setPer_aut_cmpr(String.valueOf(objRes.getObject(8)).charAt(0));
            setPer_tst_creacion(String.valueOf(objRes.getTimestamp(9)));
            setPer_tst_modific(String.valueOf(objRes.getTimestamp(10)));
            setPer_usr_creacion((String) objRes.getObject(11));
            setPer_usr_modific((String) objRes.getObject(12));
        }
    }

    //GET Y SET:
    public String getPer_id_per() {
        return per_id_per;
    }

    public void setPer_id_per(String per_id_per) {
        this.per_id_per = per_id_per;
    }

    public String getPer_nombre_per() {
        return per_nombre_per;
    }

    public void setPer_nombre_per(String per_nombre_per) {
        this.per_nombre_per = per_nombre_per;
    }

    public char getPer_estado() {
        return per_estado;
    }

    public void setPer_estado(char per_estado) {
        this.per_estado = per_estado;
    }

    public String getPer_fec_esta() {
        return per_fec_esta;
    }

    public void setPer_fec_esta(String per_fec_esta) {
        this.per_fec_esta = per_fec_esta;
    }

    public char getPer_aut_info() {
        return per_aut_info;
    }

    public void setPer_aut_info(char per_aut_info) {
        this.per_aut_info = per_aut_info;
    }

    public char getPer_aut_vent() {
        return per_aut_vent;
    }

    public void setPer_aut_vent(char per_aut_vent) {
        this.per_aut_vent = per_aut_vent;
    }

    public char getPer_aut_gest() {
        return per_aut_gest;
    }

    public void setPer_aut_gest(char per_aut_gest) {
        this.per_aut_gest = per_aut_gest;
    }

    public char getPer_aut_cmpr() {
        return per_aut_cmpr;
    }

    public void setPer_aut_cmpr(char per_aut_cmpr) {
        this.per_aut_cmpr = per_aut_cmpr;
    }

    public String getPer_tst_creacion() {
        return per_tst_creacion;
    }

    public void setPer_tst_creacion(String per_tst_creacion) {
        this.per_tst_creacion = per_tst_creacion;
    }

    public String getPer_tst_modific() {
        return per_tst_modific;
    }

    public void setPer_tst_modific(String per_tst_modific) {
        this.per_tst_modific = per_tst_modific;
    }

    public String getPer_usr_creacion() {
        return per_usr_creacion;
    }

    public void setPer_usr_creacion(String per_usr_creacion) {
        this.per_usr_creacion = per_usr_creacion;
    }

    public String getPer_usr_modific() {
        return per_usr_modific;
    }

    public void setPer_usr_modific(String per_usr_modific) {
        this.per_usr_modific = per_usr_modific;
    }

    /**
     * METODO LISTAR
     *
     * @param id_perfil
     * @return
     * @throws SQLException
     */
    public static ResultSet listarPerfil(String id_perfil) throws SQLException {
        ResultSet objRes;

        String sql = "select per_id_perf, "
                + "per_nom_perf, "
                + "per_estado,"
                + "per_fec_esta,"
                + "per_aut_info,"
                + "per_aut_vent,"
                + "per_aut_gest,"
                + "per_aut_cmpr,"
                + "per_tst_creacion,"
                + "per_tst_modific,"
                + "per_usr_creacion,"
                + "per_usr_modific"
                + " from EMDTPER where per_id_perf = " + id_perfil + ";";
        Conexion.sentencia = Conexion.conn.prepareStatement(sql);
        objRes = Conexion.sentencia.executeQuery(sql);
        return objRes;
    }

    /**
     * METODO INGRESAR PERFIL
     *
     * @param id_perfil
     * @return
     * @throws SQLException
     */
    public static boolean agregarPerfil(String id_perfil) throws SQLException {
        boolean resultado = false;

        try {
            String sql = "insert into EMDTPER ("
                    + "per_id_perf, "
                    + "per_nom_perf, "
                    + "per_estado,"
                    + "per_fec_esta,"
                    + "per_aut_info,per_aut_vent, per_aut_gest, per_aut_cmpr," //-> PERMISOS
                    + "per_tst_creacion," + "per_tst_modific,"
                    + "per_usr_creacion," + "per_usr_modific"
                    + "VALUES ('"
                    + id_perfil + ","
                    + "'CAJERO',"
                    + "'A',"
                    + "CURRENT_DATE,"
                    + "'0', '1', '0', '0'," //-> PERMISOS
                    + "'08:00:00'," + "'23:00:00',"
                    + "CURRENT_TIMESTAMP, CURRENT_TIMESTAMP,"
                    + "'0000','    ');";

            Conexion.sentencia = Conexion.conn.prepareStatement(sql);
            Conexion.sentencia.execute(sql);

            resultado = true;

        } catch (Exception e) {
            resultado = false;
        }
        return resultado;
    }

    /**
     * 11-01-2018 METODO ELIMINAR PERFIL
     *
     * @param idPerfil
     * @return
     * @throws java.lang.Exception
     */
    public static boolean eliminarPerfil(String idPerfil) throws Exception {
        boolean resultado = false;
        ResultSet objRes;
        String sql = "UPDATE EMDTPER SET per_estado = 'I' where per_id_per = " + idPerfil + ";";
        Conexion.sentencia = Conexion.conn.prepareStatement(sql);
        objRes = Conexion.sentencia.executeQuery(sql);
        while (objRes.next()) {
            if (objRes.getString(1).equals(idPerfil)) {
                resultado = true;
            }
        }
        return resultado;
    }
    
    /** 12-01-2018
     * METODO LISTAR PERFIL
     * USADO EN COMBOBOX EN FRMUSUARIO
     * EN PESTAÑA LISTAR
     * 
     * @return
     * @throws java.sql.SQLException
     */
    public static ResultSet listarPerfilesCombo() throws Exception {
        String strSql;
        strSql = "select PER_NOM_PERF from EMDTPER;";
        ResultSet objRes;
        Conexion.sentencia = Conexion.conn.prepareStatement(strSql);
        objRes = Conexion.sentencia.executeQuery(strSql);
        return objRes;
    }

}
