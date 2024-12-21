//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.Scanner;
public class Application {
    public static void main(String[] args) {

        GestionApprenant gestion=new GestionApprenant();
        gestion.Ajouter_Apprenant();
        System.out.println("----------------------------------");
        gestion.Ajouter_Apprenant();
        System.out.println("----------------------------------");
        gestion.Ajouter_Apprenant();
        System.out.println("----------------------------------");
        gestion.afficher_listes_apprenants();
        System.out.println("----------------------------------");
        gestion.Supprimer_apprenant();
        System.out.println("----------------------------------");
        gestion.afficher_listes_apprenants();
        Scanner scanner=new Scanner(System.in);
         int choix=0;
         do{
             System.out.println("        Menu Gestion Enaa        ");
             System.out.println("----------------------------------");
             System.out.println(" Menu Gestion des classes ");
             System.out.println("1- Creer une classe ");
             System.out.println("2- Modifier une classe ");
             System.out.println("3- Supprimer une classe ");
             System.out.println("4- Afficher les classes ");
             System.out.println("----------------------------------");
             System.out.println("    Menu Gestion des Apprenants  ");
             System.out.println("5- Ajouter un Apprenant ");
             System.out.println("6- Associer un Apprenant a une classe ");
             System.out.println("7- Modifier les informations d'un apprenant ");
             System.out.println("8- Supprimer un apprenant ");
             System.out.println("9- Affichage des Apprenants");
             System.out.println("----------------------------------");
             System.out.println("    Menu Gestion des Formateurs  ");
             System.out.println("10- Ajouter un Formateur ");
             System.out.println("11- Associer un Formateur a une classe ");
             System.out.println("12- Modifier les informations d'un Formateur ");
             System.out.println("13- Supprimer un Formateur ");
             System.out.println("14- Affichage des Formateurs");
             System.out.println("15- Quitter");
             System.out.println("----------------------------------");
             System.out.print("Entrez votre choix : ");
             choix=scanner.nextInt();

         }while(choix!=14);

 }
 }