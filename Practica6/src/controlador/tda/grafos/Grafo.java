/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.tda.grafos;

import controlador.tda.grafos.expetion.GrafoConexionException;
import controlador.tda.grafos.expetion.VerticeExeption;
import controlador.tda.lista.ListaEnlazada;
import controlador.tda.lista.exception.PosicionException;
import controlador.utiles.TipoOrdenacion;
import java.util.HashMap;

/**
 *
 * @author sebastian
 */
public abstract class Grafo {

    public abstract Integer numVertices();

    public abstract Integer numAristas();

    public abstract Object[] existeArista(Integer i, Integer f) throws VerticeExeption;

    public abstract Double pesoArista(Integer i, Integer f) throws VerticeExeption;

    public abstract void insertarArista(Integer i, Integer j) throws VerticeExeption;

    public abstract void insertarArista(Integer i, Integer j, Double peso) throws VerticeExeption;

    public abstract ListaEnlazada<Adycencia> adycentes(Integer i) throws VerticeExeption;

    @Override
    public String toString() {
        StringBuilder grafo = new StringBuilder();
        for (int i = 1; i <= numVertices(); i++) {
            grafo.append("VERTICE " + i);
            try {
                ListaEnlazada<Adycencia> lista = adycentes(i);

                for (int j = 0; j < lista.getSize(); j++) {
                    Adycencia aux = lista.obtenerDato(j);
                    if (aux.getPeso().toString().equalsIgnoreCase(String.valueOf(Double.NaN))) {
                        grafo.append(" --- VERTICE DESTINO " + aux.getDestino());
                    } else {
                        grafo.append(" --- VERTICE DESTINO " + aux.getDestino() + " --peso-- " + aux.getPeso());
                    }
                }
                grafo.append("\n");
            } catch (Exception e) {
                System.out.println("Error en toString " + e);

            }
        }
        return grafo.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    private Boolean estaConectado() {
        Boolean bad = true;
        for (int i = 1; i <= numVertices(); i++) {
            try {
                ListaEnlazada<Adycencia> lista = adycentes(i);
                if (lista.getSize() == 0) {
                    bad = false;
                    break;
                }
            } catch (Exception e) {
                System.out.println("Error en toString " + e);
                bad = false;
            }
        }
        return bad;
    }

    private Boolean estaPintado(ListaEnlazada<Integer> lista, Integer vertice) throws Exception {
        Boolean band = false;
        for (int i = 0; i < lista.getSize(); i++) {
            if (lista.obtenerDato(i).intValue() == vertice.intValue()) {
                band = true;
                break;
            }
        }
        return band;
    }

    public ListaEnlazada caminoMinimo(Integer verticeInicial, Integer verticeFinal) throws Exception {
        ListaEnlazada<Integer> camino = new ListaEnlazada();
        if (estaConectado()) {
            ListaEnlazada pesos = new ListaEnlazada();
            Boolean finalizar = false;
            Integer inicial = verticeInicial;
            camino.insertarCabecera(inicial);
            while (!finalizar) {
                System.out.println("***** " + inicial);
                ListaEnlazada<Adycencia> adycencias = adycentes(inicial);
                Integer T = -1;
                Double peso = 100000000.0;
                for (int i = 0; i < adycencias.getSize(); i++) {
                    Adycencia ad = adycencias.obtenerDato(i);
                    if (!estaPintado(camino, ad.getDestino())) {
                        Double pesoArista = ad.getPeso();
                        if (verticeFinal.intValue() == ad.getDestino()) {
                            T = ad.getDestino();
                            peso = ad.getPeso();
                            break;
                        } else if (pesoArista < peso) {
                            T = ad.getDestino();
                            peso = pesoArista;
                        }
                    }
                }
                if (T > -1) {
                    pesos.insertarCabecera(peso);
                    camino.insertarCabecera(T);
                    inicial = T;
                } else {
                    throw new GrafoConexionException("NO SE ENCUENTRA EL CAMINO");
                }
                if (verticeFinal.intValue() == inicial.intValue()) {
                    finalizar = true;
                }
            }
        } else {
            throw new GrafoConexionException("LE GRAFO NO ESTA CONECTADO");
        }

        return camino;
    }
    public Double[][] Matrizpesos() throws PosicionException, Exception {

        System.out.println("Matriz Pesos");
        Integer n = numVertices();
        Double[][] matrizPesos = new Double[n][n];
        for (int i = 0; i < n; i++) {
            ListaEnlazada<Adycencia> adycencias = new ListaEnlazada<>();
            adycencias = obtenerAdyacencias(adycencias, i + 1);
            for (int j = 0; j < n; j++) {
                matrizPesos[i][j] = adycencias.obtenerDato(j).getPeso();
            }
        }

        //imprimir
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + matrizPesos[i][j] + "]" + "\t");
            }
            System.out.println();
        }
        return matrizPesos;
    }


private ListaEnlazada<Adycencia> obtenerAdyacencias(ListaEnlazada<Adycencia> adycencias, Integer inicial) throws Exception {
        ListaEnlazada<Adycencia> aux = adycentes(inicial);

        for (int i = 0; i < aux.getSize(); i++) {
            adycencias.insertarCabecera(aux.obtenerDato(i));
        }

        //System.out.println("Adyacencias " + adycencias.getSize() + "Numero de vertices " + numVertices());
        if (adycencias.getSize() < numVertices()) {
            for (int i = 0; i < numVertices(); i++) {
                if (comprobar(aux, i + 1) != true) {
                    //System.out.println("Insertando adyacencia");
                    adycencias.insertarCabecera(new Adycencia( i + 1, Double.POSITIVE_INFINITY));
                }
            }
        }

        //adycencias.insertarCabecera(new Adycencia(inicial, inicial, Double.POSITIVE_INFINITY));
        adycencias.ordenar_seleccion("destino", TipoOrdenacion.ASCENDENTE);

        return adycencias;
    }

private Boolean comprobar(ListaEnlazada<Adycencia> list, Integer destino) throws VerticeExeption, PosicionException {
        Boolean estaDestino = false;
        for (int i = 0; i < list.getSize(); i++) {
            if (list.obtenerDato(i).getDestino() == destino) {
                estaDestino = true;
            }
        }
        return estaDestino;
    }

}
