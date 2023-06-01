package snacks;

import java.util.Scanner;

public class Snack1 {
    public static void main(String[] args) {
        // Inserisci un numero,
        // se è pari stampa il numero,
        // se è dispari stampa il numero successivo.

        Scanner scan=  new Scanner(System.in);
        System.out.println("Inserisci un numero");
        int numero = scan.nextInt();

        if (numero % 2 == 0 )
            System.out.println(numero);
        else {
            System.out.println(numero + 1);
        }

        scan.close();
    }
}
