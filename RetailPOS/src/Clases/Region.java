/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.SQLException;

/**
 *
 * @author Emilio
 */
public class Region {

    //ATRIBUTOS:
    private String reg_id_reg;
    private String reg_nombre;
    private int reg_correl;
    private String reg_num_reg;
    private String reg_zona;

    /**
     * CONSTRUCTOR CON ACCESO A BASE DE DATOS:
     *
     * @param id_region
     * @throws SQLException
     */
    public Region(String id_region) throws SQLException {
        String sql = "select reg_id_reg, reg_nombre, reg_correl, reg_num_reg, reg_zona"
                + "from EMDTREG where reg_id_reg = '" + id_region + "';";
    }

    //GET Y SET:
    public String getReg_id_reg() {
        return reg_id_reg;
    }

    public void setReg_id_reg(String reg_id_reg) {
        this.reg_id_reg = reg_id_reg;
    }

    public String getReg_nombre() {
        return reg_nombre;
    }

    public void setReg_nombre(String reg_nombre) {
        this.reg_nombre = reg_nombre;
    }

    public int getReg_correl() {
        return reg_correl;
    }

    public void setReg_correl(int reg_correl) {
        this.reg_correl = reg_correl;
    }

    public String getReg_num_reg() {
        return reg_num_reg;
    }

    public void setReg_num_reg(String reg_num_reg) {
        this.reg_num_reg = reg_num_reg;
    }

    public String getReg_zona() {
        return reg_zona;
    }

    public void setReg_zona(String reg_zona) {
        this.reg_zona = reg_zona;
    }

}
