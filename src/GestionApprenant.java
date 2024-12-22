import java.util.ArrayList;
import java.util.Scanner;
public class GestionApprenant {
    private ArrayList<Apprenant> liste_apprenant;
    private int comptuerId=0;

    public GestionApprenant() {
        this.liste_apprenant = new ArrayList<>();
    }

    public void Ajouter_Apprenant(){
        Apprenant E1=new Apprenant();
        E1.setId(++comptuerId);
        liste_apprenant.add(E1);
    }
    public void Associer_Apprenant_classe(Gestion_des_classes gestion_classe) {
        Scanner scanne = new Scanner(System.in);
        System.out.println("    ------------------------------  ");
        System.out.println("    voici la liste des apprenants    ");
        System.out.println("    ------------------------------  ");
        if (liste_apprenant.isEmpty()) {
            System.out.println("la liste des apprenants est vide ");
            System.out.println("------------------------------");
        } else {
            afficher_listes_apprenants();
            System.out.println("------------------------------");
            System.out.println("Selectionnez l'apprenant a associer a une classe : ");
            int index_Apprenant = scanne.nextInt() - 1;
            if (index_Apprenant >= 0 && index_Apprenant < gestion_classe.getLise_des_classes().size()) {
                Apprenant apprenant = liste_apprenant.get(index_Apprenant);
                if (gestion_classe.getLise_des_classes().isEmpty()) {
                    System.out.println("------------------------------");
                    System.out.println("la liste des classes est vide ");
                    System.out.println("------------------------------");
                    System.out.println("Message de confirmation : vous pouvez creer une classe en tapant Oui sinon vous pouvez tapez Non pour quitter => ");
                    String choix = scanne.next();
                    while (!choix.equals("Oui") || !choix.equals("Non")) {
                        System.out.print("Message de confirmation > pour creer une nouvelle classe tapez OUI > pour Quitter tapez Non : ");
                        choix = scanne.next();
                    }
                    if (choix.equals("Oui")) {
                        gestion_classe.creer_une_classe();
                        Classe classe = gestion_classe.getLise_des_classes().get(0);
                        apprenant.setClasse(classe);
                    } else {
                        System.out.print("Au revoir");
                    }
                } else {
                    System.out.println("    ------------------------------  ");
                    System.out.println("    voici la liste des classes    ");
                    System.out.println("    ------------------------------  ");
                    gestion_classe.afficher_liste_classes();
                    System.out.println("    ------------------------------  ");
                    System.out.println("Entrez l'idice de la classe : ");
                    int index_classe = scanne.nextInt() - 1;
                    if (index_classe >= 0 && index_classe < gestion_classe.getLise_des_classes().size()) {
                        Classe classe = gestion_classe.getLise_des_classes().get(index_classe);
                        apprenant.setClasse(classe);
                        System.out.print("l'association est faite avec succes");
                    }
                    else{ System.out.print("classe invalide"); }
                }
            }
            else{ System.out.print(" apprenant invalide "); }
        }
    }
    public void afficher_listes_apprenants(){
        if(liste_apprenant.isEmpty()){
            System.out.println("la liste des Apprenants est vide");
            }
        else{
            for(int i=0;i<liste_apprenant.size();i++){
            System.out.print(liste_apprenant.get(i).getId()+" : ");
            liste_apprenant.get(i).affiche();
            System.out.println();
            }
        }
        }
    public void afficher_un_apprenant() {
        Scanner scan = new Scanner(System.in);
        if (!liste_apprenant.isEmpty()) {
            System.out.println("Entrez l'indice de l'apprenant que tu vas afficher ");
            int indice = scan.nextInt();
            if (indice >= 1 && indice <= liste_apprenant.size()) {
                liste_apprenant.get(indice-1).affiche();
            }
            else{ System.out.println("indice introuvable");}
        }
        else{
            System.out.println("la liste des apprenants est vide");
        }
    }
    public void modifier_apprenant(){
        Scanner scan = new Scanner(System.in);
        if (!liste_apprenant.isEmpty()) {
            System.out.println("Entrez l'id de l'apprenant a modifier ");
            int indice = scan.nextInt();
            int indix=indice-1;
            if (indice >= 1 && indice <=liste_apprenant.size()) {
                liste_apprenant.get(indix).modifier();
            }
            else{ System.out.println("indice introuvable");}
        }
        else{
            System.out.println("la liste des apprenants est vide");
        }
    }
    public void Supprimer_apprenant(){
        Scanner scann = new Scanner(System.in);
        if (!liste_apprenant.isEmpty()) {
            System.out.println("Entrez l'indice de l'apprenant que tu vas supprimer ");
            int indice = scann.nextInt();
            int indix=indice-1;
            if (indice >= 1 && indice <=liste_apprenant.size()) {
                liste_apprenant.remove(indix);
                for(int i=indix ; i<liste_apprenant.size();i++){
                    liste_apprenant.get(i).setId(i+1);
                    System.out.println(liste_apprenant.get(i).getId());
                }
            }
            else{ System.out.println("indice introuvable");}
        }
        else{
            System.out.println("la liste des apprenants est vide");
        }
    }
    public ArrayList<Apprenant> getListe_apprenant() {
        return liste_apprenant;
    }

    public void setListe_apprenant(ArrayList<Apprenant> liste_apprenant) {
        this.liste_apprenant = liste_apprenant;
    }
}
