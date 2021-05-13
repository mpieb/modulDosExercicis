package exerunofasedos;
import java.util.*;
public class ExerUnoFaseDos {
    public static void main(String[] args) {
        // Creació del objecte ArrayList
        ArrayList<Character> meuNom = new ArrayList<Character>();
        
        // Omplim amb les dades del meu nom complet
        meuNom.add('m');
        meuNom.add('i');
        meuNom.add('q');
        meuNom.add('u');
        meuNom.add('e');
        meuNom.add('l');
        meuNom.add(' ');
        meuNom.add('p');
        meuNom.add('i');
        meuNom.add('e');
        meuNom.add(' ');
        meuNom.add('b');
        meuNom.add('a');
        meuNom.add('r');
        meuNom.add('g');
        meuNom.add('a');
        meuNom.add('l');
        meuNom.add('l');
        meuNom.add('o');
        
        /* Un bucle for each per recorre totes les posicions de 
           ArrayList, i bloc condicional per veure si és vocal, consonant, 
           espai buit o conte un número, llavors té missatge d´error
        */
        for (Character i: meuNom) {
            if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u'){
                System.out.println(i + " VOCAL");
            } else if (i == ' ') {
                System.out.println(i);
            } else if (i == 'b' || i =='c' || i == 'd' || i == 'f' ||
                    i == 'g' || i == 'h' || i == 'j' || i == 'k' || i == 'l'
                    || i == 'm' || i == 'n' || i == 'p' || i == 'q' ||
                    i == 'r' || i == 's' || i == 't' || i == 'v' || i == 'w'
                    || i == 'x' || i == 'z') {
                System.out.println(i + " CONSONANT");
            } else {
            System.out.println(i +
                    " Els noms de persones no contenen números!");
            }
        }
    }
}
       
        
            
        
       
    
    

