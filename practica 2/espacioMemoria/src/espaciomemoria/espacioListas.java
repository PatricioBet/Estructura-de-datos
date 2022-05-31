package espaciomemoria;
import org.github.jamm.MemoryMeter;
/**
 *
 * @author patob
 */
import controlador.tda.lista.*;
import java.util.ArrayList;
import java.util.List;
public class espacioListas {
    public static void main(String[] args) {
        MemoryMeter meter = MemoryMeter.builder().build();
        ListaEnlazadaServices listaE = new ListaEnlazadaServices();
        List<Integer> list = new ArrayList<Integer>();
        System.out.println("Tamaño de lista enlazada: "+meter.measureDeep(listaE)+"\nTamaño de lista List: "+meter.measureDeep(list));
        
        for (int i = 0; i < 25; i++) {
            listaE.insertarAlFinal(25);
            list.add(58);
        }
        System.out.println("Listas modificadas:\nTamaño de lista enlazada: "+meter.measureDeep(listaE)+"\nTamaño de lista List: "+meter.measureDeep(list));
    }
}
