import java.util.Scanner;

public class ExerciceComparaisonAge {

    public static void main (String args[]){

        System.out.println("Donnez vos âge");
        Scanner scanner = new Scanner(System.in);
        int Age1 = scanner.nextInt();
        int Age2 = scanner.nextInt();

        System.out.println("La personne 1 à : "+Age1 +"ans");
        System.out.println("La personne 2 à : "+Age2 + "ans");

        if (Age1 > 18 || Age2 > 18) {
            System.out.println("1 unique majeur");
        }
        else {
        }



    }
}
