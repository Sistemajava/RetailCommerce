package Clases;

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

    //CONSTRUCTORES:
    public Producto() {
    }

    public Producto(String pro_id_pro, int pro_cod_barra, String pro_nombre, String pro_marca, String pro_id_rub, String pro_id_linea, String pro_area, char pro_estado, int pro_val_net, double pro_por_iva, double pro_por_mar, int pro_val_cli, String pro_tst_creacion, String pro_tst_modific, String pro_usr_creacion, String pro_usr_modific) {
        this.pro_id_pro = pro_id_pro;
        this.pro_cod_barra = pro_cod_barra;
        this.pro_nombre = pro_nombre;
        this.pro_marca = pro_marca;
        this.pro_id_rub = pro_id_rub;
        this.pro_id_linea = pro_id_linea;
        this.pro_area = pro_area;
        this.pro_estado = pro_estado;
        this.pro_val_net = pro_val_net;
        this.pro_por_iva = pro_por_iva;
        this.pro_por_mar = pro_por_mar;
        this.pro_val_cli = pro_val_cli;
        this.pro_tst_creacion = pro_tst_creacion;
        this.pro_tst_modific = pro_tst_modific;
        this.pro_usr_creacion = pro_usr_creacion;
        this.pro_usr_modific = pro_usr_modific;
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

    @Override
    public String toString() {
        return "Producto{" + "pro_id_pro=" + pro_id_pro + ", pro_cod_barra=" + pro_cod_barra + ", pro_nombre=" + pro_nombre + ", pro_marca=" + pro_marca + ", pro_id_rub=" + pro_id_rub + ", pro_id_linea=" + pro_id_linea + ", pro_area=" + pro_area + ", pro_estado=" + pro_estado + ", pro_val_net=" + pro_val_net + ", pro_por_iva=" + pro_por_iva + ", pro_por_mar=" + pro_por_mar + ", pro_val_cli=" + pro_val_cli + ", pro_tst_creacion=" + pro_tst_creacion + ", pro_tst_modific=" + pro_tst_modific + ", pro_usr_creacion=" + pro_usr_creacion + ", pro_usr_modific=" + pro_usr_modific + '}';
    }

}
