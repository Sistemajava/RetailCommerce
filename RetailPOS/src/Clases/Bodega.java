package Clases;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Bodega {

    //ATRIBUTOS:
    private String bod_cod_barra;
    private int bod_cant_prod;
    private int bod_val_neto;
    private String bod_tst_creacion;
    private String bod_tst_modific;
    private String bod_usr_creacion;
    private String bod_usr_modific;

    /**
     * CONSTRUCTOR CON ACCESO A BASE DE DATOS:
     *
     * @param cod_barra
     * @throws SQLException
     */
    public Bodega(String cod_barra) throws SQLException {
        String sql = "select bod_cod_barra, "
                + "bod_cant_prod, "
                + "bod_val_neto, "
                + "bod_tst_creacion,"
                + "bod_tst_modific, "
                + "bod_usr_creacion, "
                + "bod_usr_modific, "
                + "from EMDTBOD where bod_cod_barra = '" + "cod_barra" + "';";
        ResultSet objRes;
        Conexion.sentencia = Conexion.conn.prepareStatement(sql);
        objRes = Conexion.sentencia.executeQuery(sql);

        while (objRes.next()) {
            //Atributos de la clase:
            setBod_cod_barra((String) objRes.getObject(1));
            setBod_cant_prod((int) objRes.getObject(2));
            setBod_val_neto((int) objRes.getObject(3));
            setBod_tst_creacion(String.valueOf(objRes.getTimestamp(4)));
            setBod_tst_modific(String.valueOf(objRes.getTimestamp(5)));
            setBod_usr_creacion((String) objRes.getObject(6));
            setBod_usr_modific((String) objRes.getObject(7));
        }

    }

    //GET Y SET:
    public String getBod_cod_barra() {
        return bod_cod_barra;
    }

    public void setBod_cod_barra(String bod_cod_barra) {
        this.bod_cod_barra = bod_cod_barra;
    }

    public int getBod_cant_prod() {
        return bod_cant_prod;
    }

    public void setBod_cant_prod(int bod_cant_prod) {
        this.bod_cant_prod = bod_cant_prod;
    }

    public int getBod_val_neto() {
        return bod_val_neto;
    }

    public void setBod_val_neto(int bod_val_neto) {
        this.bod_val_neto = bod_val_neto;
    }

    public String getBod_tst_creacion() {
        return bod_tst_creacion;
    }

    public void setBod_tst_creacion(String bod_tst_creacion) {
        this.bod_tst_creacion = bod_tst_creacion;
    }

    public String getBod_tst_modific() {
        return bod_tst_modific;
    }

    public void setBod_tst_modific(String bod_tst_modific) {
        this.bod_tst_modific = bod_tst_modific;
    }

    public String getBod_usr_creacion() {
        return bod_usr_creacion;
    }

    public void setBod_usr_creacion(String bod_usr_creacion) {
        this.bod_usr_creacion = bod_usr_creacion;
    }

    public String getBod_usr_modific() {
        return bod_usr_modific;
    }

    public void setBod_usr_modific(String bod_usr_modific) {
        this.bod_usr_modific = bod_usr_modific;
    }

    /**
     * METODO LISTAR
     *
     * @param cod_barra
     * @return
     * @throws SQLException
     */
    public static ResultSet listarBodega(String cod_barra) throws SQLException {
        ResultSet objRes;

        String sql = "select bod_cod_barra, "
                + "bod_cant_prod, "
                + "bod_val_neto, "
                + "bod_tst_creacion,"
                + "bod_tst_modific, "
                + "bod_usr_creacion, "
                + "bod_usr_modific, "
                + " from EMDTBOD where bod_cod_barra = '" + cod_barra + "';";
        Conexion.sentencia = Conexion.conn.prepareStatement(sql);
        objRes = Conexion.sentencia.executeQuery(sql);
        return objRes;
    }

}
