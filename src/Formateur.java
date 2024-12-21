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
          this.specialite= scanner.next();

          System.out.print("Entrez salaire du formateur : ");
          this.salaire= scanner.nextDouble();
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
