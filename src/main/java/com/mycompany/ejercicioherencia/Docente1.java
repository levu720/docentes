
package com.mycompany.ejercicioherencia;

public class Docente1 {
    
   protected String nombreDoc;
   protected String facultadDoc;
   protected String cadiDoc;
   
   public Docente1 (String nombreDoc, String facultadDoc, String cadiDoc){
   
       this.nombreDoc=nombreDoc;
       this.facultadDoc=facultadDoc;
       this.cadiDoc=cadiDoc;
   
   }

    public void setNombreDoc(String nombreDoc) {
        this.nombreDoc = nombreDoc;
    }

    public void setFacultadDoc(String facultadDoc) {
        this.facultadDoc = facultadDoc;
    }

    public void setCadiDoc(String cadiDoc) {
        this.cadiDoc = cadiDoc;
    }

    public String getNombreDoc() {
        return nombreDoc;
    }

    public String getFacultadDoc() {
        return facultadDoc;
    }

    public String getCadiDoc() {
        return cadiDoc;
    }

       
}
