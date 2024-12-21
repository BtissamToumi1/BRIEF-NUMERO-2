import java.util.ArrayList;
import java.util.Scanner;

public class Formateur extends  Personne {
     private String specialite;
     private  double salaire;
     private Classe classe;
     public  Formateur(){

          Scanner scanner=new Scanner(System.in);

          System.out.print("Entrez le nom du formateur : ");
          setNom(scanner.next());

          System.out.print("Entrez le prenom du formateur  : ");
          setPrenom(scanner.next());

          System.out.print("Entrez l'email du formateur : ");
          setEmail(scanner.next());

          System.out.print("Entrez le telephone du formateur : ");
          setTelephone(scanner.next());

          System.out.print("Entrez specialite du formateur : ");
          this.specialite= scanner.nextLine();
          scanner.nextLine();
          System.out.print("Entrez salaire du formateur : ");
          this.salaire= scanner.nextDouble();
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
               System.out.println("    5-Modifier specialite ");
               System.out.println("    6-Modifier salaire");
               System.out.println("    7-Quitter");
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
                    case 5: System.out.println("Par quoi voulez-vous remplacer la specialite "+getSpecialite()+" ? :  " );
                         setSpecialite(scanner.nextLine());
                         break;
                    case 6: System.out.println("Par quoi voulez-vous remplacer le salaire "+getSalaire()+" ? :  " );
                         setSalaire(scanner.nextDouble());
                         break;
                    case 7:break;
               }
          }while(choix!=7);
     }
     public void affiche(){
          System.out.println("_le nom est : "+getNom()+" |le prenom est : "+getPrenom()+" |l'email est : "+getEmail()+" |le telephone est : "+getTelephone()+" |la specialite est : "+getSpecialite()+" |le salaire est : "+getSalaire());
     }
     public String getSpecialite() {
          return specialite;
     }

     public void setSpecialite(String specialite) {
          this.specialite = specialite;
     }

     public double getSalaire() {
          return salaire;
     }

     public void setSalaire(double salaire) {
          this.salaire = salaire;
     }

     public Classe getClasse() {
          return classe;
     }

     public void setClasse(Classe classe) {
          this.classe = classe;
     }
}
