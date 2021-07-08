import java.util.Arrays;

// 1. Déclarer un tableau d'entiers avec 1, 3, 5, 7, 9 et l'afficher dans la console sur une ligne :
// Exemple: 1 3 5 7 9
// 2. Déclarer un tableau d'entiers avec 1, 3, 5, 7, 9 et afficher l'entier le plus grand
// 3. Écrire un programme qui inverse un tableau et l'affiche
// 4. Écrire un programme qui tri un tableau d'entiers dans l'ordre croissant

public class ExerciceListeAndArray {

    public static void main(String args[]) {

        //exercice1();
        //exercice2();
        //exercice3();
        exercice4();
    }

    public static void exercice1() {

        int tableau[] = new int[]{1, 3, 5, 7, 9};
        System.out.println(Arrays.toString(tableau));

    }

    public static void exercice2() {

        int tab[] = new int[]{1, 13, 5, 7, 9};
        int max = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > max) {

                max = tab[i];
            }
        }
        System.out.println(max);
    }

    public static void exercice3() {

        int tab1[] = new int[]{1, 12, 23, 35};

        for (int i = 0; i < tab1.length; i++) {
            System.out.println(tab1[i]);
        }

        for (int j = 0; j < tab1.length / 2; j++) {
            int tmp = tab1[j];
            tab1[j] = tab1[tab1.length - j - 1];
            tab1[tab1.length - j - 1] = tmp;
        }
        System.out.println("tableau inversé");

        for (int k = 0; k < tab1.length; k++) {
            System.out.println(tab1[k]);
        }
    }

    public static void exercice4()
    {

             int tab[] = new int[]{18, 78, 23, 21};
            int tmp;
            for(int i = 0;i < tab.length; i++) {

                for (int j = 1; j < tab.length - i; j++) {

                    if (tab[j - 1] < tab[j]) {
                        tmp = tab[j - 1];
                        tab[j - 1] = tab[j];
                        tab[j] = tmp;
                    }

                }
            }

            for(int k = 0; k< tab.length;k++){
                System.out.println(tab[k]+ " " );
            }




                    }
}


