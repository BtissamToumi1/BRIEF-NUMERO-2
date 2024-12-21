import java.util.ArrayList;
import java.util.Scanner;

public class Gestion_des_classes {
    ArrayList<Classe> lise_des_classes;
    public void creer_une_classe(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Entrez le nom de la classe : ");
        String nom=sc.nextLine();
        if(lise_des_classes.isEmpty()){
            Classe classe=new Classe();
            lise_des_classes.add(classe);
            System.out.println("La classe '" + nom + "' a été ajoutée avec succès !");
        } else {
            for(int i=0;i<lise_des_classes.size();i++){
                if(lise_des_classes.get(i).getNom().equals(nom)){
                    System.out.println("ce classe existe deja ");
                    break;
                }
                else{
                    Classe classe=new Classe();
                    lise_des_classes.add(classe);
                    System.out.println("La classe '" + nom + "' a été ajoutée avec succès !");
                }
            }

        }

    }
    public Gestion_des_classes() {
        lise_des_classes = new ArrayList<>();
    }

    public ArrayList<Classe> getLise_des_classes() {
        return lise_des_classes;
    }

    public void setLise_des_classes(ArrayList<Classe> lise_des_classes) {
        this.lise_des_classes = lise_des_classes;
    }
}
