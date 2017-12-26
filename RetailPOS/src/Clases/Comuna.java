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
public class Comuna {

    //ATRIBUTOS:
    private String com_id_com;
    private int com_id_reg;
    private String com_nombre;

    /**
     * Constructor clase comuna con acceso a base de datos
     *
     * @param id_comuna
     * @throws SQLException
     */
    public Comuna(String id_comuna) throws SQLException {
        String sql = "select com_id_com, com_id_reg, com_nombre"
                + "from EMDTCOM where com_id_com = '" + id_comuna + "';";
    }

    //GET Y SET
    public String getCom_id_com() {
        return com_id_com;
    }

    public void setCom_id_com(String com_id_com) {
        this.com_id_com = com_id_com;
    }

    public int getCom_id_reg() {
        return com_id_reg;
    }

    public void setCom_id_reg(int com_id_reg) {
        this.com_id_reg = com_id_reg;
    }

    public String getCom_nombre() {
        return com_nombre;
    }

    public void setCom_nombre(String com_nombre) {
        this.com_nombre = com_nombre;
    }

}
