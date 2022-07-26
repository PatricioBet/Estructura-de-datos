package controlador.dispositivos;

import controlador.tda.grafos.GrafoEND;
import modelo.dispositivo.dispositivo;

/**
 *
 * @author patob
 */
public class DispositivosGrafoControlador {

    private GrafoEND<dispositivo> gendispo;
    private dispositivo dispositivo;

    public DispositivosGrafoControlador(String nombre, String ip) {
        gendispo = new GrafoEND<>(1, dispositivo.class);
        dispositivo aux = new dispositivo();
        aux.setId(1);
        aux.setNombre(nombre);
        aux.setIp(ip);
        gendispo.etiquetarVertice(1, aux);
    }

    public DispositivosGrafoControlador(Integer nroVertices, String nombre, String Ip) {
        gendispo = new GrafoEND<>(nroVertices, dispositivo.class);
        for (int i = 0; i <= nroVertices; i++) {
            dispositivo d = new dispositivo();
            d.setId(i);
            d.setNombre(nombre);
            d.setIp(Ip);
            gendispo.etiquetarVertice(i, d);
        }
    }

    public DispositivosGrafoControlador(GrafoEND<dispositivo> d, String nombre, String Ip) {
        gendispo = new GrafoEND<>(d.numVertices() + 1, dispositivo.class);
        try {
            for (int i = 1; i <= d.numVertices(); i++) {
            dispositivo aux = (d.obtenerEtiqueta(i));
            gendispo.etiquetarVertice(i, aux);
        }
        } catch (Exception e) {
            System.out.println("Error"+e);
        }
        dispositivo aux = new dispositivo();
        aux.setId(gendispo.numVertices() + 1);
        aux.setNombre(nombre);
        aux.setIp(Ip);
        gendispo.etiquetarVertice(gendispo.numVertices(), aux);
    }

    public GrafoEND<dispositivo> getGendispo() {
        return gendispo;
    }

    public void setGendispo(GrafoEND<dispositivo> gendispo) {
        this.gendispo = gendispo;
    }

    public dispositivo getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }
}
