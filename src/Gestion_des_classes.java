import java.util.ArrayList;
import java.util.Scanner;

public class Gestion_des_classes {
    private ArrayList<Classe> liste_des_classes;
    private static int compteurID=0;
    public void creer_une_classe() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez le nom de la classe : ");
        String nom = sc.nextLine();
        if (liste_des_classes.isEmpty()) {
            Classe classe = new Classe();
            classe.setId(++compteurID);
            classe.setNom(nom);
            liste_des_classes.add(classe);
            System.out.println("La classe '" + nom + "' a été ajoutée avec succès !");
        } else {
            if (exiteDeja(nom)) {
                System.out.println("ce classe existe deja");
            } else {
                Classe classe = new Classe();
                classe.setNom(nom);
                classe.setId(++compteurID);
                liste_des_classes.add(classe);
            }
        }
    }
public void associer_un_formateur(GestionDesFormateurs gestion_formateur) {
    Scanner scanner = new Scanner(System.in);
    if (!liste_des_classes.isEmpty()) {
        afficher_liste_classes();
        System.out.println("Entrez l'indice de la classe > ");
        int indice = scanner.nextInt() - 1;
        if (indice >= 0 && indice < liste_des_classes.size()) {
            gestion_formateur.afficher_listes_formateurs();
            System.out.print("Entrez l'indice du formateur  > ");
            int index = scanner.nextInt() - 1;
            if (index >= 0 && index < gestion_formateur.liste_formateurs.size()) {
                Formateur formateur=gestion_formateur.liste_formateurs.get(index);
            }
            else{System.out.print("ce formateur n'existe pas ");}
        } else {
            System.out.print("cette classe n'existe pas ");
        }
    }
    else{System.out.print("la liste des classes est vide ");}
}
public void afficher_details_classe(){
    Scanner scanner = new Scanner(System.in);
    if (!liste_des_classes.isEmpty()) {
        afficher_liste_classes();
        System.out.println("Entrez l'indice de la classe > ");
        int indice = scanner.nextInt() - 1;
        if (indice >= 0 && indice < liste_des_classes.size()) {
            liste_des_classes.get(indice).afficher_liste_des_apprenants(indice);
        } else{System.out.print("ce classe n'existe pas ");}
        } else {
            System.out.print("cette classe n'existe pas ");
        }
}
public void modifier_classe(){
    Scanner scanner=new Scanner(System.in);
    int choix=0;
    do{
        System.out.println("    Menu de Modification des informations d'une classe");
        System.out.println("    1-Changer le nom de la classe ");
        System.out.println("    2-Ajouter un Apprenant ");
        System.out.println("    3-Supprimer un Apprenant");
        System.out.println("    4-Changer les formations  de formateur principal");
        System.out.println("    5-Quitter");
        System.out.println("    Entrez votre choix ");
        choix=scanner.nextInt();
        switch (choix){
            case 1: System.out.print("Entrez le nom de la classe : ");
                    String nom=scanner.nextLine();
                    if(!exiteDeja(nom)){Classe classe=new Classe();classe.setNom(nom);}
                    else{System.out.println("ce classe existe deja");}
                    break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }
    }while(choix!=5);
}
public void afficher_liste_classes(){
        if(!liste_des_classes.isEmpty()){
            for(int i=0; i<liste_des_classes.size();i++){
                System.out.println("id :"+liste_des_classes.get(i).getId()+ "Nom de la classe :"+liste_des_classes.get(i).getNom());
            }
        }
}
public void ajouter_apprenant_a_une_classe(Apprenant app, int i){
        liste_des_classes.get(i).getListe_des_apprenant().add(app);
}
public boolean exiteDeja(String nom) {
        int trouve = -1;
        for (int i = 0; i < liste_des_classes.size(); i++) {
            if (liste_des_classes.get(i).getNom().equals(nom)) {
                trouve = 1;
                break;
            }
        }
            if (trouve == 1) {
                return true;
            } else {
                return false;
            }
        }
public void ajouter_apprenant_classe(GestionApprenant gestionApprenant){
        Scanner scanner=new Scanner(System.in);
        if(!liste_des_classes.isEmpty()){
            System.out.println("--------------------------------");
            System.out.println("   Voici le liste des classes   ");
            System.out.println("--------------------------------");
            afficher_liste_classes();
            System.out.println("Entrez l'indice de la classe ");
            int indice = scanner.nextInt() - 1;

            if (indice >= 0 && indice < liste_des_classes.size()) {
                Classe classe=liste_des_classes.get(indice);
                int choix=0;
                do{
                System.out.println("      Menu de choix      ");
                System.out.println("      1-ajouter un nouvel apprenant dans cette classe ");
                System.out.println("      2-ajouter un apprenant deja existant dans la liste des apprenants ");
                System.out.println("      3-Quitter ");
                System.out.println("Entrez le choix =>  ");
                 choix=scanner.nextInt();
                switch(choix){
                    case 1:  int taille=gestionApprenant.getListe_apprenant().size();
                             gestionApprenant.Ajouter_Apprenant();
                             Apprenant app=gestionApprenant.getListe_apprenant().get(taille);
                             app.setClasse(classe);
                             classe.getListe_des_apprenant().add(app);
                             //gestionApprenant.getListe_apprenant().get(taille).setClasse(classe);
                             //Apprenant app=gestionApprenant.getListe_apprenant().get(taille);
                             //getLise_des_classes().get(indice).getListe_des_apprenant().add(app);
                            break;
                    case 2 :  if (!gestionApprenant.getListe_apprenant().isEmpty()) {
                                  System.out.println("------------------------------");
                                  System.out.println(" voici la liste des apprenants ");
                                  System.out.println("------------------------------");
                                  gestionApprenant.afficher_listes_apprenants();
                                  System.out.println("Entrez l'idice de la classe : ");
                                  int index = scanner.nextInt() - 1;
                                  if (index >= 0 && index < gestionApprenant.getListe_apprenant().size()) {
                                       gestionApprenant.getListe_apprenant().get(index).setClasse(classe);
                                      ajouter_apprenant_a_une_classe(gestionApprenant.getListe_apprenant().get(index),indice);
                                     System.out.print("l'ajout est fait avec succes");
                                  }
                                  else{ System.out.print("apprenant invalide"); }
                              }
                              else{System.out.println("la liste des apprenants est vide ");}
                              break;
                    case 3: break;

                    }
                }while(choix!=3);}
            else{System.out.println(" classe invalide ");}
        }else {System.out.println("la liste des classes est vide ");}

    }
    public Gestion_des_classes() {
        liste_des_classes = new ArrayList<>();
    }

    public ArrayList<Classe> getLise_des_classes() {
        return liste_des_classes;
    }

    public void setLise_des_classes(ArrayList<Classe> lise_des_classes) {
        this.liste_des_classes = lise_des_classes;
    }
}
