import java.util.ArrayList;
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
        

    public ArrayList<Apprenant> getListe_apprenant() {
        return liste_apprenant;
    }

    public void setListe_apprenant(ArrayList<Apprenant> liste_apprenant) {
        this.liste_apprenant = liste_apprenant;
    }
}
