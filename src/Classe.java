import java.util.ArrayList;
import java.util.Scanner;

public class Classe {
    private String nom;
    private Formateur formateur;
    private ArrayList<Apprenant> Liste_des_apprenant;

    public Classe() {
        //String nom,Formateur formateur,ArrayList<Apprenant> liste_des_apprenant
        //this.nom=nom;
        //this.formateur=formateur;
        //this.Liste_des_apprenant=liste_des_apprenant;
    }
    public Ajouter_Apprenant(String prenom,String nom,String email,String telephone){

        }

    /*public boolean exiteDeja(String nom,String prenom,String email){
        int i=0;
        while(i<Liste_des_apprenant.size()){
            //Apprenant app=new Apprenant(0,null,null,null,null,null);
            Apprenant app=Liste_des_apprenant.get(i);
            String Nom=app.getNom(),Prenom=app.getPrenom(),Email=app.getEmail();
            if (Nom.equals(nom) && Prenom.equals(prenom) && Email.equals(email)) {
                return false;
            }
            i++;
        }
        return true;
    }*/
    public void Modification(Apprenant apprenant){
       /* if(existeID(id)){*/
            int choix;
            Scanner scan=new Scanner(System.in);
            do{
                System.out.println("Menu de Modification");
                System.out.println("1-Nom");
                System.out.println("2-PRENOM");
                System.out.println("3-Email");
                System.out.println("4-MODIFICATION DE TABLEAU NOTES");
                System.out.println("5-MODICFATION DE CLASSE");
                System.out.println("6-QUITTER");
                System.out.println("entrez votre choix : ");
                choix=scan.nextInt();
                //Apprenant app= Liste_des_apprenant.get;
                Scanner scann=new Scanner(System.in);
                switch(choix){
                    case 1 : System.out.println("vous pouvez remplacez "+(apprenant.getNom())+" par quoi : ");
                        String Nom=scann.next();
                        apprenant.setNom(Nom);
                        break;
                    case 2 : System.out.println("vous pouvez remplacez "+(apprenant.getPrenom())+" par quoi : ");
                        String Prenom=scann.next();
                        apprenant.setPrenom(Prenom);
                        break;
                    case 3:  System.out.println("vous pouvez remplacez "+(apprenant.getEmail())+" par quoi : ");
                        String Email=scann.next();
                        apprenant.setPrenom(Email);
                        break;

                    case 4: System.out.println("vous pouvez modifier les notes d'un apprenant en specifiant les modifications");
                            Modifier_notes(apprenant.getListe_notes());
                            break;
                    case 5:
                    case 6:break;
                }
            }while(choix!=6);


    }
    public void Modifier_notes(ArrayList<Double> liste_des_notes){
        Scanner element =new Scanner(System.in);
        System.out.println("entrez le nombre de modifcation : ");
        int nombre=element.nextInt();
        int i=1;
        while(nombre>0){
            System.out.print("entrez la modification Numero "+(i)+"   ==>  ");
            System.out.print("entrez l'indice de l'element a modifier : ");
            int indice = element.nextByte();
            if(indice>=0 && indice<liste_des_notes.size()){
                for(int j = 0 ; j < liste_des_notes.size();j++){
                    System.out.print("\nentrez la nouvelle valeur  "+(liste_des_notes.get(j))+"   ==>  ");
                    double value = element.nextDouble();
                    liste_des_notes.set(j,value);
                }
            }
            i++;
            nombre--;
        }
    }
    public void  definir_formateur(){
        Scanner sc=new Scanner(System.in);
        System.out.println("entrez l'identifiant : ");
        int id=sc.nextInt();
        System.out.println("entrez le prenom : ");
        String prenom=sc.next();
        System.out.println("entrez le nom : ");
        String nom=sc.next();
        System.out.println("entrez l'email : ");
        String email=sc.next();
        System.out.println("entrez specilite : ");
        String specialite=sc.next();
        System.out.println("entrez salaire : ");
        double salaire=sc.nextDouble();
        new Formateur(id,nom,prenom,email,specialite,salaire);
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Formateur getFormateur() {
        return formateur;
    }

    public void setFormateur(Formateur formateur) {
        this.formateur = formateur;
    }

    public ArrayList<Apprenant> getListe_des_apprenant() {
        return Liste_des_apprenant;
    }

    public void setListe_des_apprenant(ArrayList<Apprenant> liste_des_apprenant) {
        Liste_des_apprenant = liste_des_apprenant;
    }
}
