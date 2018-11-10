
package prueba;

/**
 *
 * @author richy
 */
public class Main {
    
    public static void main(String[] args){
        conexionDB vc  = new conexionDB();
        vc.setConexionMySql("jdbc:mysql://localhost:3306/DREAMHOME", "root", "ricardo12");
        System.out.println("------Meta Datos de la consulta---------");
        vc.getMetaDataTable("SELECT * from PropertyForRent");
        System.out.println("------Mostrando informacion---------");
        vc.getDatoConsulta("SELECT * from PropertyForRent");
    //    vc.sentenciaNoSelect("create table  tmp00 (id numeric)");
        vc.closeConexion();
    }
}
