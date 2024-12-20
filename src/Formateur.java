import java.util.ArrayList;
public class Formateur extends  Personne {
     private String specialite;
     private  double salaire;
     private Classe classe;

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
