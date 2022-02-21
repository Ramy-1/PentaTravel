package modeles;

public class Agence {
    private int id;	
    private int id_prop;
    private String nom;
    private int numero;
    private int nb_etoile;
    private String address;	


    public Agence() {
    }

    public Agence(int id) {
        this.id = id;
    }


    public Agence( int id_prop, String nom, int numero, int nb_etoile, String address) {
        this.id_prop = id_prop;
        this.nom = nom;
        this.numero = numero;
        this.nb_etoile = nb_etoile;
        this.address = address;
    }
    public Agence(int id, int id_prop, String nom, int numero, int nb_etoile, String address) {
        this.id = id;
        this.id_prop = id_prop;
        this.nom = nom;
        this.numero = numero;
        this.nb_etoile = nb_etoile;
        this.address = address;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", id_prop='" + getId_prop() + "'" +
            ", nom='" + getNom() + "'" +
            ", numero='" + getNumero() + "'" +
            ", nb_etoile='" + getNb_etoile() + "'" +
            ", address='" + getAddress() + "'" +
            "}";
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_prop() {
        return this.id_prop;
    }

    public void setId_prop(int id_prop) {
        this.id_prop = id_prop;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNb_etoile() {
        return this.nb_etoile;
    }

    public void setNb_etoile(int nb_etoile) {
        this.nb_etoile = nb_etoile;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
