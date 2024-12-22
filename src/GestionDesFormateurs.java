import java.util.ArrayList;
import java.util.Scanner;

public class GestionDesFormateurs {
    ArrayList<Formateur> liste_formateurs;
    private int comptuerId=0;

    public void Ajouter_Formatuer(){
        Formateur  F1=new Formateur();
        F1.setId(++comptuerId);
        liste_formateurs.add(F1);
    }

    public GestionDesFormateurs() {
        liste_formateurs = new ArrayList<>();
    }

    public void afficher_listes_formateurs(){
        if(liste_formateurs.isEmpty()){
            System.out.println("la liste des Formateurs est vide");
        }
        else{
            for(int i=0;i<liste_formateurs.size();i++){
                System.out.print(liste_formateurs.get(i).getId()+" : ");
                liste_formateurs.get(i).affiche();
                System.out.println();
            }
        }
    }
    public void afficher_un_formateur() {
        Scanner scan = new Scanner(System.in);
        if (!liste_formateurs.isEmpty()) {
            System.out.println("Entrez l'indice du  formateur que tu vas afficher ");
            int indice = scan.nextInt();
            if (indice >= 1 && indice <= liste_formateurs.size()) {
                liste_formateurs.get(indice-1).affiche();
            }
            else{ System.out.println("indice introuvable");}
        }
        else{
            System.out.println("la liste des apprenants est vide");
        }
    }
    public void modifier_formateur(){
        Scanner scan = new Scanner(System.in);
        if (!liste_formateurs.isEmpty()) {
            System.out.println("Entrez l'id de formateurs a modifier ");
            int indice = scan.nextInt();
            int indix=indice-1;
            if (indice >= 1 && indice <=liste_formateurs.size()) {
                liste_formateurs.get(indix).modifier();
            }
            else{ System.out.println("indice introuvable");}
        }
        else{
            System.out.println("la liste des formateurs est vide");
        }
    }
    public void Supprimer_formateur(){
        Scanner scann = new Scanner(System.in);
        if (!liste_formateurs.isEmpty()) {
            System.out.println("Entrez l'indice du formateur que tu vas supprimer ");
            int indice = scann.nextInt();
            int indix=indice-1;
            if (indice >= 1 && indice <=liste_formateurs.size()) {
                liste_formateurs.remove(indix);
                for(int i=indix ; i<liste_formateurs.size();i++){
                    liste_formateurs.get(i).setId(i+1);
                    System.out.println(liste_formateurs.get(i).getId());
                }
            }
            else{ System.out.println("indice introuvable");}
        }
        else{
            System.out.println("la liste des formateurs est vide");
        }
    }
    public ArrayList<Formateur> getListe_formateurs() {
        return liste_formateurs;
    }

    public void setListe_formateurs(ArrayList<Formateur> liste_formateurs) {
        this.liste_formateurs = liste_formateurs;
    }

    public int getComptuerId() {
        return comptuerId;
    }

    public void setComptuerId(int comptuerId) {
        this.comptuerId = comptuerId;
    }
}
