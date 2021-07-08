import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ExerciceBoucleVariable {

    public static void main(String args[]) {

        // exercice1();
        //exercice2();
        // exercice3();
        //exercice4();
        // exercice5();
        //exercice6();
        //exercice7();
        exercice8();
    }

    public static void exercice1() {
        int nbr1 = 0;
        while (nbr1 <= 100) {
            System.out.println(nbr1);
        }
    }

    public static void exercice2() {
        int nbr2 = 0;
        while (nbr2 <= 100) {
            if (nbr2 % 2 == 0) {
                System.out.println("nbr = " + nbr2); // exo 2
            }
        }
    }

    public static void exercice3() {
        int nbr3 = 0;
        while (nbr3 <= 100) {
            if (nbr3 % 2 == 1) {
                System.out.println("nbr = " + nbr3); // exo 2
            }
        }
    }

    public static void exercice4() {
        int i = 0;
        System.out.println("Donnez moi une lettre");
        Scanner scanner = new Scanner(System.in);
        String lettre = scanner.nextLine();
        System.out.println("Combien de fois voulez vous l'afficher? ");
        int nbr_fois = scanner.nextInt();

        while (i < nbr_fois) {
            System.out.println(lettre);
            i++;
        }
    }

    public static void exercice5() {
        System.out.println("Donnez moi un nombre");
        Scanner scanner = new Scanner(System.in);
        int nbr = scanner.nextInt();
        System.out.println("N = " + nbr);
        int j = 0;
        int i = 0;
        for (i = 1; i < nbr + 1; i++) {
            j = j + i;
        }
        System.out.println("La somme des nombres de 1 à N = " + j);
    }


    public static void exercice6() {
        int nbr6 = 0;
        Random random = new Random();
        int nombreAleatoire = random.nextInt();
        System.out.println(nombreAleatoire);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Un nombre a été généré, trouvez le");

        while (nbr6 < nombreAleatoire || nbr6 > nombreAleatoire) {
            nbr6 = scanner.nextInt();
            if (nbr6 < nombreAleatoire) {
                System.out.println("Trop petit");
            } else if (nbr6 > nombreAleatoire) {
                System.out.println("Trop grand");
            } else if (nbr6 == nombreAleatoire) {
                System.out.println("VICTOIRE!!");
                break;
            }
        }

    }

    public static void exercice7() {
        int j = 1;
        int i = 0;
        int resultat = 0;

        for (i = 0; i < 11; i++) {
            resultat = i * j;
            System.out.println(i + "*" + j + "=" + resultat);

        }


    }

    public static void exercice8() {
        int i =0;
        int j=0;
        System.out.println("Donnez moi un mot");
        Scanner scanner = new Scanner(System.in);
        String mot = scanner.nextLine();
        char tableau2[];

        char tableau1[] = mot.toCharArray();

        for(char temp : tableau1){
            System.out.println(temp);
            Array
        }
    }
}