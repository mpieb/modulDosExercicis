package exerunofasetres;
import java.util.*;
public class ExerUnoFaseTres {
    public static void main(String[] args) {
        // Inicialitzem Scanner
        Scanner lector = new Scanner(System.in);
        
        // Declarem una variable i demanen nom i cognoms per el teclat
        String cadena = "";
        System.out.print("Possa el teu nom i cognoms: ");
        cadena = lector.nextLine();
        
        // Creem l´objecte Map
        Map<Character, Integer> meuNom = new HashMap<Character, Integer>();
        
        
        // Bucle for per contar els caracters repetits 
        for (int i = 0; i < cadena.length(); i++) {
            char charAt = cadena.charAt(i);
            
            if (!meuNom.containsKey(charAt)) {
                meuNom.put(charAt, + 1);
            } else {
                meuNom.put(charAt, meuNom.get(charAt) + 1);
            }
        }
        
        // Mostra per consola el nom i cognoms introduits
        System.out.println(cadena);
        // Mostra per consola el map 
        System.out.println(meuNom);
    }
}
