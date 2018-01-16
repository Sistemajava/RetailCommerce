package Clases;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Sucursal {

    //ATRIBUTOS:
    private String suc_id_suc;
    private String suc_rut_suc;
    private String suc_nom_suc;
    private String suc_id_frm;
    private char suc_estado;
    private String suc_fec_esta;
    private int suc_id_region;
    private int suc_id_comuna;
    private String suc_nom_dir;
    private String suc_id_gVenta;
    private String suc_fec_alta;
    private String suc_tst_creacion;
    private String suc_tst_modificacion;
    private String suc_usr_creacion;
    private String suc_usr_modific;
    private String suc_frm_nombre;

    /**
     * CONSTRUCTOR CON ACCESO A BASE DE DATOS:
     *
     * @param id_sucursal
     * @throws SQLException
     */
    public Sucursal(String id_sucursal) throws SQLException {
        String sql = "select suc_id_suc,"
                + "suc_rut_suc,"
                + "suc_nom_suc,"
                + "suc_id_frm,"
                + "suc_estado,"
                + "suc_fec_esta,"
                + "suc_id_region,"
                + "suc_id_comuna,"
                + "suc_nom_dir,"
                + "suc_id_gVenta,"
                + "suc_fec_alta,"
                + "suc_tst_creacion,"
                + "suc_tst_modific,"
                + "suc_usr_creacion,"
                + "suc_usr_modific"
                + " from EMDTSUC where suc_id_suc = '" + id_sucursal + "';";

        ResultSet objRes;
        Conexion.sentencia = Conexion.conn.prepareStatement(sql);
        objRes = Conexion.sentencia.executeQuery(sql);

        while (objRes.next()) {
            //Atributos de la clase:
            setSuc_id_suc((String) objRes.getObject(1));
            setSuc_rut_suc((String) objRes.getObject(2));
            setSuc_nom_suc((String) objRes.getObject(3));
            setSuc_id_frm((String) objRes.getObject(4));
            setSuc_estado(String.valueOf(objRes.getObject(5)).charAt(0));
            setSuc_fec_esta(String.valueOf(objRes.getDate(6)));
            setSuc_id_region((int) objRes.getObject(7));
            setSuc_id_comuna((int) objRes.getObject(8));
            setSuc_nom_dir((String) objRes.getObject(9));
            setSuc_id_gVenta((String) objRes.getObject(10));
            setSuc_fec_alta(String.valueOf(objRes.getDate(11)));
            setSuc_tst_creacion(String.valueOf(objRes.getTimestamp(12)));
            setSuc_tst_modificacion(String.valueOf(objRes.getTimestamp(13)));
            setSuc_usr_creacion((String) objRes.getObject(14));
            setSuc_usr_modific((String) objRes.getObject(15));
        }
    }

    /**
     * 15-01-2018 Constructor vacio
     */
    public Sucursal() {
    }

    //GET Y SET:
    public String getSuc_usr_modific() {
        return suc_usr_modific;
    }

    public void setSuc_usr_modific(String suc_usr_modific) {
        this.suc_usr_modific = suc_usr_modific;
    }

    public String getSuc_id_suc() {
        return suc_id_suc;
    }

    public void setSuc_id_suc(String suc_id_suc) {
        this.suc_id_suc = suc_id_suc;
    }

    public String getSuc_rut_suc() {
        return suc_rut_suc;
    }

    public void setSuc_rut_suc(String suc_rut_suc) {
        this.suc_rut_suc = suc_rut_suc;
    }

    public String getSuc_nom_suc() {
        return suc_nom_suc;
    }

    public void setSuc_nom_suc(String suc_nom_suc) {
        this.suc_nom_suc = suc_nom_suc;
    }

    public String getSuc_id_frm() {
        return suc_id_frm;
    }

    public void setSuc_id_frm(String suc_id_frm) {
        this.suc_id_frm = suc_id_frm;
    }

    public char getSuc_estado() {
        return suc_estado;
    }

    public void setSuc_estado(char suc_estado) {
        this.suc_estado = suc_estado;
    }

    public String getSuc_fec_esta() {
        return suc_fec_esta;
    }

    public void setSuc_fec_esta(String suc_fec_esta) {
        this.suc_fec_esta = suc_fec_esta;
    }

    public int getSuc_id_region() {
        return suc_id_region;
    }

    public void setSuc_id_region(int suc_id_region) {
        this.suc_id_region = suc_id_region;
    }

    public int getSuc_id_comuna() {
        return suc_id_comuna;
    }

    public void setSuc_id_comuna(int suc_id_comuna) {
        this.suc_id_comuna = suc_id_comuna;
    }

    public String getSuc_nom_dir() {
        return suc_nom_dir;
    }

    public void setSuc_nom_dir(String suc_nom_dir) {
        this.suc_nom_dir = suc_nom_dir;
    }

    public String getSuc_id_gVenta() {
        return suc_id_gVenta;
    }

    public void setSuc_id_gVenta(String suc_id_gVenta) {
        this.suc_id_gVenta = suc_id_gVenta;
    }

    public String getSuc_fec_alta() {
        return suc_fec_alta;
    }

    public void setSuc_fec_alta(String suc_fec_alta) {
        this.suc_fec_alta = suc_fec_alta;
    }

    public String getSuc_tst_creacion() {
        return suc_tst_creacion;
    }

    public void setSuc_tst_creacion(String suc_tst_creacion) {
        this.suc_tst_creacion = suc_tst_creacion;
    }

    public String getSuc_tst_modificacion() {
        return suc_tst_modificacion;
    }

    public void setSuc_tst_modificacion(String suc_tst_modificacion) {
        this.suc_tst_modificacion = suc_tst_modificacion;
    }

    public String getSuc_usr_creacion() {
        return suc_usr_creacion;
    }

    public void setSuc_usr_creacion(String suc_usr_creacion) {
        this.suc_usr_creacion = suc_usr_creacion;
    }
    
    public String getSuc_frm_nombre() {
        return suc_frm_nombre;
    }

    public void setSuc_frm_nombre(String suc_frm_nombre) {
        this.suc_frm_nombre = suc_frm_nombre;
    }
    

    /**
     * METODO LISTAR
     *
     * @param id_sucursal
     * @return
     * @throws SQLException
     */
    public static ResultSet listarSucursal(String id_sucursal) throws SQLException {
        ResultSet objRes;

        String sql = "select suc_id_suc,"
                + "suc_rut_suc,"
                + "suc_nom_suc,"
                + "suc_id_frm,"
                + "suc_estado,"
                + "suc_fec_esta,"
                + "suc_id_region,"
                + "suc_id_comuna,"
                + "suc_nom_dir,"
                + "suc_id_gVenta,"
                + "suc_fec_alta,"
                + "suc_tst_creacion,"
                + "suc_tst_modific,"
                + "suc_usr_creacion,"
                + "suc_usr_modific"
                + " from EMDTSUC where suc_id_suc = '" + id_sucursal + "';";
        Conexion.sentencia = Conexion.conn.prepareStatement(sql);
        objRes = Conexion.sentencia.executeQuery(sql);
        return objRes;
    }

    /**
     * METODO INGRESAR SUCURSAL
     *
     * @param id_sucursal
     * @return
     * @throws SQLException
     */
    public static boolean agregarSucursal(String id_sucursal) throws SQLException {
        boolean resultado = false;

        try {
            String sql = "insert into EMDTSUC ("
                    + "suc_id_suc,"
                    + "suc_rut_suc,"
                    + "suc_nom_suc,"
                    + "suc_id_frm,"
                    + "suc_estado,"
                    + "suc_fec_esta,"
                    + "suc_id_region,"
                    + "suc_id_comuna,"
                    + "suc_nom_dir,"
                    + "suc_id_gVenta,"
                    + "suc_fec_alta,"
                    + "suc_tst_creacion,"
                    + "suc_tst_modific,"
                    + "suc_usr_creacion,"
                    + "suc_usr_modific"
                    + "VALUES ('" + id_sucursal + ","
                    + "'1111111111',"
                    + "'SUPERMERCADO HIPER',"
                    + "1000,"
                    + "'A',"
                    + "CURRENT_DATE,"
                    + "'05',"
                    + "'0005',"
                    + "'Avenida Freire',"
                    + "'0003',"
                    + "CURRENT_DATE,"
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
     * 11-01-2018 METODO ELIMINAR SUCURSAL
     *
     * @param idSucursal
     * @return
     * @throws java.lang.Exception
     */
    public static boolean eliminarSucursal(String idSucursal) throws Exception {
        boolean resultado = false;
        ResultSet objRes;
        String sql = "UPDATE EMDTSUC SET suc_estado = 'I' where suc_id_suc = " + idSucursal + ";";
        Conexion.sentencia = Conexion.conn.prepareStatement(sql);
        objRes = Conexion.sentencia.executeQuery(sql);
        while (objRes.next()) {
            if (objRes.getString(1).equals(idSucursal)) {
                resultado = true;
            }
        }
        return resultado;
    }

    /**
     * 11-01-2018 METODO LISTAR SUCURSAL USADO EN CONBOBOX EN FRMUSUARIO EN
     * PESTAÑA LISTAR
     *
     * @return
     * @throws SQLException
     */
    public static ResultSet ListarSucursalesCombo() throws SQLException {
        String strSql;
        strSql = "select SUC_ID_SUC from EMDTSUC;";
        ResultSet objRes;
        Conexion.sentencia = Conexion.conn.prepareStatement(strSql);
        objRes = Conexion.sentencia.executeQuery(strSql);

        return objRes;
    }

    /**
     * 15-01-2018 Metodo listar sucursal con tablas especificas Metodo invocado
     * desde frmSucursal en pestaña listar
     *
     * @return
     */
    public ArrayList ListarSucursalJtable() {
        ArrayList arrayListaSuc = new ArrayList();
        ResultSet objRes;
        try {
            String sql = "select "
                    + "suc_id_suc,"
                    + "suc_nom_suc,"
                    + "suc_id_frm,"
                    + "frm_nom_form,"
                    + "suc_nom_dir,"
                    + "suc_id_gVenta,"                    
                    + "suc_estado "                   
                    + "from EMDTSUC, EMDTFRM "
                    + "WHERE SUC_ID_FRM = FRM_ID_FRM ;";
            Conexion.sentencia = Conexion.conn.prepareStatement(sql);
            objRes = Conexion.sentencia.executeQuery(sql);

            while (objRes.next()) {
                Sucursal suc = new Sucursal();
                suc.setSuc_id_suc(objRes.getString(1));                
                suc.setSuc_nom_suc(objRes.getString(2));
                suc.setSuc_id_frm(objRes.getString(3));
                suc.setSuc_frm_nombre(objRes.getString(4));
                suc.setSuc_nom_dir(objRes.getString(5));
                suc.setSuc_id_gVenta(objRes.getString(6));                
                suc.setSuc_estado(String.valueOf(objRes.getString(7)).charAt(0));

                arrayListaSuc.add(suc);
            }

        } catch (Exception e) {

        }
        return arrayListaSuc;
    }

}
