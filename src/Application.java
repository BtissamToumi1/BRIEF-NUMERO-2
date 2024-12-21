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
        gestion.afficher_listes_apprenants();
        System.out.println("----------------------------------");
        gestion.Supprimer_apprenant();
        System.out.println("----------------------------------");
        gestion.afficher_listes_apprenants();
        System.out.println("----------------------------------");
        gestion.getListe_apprenant().get(0).remplir_notes();
        gestion.modifier_apprenant();
        Scanner scanner=new Scanner(System.in);

        Scanner scannern=new Scanner(System.in);
        int choix=0;
        do {
            System.out.println(" Menu Gestion Enaa ");
            System.out.println("1- Gestion des Classes ");
            System.out.println("2- Gestion des Apprenants");
            System.out.println("3- Gestion des Formateur");
            System.out.println("4- Quitter");
            choix=scannern.nextInt();
            switch (choix){
                case 1: int choix1;
                    do {
                        System.out.println(" Menu Gestion des Classes ");
                        System.out.println("1- cree une classe ");
                        System.out.println("2- modifcation d'une classe ");
                        System.out.println("3- Affichage des details dune classe");
                        System.out.println("4- Quitter");
                        choix1=scannern.nextInt();
                        switch (choix1){
                            case 1: break;
                            case 2 :break;
                            case 3: break;
                            case 4: break;
                        }
                    }while(choix1!=4);
                    break;
                case 2: int choix2;
                    do {
                        System.out.println(" Menu Gestion des Apprenants ");
                        System.out.println("1- Ajouter un apprenant ");
                        System.out.println("2- Associer un apprenant a une classe ");
                        System.out.println("3- Modifier les informations d'un apprenant ");
                        System.out.println("4- Suppression d'un apprenant");
                        System.out.println("5- Affichage des apprenant");
                        System.out.println("6-Affichage des details d'un apprenant");
                        System.out.println("7-Quitter");
                        choix2=scannern.nextInt();
                        switch (choix2){
                            case 1: gestion.Ajouter_Apprenant();break;
                            case 2 :break;
                            case 3: gestion.modifier_apprenant();break;
                            case 4: gestion.Supprimer_apprenant();break;
                            case 5: gestion.afficher_listes_apprenants();break;
                            case 6: gestion.afficher_un_apprenant();
                            default:break;
                        }
                    }while(choix2!=6);
                    break;
                case 3: int choix3;
                    do {
                        System.out.println(" Menu Gestion des Formateurs ");
                        System.out.println("1- Ajouter un Formateur ");
                        System.out.println("2- Associer un Formateur a une classe ");
                        System.out.println("3- Modifier les informations d'un Formateur ");
                        System.out.println("4- Suppression d'un Formateur");
                        System.out.println("5- Affichage des Formateurs");
                        System.out.println("6-Quitter");
                        choix3=scannern.nextInt();
                        switch (choix3){
                            case 1: break;
                            case 2 :break;
                            case 3: break;
                            case 4: break;
                            case 5: break;
                            case 6: break;
                        }
                    }while(choix3!=6);
                    break;
                case 4: break;
            }
        }while(choix!=4);

 }
 }