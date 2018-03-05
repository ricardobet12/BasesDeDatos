
package Controller;

import Model.PersonA;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author richy
 */
public class MethodRandom {
    //crear 3 variables 2 de tipo entero y una de tipo RandomAccessFile
    private static RandomAccessFile flujo;
    private static int numeroRegistros;
    //tamano de registros 
    private static int tamañoRegistro = 66;
    
    //
    
    //metodo para crear el archivo en caso de que no exista
    public void crearFileAlumno(File archivo) throws IOException {
        //verifica que el archivo este vacio y que archivo no exista
        if (archivo.exists() && !archivo.isFile()) {
            //arroja como mensaje que no es un archivo valido
            throw new IOException(archivo.getName() + " no es un archivo");
        }
        //flujo va se igual a la clase RandomAccessFile con la ruta del archivo y rw para que pueda leer y escribir
        flujo = new RandomAccessFile(archivo, "rw");
        numeroRegistros = (int) Math.ceil(
                //el tama;o del flujo va ser la mitad del tamano de registros
                (double) flujo.length() / (double) tamañoRegistro);
    }
    
    //metodo para cerrar la persistencia con el fichero con el metodo .close()
    public void cerrar() throws IOException {
        flujo.close();
    }
    //metodo para a;adir persona pasando como parametro un tipo entero y al objecto PersonA
    public boolean setPersona(int i, PersonA persona) throws IOException {
        //verifiqua que i sea nemor o igual al numero de registros dentro del archivo
        if(i >= 0 && i <= getNumeroRegistros()) {
            //verifica que el tamano del registro sea menos al tamano de archivos 
            if(persona.getTamaño() > tamañoRegistro) {
                //si se cumcle la condicion saldra mensaje en pantalla
                System.out.println("\nTamaño de registro excedido.");
                // de lo contrario
            } else {
                //la flujo le pasamos el metodo .seek para ingrearle el numero del tamano de registro
                flujo.seek(i*tamañoRegistro);
                //con el writeUTF se puede agregar un dato de tipo string
                flujo.writeUTF(persona.getNombre());
                flujo.writeUTF(persona.getCedula());
                //con el writeInt se puede agregar un dato de tipo entero
                flujo.writeInt(persona.getDiaNacimiento());
                flujo.writeInt(persona.getMesNacimiento());
                //con el dato writeShort se puede agregar un dato de tipo short
                flujo.writeShort(persona.getAnoNacimiento());
                flujo.writeUTF(persona.getTelefono());
               flujo.writeUTF("\n");
               //para al parametro persona como activo true
                flujo.writeBoolean(persona.isActivo());
                //returna true
                return true;
            }
            //de lo contrario
        } else {
            // es tamano esta fuera de los limites del registro
            System.out.println("\nNúmero de registro fuera de límites.");
        }
        //retornaria false
        return false;
    }
    
    //metodo para buscar registro inactivo
    private int buscarRegistroInactivo() throws IOException {
        //se realiza un ciclo para que pueda ver el numero de registro que tiene el archivo
        for(int i=0; i<getNumeroRegistros(); i++) 
        {
            //con el seek i se multiplica con el tamano de registros
            flujo.seek(i * tamañoRegistro);
            //compara si i no esta activo con el getPersona
            if(!getPersona(i).isActivo()) 
                //retorna el valor de i
                return i;
        }
        return -1;        
    }
    
    //metodo para eliminar el registro de la persona
    public boolean eliminarPersona(String aEliminar)throws IOException {
        //primero se crea una variable de tipo entero llamado pos para que sea igual al metodo buscar registros
        int pos = buscarRegistro(aEliminar); 
        //verifica si la posicion es igual a -1
        if(pos == -1) return false;
        //a la clase PersonA se llama a getPersona usando como parametro a pos
        PersonA personaEliminada = getPersona(pos);
        personaEliminada.setActivo(false);
        //se le pasa a setPersona 2 parametros la posicion y la persona eliminada
        setPersona(pos, personaEliminada);
        //retorna true
        return true;
    }
    
    //metodo para agregar persona entrando como parametro al objecto PersonA
    public void añadirPersona(PersonA persona) throws IOException {
        //se crea una variable para saber cual es el registro inactivo
        int inactivo = buscarRegistroInactivo();
        //verifica si la persona esta inactiva
        if(setPersona(inactivo==-1?numeroRegistros:inactivo, persona)) 
            //y le suma al numero de registros
            numeroRegistros++;        
    }

    public int getNumeroRegistros() {
        return numeroRegistros;
    }
   //metodo para obtener a la persona recibe como parametro un entero llamado i
    public PersonA getPersona(int i) throws IOException {
        //verifica si i es mayor o igual a 0 y si i es menor o igual al numero de registros
        if(i >= 0 && i <= getNumeroRegistros()) {
            //se llama el metodo .seek y se ingresa a i multiplaicado por el tamano de registros
            flujo.seek(i * tamañoRegistro);
            //retornamos al contructor y le pasamos los parametros
            return new PersonA(flujo.readUTF(), flujo.readUTF(),flujo.readInt(),flujo.readInt(),
                    flujo.readShort(),flujo.readUTF(),flujo.readBoolean());
            //de lo contrario
        } else {
            //arroja un mensaje en pantalla diciendo que el numero de registros esta fuera de limite
            System.out.println("\nNúmero de registro fuera de límites.");
            return null;
        }
    }
    //metodo para buscarRegistro con un parametro de entrada de tipo String
    public int buscarRegistro(String buscado) throws IOException {
        PersonA p;
        //verificar si el parametro esta vacio
        if (buscado == null) {
            return -1;
        }
        //hacer un cilio que mientras que i sea menor a getNumeroRegistro se valla incrementando en 1
        for(int i=0; i<getNumeroRegistros(); i++) {
            //se llama el metodo .seek y se ingresa a i multiplaicado por el tamano de registros
            flujo.seek(i * tamañoRegistro);
            //a p que sea igual al obetner persona con el numero de registro i
            p = getPersona(i);
            //verifica que el dato este activo
            if(p.getNombre().equals(buscado) && p.isActivo()) {
                return i;
            }
        }
        return -1;
    } 
}
