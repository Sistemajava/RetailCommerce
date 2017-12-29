package clases;

import Clases.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Usuario {

    //ATRIBUTOS:    
    private String usu_id_usua;
    private int usu_id_perf;
    private String usu_nombres;
    private String usu_apell1;
    private String usu_apell2;
    private String usu_dni;
    private String usu_passw;
    private char usu_estado;
    private String usu_fec_esta;
    private String usu_ind_jefe;
    private String usu_fec_alta;
    private String usu_fec_lic_desde;
    private String usu_fec_lic_hasta;
    private char usu_conexion;
    private String usu_fec_bloq;
    private String usu_hor_bloq;
    private String usu_tst_creacion;
    private String usu_tst_modific;
    private String usu_usr_creacion;
    private String usu_usr_modific;

    //CONSTRUCTORES:
    public Usuario() {
    }

    /**
     *
     * @param useName
     * @throws SQLException
     */
    public Usuario(String useName) throws SQLException {

        String sql = "select usu_id_usua,"
                + " usu_id_perf,"
                + " usu_nombres,"
                + " usu_apell1,"
                + " usu_apell2, "
                + "usu_dni, "
                + "usu_passw, "
                + "usu_estado, "
                + "usu_fec_esta,"
                + " usu_ind_jefe, "
                + "usu_fec_alta, "
                + "usu_fec_lic_desde,"
                + " usu_fec_lic_hasta, "
                + "usu_conexion, "
                + "usu_fec_bloq, "
                + "usu_hor_bloq,"
                + " usu_tst_creacion, "
                + "usu_tst_modific, "
                + "usu_usr_creacion,"
                + " usu_usr_modific"
                + " from EMDTUSU where usu_id_usua = '" + useName + "';";

        ResultSet objRes;
        Conexion.sentencia = Conexion.conn.prepareStatement(sql);
        objRes = Conexion.sentencia.executeQuery(sql);

        while (objRes.next()) {
            //Atributos de la clase:
            setUsu_id_usua((String) objRes.getObject(1));
            setUsu_id_perf((int) objRes.getObject(2));
            setUsu_nombres((String) objRes.getObject(3));
            setUsu_apell1((String) objRes.getObject(4));
            setUsu_apell2((String) objRes.getObject(5));
            setUsu_dni((String) objRes.getObject(6));
            setUsu_passw((String) objRes.getObject(7));
            setUsu_estado(String.valueOf(objRes.getObject(8)).charAt(0));
            setUsu_fec_esta(String.valueOf(objRes.getDate(9)));
            setUsu_ind_jefe((String) objRes.getObject(10));
            setUsu_fec_alta(String.valueOf(objRes.getObject(11)));
            setUsu_fec_lic_desde(String.valueOf(objRes.getObject(12)));
            setUsu_fec_lic_hasta(String.valueOf(objRes.getObject(13)));
            setUsu_conexion(String.valueOf(objRes.getObject(14)).charAt(0));
            setUsu_fec_bloq(String.valueOf(objRes.getObject(15)));
            setUsu_hor_bloq(String.valueOf(objRes.getTime(16)));
            setUsu_tst_creacion(String.valueOf(objRes.getTimestamp(17)));
            setUsu_tst_modific(String.valueOf(objRes.getTimestamp(18)));
            setUsu_usr_creacion((String) objRes.getObject(19));
            setUsu_usr_modific((String) objRes.getObject(20));
        }

    }

    //implementar metodo con ingreso de usuario y passw
    //GET Y SET:
    public String getUsu_id_usua() {
        return usu_id_usua;
    }

    public void setUsu_id_usua(String usu_id_usua) {
        this.usu_id_usua = usu_id_usua;
    }

    public int getUsu_id_perf() {
        return usu_id_perf;
    }

    public void setUsu_id_perf(int usu_id_perf) {
        this.usu_id_perf = usu_id_perf;
    }

    public String getUsu_nombres() {
        return usu_nombres;
    }

    public void setUsu_nombres(String usu_nombres) {
        this.usu_nombres = usu_nombres;
    }

    public String getUsu_apell1() {
        return usu_apell1;
    }

    public void setUsu_apell1(String usu_apell1) {
        this.usu_apell1 = usu_apell1;
    }

    public String getUsu_apell2() {
        return usu_apell2;
    }

    public void setUsu_apell2(String usu_apell2) {
        this.usu_apell2 = usu_apell2;
    }

    public String getUsu_dni() {
        return usu_dni;
    }

    public void setUsu_dni(String usu_dni) {
        this.usu_dni = usu_dni;
    }

    public String getUsu_passw() {
        return usu_passw;
    }

    public void setUsu_passw(String usu_passw) {
        this.usu_passw = usu_passw;
    }

    public char getUsu_estado() {
        return usu_estado;
    }

    public void setUsu_estado(char usu_estado) {
        this.usu_estado = usu_estado;
    }

    public String getUsu_fec_esta() {
        return usu_fec_esta;
    }

    public void setUsu_fec_esta(String usu_fec_esta) {
        this.usu_fec_esta = usu_fec_esta;
    }

    public String getUsu_ind_jefe() {
        return usu_ind_jefe;
    }

    public void setUsu_ind_jefe(String usu_ind_jefe) {
        this.usu_ind_jefe = usu_ind_jefe;
    }

    public String getUsu_fec_alta() {
        return usu_fec_alta;
    }

    public void setUsu_fec_alta(String usu_fec_alta) {
        this.usu_fec_alta = usu_fec_alta;
    }

    public String getUsu_fec_lic_desde() {
        return usu_fec_lic_desde;
    }

    public void setUsu_fec_lic_desde(String usu_fec_lic_desde) {
        this.usu_fec_lic_desde = usu_fec_lic_desde;
    }

    public String getUsu_fec_lic_hasta() {
        return usu_fec_lic_hasta;
    }

    public void setUsu_fec_lic_hasta(String usu_fec_lic_hasta) {
        this.usu_fec_lic_hasta = usu_fec_lic_hasta;
    }

    public char getUsu_conexion() {
        return usu_conexion;
    }

    public void setUsu_conexion(char usu_conexion) {
        this.usu_conexion = usu_conexion;
    }

    public String getUsu_fec_bloq() {
        return usu_fec_bloq;
    }

    public void setUsu_fec_bloq(String usu_fec_bloq) {
        this.usu_fec_bloq = usu_fec_bloq;
    }

    public String getUsu_hor_bloq() {
        return usu_hor_bloq;
    }

    public void setUsu_hor_bloq(String usu_hor_bloq) {
        this.usu_hor_bloq = usu_hor_bloq;
    }

    public String getUsu_tst_creacion() {
        return usu_tst_creacion;
    }

    public void setUsu_tst_creacion(String usu_tst_creacion) {
        this.usu_tst_creacion = usu_tst_creacion;
    }

    public String getUsu_tst_modific() {
        return usu_tst_modific;
    }

    public void setUsu_tst_modific(String usu_tst_modific) {
        this.usu_tst_modific = usu_tst_modific;
    }

    public String getUsu_usr_creacion() {
        return usu_usr_creacion;
    }

    public void setUsu_usr_creacion(String usu_usr_creacion) {
        this.usu_usr_creacion = usu_usr_creacion;
    }

    public String getUsu_usr_modific() {
        return usu_usr_modific;
    }

    public void setUsu_usr_modific(String usu_usr_modific) {
        this.usu_usr_modific = usu_usr_modific;
    }

    //METODO LISTAR USUARIOS:
    public static ResultSet listarUsuarios() throws SQLException {
        ResultSet objRes = null;

        String sql = "select usu_id_usua, usu_nombres from EMDTUSU;";
        Conexion.sentencia = Conexion.conn.prepareStatement(sql);
        objRes = Conexion.sentencia.executeQuery(sql);
        return objRes;
    }

    /**
     * METODO LISTAR
     *
     * @param id_usua
     * @return
     * @throws SQLException
     */
    public static ResultSet listarUsuarios(String id_usua) throws SQLException {
        ResultSet objRes;

        String sql = "select usu_id_usua, usu_id_perf, usu_nombres, usu_apell1, usu_apell2, usu_dni, usu_passw, usu_estado, usu_fec_esta, usu_ind_jefe, "
                + "usu_fec_alta, usu_fec_lic_desde, usu_fec_lic_hasta, usu_conexion, usu_fec_bloq, usu_hor_bloq, usu_tst_creacion, usu_tst_modific, "
                + "usu_usr_creacion, usu_usr_modific"
                + " from EMDTUSU where usu_id_usua = '" + id_usua + "';";
        Conexion.sentencia = Conexion.conn.prepareStatement(sql);
        objRes = Conexion.sentencia.executeQuery(sql);
        return objRes;
    }

    /**
     * "METODO VALIDAR PASSWORD"
     * @param id_usua
     * @param passw
     * @return
     * @throws SQLException 
     */
    public static boolean validaPassword(String id_usua, String passw) throws SQLException {
        ResultSet objRes;
        boolean resultado = false;

        String sql = "select usu_id_usua, usu_id_perf, usu_nombres, usu_apell1, usu_apell2, usu_dni, usu_passw, usu_estado, usu_fec_esta, usu_ind_jefe, "
                + "usu_fec_alta, usu_fec_lic_desde, usu_fec_lic_hasta, usu_conexion, usu_fec_bloq, usu_hor_bloq, usu_tst_creacion, usu_tst_modific, "
                + "usu_usr_creacion, usu_usr_modific"
                + " from EMDTUSU where usu_id_usua = '" + id_usua + "'  and usu_passw = '" + passw + "';";
        Conexion.sentencia = Conexion.conn.prepareStatement(sql);
        objRes = Conexion.sentencia.executeQuery(sql);

        while (objRes.next()) {
            if (objRes.getString(1).equals(id_usua) && objRes.getString(7).equals(passw)) {
                resultado = true;
            }
        }
        return resultado;
    }

    /**
     * Metodo de ingreso de usuario
     *
     * @param idUsu = char 4
     * @param idPerf = int 2
     * @return
     * @throws SQLException
     */
    public static boolean agregarUsuario(String idUsu, int idPerf) throws SQLException {
        boolean resultado = false;

        try {
            //insert into EMDTUSU (usu_id_usua, usu_id_perf, usu_nombres, usu_apell1, usu_apell2, usu_dni, usu_passw, usu_estado, usu_fec_esta, usu_ind_jefe,usu_fec_alta, usu_fec_lic_desde, usu_fec_lic_hasta, usu_conexion, usu_fec_bloq, usu_hor_bloq, usu_tst_creacion, usu_tst_modific,usu_usr_creacion, usu_usr_modific) VALUES ('0009',1,"Nuevo Usuario","apelli1","apelli2","0000000000","0009",'A',CURRENT_DATE, 'N',CURRENT_DATE,'0001-01-01','0001-01-01','N','0001-01-01','01:00:00', CURRENT_TIMESTAMP,CURRENT_TIMESTAMP,'0000','    ');
            String sql = "insert into EMDTUSU (usu_id_usua, usu_id_perf, usu_nombres, usu_apell1, usu_apell2, usu_dni, usu_passw, usu_estado, "
                    + "usu_fec_esta, usu_ind_jefe,usu_fec_alta, usu_fec_lic_desde, usu_fec_lic_hasta, usu_conexion, usu_fec_bloq, usu_hor_bloq, usu_tst_creacion, "
                    + "usu_tst_modific,usu_usr_creacion, usu_usr_modific) "
                    + "VALUES ('" + idUsu + "'," + idPerf + ",'Nuevo Usuario','apelli1','apelli2','0000000000','0009','A',CURRENT_DATE,'N',CURRENT_DATE,'0001-01-01','0001-01-01',"
                    + "'N','0001-01-01','01:00:00', CURRENT_TIMESTAMP,CURRENT_TIMESTAMP,'0000','    ');";

            Conexion.sentencia = Conexion.conn.prepareStatement(sql);
            Conexion.sentencia.execute(sql);

            resultado = true;

        } catch (Exception e) {
            resultado = false;
        }

        return resultado;
    }

}
