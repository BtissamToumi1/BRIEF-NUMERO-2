public abstract class Personne {
      private static int compteurId=0;
      private int id;
      private String nom;
      private String prenom;
      private String email;
      private String telephone;

      public static int getCompteurId() {
            return compteurId;
      }

      public static void setCompteurId(int compteurId) {
            Personne.compteurId = compteurId;
      }

      public int getId() {
            return id;
      }

      public void setId(int id) {
            this.id = id;
      }

      public String getNom() {
            return nom;
      }

      public void setNom(String nom) {
            this.nom = nom;
      }

      public String getPrenom() {
            return prenom;
      }

      public void setPrenom(String prenom) {
            this.prenom = prenom;
      }

      public String getEmail() {
            return email;
      }

      public void setEmail(String email) {
            this.email = email;
      }

      public String getTelephone() {
            return telephone;
      }

      public void setTelephone(String telephone) {
            this.telephone = telephone;
      }
}
