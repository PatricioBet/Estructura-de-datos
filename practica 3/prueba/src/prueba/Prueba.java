package prueba;

import java.util.Scanner;

/**
 *
 * @author patob
 */
public class Prueba {
    public static void main(String[] args) {
        int tamanio = 200000000;
        StringBuilder s = new StringBuilder();
        try {
            for (int i = 0; i < tamanio; i++) {
                s.append("a");
            }
            System.out.println(s.length());
            Scanner scanner = new Scanner(System.in);
            //System.out.println("Ingrese cualquier numero para terminar...");
            //scanner.nextInt();
        } catch (Exception e) {
        }
    }
}
