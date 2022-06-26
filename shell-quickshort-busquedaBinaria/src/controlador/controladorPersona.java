/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author patob
 */
import controlador.tda.lista.ListaEnlazadaServices;
import java.util.Random;
import modelo.persona;
public class controladorPersona {
    private ListaEnlazadaServices<persona> listaP = new ListaEnlazadaServices<>();

    /**
     * @return the listaP
     */
    public ListaEnlazadaServices<persona> getListaP() {
        return listaP;
    }

    /**
     * @param listaP the listaP to set
     */
    public void setListaP(ListaEnlazadaServices<persona> listaP) {
        this.listaP = listaP;
    }
    public void llenarLista(){
        String[] nombre = {"Mateo", "Daniel", "Pablo", "Fernando", "Adrián", "David", "Diego", "Javier", "Mario", "Sergio", "Marcos", "Manuel", "Martín", "Nicolás", "Jorge", "Iván", "Carlos", "Miguel", "Lucas","Lucía", "Sofía",
        "Martina", "María", "Julia", "Paula", "Valeria", "Emma", "Daniela", "Carla", "Alba", "Noa", "Alma", "Sara", "Carmen", "Lara", "Mia"};
        String[] apellido = {"Álvarez", "Andrade", "Benítez", "Castillo", "Castro", "Contreras", "De León", "Díaz", "Duarte", "Espinoza", "Fernández",
        "Flores", "García", "Giménez", "Gómez", "Gonzales", "Gutiérrez", "Hernández", "Jiménez", "López", "Mamani", "Pereira", "Quispe", "Ramírez", "Salazar"};
        Random n = new Random();
        
        for (int i = 0; i < 10000; i++) {
            persona p = new persona();
            p.setNombre(nombre[n.nextInt(35)] + " " + apellido[n.nextInt(24)]);
            p.setCedula(10000+n.nextInt(27001-10000)+""+(10000+n.nextInt(99999-10000)));
            p.setEdad(1+n.nextInt(100));
            listaP.insertarAlFinal(p);
        }
    }
    public persona[] toArray(){
        persona[] p = new persona[listaP.getSize()];
        for (int i = 0; i < listaP.getSize(); i++) {
            p[i] = listaP.obtenerDato(i);
        }
        return p;
    }
}
