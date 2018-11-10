package prueba;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author richy
 */
public class conexionDB {

    private String URLAccess = "";
    private String usuario = "";
    private String contrasena = "";
    private Connection conexion;

    public String getURLAccess() {
        return URLAccess;
    }

    public void setURLAccess(String URLAccess) {
        this.URLAccess = URLAccess;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Connection getConexion() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }

    
    //Abrir
    public void setConexionMySql(String URLAccess, String usuario, String contrasena) {
        try {
            setURLAccess("" + URLAccess);
            setUsuario(usuario);
            setContrasena(contrasena);
            Class.forName("com.mysql.jdbc.Driver");  
            conexion = DriverManager.getConnection(URLAccess, usuario, contrasena);
            System.out.println("Conexion Exitosa" + URLAccess + "Usuario:" + usuario);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error" + ex.toString());
        }
    }
    
    //Cerrar
    public void closeConexion(){
        try {
            conexion.close();
        } catch (SQLException ex) {
            System.out.println("Error"+ex.toString());
        }
    }
    
    public void sentenciaNoSelect(String sentencia){
        try {
            Statement st = conexion.createStatement();
            st.executeUpdate(sentencia);
            conexion.commit();
        } catch (SQLException ex) {
            System.out.println("Error"+ex.toString());
        }
    }
    
    //Operaciones SELECT
    public void getDatoConsulta(String consulta){
        try {
            int i =0;
            Statement st =  conexion.createStatement();
            ResultSet rs = st.executeQuery(consulta);
            while(rs.next()){
                i++;
                for(int j=1;j<=rs.getMetaData().getColumnCount();j++){
                    System.out.print(rs.getObject(j)+"\t");
                   
                    
                }
                System.out.println("");
                        
            }
        } catch (SQLException ex) {
            System.out.println("Error"+ex.toString());
        }
    }
    
    public void getMetaDataTable(String consulta){
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(consulta);
            //Mostrar metadata
            ResultSetMetaData rsmd = rs.getMetaData();
            System.out.println("Numero de campos");
            rs.getMetaData().getColumnCount();
            int i=1;
            while(i<= rsmd.getColumnCount()){
                System.out.println("Campo"+
                    rsmd.getColumnName(i)+"Tipo de dato: "+rsmd.getColumnTypeName(i));
                i++;
            }
            
        } catch (SQLException ex) {
            System.out.println("Error"+ex.toString());
        }
    }
    
    

}
