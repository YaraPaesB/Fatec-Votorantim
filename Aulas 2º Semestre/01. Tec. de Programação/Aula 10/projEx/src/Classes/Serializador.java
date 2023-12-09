
package Classes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

public class Serializador {
    
    public static void gravar(String caminho, Object objeto)throws FileNotFoundException,IOException{
        
        FileOutputStream outFile= new FileOutputStream(caminho);
        ObjectOutputStream outObj = new ObjectOutputStream(outFile);
        try {
            outObj.writeObject(objeto);
        } catch (Exception e) {
            new Exception("Erro ao gravar em arquivo!", e);
            
        }finally{
            outObj.close();
        }
        
        
    }
    
    public static Object ler(String caminho) throws FileNotFoundException, IOException, ClassNotFoundException {
    ObjectInputStream inObj = null;
    try {
        FileInputStream inFile = new FileInputStream(caminho);
        inObj = new ObjectInputStream(inFile);
        return inObj.readObject();
    } catch (Exception e) {
        // Melhoria: Lançar a exceção com a mensagem detalhada
        throw new IOException("Erro ao ler o arquivo! " + e.getMessage(), e);
    } finally {
        if (inObj != null) {
            inObj.close();
        }
    }
    }
    
    //Código anterior:
//    public static Object ler(String caminho)throws FileNotFoundException,IOException, ClassNotFoundException{
//        
//        FileInputStream inFile = new FileInputStream(caminho);
//        ObjectInputStream inObj=new ObjectInputStream(inFile);
//        try{
//            Object objeto = inObj.readObject();
//            return objeto;
//            //Precisei alterar o codigo pra pelo menos aparecer a msg de erro...
//            } catch (Exception e) {
//        
//        e.printStackTrace();
//        throw e; 
//    } finally {
//        if (inObj != null) {
//            inObj.close();
//        }
//    }
//        //Código original:
//    //        }catch(Exception e){
//    //        new Exception("Erro ao ler o arquivo", e);
//    //    }finally{
//    //        inObj.close();
//    //    }
//     //   
//      //  return null;
//        
//    }

}