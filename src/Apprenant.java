import java.util.ArrayList;
import java.util.Scanner;
public class Apprenant extends Personne {
    private Classe classe;
    private ArrayList<Double> Liste_notes;

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public ArrayList<Double> getListe_notes() {
        return Liste_notes;
    }

    public void setListe_notes(ArrayList<Double> liste_notes) {
        Liste_notes = liste_notes;
    }
}
