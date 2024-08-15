
package model;

import view.mainPage;
import java.sql.Connection;

public class Main {
    
    
     public static void main (String[] arg){
         
         // base de datos 
        Conexion conexion = new Conexion("selecmenu") ;
        Connection conec = conexion.conectar();
        
        // interfaz grafica
        mainPage mostrar = new mainPage ();
        mostrar.setVisible(true);
        
    }
    
}
