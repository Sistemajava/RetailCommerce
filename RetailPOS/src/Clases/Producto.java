package Clases;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Producto {

    //ATRIBUTOS:
    private String pro_id_pro;
    private int pro_cod_barra;
    private String pro_nombre;
    private String pro_marca;
    private String pro_id_rub;
    private String pro_id_linea;
    private String pro_area;
    private char pro_estado;
    private int pro_val_net;
    private double pro_por_iva;
    private double pro_por_mar;
    private int pro_val_cli;
    private String pro_tst_creacion;
    private String pro_tst_modific;
    private String pro_usr_creacion;
    private String pro_usr_modific;

    /**
     * CONSTRUCTOR CON ACCESO A BASE DE DATOS:
     *
     * @param id_producto
     * @throws SQLException
     * @"Tabla: EMDTPRO"
     */
    public Producto(String id_producto) throws SQLException {
        String sql = "select pro_id_pro,"
                + "pro_cod_barra,"
                + "pro_nombre,"
                + "pro_marca,"
                + "pro_id_rub,"
                + "pro_id_linea,"
                + "pro_area,"
                + "pro_estado,"
                + "pro_val_net,"
                + "pro_por_iva,"
                + "pro_por_mar,"
                + "pro_val_cli,"
                + "pro_tst_creacion,"
                + "pro_tst_modific,"
                + "pro_usr_creacion,"
                + "pro_usr_modific"
                + "from EMDTPRO where reg_id_reg = '" + id_producto + "';";

        ResultSet objRes;
        Conexion.sentencia = Conexion.conn.prepareStatement(sql);
        objRes = Conexion.sentencia.executeQuery(sql);

        while (objRes.next()) {
            //Atributos de la clase:
            setPro_id_pro((String) objRes.getObject(1));
            setPro_cod_barra((int) objRes.getObject(2));
            setPro_nombre((String) objRes.getObject(3));
            setPro_marca((String) objRes.getObject(4));
            setPro_id_rub((String) objRes.getObject(5));
            setPro_id_linea((String) objRes.getObject(6));
            setPro_area((String) objRes.getObject(7));
            setPro_estado(String.valueOf(objRes.getObject(8)).charAt(0));
            setPro_val_net((int) objRes.getObject(9));
            setPro_por_iva((double) objRes.getObject(10));
            setPro_por_mar((double) objRes.getObject(11));
            setPro_val_cli((int) objRes.getObject(12));
            setPro_tst_creacion(String.valueOf(objRes.getTimestamp(13)));
            setPro_tst_modific(String.valueOf(objRes.getTimestamp(14)));
            setPro_usr_creacion((String) objRes.getObject(15));
            setPro_usr_modific((String) objRes.getObject(16));

        }
    }

    //GET Y SET:
    public String getPro_id_pro() {
        return pro_id_pro;
    }

    public void setPro_id_pro(String pro_id_pro) {
        this.pro_id_pro = pro_id_pro;
    }

    public int getPro_cod_barra() {
        return pro_cod_barra;
    }

    public void setPro_cod_barra(int pro_cod_barra) {
        this.pro_cod_barra = pro_cod_barra;
    }

    public String getPro_nombre() {
        return pro_nombre;
    }

    public void setPro_nombre(String pro_nombre) {
        this.pro_nombre = pro_nombre;
    }

    public String getPro_marca() {
        return pro_marca;
    }

    public void setPro_marca(String pro_marca) {
        this.pro_marca = pro_marca;
    }

    public String getPro_id_rub() {
        return pro_id_rub;
    }

    public void setPro_id_rub(String pro_id_rub) {
        this.pro_id_rub = pro_id_rub;
    }

    public String getPro_id_linea() {
        return pro_id_linea;
    }

    public void setPro_id_linea(String pro_id_linea) {
        this.pro_id_linea = pro_id_linea;
    }

    public String getPro_area() {
        return pro_area;
    }

    public void setPro_area(String pro_area) {
        this.pro_area = pro_area;
    }

    public char getPro_estado() {
        return pro_estado;
    }

    public void setPro_estado(char pro_estado) {
        this.pro_estado = pro_estado;
    }

    public int getPro_val_net() {
        return pro_val_net;
    }

    public void setPro_val_net(int pro_val_net) {
        this.pro_val_net = pro_val_net;
    }

    public double getPro_por_iva() {
        return pro_por_iva;
    }

    public void setPro_por_iva(double pro_por_iva) {
        this.pro_por_iva = pro_por_iva;
    }

    public double getPro_por_mar() {
        return pro_por_mar;
    }

    public void setPro_por_mar(double pro_por_mar) {
        this.pro_por_mar = pro_por_mar;
    }

    public int getPro_val_cli() {
        return pro_val_cli;
    }

    public void setPro_val_cli(int pro_val_cli) {
        this.pro_val_cli = pro_val_cli;
    }

    public String getPro_tst_creacion() {
        return pro_tst_creacion;
    }

    public void setPro_tst_creacion(String pro_tst_creacion) {
        this.pro_tst_creacion = pro_tst_creacion;
    }

    public String getPro_tst_modific() {
        return pro_tst_modific;
    }

    public void setPro_tst_modific(String pro_tst_modific) {
        this.pro_tst_modific = pro_tst_modific;
    }

    public String getPro_usr_creacion() {
        return pro_usr_creacion;
    }

    public void setPro_usr_creacion(String pro_usr_creacion) {
        this.pro_usr_creacion = pro_usr_creacion;
    }

    public String getPro_usr_modific() {
        return pro_usr_modific;
    }

    public void setPro_usr_modific(String pro_usr_modific) {
        this.pro_usr_modific = pro_usr_modific;
    }

    /**
     * METODO LISTAR
     *
     * @param id_producto
     * @return
     * @throws SQLException
     */
    public static ResultSet listarProducto(String id_producto) throws SQLException {
        ResultSet objRes;

        String sql = "select pro_id_pro,"
                + "pro_cod_barra,"
                + "pro_nombre,"
                + "pro_marca,"
                + "pro_id_rub,"
                + "pro_id_linea,"
                + "pro_area,"
                + "pro_estado,"
                + "pro_val_net,"
                + "pro_por_iva,"
                + "pro_por_mar,"
                + "pro_val_cli,"
                + "pro_tst_creacion,"
                + "pro_tst_modific,"
                + "pro_usr_creacion,"
                + "pro_usr_modific"
                + " from EMDTPRO where pro_id_pro = '" + id_producto + "';";
        Conexion.sentencia = Conexion.conn.prepareStatement(sql);
        objRes = Conexion.sentencia.executeQuery(sql);
        return objRes;
    }

    /**
     * METODO INGRESAR PRODUCTO
     *
     * @param id_Producto
     * @return
     * @throws SQLException
     */
    public static boolean agregarProducto(String id_Producto) throws SQLException {
        boolean resultado = false;

        try {
            String sql = "insert into EMDTPRO ("
                    + "pro_id_pro,"
                    + "pro_cod_barra," + "pro_nombre,"
                    + "pro_marca," + "pro_id_rub," + "pro_id_linea," + "pro_area,"
                    + "pro_estado," + "pro_val_net,"
                    + "pro_por_iva," + "pro_por_mar,"
                    + "pro_val_cli," + "pro_tst_creacion," + "pro_tst_modific,"
                    + "pro_usr_creacion," + "pro_usr_modific"
                    + "VALUES ('" + id_Producto + ","
                    + "'00001'," + "'Monitor PC',"
                    + "'LG'," + "'MONITORES'," + "'COMPUTACION'," + "'ELECTRO',"
                    + "'A'," + "'170000',"
                    + "'0,19'," + "'0,5',"
                    + "'179000'," + "CURRENT_TIMESTAMP, CURRENT_TIMESTAMP,"
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
