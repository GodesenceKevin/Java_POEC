import java.util.Scanner;

public class ExerciceNombrePairOuNon {

    public static void main(String args[]) {

        System.out.println("Donnez un nombre");
        Scanner scanner = new Scanner(System.in);
        double nombre = scanner.nextDouble();

        if (nombre%2 == 0) {
            System.out.println("votre nombre est pair");
        }

        else  {
            System.out.println("Le nombre est impair");
        }


    }

}
