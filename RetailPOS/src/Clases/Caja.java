package Clases;

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

    //CONSTRUCOTRES:
    public Caja() {
    }

    public Caja(String pos_id_suc, String pos_id_pos, char pos_estado, String pos_fec_esta, char pos_ind_res, int pos_mvta_dia, int pos_manu_dia, String pos_tst_creacion, String pos_tst_modific, String pos_usr_creacion, String pos_usr_modific) {
        this.pos_id_suc = pos_id_suc;
        this.pos_id_pos = pos_id_pos;
        this.pos_estado = pos_estado;
        this.pos_fec_esta = pos_fec_esta;
        this.pos_ind_res = pos_ind_res;
        this.pos_mvta_dia = pos_mvta_dia;
        this.pos_manu_dia = pos_manu_dia;
        this.pos_tst_creacion = pos_tst_creacion;
        this.pos_tst_modific = pos_tst_modific;
        this.pos_usr_creacion = pos_usr_creacion;
        this.pos_usr_modific = pos_usr_modific;
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

    @Override
    public String toString() {
        return "Caja{" + "pos_id_suc=" + pos_id_suc + ", pos_id_pos=" + pos_id_pos + ", pos_estado=" + pos_estado + ", pos_fec_esta=" + pos_fec_esta + ", pos_mvta_dia=" + pos_mvta_dia + ", pos_manu_dia=" + pos_manu_dia + ", pos_tst_creacion=" + pos_tst_creacion + ", pos_tst_modific=" + pos_tst_modific + ", pos_usr_creacion=" + pos_usr_creacion + ", pos_usr_modific=" + pos_usr_modific + '}';
    }

}
