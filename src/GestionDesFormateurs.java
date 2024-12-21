import java.util.ArrayList;

public class GestionDesFormateurs {
    ArrayList<Formateur> liste_formateurs;
    private int comptuerId=0;


    public GestionDesFormateurs(ArrayList<Formateur> liste_formateurs) {
        this.liste_formateurs = liste_formateurs;
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
