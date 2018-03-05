package Controller;

import Model.Person;
import View.SearchVW;
import View.AddPersonVW;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.*;

/**
 *
 * @author richy
 */
public class Method {
    
    //Instanciar a la clase AddPersonVW para acceder a sus atributos,campos de texto
    AddPersonVW p = new AddPersonVW();
    //Instanciar a la clase SearchVw para acceder a sus atributos y metodos
    SearchVW b = new SearchVW();
    
    //Metodo para adicionar persona en la base de datos DbText recibe como parametro el objecto persona de la clase Person
    public void addPersonText(Person person) {
        //intente
        try {
            // ruta windows FileWriter allowsWrite = new FileWriter("D:\\BaseDeDatos.txt", true);
            //con la libreria import java.io.FileWriter instanciamos a la clase FileWriter para darle la ruta de la DB
            FileWriter allowsWrite = new FileWriter("DbTexto.txt", true);
            //con la libreria import java.io.FileWriter instanciamos a la clase ProntWriter para ver la informacion dentro del fichero
            PrintWriter w = new PrintWriter(allowsWrite);
            //hacemos una comparacion para verificar si el archivo esta vacio
            if (allowsWrite != null) {
                //Si no esta vacio hace un salto de linea
              //  w.print("\n");
                // y con el w.print agregramos como parametro a person.toString
                w.println(person.toString());
                //imprimir en pantalla logica a person.toString
                System.out.println(person.toString());
                //para cerrar el fichero
                allowsWrite.close();
                //mensaje al usuario final 
              
            } 
            //si hay un catch
            //reciba como parametro el error en la clase IOException
        } catch (IOException ex) {
            //imprima en pantalla el error
            System.out.println(ex);
        }
    }
    
    //metodo para agregar una persona con enteros pasados en binario recibe como parametro a la clase Person 
    public void addPersonBInary(Person person) throws IOException{
        //con la libreria import java.io.File le pasamos la ruta del fichero
        File crear = new File("DbBinary.txt");
        //verificamos si el archivo existe
        if (!crear.exists()) {
            //si no existe el metodo createNewFile() crea el archivo
            crear.createNewFile();
        }
        //intente
        try {
            //con la libreria import java.io.FileWriter instanciamos la clase FileWriter para abrir el archivo
            FileWriter archivo = new FileWriter(crear, true);
            //con la libreria import java.io.FileWriter para agregar a archivo al fichero
            PrintWriter escribir = new PrintWriter(archivo);
            if (archivo != null) {
/*ejemplo para prueba de pasar un string a binario 
                    String g = persona.toString();
                    
                    int a = 0;
                    String b ="";
                    for(int i =0; i<g.length(); i++){
                        a=g.charAt(i);
                        b=Integer.toBinaryString(a);
                        System.out.println(a);
                        System.out.println(b+"\n");*/
                //contatenamos el valor de cada atributo con un separador
                escribir.println(person.getNombre()+"|"+person.getCedula()+"|"+person.getDiaBinario()+"|"+person.getMesBinario()+"|"+person.getAnoNacimiento()+"|"+person.getTelefono());
                //imprimir en pantalla el valor del dia en binario
                System.out.println(person.getDiaBinario());
                //imprimir en pantalla el valor del mes en binario
                System.out.println(person.getMesBinario());
                //mostar al usuario mensaje
                JOptionPane.showMessageDialog(null, "Registro Agregado Correctamente");
                //Cerramos el archivo.
                escribir.close();
            }
            //si da un error recibe como parametro el error
        } catch (Exception e) {
            //y muestra en pantalla el trace
            e.printStackTrace();
        }
    }
    //metodo para pasar al codigo binario recibe como valor un entero
    public String calcularBinario(int nun) {
        //se crea una variable vacia de tipo String
        String salida = "";
        //verificamos si el parametro en nemor a 0
        if (nun > 0) {
            //salida va ser igual al llamado de la funcion calcularBinario recibiendo como parametros la suma de num/2 y num%2
            salida = calcularBinario(nun / 2) + (nun % 2);
        }
        //y retorna como resultado salida
        return salida;
    }
     //metodo para eliminar un registro recibiendo como parametro la ruta del fichero y la linea para remover el registro   
    public void removeLineFromFile(String file, String lineToRemove) {
       //intentar
        try {
            //que el parametro que reciba lo ingrese a infile
            File inFile = new File(file);
            //verificar si el archivo existe
            if (!inFile.isFile()) {
                //en caso de que no existe retorna y se sale de la funcion
                return;
            }
            //Construya el nuevo archivo que luego se renombrará como el nombre de archivo original 
            File tempFile = new File(inFile.getAbsolutePath() + ".tmp");
            // la clase BufferedReader el para leer los archivos del fichero 
            BufferedReader br = new BufferedReader(new FileReader(file));
            //la clase PrintWriter para escribir el archivo temporal
            PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
            //se crea una variable de tipo String line3
            String line3=null ;
            //Lea del archivo original y escriba en el nuevo 
            //a menos que el contenido coincida con los datos que se eliminarán.
            while ((line3 = br.readLine()) != null) {
                //si coinciden los datos
                if (line3.indexOf(lineToRemove) != 0) {
                    //escribe lo que halla en linea3
                    pw.println(line3);
                    //Vacía el flujo de salida y obliga a escribir los bytes de salida almacenados en el búfer. 
                    pw.flush();              
                }
            }
            
            //cerrar PrintfWritter
            pw.close();
            //cerrar BufferedReader
            br.close();
 
            //Eliminar el archivo original
            if (!inFile.delete()) {
                System.out.println("No se pudo eliminar el archivo");
                return;
            }
            //Cambie el nombre del nuevo archivo por el nombre del archivo original.
            if (!tempFile.renameTo(inFile))
                System.out.println("No se pudo renombrar el archivo");
         //en caso de un error que lo capture en un parametro 
        } catch (FileNotFoundException ex) {
            //imprimir el error
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}