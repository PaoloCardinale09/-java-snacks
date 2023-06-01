package snacks;

import java.util.Scanner;

public class Snack4 {
    public static void main(String[] args) {
    //Data in input una stringa verificare se è palindroma
        Scanner scan= new Scanner(System.in);
        String parola = scan.nextLine();
        int inizio = 0;
        int fine = parola.length() -1;
        boolean isPalindrome = true;

        while (inizio < fine
        ) {
            if (parola.charAt(inizio) != parola.charAt(fine)) {
                isPalindrome = false;
                break;
            }

            inizio++;
            fine--;
        }

        if (isPalindrome) {
            System.out.println("La stringa è palindroma.");
        } else {
            System.out.println("La stringa non è palindroma.");
        }



        scan.close();
    }
}
