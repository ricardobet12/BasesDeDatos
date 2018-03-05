package Model;


/**
 *
 * @author richy
 */
//modelo donde estan los atributos para tener sus metodos de acceso y crear objectos
public class Person {
    //Atributos con su tipo de dato 
    private String nombre;
    private String cedula;
    private int diaNacimiento;
    private String diaBinario;
    private int mesNacimiento;
    private String mesBinario;
    private short anoNacimiento;
    private String telefono;
    
    //Contructor donde me pide cada parametro asignado para guardar en el objecto
     public Person(String nombre, String cedula, int diaNacimiento, int mesNacimiento, short anoNacimiento, String telefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.diaNacimiento = diaNacimiento;
        this.mesNacimiento = mesNacimiento;
        this.anoNacimiento = anoNacimiento;
        this.telefono = telefono;
    }
    
    //constructor de la clase que no recibe ningun parametro 
    public Person(){}
    //constructor que me recibe los parametros para los dia y mes en binario
    public Person(String nombre, String cedula, String diaB, String mesB, short anio, String telefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.diaBinario = diaB;
        this.mesBinario = mesB;
        this.anoNacimiento = anio;
        this.telefono = telefono;
    }

    //metodos de acceso
    public String getDiaBinario() {
        return diaBinario;
    }

    public void setDiaBinario(String diaBinario) {
        this.diaBinario = diaBinario;
    }

    public String getMesBinario() {
        return mesBinario;
    }

    public void setMesBinario(String mesBinario) {
        this.mesBinario = mesBinario;
    }
    
    

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDiaNacimiento() {
        return diaNacimiento;
    }

    public void setDiaNacimiento(int diaNacimiento) {
        this.diaNacimiento = diaNacimiento;
    }

    public int getMesNacimiento() {
        return mesNacimiento;
    }

    public void setMesNacimiento(int mesNacimiento) {
        this.mesNacimiento = mesNacimiento;
    }

    public short getAnoNacimiento() {
        return anoNacimiento;
    }

    public void setAnoNacimiento(short anoNacimiento) {
        this.anoNacimiento = anoNacimiento;
    }

 
   
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    //el metodo toString para tener una cadena de los atributos de la clase Person

    @Override
    public String toString() {
        return nombre+"|"+cedula+"|"+diaNacimiento+"|"+mesNacimiento+"|"+anoNacimiento+"|"+telefono;
    }
   
    
}
