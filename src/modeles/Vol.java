package modeles;

import java.sql.Date;

public class Vol {
    private int id;
    private int id_user;
    private String company;
    private String depart;
    private String destination;
    private Date date;
    private int prix;

    public Vol() {
    }

    public Vol(int id) {
        this.id = id;
    }

    public Vol(int id_user, String company, String depart, String destination, Date date, int prix) {
        this.id_user = id_user;
        this.company = company;
        this.depart = depart;
        this.destination = destination;
        this.date = date;
        this.prix = prix;
    }

    public Vol(int id, int id_user, String company, String depart, String destination, Date date, int prix) {
        this.id = id;
        this.id_user = id_user;
        this.company = company;
        this.depart = depart;
        this.destination = destination;
        this.date = date;
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", id_user='" + getId_user() + "'" +
            ", company='" + getCompany() + "'" +
            ", depart='" + getDepart() + "'" +
            ", destination='" + getDestination() + "'" +
            ", date='" + getDate() + "'" +
            ", prix='" + getPrix() + "'" +
            "}";
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_user() {
        return this.id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getCompany() {
        return this.company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDepart() {
        return this.depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public String getDestination() {
        return this.destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getPrix() {
        return this.prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

}
