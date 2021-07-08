import java.util.Scanner;

public class ExerciceIMCMain{
    public static void main(String args[]) {


        System.out.println("Bonjour, bienvenue dans le calculateur d'IMC");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est votre poids? (en kg)");
        String poidsUtilisateurStr = scanner.nextLine();
        double poidsUtilisateur = Double.parseDouble(poidsUtilisateurStr);
        System.out.println("Quel est votre taille? (en m) :");
        String tailleUtilisateurStr = scanner.nextLine();
        double tailleUtilisateur = Double.parseDouble(tailleUtilisateurStr);

        double IMC = poidsUtilisateur / (tailleUtilisateur*tailleUtilisateur);

        System.out.println("Votre IMC est ");
        System.out.println(IMC);

        if(IMC < 18.4) { // Si
            System.out.println("maigre");
        } else if(IMC > 18.5 && IMC < 24.9) { // Si sinon
            System.out.println("normale");
        } else if(IMC > 25 && IMC < 29.9) { // Si sinon
            System.out.println("surpoids");
        } else if(IMC > 30 && IMC < 34.9) { // Si sinon
            System.out.println("Obésité modérée");
        } else if(IMC > 35 && IMC < 39.9) { // Si sinon
            System.out.println("Obésité sévère");
        } else  { // Si sinon
            System.out.println("Obésité morbide");

        }
    }
}
