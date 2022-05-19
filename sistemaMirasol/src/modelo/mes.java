package modelo;
/**
 *
 * @author patob
 */
public class mes {
    private String nombreMes="";
    private double ventas=0.0;
    
    /**
     * @return the ventas
     */
    public double getVentas() {
        return ventas;
    }

    /**
     * @param ventas the ventas to set
     */
    public void setVentas(double ventas) {
        double v= ventas;
        this.ventas = v;
    }

    /**
     * @return the nombreMes
     */
    public String getNombreMes() {
        return nombreMes;
    }

    /**
     * @param nombreMes the nombreMes to set
     */
    public void setNombreMes(String nombreMes) {
        this.nombreMes = nombreMes;
    }
}
