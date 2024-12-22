//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.import java.util.InputMismatchException;
import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.Scanner;
public class Application {
    public static void main(String[] args) {

        GestionDesFormateurs gestion_formateur=new GestionDesFormateurs();
        GestionApprenant gestion_apprenant=new GestionApprenant();
        Gestion_des_classes gestion_classe=new Gestion_des_classes();

        /*gestion_classe.creer_une_classe();
        gestion_classe.creer_une_classe();
        gestion_classe.afficher_liste_classes();
        System.out.println("----------------------------------");
        gestion_apprenant.Ajouter_Apprenant();
        System.out.println("----------------------------------");
        gestion_apprenant.Ajouter_Apprenant();
        System.out.println("----------------------------------");
        //gestion_apprenant.Associer_Apprenant_classe(gestion_classe);
        System.out.println();
        //System.out.println(gestion_apprenant.getListe_apprenant().get(0).getClasse().getNom());
        System.out.println();
        //gestion_classe.ajouter_apprenant_classe(gestion_apprenant);
        gestion_apprenant.afficher_listes_apprenants();
        System.out.println(gestion_apprenant.getListe_apprenant().get(2).getClass());
        //gestion_apprenant.getListe_apprenant().get(2).getClass();*/
        Scanner scanner=new Scanner(System.in);

        Scanner scannern=new Scanner(System.in);
        int choix=0,choix1=0,choix2=0,choix3=0;
        do {
            System.out.println(" Menu Gestion Enaa ");
            System.out.println("1- Gestion des Classes ");
            System.out.println("2- Gestion des Apprenants");
            System.out.println("3- Gestion des Formateur");
            System.out.println("4- Quitter");
            try{
            System.out.println("Entrez votre choix > ");
            choix = scannern.nextInt();
            switch (choix) {
                case 1:
                    do {
                        System.out.println(" Menu Gestion des Classes ");
                        System.out.println("1- cree une classe ");
                        System.out.println("2- modifcation d'une classe ");
                        System.out.println("3- Affichage des details dune classe");
                        System.out.println("4- Quitter");
                        try {
                            System.out.println("Entrez votre choix > ");
                            choix1 = scannern.nextInt();
                            switch (choix1) {
                                case 1:
                                    gestion_classe.creer_une_classe();
                                    break;
                                case 2:
                                    break;
                                case 3:
                                    break;
                                case 4:
                                    break;
                            }

                        } catch (InputMismatchException e) {
                            System.out.println(" Entrez invalide ");
                            scannern.next();
                        }
                    } while (choix1 != 4);
                    break;
                case 2:
                    do {
                        System.out.println(" Menu Gestion des Apprenants ");
                        System.out.println("1- Ajouter un apprenant ");
                        System.out.println("2- Associer un apprenant a une classe ");
                        System.out.println("3- Modifier les informations d'un apprenant ");
                        System.out.println("4- Suppression d'un apprenant");
                        System.out.println("5- Affichage des apprenant");
                        System.out.println("6-Affichage de details d'un apprenant");
                        System.out.println("7-remplissage des notes d'un apprenant");
                        System.out.println("8-Quitter");
                        try {
                            System.out.println("Entrez votre choix > ");
                            choix2 = scannern.nextInt();
                            switch (choix2) {
                                case 1:
                                    gestion_apprenant.Ajouter_Apprenant();
                                    break;
                                case 2:
                                    gestion_apprenant.Associer_Apprenant_classe(gestion_classe);
                                    break;
                                case 3:
                                    gestion_apprenant.modifier_apprenant();
                                    break;
                                case 4:
                                    gestion_apprenant.Supprimer_apprenant();
                                    break;
                                case 5:
                                    gestion_apprenant.afficher_listes_apprenants();
                                    break;
                                case 6:
                                    gestion_apprenant.afficher_un_apprenant();
                                    break;
                                case 7:
                                    break;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println(" Entrez invalide ");
                            scannern.next();
                        }
                    } while (choix2 != 8);
                    break;
                case 3:
                    do {
                        System.out.println(" Menu Gestion des Formateurs ");
                        System.out.println("1- Ajouter un Formateur ");
                        System.out.println("2- Associer un Formateur a une classe ");
                        System.out.println("3- Modifier les informations d'un Formateur ");
                        System.out.println("4- Suppression d'un Formateur");
                        System.out.println("5- Affichage des Formateurs");
                        System.out.println("6- Affichage de details d'un formateur");
                        System.out.println("7- Quitter");
                        try {
                            System.out.println("Entrez votre choix > ");
                            choix3 = scannern.nextInt();
                            switch (choix3) {
                                case 1:
                                    gestion_formateur.Ajouter_Formatuer();
                                    break;
                                case 2:
                                    break;
                                case 3:
                                    gestion_formateur.modifier_formateur();
                                    break;
                                case 4:
                                    gestion_formateur.Supprimer_formateur();
                                    break;
                                case 5:
                                    gestion_formateur.afficher_listes_formateurs();
                                    break;
                                case 6:
                                    gestion_formateur.afficher_un_formateur();
                                    break;
                                case 7:
                                    break;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println(" Entrez invalide ");
                            scannern.next();
                        }
                    } while (choix3 != 7);
                    break;
                case 4:
                    break;
            }
        }catch (InputMismatchException e){
                System.out.println(" Entrez invalide ");
                scannern.next();
            }
        }while(choix!=4);

 }
 }