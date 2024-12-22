import java.util.ArrayList;
import java.util.Scanner;

public class Gestion_des_classes {
    private ArrayList<Classe> lise_des_classes;
    private static int compteurID=0;
    public void creer_une_classe(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Entrez le nom de la classe : ");
        String nom=sc.nextLine();
        if(lise_des_classes.isEmpty()){
            Classe classe=new Classe();
            classe.setId(++compteurID);
            classe.setNom(nom);
            lise_des_classes.add(classe);
            System.out.println("La classe '" + nom + "' a été ajoutée avec succès !");
        } else {
               if(exiteDeja(nom)){System.out.println("ce classe existe deja");}
                else{Classe classe=new Classe();
                   classe.setNom(nom);
                   classe.setId(++compteurID);
                   lise_des_classes.add(classe);}
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
        if(!lise_des_classes.isEmpty()){
            for(int i=0; i<lise_des_classes.size();i++){
                System.out.println(lise_des_classes.get(i).getNom());
            }
        }
}
public void ajouter_apprenant_a_une_classe(Apprenant app, int i){
        lise_des_classes.get(i).getListe_des_apprenant().add(app);
}
public boolean exiteDeja(String nom) {
        int trouve = -1;
        for (int i = 0; i < lise_des_classes.size(); i++) {
            if (lise_des_classes.get(i).getNom().equals(nom)) {
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
        if(!lise_des_classes.isEmpty()) {
            System.out.println("--------------------------------");
            System.out.println("   Voici le liste des classes   ");
            System.out.println("--------------------------------");

            System.out.println("Entrez l'indice de la classe ");
            int indice = scanner.nextInt() - 1;

            if (indice >= 0 && indice < lise_des_classes.size()) {
                Classe classe=lise_des_classes.get(indice);
                System.out.println("      Menu de choix      ");
                System.out.println("      1-ajouter un nouvel apprenant dans cette classe ");
                System.out.println("      2-ajouter un apprenant deja existant dans la liste des apprenants ");
                System.out.println("      3-Quitter ");
                System.out.println("Entrez le choix =>  ");
                int choix=scanner.nextInt();
                switch(choix){
                    case 1:  int taille=gestionApprenant.getListe_apprenant().size();
                             gestionApprenant.Ajouter_Apprenant();
                             gestionApprenant.getListe_apprenant().get(taille+1).setClasse(classe);
                             Apprenant app=gestionApprenant.getListe_apprenant().get(taille+1);
                             lise_des_classes.get(indice).getListe_des_apprenant().add(app);
                            break;
                    case 2 :
                }
            }
            else{System.out.println(" classe invalide ");}

        }else {System.out.println("la liste des classes est vide ");}
    }
    public Gestion_des_classes() {
        lise_des_classes = new ArrayList<>();
    }

    public ArrayList<Classe> getLise_des_classes() {
        return lise_des_classes;
    }

    public void setLise_des_classes(ArrayList<Classe> lise_des_classes) {
        this.lise_des_classes = lise_des_classes;
    }
}
