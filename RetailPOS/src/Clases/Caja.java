package Clases;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Caja {

    //ATRIBUTOS:
    private String pos_id_suc;
    private String pos_id_pos;
    private char pos_estado;
    private String pos_fec_esta;
    private char pos_ind_res;
    private int pos_mvta_dia;
    private int pos_manu_dia;
    private String pos_tst_creacion;
    private String pos_tst_modific;
    private String pos_usr_creacion;
    private String pos_usr_modific;

    /**
     * CONSTRUCTOR CON ACCESO A BASE DE DATOS:
     *
     * @param cod_caja
     * @throws SQLException
     */
    public Caja(String cod_caja) throws SQLException {
        String sql = "select pos_id_suc, "
                + "pos_id_pos,"
                + "pos_estado,"
                + "pos_fec_esta,"
                + "pos_ind_res"
                + "pos_mvta_dia,"
                + "pos_manu_dia,"
                + "pos_tst_creacion,"
                + "pos_tst_modific,"
                + "pos_usr_creacion,"
                + "pos_usr_modific"
                + "from EMDTPOS where pos_id_pos = '" + cod_caja + "';";
        ResultSet objRes;
        Conexion.sentencia = Conexion.conn.prepareStatement(sql);
        objRes = Conexion.sentencia.executeQuery(sql);

        while (objRes.next()) {
            //Atributos de la clase:
            setPos_id_suc((String) objRes.getObject(1));
            setPos_id_pos((String) objRes.getObject(2));
            //setPer_estado(String.valueOf(objRes.getObject(3)).charAt(0));
            setPos_estado(String.valueOf(objRes.getObject(3)).charAt(0));
            setPos_fec_esta(String.valueOf(objRes.getDate(4)));
            setPos_ind_res(String.valueOf(objRes.getObject(5)).charAt(0));
            setPos_mvta_dia((int) objRes.getObject(6));
            setPos_manu_dia((int) objRes.getObject(7));
            setPos_tst_creacion(String.valueOf(objRes.getTimestamp(4)));
            setPos_tst_modific(String.valueOf(objRes.getTimestamp(5)));
            setPos_usr_creacion((String) objRes.getObject(6));
            setPos_usr_modific((String) objRes.getObject(7));
        }

    }

    //GET Y SET:
    public String getPos_id_suc() {
        return pos_id_suc;
    }

    public void setPos_id_suc(String pos_id_suc) {
        this.pos_id_suc = pos_id_suc;
    }

    public String getPos_id_pos() {
        return pos_id_pos;
    }

    public void setPos_id_pos(String pos_id_pos) {
        this.pos_id_pos = pos_id_pos;
    }

    public char getPos_estado() {
        return pos_estado;
    }

    public void setPos_estado(char pos_estado) {
        this.pos_estado = pos_estado;
    }

    public String getPos_fec_esta() {
        return pos_fec_esta;
    }

    public void setPos_fec_esta(String pos_fec_esta) {
        this.pos_fec_esta = pos_fec_esta;
    }

    public char getPos_ind_res() {
        return pos_ind_res;
    }

    public void setPos_ind_res(char pos_ind_res) {
        this.pos_ind_res = pos_ind_res;
    }

    public int getPos_mvta_dia() {
        return pos_mvta_dia;
    }

    public void setPos_mvta_dia(int pos_mvta_dia) {
        this.pos_mvta_dia = pos_mvta_dia;
    }

    public int getPos_manu_dia() {
        return pos_manu_dia;
    }

    public void setPos_manu_dia(int pos_manu_dia) {
        this.pos_manu_dia = pos_manu_dia;
    }

    public String getPos_tst_creacion() {
        return pos_tst_creacion;
    }

    public void setPos_tst_creacion(String pos_tst_creacion) {
        this.pos_tst_creacion = pos_tst_creacion;
    }

    public String getPos_tst_modific() {
        return pos_tst_modific;
    }

    public void setPos_tst_modific(String pos_tst_modific) {
        this.pos_tst_modific = pos_tst_modific;
    }

    public String getPos_usr_creacion() {
        return pos_usr_creacion;
    }

    public void setPos_usr_creacion(String pos_usr_creacion) {
        this.pos_usr_creacion = pos_usr_creacion;
    }

    public String getPos_usr_modific() {
        return pos_usr_modific;
    }

    public void setPos_usr_modific(String pos_usr_modific) {
        this.pos_usr_modific = pos_usr_modific;
    }

    /**
     * METODO LISTAR
     *
     * @param cod_pos
     * @return
     * @throws SQLException
     */
    public static ResultSet listarCaja(String cod_pos) throws SQLException {
        ResultSet objRes;

        String sql = "select pos_id_suc, "
                + "pos_id_pos,"
                + "pos_estado,"
                + "pos_fec_esta,"
                + "pos_ind_res"
                + "pos_mvta_dia,"
                + "pos_manu_dia,"
                + "pos_tst_creacion,"
                + "pos_tst_modific,"
                + "pos_usr_creacion,"
                + "pos_usr_modific"
                + " from EMDTPOS where pos_id_pos = '" + cod_pos + "';";
        Conexion.sentencia = Conexion.conn.prepareStatement(sql);
        objRes = Conexion.sentencia.executeQuery(sql);
        return objRes;
    }

    /**
     * METODO INGRESAR CAJA
     *
     * @param id_caja
     * @return
     * @throws SQLException
     */
    public static boolean agregarCaja(String id_caja) throws SQLException {
        boolean resultado = false;

        try {
            String sql = "insert into EMDTPOS ("
                    + "pos_id_suc, "
                    + "pos_id_pos,"
                    + "pos_estado,"
                    + "pos_fec_esta,"
                    + "pos_ind_res"
                    + "pos_mvta_dia,"
                    + "pos_manu_dia,"
                    + "pos_tst_creacion,"
                    + "pos_tst_modific,"
                    + "pos_usr_creacion,"
                    + "pos_usr_modific"
                    + "VALUES ('" + id_caja + ","
                    + "'001',"
                    + "'A',"
                    + "CURRENT_DATE,"
                    + "'C',"
                    + "'170000',"
                    + "'0',"
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

}
