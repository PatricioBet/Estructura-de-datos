package modelo.dispositivo.tabla;

import controlador.tda.grafos.GrafoEND;
import javax.swing.table.AbstractTableModel;
import modelo.dispositivo.dispositivo;

/**
 *
 * @author patob
 */
public class ModeloTablaDispositivo extends AbstractTableModel{
    private GrafoEND<dispositivo> grafo;
    
    public GrafoEND<dispositivo> getGrafo() {
        return grafo;
    }

    public void setGrafo(GrafoEND<dispositivo> grafo) {
        this.grafo = grafo;
    }
    @Override
    public int getColumnCount() {
        return 3;
    }
    @Override
    public int getRowCount() {
        return grafo.numVertices();
    }
    
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Nro";
            case 1:
                return "Nombres";
            case 2:
                return "Ip";
            default:
                return null;
        }
    }
    
    @Override
    public Object getValueAt(int arg0, int arg1) {
        try {
            dispositivo d = grafo.obtenerEtiqueta(arg0 + 1);
            switch (arg1) {
                case 0:
                    return (arg0+1);
                case 1:
                    return d.getNombre();
                case 2:
                    return d.getIp().toString();
                default:
                    return null;
            }
        } catch (Exception e) {
            System.out.println("Error en listado");
            return null;
        }
    }
    
}
