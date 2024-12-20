import java.util.ArrayList;
import java.util.Scanner;
public class Apprenant extends Personne {
    private Classe classe;
    private ArrayList<Double> Liste_notes;
    public  Apprenant(){

         Scanner scanner=new Scanner(System.in);

         System.out.println("Entrez le nom de l'apprenant : ");
         setNom(scanner.next());

         System.out.println("Entrez le prenom de l'apprenant : ");
         setPrenom(scanner.next());

        System.out.println("Entrez l'email de l'apprenant : ");
        setEmail(scanner.next());

        System.out.println("Entrez le telephone de l'apprenant : ");
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
