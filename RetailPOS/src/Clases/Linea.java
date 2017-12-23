package Clases;

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

    //CONSTRUCTORE:
    public Linea() {
    }

    public Linea(String lin_id_lin, String lin_nom_linea, int lin_id_area, char lin_estado, String fec_alta, String lin_tst_creacion, String lin_tst_modific, String lin_usr_creacion, String lin_usr_modific) {
        this.lin_id_lin = lin_id_lin;
        this.lin_nom_linea = lin_nom_linea;
        this.lin_id_area = lin_id_area;
        this.lin_estado = lin_estado;
        this.fec_alta = fec_alta;
        this.lin_tst_creacion = lin_tst_creacion;
        this.lin_tst_modific = lin_tst_modific;
        this.lin_usr_creacion = lin_usr_creacion;
        this.lin_usr_modific = lin_usr_modific;
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

    //TO STRING:
    @Override
    public String toString() {
        return "Linea{" + "lin_id_lin=" + lin_id_lin + ", lin_nom_linea=" + lin_nom_linea + ", lin_id_area=" + lin_id_area + ", lin_estado=" + lin_estado + ", fec_alta=" + fec_alta + ", lin_tst_creacion=" + lin_tst_creacion + ", lin_tst_modific=" + lin_tst_modific + ", lin_usr_creacion=" + lin_usr_creacion + ", lin_usr_modific=" + lin_usr_modific + '}';
    }

}
