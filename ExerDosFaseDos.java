package exerdosfasedos;
import java.util.Scanner;
public class ExerDosFaseDos {
    public static void main(String[] args) {
        // Inicialització de Scanner
        Scanner lector = new Scanner(System.in);
         
        // Demanem la altura per el teclat
        System.out.print("Escriu la altura de la piràmide invertida: ");
        int altura = lector.nextInt();
        lector.nextLine();
        
        /* Bloc de for anidats per treure per consola la piràmide.
           per altura = 4:
            *******
             *****
              ***
               *
        */
        for (int espais = 0, asteriscs = (altura * 2) - 1;
                asteriscs > 0;espais++, asteriscs -= 2) {
            for (int i = 0; i < espais; i++) {
                System.out.print(" ");
            }
            for (int j = asteriscs; j != 0;j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
