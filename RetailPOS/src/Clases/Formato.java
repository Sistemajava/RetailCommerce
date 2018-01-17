package Clases;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Formato {

    //ATRIBUTOS:
    private String frm_id_frm;
    private String frm_nom_form;
    private String frm_slogan;
    private int cant_caja;
    private char frm_estado;
    private String fec_estado;
    private String fec_alta;
    private String frm_hr_ini;
    private String frm_hr_fin;
    private String frm_tst_creacion;
    private String frm_tst_modific;
    private String frm_usr_creacion;
    private String frm_usr_modific;

    /**
     * Constructor clase con acceso a base de datos
     *
     * @param id_formato
     * @throws SQLException
     */
    public Formato(String id_formato) throws SQLException {
        String sql = "select frm_id_frm, "
                + "frm_nom_form, "
                + "frm_slogan,"
                + "frm_cant_caja,"
                + "frm_estado,"
                + "frm_fec_esta,"
                + "frm_fec_alta,"
                + "frm_hr_ini,"
                + "frm_hr_fin,"
                + "frm_tst_creacion,"
                + "frm_tst_modific,"
                + "frm_usr_creacion,"
                + "frm_usr_modific"
                + " from EMDTFRM "
                + "where frm_id_frm = '" + id_formato + "';";
        ResultSet objRes;
        Conexion.sentencia = Conexion.conn.prepareStatement(sql);
        objRes = Conexion.sentencia.executeQuery(sql);

        while (objRes.next()) {
            //Atributos de la clase:
            setFrm_id_frm((String) objRes.getObject(1));
            setFrm_nom_form((String) objRes.getObject(2));
            setFrm_slogan((String) objRes.getObject(3));
            setCant_caja((int) objRes.getObject(4));
            setFrm_estado(String.valueOf(objRes.getObject(5)).charAt(0));
            setFec_estado(String.valueOf(objRes.getDate(6)));
            setFec_alta(String.valueOf(objRes.getDate(7)));
            setFrm_hr_ini(String.valueOf(objRes.getTime(8)));
            setFrm_hr_fin(String.valueOf(objRes.getTime(9)));
            setFrm_tst_creacion(String.valueOf(objRes.getTimestamp(10)));
            setFrm_tst_modific(String.valueOf(objRes.getTimestamp(11)));
            setFrm_usr_creacion(String.valueOf(objRes.getObject(12)));
            setFrm_usr_modific(String.valueOf(objRes.getObject(13)));
        }
    }

    //GET Y SET:
    public String getFrm_id_frm() {
        return frm_id_frm;
    }

    public void setFrm_id_frm(String frm_id_frm) {
        this.frm_id_frm = frm_id_frm;
    }

    public String getFrm_nom_form() {
        return frm_nom_form;
    }

    public void setFrm_nom_form(String frm_nom_form) {
        this.frm_nom_form = frm_nom_form;
    }

    public String getFrm_slogan() {
        return frm_slogan;
    }

    public void setFrm_slogan(String frm_slogan) {
        this.frm_slogan = frm_slogan;
    }

    public int getCant_caja() {
        return cant_caja;
    }

    public void setCant_caja(int cant_caja) {
        this.cant_caja = cant_caja;
    }

    public char getFrm_estado() {
        return frm_estado;
    }

    public void setFrm_estado(char frm_estado) {
        this.frm_estado = frm_estado;
    }

    public String getFec_estado() {
        return fec_estado;
    }

    public void setFec_estado(String fec_estado) {
        this.fec_estado = fec_estado;
    }

    public String getFec_alta() {
        return fec_alta;
    }

    public void setFec_alta(String fec_alta) {
        this.fec_alta = fec_alta;
    }

    public String getFrm_hr_ini() {
        return frm_hr_ini;
    }

    public void setFrm_hr_ini(String frm_hr_ini) {
        this.frm_hr_ini = frm_hr_ini;
    }

    public String getFrm_hr_fin() {
        return frm_hr_fin;
    }

    public void setFrm_hr_fin(String frm_hr_fin) {
        this.frm_hr_fin = frm_hr_fin;
    }

    public String getFrm_tst_creacion() {
        return frm_tst_creacion;
    }

    public void setFrm_tst_creacion(String frm_tst_creacion) {
        this.frm_tst_creacion = frm_tst_creacion;
    }

    public String getFrm_tst_modific() {
        return frm_tst_modific;
    }

    public void setFrm_tst_modific(String frm_tst_modific) {
        this.frm_tst_modific = frm_tst_modific;
    }

    public String getFrm_usr_creacion() {
        return frm_usr_creacion;
    }

    public void setFrm_usr_creacion(String frm_usr_creacion) {
        this.frm_usr_creacion = frm_usr_creacion;
    }

    public String getFrm_usr_modific() {
        return frm_usr_modific;
    }

    public void setFrm_usr_modific(String frm_usr_modific) {
        this.frm_usr_modific = frm_usr_modific;
    }

    /**
     * METODO LISTAR
     *
     * @param id_formato
     * @return
     * @throws SQLException
     */
    public static ResultSet listarFormato(String id_formato) throws SQLException {
        ResultSet objRes;

        String sql = "select frm_id_frm, "
                + "frm_nom_form, "
                + "frm_slogan,"
                + "cant_caja,"
                + "frm_estado,"
                + "fec_estado,"
                + "fec_alta,"
                + "frm_hr_ini,"
                + "frm_hr_fin,"
                + "frm_tst_creacion,"
                + "frm_tst_modific,"
                + "frm_usr_creacion,"
                + "frm_usr_modific"
                + " from EMDTFRM where com_id_com = '" + id_formato + "';";
        Conexion.sentencia = Conexion.conn.prepareStatement(sql);
        objRes = Conexion.sentencia.executeQuery(sql);
        return objRes;
    }

    /**
     * METODO INGRESAR FORMATO
     *
     * @param id_formato
     * @return
     * @throws SQLException
     */
    public static boolean agregarFormato(String id_formato) throws SQLException {
        boolean resultado = false;

        try {
            String sql = "insert into EMDTFRM ("
                    + "frm_id_frm, "
                    + "frm_nom_form, "
                    + "frm_slogan,"
                    + "cant_caja,"
                    + "frm_estado," + "fec_estado," + "fec_alta,"
                    + "frm_hr_ini," + "frm_hr_fin,"
                    + "frm_tst_creacion," + "frm_tst_modific,"
                    + "frm_usr_creacion,"
                    + "frm_usr_modific"
                    + "VALUES ('" + id_formato + ","
                    + "'HIPER',"
                    + "'COMPRE MAS, GASTE MAS',"
                    + "'100',"
                    + "'A',"
                    + "CURRENT_DATE," + "CURRENT_DATE," + "CURRENT_DATE,"
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
     * 11-01-2018 METODO ELIMINAR FORMATO
     *
     * @param idFormato
     * @return
     * @throws java.sql.SQLException
     */
    public static boolean eliminarFormato(String idFormato) throws SQLException {
        boolean resultado = false;
        ResultSet objRes;
        String sql = "UPDATE EMDFRM SET frm_estado = 'I' where frm_id_frm = " + idFormato + ";";
        Conexion.sentencia = Conexion.conn.prepareStatement(sql);
        objRes = Conexion.sentencia.executeQuery(sql);
        while (objRes.next()) {
            if (objRes.getString(1).equals(idFormato)) {
                resultado = true;
            }
        }
        return resultado;
    }
    
    /** 12-01-2018 
     * METODO LISTAR FORMATO
     * USADO EN COMBOBOX EN FRMUSUARIO 
     * EN PESTAÑA LISTAR
     * @return
     * @throws java.sql.SQLException
     */
    public static ResultSet ListarFormatosCombo() throws Exception {
        String strSql;
        strSql = "select FRM_NOM_FORM from EMDTFRM;";
        ResultSet objRes;
        Conexion.sentencia = Conexion.conn.prepareStatement(strSql);
        objRes = Conexion.sentencia.executeQuery(strSql);
        return objRes;
    }
    
    public static String ObtenerNombreSegunID(String nomFormato) throws SQLException{
        String idFrm = "";
        String sql = "select FRM_ID_FRM from EMDTFRM WHERE FRM_NOM_FORM = '"+nomFormato+"';";
        Conexion.sentencia = Conexion.conn.prepareStatement(sql);
        ResultSet rst = Conexion.sentencia.executeQuery(sql);
        
        while (rst.next()) {
            idFrm = (String) rst.getObject(1);
        }                    
        return idFrm;
    }
}
