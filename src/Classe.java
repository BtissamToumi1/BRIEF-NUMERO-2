import java.util.ArrayList;
import java.util.Scanner;

public class Classe {
    private int id;
    private String nom;
    private Formateur formateur;
    private ArrayList<Apprenant> Liste_des_apprenant;
    public Classe() {
        Liste_des_apprenant = new ArrayList<>();
    }
    public String getNom() {
        return nom;
    }
    public void afficher_liste_des_apprenants(int i){
                getListe_des_apprenant().get(i).affiche();
                System.out.println();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Formateur getFormateur() {
        return formateur;
    }

    public void setFormateur(Formateur formateur) {
        this.formateur = formateur;
    }

    public ArrayList<Apprenant> getListe_des_apprenant() {
        return Liste_des_apprenant;
    }

    public void setListe_des_apprenant(ArrayList<Apprenant> liste_des_apprenant) {
        Liste_des_apprenant = liste_des_apprenant;
    }
}
