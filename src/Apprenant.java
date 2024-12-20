import java.util.ArrayList;
import java.util.Scanner;
public class Apprenant extends Personne {
    private Classe classe;
    private ArrayList<Double> Liste_notes;
    public  Apprenant(){

         Scanner scanner=new Scanner(System.in);

         System.out.print("Entrez le nom de l'apprenant : ");
         setNom(scanner.next());

         System.out.print("Entrez le prenom de l'apprenant : ");
         setPrenom(scanner.next());

        System.out.print("Entrez l'email de l'apprenant : ");
        setEmail(scanner.next());

        System.out.print("Entrez le telephone de l'apprenant : ");
        setTelephone(scanner.next());

     }
    public void modifier(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Par quoi voulez-vous remplacer le nom "+getNom()+" ?  : ");
        setNom(scanner.next());

        System.out.print("Par quoi voulez-vous remplacer le prenom "+getPrenom()+" ? : ");
        setPrenom(scanner.next());

        System.out.print("Par quoi voulez-vous remplacer le prenom "+getEmail()+" ? :  ");
        setEmail(scanner.next());

        System.out.print("Par quoi voulez-vous remplacer le prenom "+getTelephone()+" ? :  ");
        setTelephone(scanner.next());
    }
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
