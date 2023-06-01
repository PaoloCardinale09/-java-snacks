package snacks;

public class Snack9 {
    public static void main(String[] args) {
      /*  Calcola la somma e la media dei primi 10 numeri.*/
        int number;
        int sum = 0;
        double media = 0;


        for (int i = 1; i <= 10; i++) {
             number = i;
             sum += number;

             media = (double) sum /10;



        }
        System.out.println("La somma dei numeri da 1 a 10 è: "+ sum);
        System.out.println("La media dei numeri è: " + media );
    }
}
