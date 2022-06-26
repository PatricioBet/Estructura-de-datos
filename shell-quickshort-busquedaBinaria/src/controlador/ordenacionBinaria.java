package controlador;

/**
 *
 * @author patob
 */
public class ordenacionBinaria {
    public int buscarElemento (String[][] p, int columna, String elemento){
        int izq=0, der = p.length-1;
        while (izq <= der) {            
            int indiceMedio = (int) Math.floor((izq+der)/2);
            String[] elementoMedio = p[indiceMedio];
            int compara = elemento.compareTo(elementoMedio[columna]);
            if(compara==0){
                return indiceMedio;
            }
            if (compara<0) {
                der = indiceMedio -1;
            }else{
                izq = indiceMedio+1;
            }
        }
        return -1;
    }
}
