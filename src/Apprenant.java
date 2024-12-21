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
        Liste_notes=new ArrayList<>();

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

        System.out.println("vous voulez modifiez dans les notes :");
        if(Liste_notes==null){
            System.out.println("la liste des notes est vide ");
        }
        else{
            System.out.println("entrez le nombre de modification : ");
            int nombre= scanner.nextInt();
            if(nombre>Liste_notes.size()){
                System.out.println("impossible de faire ce nombre modification");
            }
            else{
                int i=1;
                while(i<=nombre){
                    System.out.println("entrez l'indice de modification Numero "+(i)+" : ");
                    Liste_notes.set(scanner.nextInt(),scanner.nextDouble());
                }
            }
            }
        }
    public void affiche(){
        System.out.println("_le nom est : "+getNom()+" |le prenom est : "+getPrenom()+" |l'email est : "+getEmail()+" |le telephone est : "+getTelephone());
    }
    public void remplir_notes(){
        Scanner scanne=new Scanner(System.in);
        System.out.println("Entrez le nombre de notes : ");
        int nombre=scanne.nextInt();
        for(int i=0;i<nombre;i++){
            System.out.print("Entrez la note de Numero "+(i+1)+": ");
            Liste_notes.add(scanne.nextDouble());
            setListe_notes(Liste_notes);
        }
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
