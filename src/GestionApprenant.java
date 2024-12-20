import java.util.ArrayList;

public class GestionApprenant {
    private ArrayList<Apprenant> liste_apprenant;
    private int comptuerId=0;
    public void Ajouter_Apprenant(){
        Apprenant E1=new Apprenant();
        E1.setId(++comptuerId);
        liste_apprenant.add(E1);
    }
    
    public ArrayList<Apprenant> getListe_apprenant() {
        return liste_apprenant;
    }

    public void setListe_apprenant(ArrayList<Apprenant> liste_apprenant) {
        this.liste_apprenant = liste_apprenant;
    }
}
