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
     * Constructor clase comuna con acceso a base de datos
     *
     * @param id_comuna
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
                + "from EMDTCOM where com_id_com = '" + id_perfil + "';";
        ResultSet objRes;
        Conexion.sentencia = Conexion.conn.prepareStatement(sql);
        objRes = Conexion.sentencia.executeQuery(sql);

        while (objRes.next()) {
            //Atributos de la clase:
            setPer_id_per((String) objRes.getObject(1));
            setPer_nombre_per((String) objRes.getObject(2));
            setPer_estado((char) objRes.getObject(3));
            setPer_fec_esta((String) objRes.getObject(4));
            setPer_aut_info((char) objRes.getObject(5));
            setPer_aut_vent((char) objRes.getObject(6));
            setPer_aut_gest((char) objRes.getObject(7));
            setPer_aut_cmpr((char) objRes.getObject(8));
            setPer_tst_creacion((String) objRes.getObject(9));
            setPer_tst_modific((String) objRes.getObject(10));
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

    //METODO LISTAR:
    public static ResultSet listarPerfil(String id_perfil) throws SQLException {
        ResultSet objRes;

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
                + " from EMDTPER where per_id_per = '" + id_perfil + "';";
        Conexion.sentencia = Conexion.conn.prepareStatement(sql);
        objRes = Conexion.sentencia.executeQuery(sql);
        return objRes;
    }
}
