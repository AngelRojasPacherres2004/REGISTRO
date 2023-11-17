/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reporte.incidentes;
import java.util.ArrayList;
import java.util.List;
import pantallas.FrameLogin;
/**
 *
 * @author Proyector
 */
public class ReporteIncidentes {
    public static List<String> escoger = new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        
         escoger.add("Alto");
        escoger.add("Medio");
        escoger.add("Bajo");
       
        
        
        
        
        
        
        
        
         FrameLogin pantalla = new FrameLogin();
        pantalla.setLocationRelativeTo(null);
        pantalla.setVisible(true);
    }
    
}
