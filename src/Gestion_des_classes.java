import java.util.ArrayList;

public class Gestion_des_classes {
    ArrayList<Classe> lise_des_classes;
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
