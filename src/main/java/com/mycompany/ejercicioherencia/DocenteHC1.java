
package com.mycompany.ejercicioherencia;

public class DocenteHC1 extends Docente1 {
    
    private int horastrabajadas;
    private double valorhora;
    private double sueldomeshoras;

    public DocenteHC1(int horastrabajadas, double valorhora,String nombreDoc, String facultadDoc, String cadiDoc) {
        super(nombreDoc, facultadDoc, cadiDoc);
        this.horastrabajadas = horastrabajadas;
        this.valorhora = valorhora;
     
    }

    public void setHorastrabajadas(int horastrabajadas) {
        this.horastrabajadas = horastrabajadas;
    }

    public void setValorhora(double valorhora) {
        this.valorhora = valorhora;
    }

    
    public double sueldomeshoras(){
    
        sueldomeshoras= valorhora * horastrabajadas;
        
        return sueldomeshoras;
    
    }

    public int getHorastrabajadas() {
        return horastrabajadas;
    }

    public double getValorhora() {
        return valorhora;
    }

    public double getSueldomeshoras() {
        return sueldomeshoras;
    }
    
    
    
    
    
}
