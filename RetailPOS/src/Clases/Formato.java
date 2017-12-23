package Clases;

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
    private char frm_usr_creacion;
    private char frm_usr_modific;

    //CONSTRUCTORES:
    public Formato() {
    }

    public Formato(String frm_id_frm, String frm_nom_form, String frm_slogan, int cant_caja, char frm_estado, String fec_estado, String fec_alta, String frm_hr_ini, String frm_hr_fin, String frm_tst_creacion, String frm_tst_modific, char frm_usr_creacion, char frm_usr_modific) {
        this.frm_id_frm = frm_id_frm;
        this.frm_nom_form = frm_nom_form;
        this.frm_slogan = frm_slogan;
        this.cant_caja = cant_caja;
        this.frm_estado = frm_estado;
        this.fec_estado = fec_estado;
        this.fec_alta = fec_alta;
        this.frm_hr_ini = frm_hr_ini;
        this.frm_hr_fin = frm_hr_fin;
        this.frm_tst_creacion = frm_tst_creacion;
        this.frm_tst_modific = frm_tst_modific;
        this.frm_usr_creacion = frm_usr_creacion;
        this.frm_usr_modific = frm_usr_modific;
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

    public char getFrm_usr_creacion() {
        return frm_usr_creacion;
    }

    public void setFrm_usr_creacion(char frm_usr_creacion) {
        this.frm_usr_creacion = frm_usr_creacion;
    }

    public char getFrm_usr_modific() {
        return frm_usr_modific;
    }

    public void setFrm_usr_modific(char frm_usr_modific) {
        this.frm_usr_modific = frm_usr_modific;
    }

    //METODO DE IMPRESION:
    @Override
    public String toString() {
        return "Formato:"
                + "frm_id_frm= " + frm_id_frm
                + ", frm_nom_form= " + frm_nom_form
                + ", frm_slogan= " + frm_slogan
                + ", cant_caja= " + cant_caja
                + ", frm_estado= " + frm_estado
                + ", fec_estado= " + fec_estado
                + ", fec_alta= " + fec_alta
                + ", frm_hr_ini= " + frm_hr_ini
                + ", frm_hr_fin= " + frm_hr_fin
                + ", frm_tst_creacion= " + frm_tst_creacion
                + ", frm_tst_modific= " + frm_tst_modific
                + ", frm_usr_creacion= " + frm_usr_creacion
                + ", frm_usr_modific= " + frm_usr_modific;
    }
}
