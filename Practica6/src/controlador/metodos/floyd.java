package controlador.metodos;

import controlador.tda.lista.ListaEnlazadaServices;
import modelo.dispositivo.dispositivo;
import controlador.dispositivos.*;
import javax.swing.JOptionPane;

/**
 *
 * @author patob
 */
public class floyd {
    
    DispositivosGrafoControlador dgp;

    public floyd(DispositivosGrafoControlador dgp) {
        this.dgp = dgp;
    }
    
    
    public String implementar() throws Exception{
        caminosMinimos cm = new caminosMinimos(dgp);
        return cm.algoritmoFloyd(dgp.getGendispo().Matrizpesos());
    }
    
    
}
