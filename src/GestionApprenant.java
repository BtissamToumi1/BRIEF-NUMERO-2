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
