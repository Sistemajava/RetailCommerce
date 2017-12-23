package clases;
import Clases.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
public class Usuario {

    //ATRIBUTOS:
    private String usu_id_usua;
    private int usu_id_perf;
    private String usu_nombres;
    private String usu_apelli1;
    private String usu_apelli2;
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

    public Usuario(String usu_id_usua, int usu_id_perf, String usu_nombres, String usu_apelli1, String usu_apelli2, String usu_dni, String usu_passw, char usu_estado, String usu_fec_esta, String usu_ind_jefe, String usu_fec_alta, String usu_fec_lic_desde, String usu_fec_lic_hasta, char usu_conexion, String usu_fec_bloq, String usu_hor_bloq, String usu_tst_creacion, String usu_tst_modific, String usu_usr_creacion, String usu_usr_modific) {
        this.usu_id_usua = usu_id_usua;
        this.usu_id_perf = usu_id_perf;
        this.usu_nombres = usu_nombres;
        this.usu_apelli1 = usu_apelli1;
        this.usu_apelli2 = usu_apelli2;
        this.usu_dni = usu_dni;
        this.usu_passw = usu_passw;
        this.usu_estado = usu_estado;
        this.usu_fec_esta = usu_fec_esta;
        this.usu_ind_jefe = usu_ind_jefe;
        this.usu_fec_alta = usu_fec_alta;
        this.usu_fec_lic_desde = usu_fec_lic_desde;
        this.usu_fec_lic_hasta = usu_fec_lic_hasta;
        this.usu_conexion = usu_conexion;
        this.usu_fec_bloq = usu_fec_bloq;
        this.usu_hor_bloq = usu_hor_bloq;
        this.usu_tst_creacion = usu_tst_creacion;
        this.usu_tst_modific = usu_tst_modific;
        this.usu_usr_creacion = usu_usr_creacion;
        this.usu_usr_modific = usu_usr_modific;
    }

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

    public String getUsu_apelli1() {
        return usu_apelli1;
    }

    public void setUsu_apelli1(String usu_apelli1) {
        this.usu_apelli1 = usu_apelli1;
    }

    public String getUsu_apelli2() {
        return usu_apelli2;
    }

    public void setUsu_apelli2(String usu_apelli2) {
        this.usu_apelli2 = usu_apelli2;
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

 
    public static ResultSet listarUsuarios() throws SQLException{
        ResultSet objRes = null ;
        
        String sql = "select usu_id_usua, usu_nombres from emdtusu;";
        Conexion.sentencia = Conexion.conn.prepareStatement(sql);
        objRes = Conexion.sentencia.executeQuery(sql);                        
        return objRes; 
    }    
    
    public static ResultSet listarUsuarios(String id_usua) throws SQLException{
        ResultSet objRes = null ;
        
        String sql = "select usu_id_usua, usu_nombres "
                + "from emdtusu where usu_id_usua = '"+id_usua+"';";
        Conexion.sentencia = Conexion.conn.prepareStatement(sql);
        objRes = Conexion.sentencia.executeQuery(sql);                        
        return objRes; 
    }  
    
    

}
