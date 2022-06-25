package controlador;

import modelo.persona;

/**
 *
 * @author patob
 */
public class metodos {
    public String[][] shell(String p[][], int columna, boolean ascendente){
        String[] aux;
        int salto,i;
        boolean cambios;
            for(salto = p.length/2; salto!=0; salto/=2){
            cambios=true;
            while(cambios){
                cambios = false;
                for(i= salto; i<p.length; i++){
                    if(comparaStrings(p[i-salto][columna], p[i][columna])){
                        aux = p[i];
                        p[i]=p[i-salto];
                        p[i - salto] = aux;
                        cambios=true;
                    }
                }
            }
        }
        if (!ascendente) {
          p = invertir(p);
        }
        return p;
    }
    public String[][] quicksort(String p[][], int columna, int izq, int derecha){
        String[] pivote = new String[3];
        String[] aux = new String[3];
        pivote = p[izq];
        int i = izq;
        int j = derecha;
        while (i<j) {            
            while(!comparaStrings(p[i][columna], pivote[columna])&&i<j)i++;
            while(comparaStrings(p[j][columna], pivote[columna]))j--;
            if(i<j){
                aux=p[i];
                p[i]=p[j];
                p[j]=aux;
            }
        }
        p[izq]=p[j];
        p[j]=pivote;
        if(izq<j-1){
            quicksort(p, columna, izq, j-1);
        }
        if(j+1<derecha){
            quicksort(p, columna, j+1, derecha);
        }
        
        return p;
    }
    private boolean comparaStrings(String a, String b){
        if (a.compareTo(b)>0) {
            return true;
        } else {
            return false;
        }
    }
    public String[][] invertir(String[][]p){
        String[] temp = new String[3];
            int longitud = p.length;
            for (int j = 0; j < longitud/2; j++) {
                temp = p[j];
                int indiceC = longitud-j-1;
                p[j]=p[indiceC];
                p[indiceC] = temp;
            }
            return p;
    }
}
