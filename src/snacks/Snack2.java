package snacks;

import java.util.Random;

public class Snack2 {
    public static void main(String[] args) {
        //Generatore di “nomi cognomi” casuali:
        // il Grande Gatsby ha una lista di nomi e una lista di cognomi,
        // e da queste vuole mostrare a video una falsa lista di invitati con nome e cognome.

        String[] nomi = {"Paolo", "Giovanni", "Claudio", "Maria", "Greta"};
        String[] cognomi = {"Rossi", "Verdi", "Cardinale", "White", "Green"};

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            String nomeCasuale = nomi[random.nextInt(nomi.length)];
            String cognomeCasuale = cognomi[random.nextInt(cognomi.length)];
            System.out.println(nomeCasuale + " " + cognomeCasuale);
        }
    }
}
