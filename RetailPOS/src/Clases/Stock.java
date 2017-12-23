package Clases;

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

    //CONSTRUCTOR:
    public Stock() {
    }

    public Stock(int stk_cod_suc, int stk_cod_barra, int stk_cant_pro, char stk_estado, int stk_val_net, double stk_por_iva, double stk_por_mar, int stk_val_cli, int stk_id_prom, String stk_tst_creacion, String stk_tst_modific, String stk_usr_creacion, String stk_usr_modific) {
        this.stk_cod_suc = stk_cod_suc;
        this.stk_cod_barra = stk_cod_barra;
        this.stk_cant_pro = stk_cant_pro;
        this.stk_estado = stk_estado;
        this.stk_val_net = stk_val_net;
        this.stk_por_iva = stk_por_iva;
        this.stk_por_mar = stk_por_mar;
        this.stk_val_cli = stk_val_cli;
        this.stk_id_prom = stk_id_prom;
        this.stk_tst_creacion = stk_tst_creacion;
        this.stk_tst_modific = stk_tst_modific;
        this.stk_usr_creacion = stk_usr_creacion;
        this.stk_usr_modific = stk_usr_modific;
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

    @Override
    public String toString() {
        return "Stock{" + "stk_cod_suc=" + stk_cod_suc + ", stk_cod_barra=" + stk_cod_barra + ", stk_cant_pro=" + stk_cant_pro + ", stk_estado=" + stk_estado + ", stk_val_net=" + stk_val_net + ", stk_por_iva=" + stk_por_iva + ", stk_por_mar=" + stk_por_mar + ", stk_val_cli=" + stk_val_cli + ", stk_id_prom=" + stk_id_prom + ", stk_tst_creacion=" + stk_tst_creacion + ", stk_tst_modific=" + stk_tst_modific + ", stk_usr_creacion=" + stk_usr_creacion + ", stk_usr_modific=" + stk_usr_modific + '}';
    }

}
