package modeles;

import java.sql.Date;

public class Vol_command {
    private int id;
    private int id_user;
    private int id_agance;
    private int id_vol;
    private int prix;
    
    public Vol_command() {
    }

    public Vol_command(int id) {
        this.id = id;
    }

    public Vol_command(int id, int id_user, int id_agance, int id_vol) {
        this.id = id;
        this.id_user = id_user;
        this.id_agance = id_agance;
        this.id_vol = id_vol;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", id_user='" + getId_user() + "'" +
            ", id_agance='" + getId_agance() + "'" +
            ", id_vol='" + getId_vol() + "'" +
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

    public int getId_agance() {
        return this.id_agance;
    }

    public void setId_agance(int id_agance) {
        this.id_agance = id_agance;
    }

    public int getId_vol() {
        return this.id_vol;
    }

    public void setId_vol(int id_vol) {
        this.id_vol = id_vol;
    }
    
}
