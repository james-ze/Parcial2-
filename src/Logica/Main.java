
package Logica;

import Interfaz.Interfaz;
import java.sql.Connection;

public class Main {
    
    
     public static void main (String[] arg){
         
         // base de datos 
        Conexion conexion = new Conexion("selecmenu") ;
        Connection conec = conexion.conectar();
        
        // interfaz grafica
        Interfaz mostrar = new Interfaz ();
        mostrar.setVisible(true);
        
    }
    
}
