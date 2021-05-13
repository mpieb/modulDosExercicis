package exerunofaseuno;
public class ExerUnoFaseUno {
    public static void main(String[] args) {
        // Declaració de la taula, amb les lletres del meu nom complet
        char[] meuNom = {'m', 'i', 'q', 'u', 'e', 'l', ' ', 'p', 'i', 'é',
                ' ', 'b', 'a', 'r', 'g', 'a', 'l', 'l', 'ó'};
        
        // Bucle(for-each) per recorre totes les posicions de la taula
        // Mostra per consola cadascuna de les lletres
        for (char caracters: meuNom ){
            System.out.print(caracters);
        }
        System.out.println();
    }
}
