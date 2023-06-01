package snacks;

public class Snack3 {
    public static void main(String[] args) {
        //Crea un array di numeri interi e
        // fai la somma di tutti gli elementi che sono in posizione dispari

        int[] number = {1,2,3,4,5,6,7,8,9};
        int sumDispari = 0;

        for (int i = 0; i < number.length; i++) {
            if (i % 2 != 0){
                sumDispari += number[i];
            }
        }
            System.out.println(sumDispari);
    }
}
