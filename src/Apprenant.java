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
        String Email=scanner.next();
        while(!ValiderEmail(Email)){
            System.out.println("Email invalide ");
            System.out.print("Entrez l'email de l'apprenant une autre fois : ");
            Email=scanner.next();
        }

        setEmail(Email);

        System.out.print("Entrez le telephone de l'apprenant : ");
        setTelephone(scanner.next());
        Liste_notes=new ArrayList<>();

     }
    public void modifier(){
        Scanner scanner=new Scanner(System.in);
        int choix=0;
        do{
            System.out.println("    Menu de Modification ");
            System.out.println("    1-Modifier Nom ");
            System.out.println("    2-Modifier Prenom ");
            System.out.println("    3-Modifier email");
            System.out.println("    4-Modifier telephone ");
            System.out.println("    5-Modifier les Notes ");
            System.out.println("    6-Quitter");
            System.out.println("    Entrez votre choix ");
            choix=scanner.nextInt();
            switch (choix){
                case 1:System.out.print("Par quoi voulez-vous remplacer le nom "+getNom()+" ?  : ");
                       setNom(scanner.next());
                       break;
                case 2:System.out.print("Par quoi voulez-vous remplacer le prenom "+getPrenom()+" ? : ");
                       setPrenom(scanner.next());
                       break;
                case 3:System.out.print("Par quoi voulez-vous remplacer l'email "+getEmail()+" ? :  ");
                       setEmail(scanner.next());
                       break;
                case 4:System.out.print("Par quoi voulez-vous remplacer le telephone "+getTelephone()+" ? :  ");
                       setTelephone(scanner.next());
                       break;
                case 5: System.out.println("vous voulez modifiez dans les notes :");
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
                                int indice=scanner.nextInt();
                                System.out.println("entrez la nouvelle valeur  : ");
                                double value=scanner.nextDouble();
                                Liste_notes.set(indice,value);
                                i++;
                            }
                        }
                    }
                    break;
                case 6:break;
            }
        }while(choix!=6);
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
    public boolean ValiderEmail(String Email){
        String regex= "^[a-zA-Z][a-zA-Z0-9._*%+-]*@gmail\\.com$";
        return Email.matches(regex);
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
