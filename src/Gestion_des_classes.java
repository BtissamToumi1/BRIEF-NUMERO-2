import java.util.ArrayList;
import java.util.Scanner;

public class Gestion_des_classes {
    ArrayList<Classe> lise_des_classes;
    public void creer_une_classe(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Entrez le nom de la classe : ");
        String nom=sc.nextLine();
        if(lise_des_classes.isEmpty()){
            Classe classe=new Classe();
            classe.setNom(nom);
            lise_des_classes.add(classe);
            System.out.println("La classe '" + nom + "' a été ajoutée avec succès !");
        } else {
            int trouve=-1;
            for(int i=0;i<lise_des_classes.size();i++){
                if(lise_des_classes.get(i).getNom().equals(nom)){
                    System.out.println(lise_des_classes.get(i).getNom());
                    System.out.println("ce classe existe deja ");
                    trouve=1;
                    break;
                }
            }
                if(trouve==-1){
                    Classe classe=new Classe();
                    classe.setNom(nom);
                    lise_des_classes.add(classe);
                    System.out.println("La classe '" + nom + "' a été ajoutée avec succès !");
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
