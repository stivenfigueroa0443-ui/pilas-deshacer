
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


/**
 *
 * @author drlias
 */
public class Archivos {
    

//------------------------------------------------------------
//----Función para escribir objetos en un archivo-------------
//------------------------------------------------------------    
//--- Entrada: nombre del archivo (ruta completa), objeto que se va a guardar
//--- Regresa: nada    
//------------------------------------------------------------

    public static void escribir(String archivo, Object objeto) {
        FileOutputStream fos;
        ObjectOutputStream oos;
        try {
            fos = new FileOutputStream(new File(archivo));
            oos = new ObjectOutputStream(fos);
            oos.writeObject(objeto);
            oos.close();
        } catch (IOException e) {
            System.out.println("Error al escribir: " + e.getMessage());
        }
    }

//------------------------------------------------------------
//------Función para leer objetos desde un archivo------------
//------------------------------------------------------------    
//--- Entrada: nombre del archivo (ruta completa) a leer
//--- Reegresa: objeto leido en el archivo   
//------------------------------------------------------------
    
    public static Object leer(String archivo) {
        FileInputStream fis;
        ObjectInputStream ois = null;
        Object objeto=null;

        try {
            fis = new FileInputStream(new File(archivo));
            ois = new ObjectInputStream(fis);
            objeto = ois.readObject();
            ois.close();
            return objeto;
        } catch (Exception e) {
            System.out.println("Error al leer: " + e.getMessage());
            return objeto;
        }
    }

}
