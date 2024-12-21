import java.util.ArrayList;
import java.util.Scanner;

public class Gestion_des_classes {
    ArrayList<Classe> lise_des_classes;
    public void creer_une_classe(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Entrez le nom de la classe : ");
        String nom=sc.nextLine();
        if(lise_des_classes.isEmpty()){
            Classe classe=new Classe();
            classe.setNom(nom);
            lise_des_classes.add(classe);
            System.out.println("La classe '" + nom + "' a été ajoutée avec succès !");
        } else {
               if(exiteDeja(nom)){System.out.println("ce classe existe deja");}
                else{Classe classe=new Classe();
                   classe.setNom(nom);
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
