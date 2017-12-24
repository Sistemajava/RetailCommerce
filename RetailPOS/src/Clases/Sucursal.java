package Clases;

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

    //CONSTRUCTORES:
    public Sucursal() {
    }

    public Sucursal(String suc_id_suc, String suc_rut_suc, String suc_nom_suc, String suc_id_frm, char suc_estado, String suc_fec_esta, int suc_id_region, int suc_id_comuna, String suc_nom_dir, String suc_id_gVenta, String suc_fec_alta, String suc_tst_creacion, String suc_tst_modificacion, String suc_usr_creacion, String suc_usr_modific) {
        this.suc_id_suc = suc_id_suc;
        this.suc_rut_suc = suc_rut_suc;
        this.suc_nom_suc = suc_nom_suc;
        this.suc_id_frm = suc_id_frm;
        this.suc_estado = suc_estado;
        this.suc_fec_esta = suc_fec_esta;
        this.suc_id_region = suc_id_region;
        this.suc_id_comuna = suc_id_comuna;
        this.suc_nom_dir = suc_nom_dir;
        this.suc_id_gVenta = suc_id_gVenta;
        this.suc_fec_alta = suc_fec_alta;
        this.suc_tst_creacion = suc_tst_creacion;
        this.suc_tst_modificacion = suc_tst_modificacion;
        this.suc_usr_creacion = suc_usr_creacion;
        this.suc_usr_modific = suc_usr_modific;
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

    @Override
    public String toString() {
        return "Sucursal{" + "suc_id_suc=" + suc_id_suc + ", suc_rut_suc=" + suc_rut_suc + ", suc_nom_suc=" + suc_nom_suc + ", suc_id_frm=" + suc_id_frm + ", suc_estado=" + suc_estado + ", suc_fec_esta=" + suc_fec_esta + ", suc_id_region=" + suc_id_region + ", suc_id_comuna=" + suc_id_comuna + ", suc_nom_dir=" + suc_nom_dir + ", suc_id_gVenta=" + suc_id_gVenta + ", suc_fec_alta=" + suc_fec_alta + ", suc_tst_creacion=" + suc_tst_creacion + ", suc_tst_modificacion=" + suc_tst_modificacion + ", suc_usr_creacion=" + suc_usr_creacion + ", suc_usr_modific=" + suc_usr_modific + '}';
    }

}