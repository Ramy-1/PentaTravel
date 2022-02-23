package modeles;

import java.sql.Date;
import java.util.ArrayList;

public class Vol {
    private int id;
    private int id_agence;
    private int capacity;
    private int prix;
    private String company;
    private String depart;
    private String destination;
    private Date date;
    ArrayList<Vol_command> list_commands = new ArrayList<Vol_command>();

    public Vol() {
    }

    public Vol(int id) {
        this.id = id;
    }

    public Vol(int id_agence,int capacity, String company, String depart, String destination, Date date,
            ArrayList<Vol_command> list_commands) {
        this.id_agence = id_agence;
        this.capacity = capacity;
        this.company = company;
        this.depart = depart;
        this.destination = destination;
        this.date = date;
        this.list_commands = list_commands;
    }

    public Vol(int id, int capacity,int id_agence, String company, String depart, String destination, Date date,
            ArrayList<Vol_command> list_commands) {
        this.id = id;
        this.id_agence = id_agence;
        this.capacity = capacity;
        this.company = company;
        this.depart = depart;
        this.destination = destination;
        this.date = date;
        this.list_commands = list_commands;
    }

    public void addVol_command(Vol_command vc){
        list_commands.add(vc);
    }

    public int calculateReture(){
        return list_commands.size()*prix;
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", id_agence='" + getId_agence() + "'" +
                ", company='" + getCompany() + "'" +
                ", depart='" + getDepart() + "'" +
                ", destination='" + getDestination() + "'" +
                ", date='" + getDate() + "'" +
                ", list_commands='" + getlist_commands() + "'" +
                "}";
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_agence() {
        return this.id_agence;
    }

    public void setId_agence(int id_agence) {
        this.id_agence = id_agence;
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

    public ArrayList<Vol_command> getlist_commands() {
        return this.list_commands;
    }

    public void setlist_commands(ArrayList<Vol_command> list_commands) {
        this.list_commands = list_commands;
    }

}
