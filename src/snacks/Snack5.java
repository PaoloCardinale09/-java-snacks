package snacks;

import java.util.Scanner;

public class Snack5 {
    public static void main(String[] args) {
        //Data una stringa in input
        // mostrare a video quanti caratteri alfabetici contiene,
        // quanti numeri e quanti simboli non alfanumerici.
        //Continuare a chiedere una nuova stringa finchè non si inserisce 0.

        Scanner scan= new Scanner(System.in);

        System.out.println("Inserisci una stringa");
        String str = scan.nextLine();

        int alfabetici = 0;
        int alfanumerici = 0;
        int simboli = 0;

        for (int i = 0; i < str.length(); i++) {
        char currentPosition = str.charAt(i);
        if (Character.isAlphabetic(currentPosition)){
            alfabetici++;
        } else if (Character.isDigit(currentPosition)) {
            alfanumerici++;
            
        }else{
            simboli++;
        }

        }
        System.out.println("Caratteri alfabetici: "+ alfabetici);
        System.out.println("Caratteri Numerici: "+ alfanumerici);
        System.out.println("Caratteri simbolo: "+ simboli);
    }
}
