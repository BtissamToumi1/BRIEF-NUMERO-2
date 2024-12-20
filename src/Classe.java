import java.util.ArrayList;
import java.util.Scanner;

public class Classe {
    private String nom;
    private Formateur formateur;
    private ArrayList<Apprenant> Liste_des_apprenant;

    public Classe() {
    }
    public String getNom() {
        return nom;
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