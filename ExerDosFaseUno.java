package exerdosfaseuno;
import java.util.Scanner;
public class ExerDosFaseUno {
    public static void main(String[] args) {
        // Inicialització de Scanner
        Scanner lector = new Scanner(System.in);
        
        // Declaració de variables
        int files = 0;
        
        // Demanem el nombre de files del triàngle
        System.out.print("Escriu el número de files del triàngle: ");
        files = lector.nextInt();
        lector.nextLine();
        
        /* Bloc de for anidats recorren el nombre de files i treuen per consola
           el triàngle. Per n = 4:
           1
           12
           123
           1234
        */
        for (int i = 1; i <= files; i++){
            System.out.print(" ");
            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
