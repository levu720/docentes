
package com.mycompany.ejercicioherencia;

public class DocenteTCO1 extends Docente1 {
    
    private double sueldoMensual;
    private double canTrabGrado;
    private double valorHoraAsesor;
    private double asesoriaDoc;
    private double sueldobasico;

    public DocenteTCO1(double canTrabGrado, double sueldobasico, String nombreDoc, String facultadDoc, String cadiDoc) {
        super(nombreDoc, facultadDoc, cadiDoc);
        this.canTrabGrado = canTrabGrado;
        this.sueldobasico = sueldobasico;
    }


    public void setValorHoraAsesor() {
        this.valorHoraAsesor = (sueldobasico/30)/8;
    }

    public void setAsesoriaDoc() {
        this.asesoriaDoc = canTrabGrado * (2 * valorHoraAsesor);        
        
    }

     public double calcularSueldoMensual(){
         
        setValorHoraAsesor(); 
        setAsesoriaDoc();
        sueldoMensual = sueldobasico + asesoriaDoc;
        return sueldoMensual;
      }

    public double getSueldoMensual() {
        return sueldoMensual;
    }

    public double getCanTrabGrado() {
        return canTrabGrado;
    }

    public double getValorHoraAsesor() {
        return valorHoraAsesor;
    }

    public double getAsesoriaDoc() {
        return asesoriaDoc;
    }

    public double getSueldobasico() {
        return sueldobasico;
    }
     
     
}
    
    
    
    
    
    

   

    

