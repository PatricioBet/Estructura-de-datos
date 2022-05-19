package modelo;

/**
 *
 * @author patob
 */
public class agencia {
    private String nombre="";
    private double ventas_totales=0.0;
    private double promedio=0.0;
    private mes[] m = new mes[12];

    public agencia() {
        mes aux = new mes();
        String meses[]={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Setiembre", "Octubre", "Noviembre","Diciembre"};
        for (int i = 0; i < m.length; i++) {
            aux.setNombreMes(meses[i]);
            m[i]=aux;
        }
    }

    /**
     * @return the ventas_totales
     */
    public double getVentas_totales() {
        return ventas_totales;
    }

    /**
     * @param ventas_totales the ventas_totales to set
     */
    public void setVentas_totales(double ventas_totales) {
        this.ventas_totales = ventas_totales;
    }

    /**
     * @return the m
     */
    public mes[] getM() {
        return m;
    }

    /**
     * @param m the m to set
     */
    public void setM(mes[] m) {
        this.setM(m);
    }
    
    public void valor(int pos, double valor){
        getM()[pos].setVentas(valor);
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the promedio
     */
    public double getPromedio() {
        return promedio;
    }

    /**
     * @param promedio the promedio to set
     */
    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    public double sumaMeses(){
        double suma=0;
        for (int i = 0; i < m.length; i++) {
            suma=suma+m[i].getVentas();
        }
        return suma;
    }
}
