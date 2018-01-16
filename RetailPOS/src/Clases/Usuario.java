package clases;

import Clases.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Usuario {

    //ATRIBUTOS:    
    private String usu_id_usua;
    private int usu_id_perf;
    private String usu_id_sucu; // añadido el 02-01-2018
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
    private String usu_frm_nombre;
    private String usu_frm_id;
    private String usu_frm_Slogan;
    private String usu_per_nombre;

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
                + "usu_id_perf,"
                + "usu_id_sucu,"
                + "usu_nombres,"
                + "usu_apell1,"
                + "usu_apell2, "
                + "usu_dni, "
                + "usu_passw, "
                + "usu_estado, "
                + "usu_fec_esta,"
                + "usu_ind_jefe, "
                + "usu_fec_alta, "
                + "usu_fec_lic_desde,"
                + "usu_fec_lic_hasta, "
                + "usu_conexion, "
                + "usu_fec_bloq, "
                + "usu_hor_bloq,"
                + " usu_tst_creacion, "
                + "usu_tst_modific, "
                + "usu_usr_creacion,"
                + " usu_usr_modific"
                + " from EMDTUSU "
                + "where usu_id_usua = '" + useName + "';";

        ResultSet objRes;
        Conexion.sentencia = Conexion.conn.prepareStatement(sql);
        objRes = Conexion.sentencia.executeQuery(sql);

        while (objRes.next()) {
            //Atributos de la clase:
            setUsu_id_usua((String) objRes.getObject(1));
            setUsu_id_perf((int) objRes.getObject(2));
            setUsu_id_sucu((String) objRes.getObject(3));
            setUsu_nombres((String) objRes.getObject(4));
            setUsu_apell1((String) objRes.getObject(5));
            setUsu_apell2((String) objRes.getObject(6));
            setUsu_dni((String) objRes.getObject(7));
            setUsu_passw((String) objRes.getObject(8));
            setUsu_estado(String.valueOf(objRes.getObject(9)).charAt(0));
            setUsu_fec_esta(String.valueOf(objRes.getDate(10)));
            setUsu_ind_jefe((String) objRes.getObject(11));
            setUsu_fec_alta(String.valueOf(objRes.getObject(12)));
            setUsu_fec_lic_desde(String.valueOf(objRes.getObject(13)));
            setUsu_fec_lic_hasta(String.valueOf(objRes.getObject(14)));
            setUsu_conexion(String.valueOf(objRes.getObject(15)).charAt(0));
            setUsu_fec_bloq(String.valueOf(objRes.getObject(16)));
            setUsu_hor_bloq(String.valueOf(objRes.getTime(17)));
            setUsu_tst_creacion(String.valueOf(objRes.getTimestamp(18)));
            setUsu_tst_modific(String.valueOf(objRes.getTimestamp(19)));
            setUsu_usr_creacion((String) objRes.getObject(20));
            setUsu_usr_modific((String) objRes.getObject(21));
            
            if (getUsu_id_sucu() != ""){
               String sqlFrm = "Select FRM_NOM_FORM, SUC_ID_FRM, FRM_SLOGAN FROM EMDTSUC, EMDTFRM WHERE SUC_ID_FRM  = FRM_ID_FRM  AND SUC_ID_SUC  =  '"+getUsu_id_sucu()+"';";
               Conexion.sentencia = Conexion.conn.prepareStatement(sqlFrm);
               objRes = Conexion.sentencia.executeQuery(sqlFrm);
               
                while (objRes.next()) {
                    setUsu_frm_nombre((String) objRes.getObject(1));
                    setUsu_frm_id((String) objRes.getObject(2));
                    setUsu_frm_Slogan((String) objRes.getObject(3));
                    
                    String sqlPer = "Select PER_ID_PERF,PER_NOM_PERF FROM EMDTPER WHERE PER_ID_PERF  = "+getUsu_id_perf()+";";
                    Conexion.sentencia = Conexion.conn.prepareStatement(sqlPer);
                    objRes = Conexion.sentencia.executeQuery(sqlPer);
                    
                    while (objRes.next()) {
                        setUsu_per_Nombre((String) objRes.getObject(2));
                    }
                }
            }
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

    public String getUsu_id_sucu() {
        return usu_id_sucu;
    }

    public void setUsu_id_sucu(String usu_id_sucu) {
        this.usu_id_sucu = usu_id_sucu;
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
    
    public String getUsu_frm_nombre() {
        return usu_frm_nombre;
    }

    public void setUsu_frm_nombre(String usu_frm_nombre) {
        this.usu_frm_nombre = usu_frm_nombre;
    }

    public String getUsu_frm_id() {
        return usu_frm_id;
    }

    public void setUsu_frm_id(String usu_frm_id) {
        this.usu_frm_id = usu_frm_id;
    }
    
    public String getUsu_frm_Slogan() {
        return usu_frm_Slogan;
    }

    public void setUsu_frm_Slogan(String usu_frm_Slogan) {
        this.usu_frm_Slogan = usu_frm_Slogan;
    }
    
    public String getUsu_per_Nombre() {
        return usu_per_nombre;
    }

    public void setUsu_per_Nombre(String usu_per_Nombre) {
        this.usu_per_nombre = usu_per_Nombre;
    }
    

    //METODO LISTAR todos los USUARIOS:
    public static ResultSet listarUsuarios() throws SQLException {
        ResultSet objRes = null;

        String sql = "select usu_id_usua, usu_nombres from EMDTUSU;";
        Conexion.sentencia = Conexion.conn.prepareStatement(sql);
        objRes = Conexion.sentencia.executeQuery(sql);
        return objRes;
    }

    /**
     * 02-01-2018 METODO LISTAR usuario especifico
     *
     * @param id_usua
     * @return
     * @throws SQLException
     */
    public static ResultSet listarUsuarios(String id_usua) throws SQLException {
        ResultSet objRes;

        String sql = "select usu_id_usua, usu_id_perf, , usu_id_sucu, usu_nombres, usu_apell1, usu_apell2, usu_dni, usu_passw, usu_estado, usu_fec_esta, usu_ind_jefe, "
                + "usu_fec_alta, usu_fec_lic_desde, usu_fec_lic_hasta, usu_conexion, usu_fec_bloq, usu_hor_bloq, usu_tst_creacion, usu_tst_modific, "
                + "usu_usr_creacion, usu_usr_modific"
                + " from EMDTUSU where usu_id_usua = '" + id_usua + "';";
        Conexion.sentencia = Conexion.conn.prepareStatement(sql);
        objRes = Conexion.sentencia.executeQuery(sql);
        return objRes;
    }

    /**
     * "METODO VALIDAR PASSWORD"
     *
     * @param id_usua
     * @param passw
     * @return
     * @throws SQLException
     */
    public static boolean validaPassword(String id_usua, String passw) throws SQLException {
        ResultSet objRes;
        boolean resultado = false;
        Conexion.CONEXION_USERID_KO = id_usua;

        String sql = "select usu_id_usua, usu_id_perf, usu_id_sucu, usu_nombres, usu_apell1, usu_apell2, usu_dni, usu_passw, usu_estado, usu_fec_esta, usu_ind_jefe, "
                + "usu_fec_alta, usu_fec_lic_desde, usu_fec_lic_hasta, usu_conexion, usu_fec_bloq, usu_hor_bloq, usu_tst_creacion, usu_tst_modific, "
                + "usu_usr_creacion, usu_usr_modific"
                + " from EMDTUSU where usu_id_usua = '" + id_usua + "'  and usu_passw = '" + passw + "';";
        Conexion.sentencia = Conexion.conn.prepareStatement(sql);
        objRes = Conexion.sentencia.executeQuery(sql);

        while (objRes.next()) {
            if (objRes.getString(1).equals(id_usua) && objRes.getString(8).equals(passw)) {
                resultado = true;
                Conexion.CONEXION_USERID_OK = id_usua;
                Conexion.CONEXION_USERID_KO = "";
            }
        }
        return resultado;
    }

    /**
     * Metodo de ingreso de usuario
     *
     * @param idUsu = char 4
     * @param idPerf = int 2
     * @param idSucu
     * @return
     * @throws SQLException
     */
    public static boolean agregarUsuario(String idUsu, int idPerf, String idSucu) throws SQLException {
        boolean resultado = false;

        try {
            //insert into EMDTUSU (usu_id_usua, usu_id_perf, usu_nombres, usu_apell1, usu_apell2, usu_dni, usu_passw, usu_estado, usu_fec_esta, usu_ind_jefe,usu_fec_alta, usu_fec_lic_desde, usu_fec_lic_hasta, usu_conexion, usu_fec_bloq, usu_hor_bloq, usu_tst_creacion, usu_tst_modific,usu_usr_creacion, usu_usr_modific) VALUES ('0009',1,"Nuevo Usuario","apelli1","apelli2","0000000000","0009",'A',CURRENT_DATE, 'N',CURRENT_DATE,'0001-01-01','0001-01-01','N','0001-01-01','01:00:00', CURRENT_TIMESTAMP,CURRENT_TIMESTAMP,'0000','    ');
            String sql = "insert into EMDTUSU ("
                    + "usu_id_usua, usu_id_perf, usu_id_sucu, usu_nombres, usu_apell1, usu_apell2, usu_dni, usu_passw, usu_estado, "
                    + "usu_fec_esta, usu_ind_jefe,usu_fec_alta, usu_fec_lic_desde, usu_fec_lic_hasta, usu_conexion, usu_fec_bloq, usu_hor_bloq, usu_tst_creacion, "
                    + "usu_tst_modific,usu_usr_creacion, usu_usr_modific) "
                    + "VALUES ('" + idUsu + "'," + idPerf + idSucu + ",'Nuevo Usuario','apelli1','apelli2','0000000000','0009','A',CURRENT_DATE,'N',CURRENT_DATE,'0001-01-01','0001-01-01',"
                    + "'N','0001-01-01','01:00:00', CURRENT_TIMESTAMP,CURRENT_TIMESTAMP,'0000','    ');";

            Conexion.sentencia = Conexion.conn.prepareStatement(sql);
            Conexion.sentencia.execute(sql);

            resultado = true;

        } catch (Exception e) {
            resultado = false;
        }

        return resultado;
    }

    public static boolean bloqueaUsuario(String username, String fecBloqueo, String horBloqueo) throws SQLException {
        boolean resultado = false;

        try {
            //UPDATE EMDTUSU SET `USU_CONEXION` = 'B', `USU_FEC_BLOQ` = '2018-01-01',`USU_HOR_BLOQ` = '08:01:01' WHERE `USU_ID_USUA` = '0001';
            String sql = "UPDATE EMDTUSU"
                    + " SET `USU_CONEXION` = 'B', `USU_FEC_BLOQ` = CURRENT_DATE,`USU_HOR_BLOQ` = '" + horBloqueo + "'"
                    + " WHERE `USU_ID_USUA` = '" + username + "';";

            System.out.println("BOQUEAR USUARIO = " + sql);
            Conexion.sentencia = Conexion.conn.prepareStatement(sql);
            Conexion.sentencia.execute(sql);

            resultado = true;

        } catch (Exception e) {
            resultado = false;
        }

        return resultado;
    }
    
    public static boolean validaStamBloqueo(String idUsua, String fecBl, String horBl, String fecAct, String horAct) throws SQLException {
        boolean valido = false;
        ResultSet objRes;
        //TIMESTAMPDIFF(MINUTE,TIMESTAMP(USU_FEC_BLOQ,USU_HOR_BLOQ),CURRENT_TIMESTAMP())
        String sql = "select TIMESTAMPDIFF(MINUTE,TIMESTAMP(USU_FEC_BLOQ,USU_HOR_BLOQ),  TIMESTAMP('"+fecAct+"','"+horAct+"')) "
                   + " from EMDTUSU "
                   + " where usu_id_usua = '" + idUsua + "';";
        Conexion.sentencia = Conexion.conn.prepareStatement(sql);
        objRes = Conexion.sentencia.executeQuery(sql);
        
        while (objRes.next()) {            
            //System.out.println("Tiempo del ultimo Bloqueo : "+objRes.getString(1));
            if(objRes.getInt(1) > 15 ){
                 valido = true;
            }            
        }        
        return valido;
    }
    
    
    public static boolean desbloqueaUsuario(String username) throws SQLException {
        boolean resultado = false;

        try {
            //UPDATE EMDTUSU SET `USU_CONEXION` = 'B', `USU_FEC_BLOQ` = '2018-01-01',`USU_HOR_BLOQ` = '08:01:01' WHERE `USU_ID_USUA` = '0001';
            String sql = "UPDATE EMDTUSU"
                    + " SET `USU_CONEXION` = 'N', `USU_FEC_BLOQ` = '0001-01-01',`USU_HOR_BLOQ` = '00:00:00'"
                    + " WHERE `USU_ID_USUA` = '" + username + "';";

            Conexion.sentencia = Conexion.conn.prepareStatement(sql);
            Conexion.sentencia.execute(sql);

            resultado = true;

        } catch (Exception e) {
            resultado = false;
        }
        return resultado;
    }

    /**
     * 10-01-2018 Metodo listar usuario con tablas especificas
     *
     * @return
     */
    public ArrayList ListarUsuarioJtable() {
        ArrayList arrayListaUsr = new ArrayList();
        ResultSet objRes;
        try {
            String sql = "select usu_id_usua,"
                    + "usu_passw, "
                    + "usu_nombres,"
                    + "usu_apell1,"
                    + "usu_apell2,"
                    + "usu_estado, "
                    + "usu_conexion "
                    + "from EMDTUSU;";
            Conexion.sentencia = Conexion.conn.prepareStatement(sql);
            objRes = Conexion.sentencia.executeQuery(sql);

            while (objRes.next()) {
                Usuario usr = new Usuario();
                usr.setUsu_id_usua(objRes.getString(1));
                usr.setUsu_passw(objRes.getString(2));
                usr.setUsu_nombres(objRes.getString(3));
                usr.setUsu_apell1(objRes.getString(4));
                usr.setUsu_apell2(objRes.getString(5));
                usr.setUsu_estado(String.valueOf(objRes.getObject(6)).charAt(0));
                usr.setUsu_conexion(String.valueOf(objRes.getObject(7)).charAt(0));

                arrayListaUsr.add(usr);
            }

        } catch (Exception e) {

        }
        return arrayListaUsr;
    }

    /**
     * 11-01-2018 METODO ELIMINAR USUARIO
     *
     * @param idUsuario
     * @return
     * @throws java.lang.Exception
     */
    public static boolean eliminarUsuario(String idUsuario) throws Exception {
        boolean resultado = false;
        
        String sql = "UPDATE EMDTUSU SET usu_estado = 'I' where usu_id_usua = '" + idUsuario + "';";
        Conexion.sentencia = Conexion.conn.prepareStatement(sql);
        resultado = Conexion.sentencia.execute(sql);

        return resultado;
    }
    
    public static boolean marcaConexion(String idUsuario) throws Exception {
        boolean resultado = false;

        String sql = "UPDATE EMDTUSU SET usu_conexion = 'S' where usu_id_usua = '" + idUsuario + "';";
        System.out.println("SQL :"+sql);
        Conexion.sentencia = Conexion.conn.prepareStatement(sql);
        resultado = Conexion.sentencia.execute(sql);

        return resultado;
    }
    
    public static boolean desmarcaConexion(String idUsuario) throws Exception {
        boolean resultado = false;

        String sql = "UPDATE EMDTUSU SET usu_conexion = 'N' where usu_id_usua = '" + idUsuario + "';";
        Conexion.sentencia = Conexion.conn.prepareStatement(sql);
        resultado = Conexion.sentencia.execute(sql);

        return resultado;
    }
    
    
    /** 12-01-2018
     * METODO LISTAR USUARIO
     * USADO EN COMBOBOX EN FRMUSUARIO
     * EN PESTAÑA LISTAR
     * 
     * @return
     * @throws java.sql.SQLException
     */
    public static ResultSet listarCboUsuario() throws Exception {
        String strSql;
        strSql = "select USU_ID_USUA from EMDTUSU;";
        ResultSet objRes;
        Conexion.sentencia = Conexion.conn.prepareStatement(strSql);
        objRes = Conexion.sentencia.executeQuery(strSql);
        return objRes;
    }
}
