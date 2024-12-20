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
            if (indice >= 0 && indice < liste_apprenant.size()) {
                liste_apprenant.get(indice).affiche();
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
