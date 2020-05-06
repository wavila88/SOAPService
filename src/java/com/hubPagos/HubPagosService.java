/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hubPagos;

import com.Entities.Request;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Usuario
 */
@WebService(serviceName = "HubPagosService")
public class HubPagosService {
    private String ruta = "C:/Users/Usuario/Desktop/"; 
    /**
     * This is a sample web service operation
     */
    
     public void crearArchivo(Request txt){
        try {
         String contenido = "Ejemplo creado con estructura nueva definida, para el Pais: "+txt.getCountry()+" \n"+
                 "Banco: "+txt.getBank()+""+
                 "En la Fecha: "+txt.getDate()+"";
            File file = new File(ruta+txt.getFileName()+".txt");
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
             } catch (Exception e) {
            e.printStackTrace();
        }
    }
     
    @WebMethod(operationName = "creacionArchivo")
    public String creacionArchivo(@WebParam(name = "name") Request txt) {
        crearArchivo(txt);
        return "Documento Entregado en el pais: " + txt.getCountry() + " !";
    }
    
    
   
}
