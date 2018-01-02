package Clases;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Linea {

    //ATRIBUTOS:
    private String lin_id_lin;
    private String lin_nom_linea;
    private int lin_id_area;
    private char lin_estado;
    private String fec_alta;
    private String lin_tst_creacion;
    private String lin_tst_modific;
    private String lin_usr_creacion;
    private String lin_usr_modific;

    /**
     * Constructor clase con acceso a base de datos
     *
     * @param id_linea
     * @throws SQLException
     */
    public Linea(String id_linea) throws SQLException {
        String sql = "select lin_id_lin,"
                + "lin_nom_linea,"
                + "lin_id_area,"
                + "lin_estado,"
                + "fec_alta,"
                + "lin_tst_creacion,"
                + "lin_tst_modific,"
                + "lin_usr_creacion,"
                + "lin_usr_modific"
                + "from EMDTLIN where lin_id_lin = '" + id_linea + "';";
        ResultSet objRes;
        Conexion.sentencia = Conexion.conn.prepareStatement(sql);
        objRes = Conexion.sentencia.executeQuery(sql);

        while (objRes.next()) {
            //Atributos de la clase:
            setLin_id_lin((String) objRes.getObject(1));
            setLin_nom_linea((String) objRes.getObject(2));
            setLin_id_area((int) objRes.getObject(3));
            setLin_estado(String.valueOf(objRes.getObject(4)).charAt(0));
            setFec_alta(String.valueOf(objRes.getDate(5)));
            setLin_tst_creacion(String.valueOf(objRes.getTimestamp(6)));
            setLin_tst_modific(String.valueOf(objRes.getTimestamp(7)));
            setLin_usr_modific((String) objRes.getObject(8));
            setLin_usr_modific((String) objRes.getObject(9));
        }
    }

    //GET Y SET:
    public String getLin_id_lin() {
        return lin_id_lin;
    }

    public void setLin_id_lin(String lin_id_lin) {
        this.lin_id_lin = lin_id_lin;
    }

    public String getLin_nom_linea() {
        return lin_nom_linea;
    }

    public void setLin_nom_linea(String lin_nom_linea) {
        this.lin_nom_linea = lin_nom_linea;
    }

    public int getLin_id_area() {
        return lin_id_area;
    }

    public void setLin_id_area(int lin_id_area) {
        this.lin_id_area = lin_id_area;
    }

    public char getLin_estado() {
        return lin_estado;
    }

    public void setLin_estado(char lin_estado) {
        this.lin_estado = lin_estado;
    }

    public String getFec_alta() {
        return fec_alta;
    }

    public void setFec_alta(String fec_alta) {
        this.fec_alta = fec_alta;
    }

    public String getLin_tst_creacion() {
        return lin_tst_creacion;
    }

    public void setLin_tst_creacion(String lin_tst_creacion) {
        this.lin_tst_creacion = lin_tst_creacion;
    }

    public String getLin_tst_modific() {
        return lin_tst_modific;
    }

    public void setLin_tst_modific(String lin_tst_modific) {
        this.lin_tst_modific = lin_tst_modific;
    }

    public String getLin_usr_creacion() {
        return lin_usr_creacion;
    }

    public void setLin_usr_creacion(String lin_usr_creacion) {
        this.lin_usr_creacion = lin_usr_creacion;
    }

    public String getLin_usr_modific() {
        return lin_usr_modific;
    }

    public void setLin_usr_modific(String lin_usr_modific) {
        this.lin_usr_modific = lin_usr_modific;
    }

    /**
     * METODO LISTAR
     *
     * @param id_linea
     * @return
     * @throws SQLException
     */
    public static ResultSet listarLinea(String id_linea) throws SQLException {
        ResultSet objRes;

        String sql = "select lin_id_lin,"
                + "lin_nom_linea,"
                + "lin_id_area,"
                + "lin_estado,"
                + "fec_alta,"
                + "lin_tst_creacion,"
                + "lin_tst_modific,"
                + "lin_usr_creacion,"
                + "lin_usr_modific"
                + " from EMDTLIN where lin_id_lin = '" + id_linea + "';";
        Conexion.sentencia = Conexion.conn.prepareStatement(sql);
        objRes = Conexion.sentencia.executeQuery(sql);
        return objRes;
    }

    /**
     * 02-01-2017 METODO INGRESAR LINEA
     *
     * @param idLinea
     * @param idArea
     * @return
     */
    public static boolean ingresarLinea(String idLinea, String idArea) {
        boolean resultado = false;

        try {
            String sql = "insert into EMDTLIN ("
                    + "lin_id_lin,"
                    + "lin_nom_linea,"
                    + "lin_id_area,"
                    + "lin_estado,"
                    + "fec_alta,"
                    + "lin_tst_creacion,"
                    + "lin_tst_modific,"
                    + "lin_usr_creacion,"
                    + "lin_usr_modific"
                    + "VALUES ('"
                    + idLinea + ","
                    + "'COMPUTACION',"
                    + idArea + ","
                    + "'A',"
                    + "CURRENT_DATE,"
                    + "CURRENT_TIMESTAMP,"
                    + "CURRENT_TIMESTAMP,"
                    + "'0000',"
                    + "'    ');";
            Conexion.sentencia = Conexion.conn.prepareStatement(sql);
            Conexion.sentencia.execute(sql);
            resultado = true;
        } catch (Exception e) {
            resultado = false;
        }
        return resultado;
    }
}
