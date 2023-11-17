




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author GAMER
 */
public class Incidente extends Problema 
        implements Registro {
    private String fecha;       
    private String tipo;
    private String hora;
    private String descripcion;
     private String riesgo;
     private String testigo;
  private String estado;
    public String getTestigo() {
        return testigo;
    }

    public void setTestigo(String testigo) {
        this.testigo = testigo ;
    }
     
//private String DatosMostrar;

   @Override
  public String getDatosMostrar() {
    return "Tipo: " + tipo + " - Hora: " + hora + " - Fecha: " + fecha + " - Testigo: " + testigo +" - Estado: "+ estado ;
}
    

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
  
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Incidente(String fecha, String tipo,String descripcion,String hora,String testigo) {
        this.fecha = fecha;
        this.tipo = tipo;
        this.hora=hora;
        this.descripcion=descripcion;
        this.testigo=testigo;
        
    }
     public String getRiesgo() {
        //return riesgo;
        return riesgo != null ? riesgo : "por escoger";
    }

    public void setRiesgo(String riesgo) {
        this.riesgo = riesgo;
    }
    

    public String getEstado() {
        return estado!= null ? estado : "por determinar";
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
    
    
    
    @Override
    public void registra() {
        
    }
    
    
}
