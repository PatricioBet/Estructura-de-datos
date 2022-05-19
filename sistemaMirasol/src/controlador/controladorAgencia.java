package controlador;

/**
 *
 * @author patob
 */
import modelo.*;
public class controladorAgencia {
    private agencia[] ag = new agencia[5];

    public controladorAgencia() {
        agencia aux = new agencia();
        for (int i = 0; i < ag.length; i++) {
            aux.setNombre("Agencia "+(i+1));
            ag[i] = aux;
        }
    }
    
    /**
     * @return the ag
     */
    public agencia[] getAg() {
        return ag;
    }

    /**
     * @param ag the ag to set
     */
    public void setAg(agencia[] ag) {
        this.ag = ag;
    }
    public void darValor(int pos1, int pos2, double valor){
        ag[pos1].valor(pos2, valor);
    }
    public double calcularValor(int pos){
        ag[pos].setVentas_totales(ag[pos].sumaMeses());
        return ag[pos].getVentas_totales();
    }
    public double calcularPromedio(int pos){
        ag[pos].setPromedio(ag[pos].sumaMeses()/12);
        return ag[pos].getPromedio();
        
    }
    public String mostrarHistorial(){
        String mayor = "";
        String texto = "";
        double auxVentas=0.0;
        for (int i = 0; i < ag.length; i++) {
            if(ag[i].getVentas_totales()>auxVentas){
                mayor=ag[i].getNombre();
            }
        }
        texto = "La agencia con mayor ventas fue: "+mayor+", el mes con menos ventas fue: "+promedioMeses();
        return texto;
    }
    public String promedioMeses(){
        String mes="";
        double promedio1=0, promedio2=0;
        
        for (int i = 0; i < ag[0].getM().length-1; i++) {
            promedio1=0;
            for (int j = 0; j < ag.length; j++) {
                promedio1 = promedio1 + ag[j].getM()[i].getVentas();
            }
            if(promedio2>promedio1||i==0){
                promedio2=promedio1;
                mes=ag[0].getM()[i].getNombreMes();
            }
        }
        return mes;
    }
}
