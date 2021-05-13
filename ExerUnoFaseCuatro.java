package exerunofasecuatro;
import java.util.*;
public class ExerUnoFaseCuatro {
    public static void main(String[] args) {
        // Declaració de l´objecte List, amb dues llistes
        List<Character> name, surName;
        
        /* Agreguem valors a la primera llista, previa declaració de
           l´objecte ArrayList */ 
        name = new ArrayList<Character>();
        name.add('m');
        name.add('i');
        name.add('q');
        name.add('u');
        name.add('e');
        name.add('l');
        name.add(' ');
        
        // Agreguem valors a la segona llista
        surName = new ArrayList<Character>();
        surName.add('p');
        surName.add('i');
        surName.add('e');
        
        // Declaració de l´objecte fullName i concatenació de les llistes
        List<Character> fullName = new ArrayList<Character>(name);
        fullName.addAll(surName);
        
        /* Bucle for per recorrer el List fullName i treure per consola 
           el seu contingut */
        for (int i = 0; i < fullName.size(); i++){
            System.out.print(fullName.get(i) + " ");
        }
        System.out.println();
    }
}
