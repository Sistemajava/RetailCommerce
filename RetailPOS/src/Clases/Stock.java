package Clases;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Stock {

    //ATRIBUTOS:
    private int stk_cod_suc;
    private int stk_cod_barra;
    private int stk_cant_pro;
    private char stk_estado;
    private int stk_val_net;
    private double stk_por_iva;
    private double stk_por_mar;
    private int stk_val_cli;
    private int stk_id_prom;
    private String stk_tst_creacion;
    private String stk_tst_modific;
    private String stk_usr_creacion;
    private String stk_usr_modific;

    /**
     * Constructor clase Stock 01-01-2017
     *
     * @param cod_barra Por: Emilio G.
     * @throws SQLException
     */
    public Stock(String cod_barra) throws SQLException {

        String sql = "select stk_cod_suc,"
                + "stk_cod_barra,"
                + "stk_cant_pro,"
                + "stk_estado,"
                + "stk_val_net,"
                + "stk_por_iva,"
                + "stk_por_mar,"
                + "stk_val_cli,"
                + "stk_id_cli,"
                + "stk_tst_creacion,"
                + "stk_tst_modific,"
                + "stk_usr_creacion,"
                + "stk_usr_modific"
                + " from EMDTSTK where stk_cod_barra = '" + cod_barra + "';";

        ResultSet objRes;
        Conexion.sentencia = Conexion.conn.prepareStatement(sql);
        objRes = Conexion.sentencia.executeQuery(sql);

        while (objRes.next()) {
            //Atributos de la clase:
            setStk_cod_suc((int) objRes.getObject(1));
            setStk_cod_barra((int) objRes.getObject(2));
            setStk_cant_pro((int) objRes.getObject(3));
            setStk_estado(String.valueOf(objRes.getObject(4)).charAt(0));
            setStk_val_net((int) objRes.getObject(5));
            setStk_por_iva((double) objRes.getObject(6));
            setStk_por_mar((double) objRes.getObject(7));
            setStk_val_cli((int) objRes.getObject(8));
            setStk_id_prom((int) objRes.getObject(9));
            setStk_tst_creacion(String.valueOf(objRes.getTimestamp(10)));
            setStk_tst_modific(String.valueOf(objRes.getTimestamp(11)));
            setStk_usr_creacion((String) objRes.getObject(12));
            setStk_usr_modific((String) objRes.getObject(13));
        }
    }
    //GET Y SET:

    public int getStk_cod_suc() {
        return stk_cod_suc;
    }

    public void setStk_cod_suc(int stk_cod_suc) {
        this.stk_cod_suc = stk_cod_suc;
    }

    public int getStk_cod_barra() {
        return stk_cod_barra;
    }

    public void setStk_cod_barra(int stk_cod_barra) {
        this.stk_cod_barra = stk_cod_barra;
    }

    public int getStk_cant_pro() {
        return stk_cant_pro;
    }

    public void setStk_cant_pro(int stk_cant_pro) {
        this.stk_cant_pro = stk_cant_pro;
    }

    public char getStk_estado() {
        return stk_estado;
    }

    public void setStk_estado(char stk_estado) {
        this.stk_estado = stk_estado;
    }

    public int getStk_val_net() {
        return stk_val_net;
    }

    public void setStk_val_net(int stk_val_net) {
        this.stk_val_net = stk_val_net;
    }

    public double getStk_por_iva() {
        return stk_por_iva;
    }

    public void setStk_por_iva(double stk_por_iva) {
        this.stk_por_iva = stk_por_iva;
    }

    public double getStk_por_mar() {
        return stk_por_mar;
    }

    public void setStk_por_mar(double stk_por_mar) {
        this.stk_por_mar = stk_por_mar;
    }

    public int getStk_val_cli() {
        return stk_val_cli;
    }

    public void setStk_val_cli(int stk_val_cli) {
        this.stk_val_cli = stk_val_cli;
    }

    public int getStk_id_prom() {
        return stk_id_prom;
    }

    public void setStk_id_prom(int stk_id_prom) {
        this.stk_id_prom = stk_id_prom;
    }

    public String getStk_tst_creacion() {
        return stk_tst_creacion;
    }

    public void setStk_tst_creacion(String stk_tst_creacion) {
        this.stk_tst_creacion = stk_tst_creacion;
    }

    public String getStk_tst_modific() {
        return stk_tst_modific;
    }

    public void setStk_tst_modific(String stk_tst_modific) {
        this.stk_tst_modific = stk_tst_modific;
    }

    public String getStk_usr_creacion() {
        return stk_usr_creacion;
    }

    public void setStk_usr_creacion(String stk_usr_creacion) {
        this.stk_usr_creacion = stk_usr_creacion;
    }

    public String getStk_usr_modific() {
        return stk_usr_modific;
    }

    public void setStk_usr_modific(String stk_usr_modific) {
        this.stk_usr_modific = stk_usr_modific;
    }

    /**
     * Metodo listar Stock:
     *
     */
    public static ResultSet listarStock() throws SQLException {
        ResultSet objRes = null;

        String sql = "select stk_cod_suc,"
                + "stk_cod_barra,"
                + "stk_cant_pro,"
                + "stk_estado,"
                + "stk_val_net"
                + "stk_por_iva,"
                + "stk_por_mar,"
                + "stk_val_cli,"
                + "stk_id_cli,"
                + "stk_tst_creacion,"
                + "stk_tst_modific,"
                + "stk_usr_creacion,"
                + "stk_usr_modific"
                + " from EMDTSTK;";
        Conexion.sentencia = Conexion.conn.prepareStatement(sql);
        objRes = Conexion.sentencia.executeQuery(sql);
        return objRes;
    }

    /**
     * Metodo de ingreso de stock
     *
     * @param cod_suc
     * @return
     * @throws SQLException
     */
    public static boolean agregarUsuario(int cod_suc, int cod_barra) throws SQLException {
        boolean resultado = false;

        try {
            //insert into EMDTUSU (usu_id_usua, usu_id_perf, usu_nombres, usu_apell1, usu_apell2, usu_dni, usu_passw, usu_estado, usu_fec_esta, usu_ind_jefe,usu_fec_alta, usu_fec_lic_desde, usu_fec_lic_hasta, usu_conexion, usu_fec_bloq, usu_hor_bloq, usu_tst_creacion, usu_tst_modific,usu_usr_creacion, usu_usr_modific) VALUES ('0009',1,"Nuevo Usuario","apelli1","apelli2","0000000000","0009",'A',CURRENT_DATE, 'N',CURRENT_DATE,'0001-01-01','0001-01-01','N','0001-01-01','01:00:00', CURRENT_TIMESTAMP,CURRENT_TIMESTAMP,'0000','    ');
            String sql = "insert into EMDTUSU ("
                    + "stk_cod_suc, stk_cod_barra,"
                    + "stk_cant_pro,stk_estado,"
                    + "stk_val_net,stk_por_iva,"
                    + "stk_por_mar,stk_val_cli,"
                    + "stk_id_cli,"
                    + "stk_tst_creacion,stk_tst_modific,"
                    + "stk_usr_creacion,stk_usr_modific) "
                    + "VALUES ('" + cod_suc + "'," + cod_barra + ","
                    + "'1','A',"
                    + "'1000','0,19',"
                    + "'0,10', '1000',"
                    + "'nueva tabla ???'," //---> Id de Promoción (implementación a futuro, requiere una nueva tabla de Promociones)???
                    + "CURRENT_TIMESTAMP,CURRENT_TIMESTAMP,"
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
