
package Model;

/**
 *
 * @author richy
 */
public class PersonA {
    
    private String nombre;
    private String cedula;
    private int diaNacimiento;
    private int mesNacimiento;
    private short anoNacimiento;
    private String telefono;
    private boolean activo; 
    
    public PersonA() {
        nombre = "NN";
        cedula  = "NN";
        diaNacimiento = 0;
        mesNacimiento = 0;
        anoNacimiento = 0;
        telefono = "NN";
        activo = true;
    }

    public PersonA(String nombre,String cedula, int dia, int mes, short anio, String telefon, boolean activo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.diaNacimiento = dia;
        this.mesNacimiento = mes;
        this.anoNacimiento = anio;
        this.telefono = telefon;
        this.activo = activo;
    }



    @Override
    public String toString() {
        return getNombre()+"|"+getCedula()+"|"+getDiaNacimiento()+"|"+getMesNacimiento()+"|"+getAnoNacimiento()+"|"+getTelefono();
    }   
    
    public int getTamaño() {
        return getNombre().length()*2 + 2 + 4 + 1;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the diaNacimiento
     */
    public int getDiaNacimiento() {
        return diaNacimiento;
    }

    /**
     * @param diaNacimiento the diaNacimiento to set
     */
    public void setDiaNacimiento(int diaNacimiento) {
        this.diaNacimiento = diaNacimiento;
    }

    /**
     * @return the mesNacimiento
     */
    public int getMesNacimiento() {
        return mesNacimiento;
    }

    /**
     * @param mesNacimiento the mesNacimiento to set
     */
    public void setMesNacimiento(int mesNacimiento) {
        this.mesNacimiento = mesNacimiento;
    }

    /**
     * @return the anoNacimiento
     */
    public short getAnoNacimiento() {
        return anoNacimiento;
    }

    /**
     * @param anoNacimiento the anoNacimiento to set
     */
    public void setAnoNacimiento(short anoNacimiento) {
        this.anoNacimiento = anoNacimiento;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the activo
     */
    public boolean isActivo() {
        return activo;
    }

    /**
     * @param activo the activo to set
     */
    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
}
