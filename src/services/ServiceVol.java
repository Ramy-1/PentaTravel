package services;

import java.util.List;

import modeles.Vol;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import utils.DataSource;

public class ServiceVol implements IService {

    Connection cnx = DataSource.getInstance().getCnx();

    public void add(Object u) {
        Vol v = (Vol) u;
        try {
            String req = "INSERT INTO `Vol`(`id_user`, `company`, `depart`, `destination`, `date`, `prix`) VALUES (?,?,?,?,?,?)";
            PreparedStatement ps = cnx.prepareStatement(req);
            ps.setInt(1, v.getId_user());
            ps.setString(2, v.getCompany());
            ps.setString(3, v.getDepart());
            ps.setString(4, v.getDestination());
            ps.setString(5, v.getDate().toString());
            ps.setInt(6, v.getPrix());

            ps.executeUpdate();
            System.out.println("Vol Ajoutée");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }

    }

    @Override
    public Object getById(int id) {
        Vol v = new Vol(id);
        try {
            String req = "SELECT * FROM `Vol` where id = " + id;
            // Statement st = cnx.createStatement();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery(req);

            while (rs.next()) {
                Vol hot = new Vol(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5),
                        rs.getDate(6), rs.getInt(7));
                v = hot;
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return v;
    }

    @Override
    public List getAll() {
        List<Vol> list = new ArrayList<>();
        try {
            String req = "SELECT * FROM `Vol`";
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery(req);
            while (rs.next()) {
                Vol u = new Vol(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5),
                        rs.getDate(6), rs.getInt(7));
                list.add(u);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return list;
    }

    @Override
    public boolean update(Object u) {
        Vol v = (Vol) u;
        System.out.println(u);
        String req = "update Vol set id_user = ? , company = ? , depart =? , destination = ? , date = ? , prix = ? where id = ? ";
        try {
            PreparedStatement ps = cnx.prepareStatement(req);
            ps.setInt(1, v.getId_user());
            ps.setString(2, v.getCompany());
            ps.setString(3, v.getDepart());
            ps.setString(4, v.getDestination());
            ps.setString(5, v.getDate().toString());
            ps.setInt(6, v.getPrix());
            ps.setInt(7, v.getId());

            ps.executeUpdate();
            System.out.println("Vol modifier");
            ps.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }

    @Override
    public boolean delete(Object u) {
        Vol v = (Vol) u;

        String req = "delete from Vol where id = ?";
        try {
            PreparedStatement ps = cnx.prepareStatement(req);
            ps.setInt(1, v.getId());
            ps.executeUpdate();
            System.out.println("Vol supprimer");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }
}
