/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
/**
 *
 * @author patob
 */
import com.google.gson.Gson;
import java.io.*;
public class crearJson {
    public void generarArchivo(controladorAgencia objAgencias)throws IOException{
        Gson archivoJson = new Gson();
        String json = archivoJson.toJson(objAgencias.getAg());
        FileWriter archivo = new FileWriter("Mirasol.json");
        archivo.write(json);
        archivo.flush();
    }
}
