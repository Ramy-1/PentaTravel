/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.connexion3a2.tests;

import edu.connexion3a2.entities.Locations;
import edu.connexion3a2.entities.Transport;
import edu.connexion3a2.services.LocationsCRUD;
import edu.connexion3a2.services.TransportCRUD;
import edu.connexion3a2.utils.MyConnection;
import java.util.List;

/**
 *
 * @author karra
 */
public class MainClass {

    public static void main(String[] args) {
        //System.out.println("***********   Connection BDD   ***************");
        MyConnection mc = new MyConnection();
        MyConnection m1 = MyConnection.getInstance();
      //  System.out.println("***********   Gestion Locations   ***************");
        LocationsCRUD ad = new LocationsCRUD();
        Locations A1 = new Locations(1000, "18/60/2000", "nabeul", "3");
         ad.ajouterLocations(A1);
      //  List<Locations> listLocations = ad.affichageLocations();
      // for (Locations equ : listLocations) {
        //System.out.println(ad.affichageLocations());
       // };
        // ad.modifierLocations(new Locations(17,20.F,"20/12/1999","ariana","20min")); 
       // ad.supprimerLocations(19);
       // System.out.println("***********   Gestion Transports   ***************");
        TransportCRUD cl = new TransportCRUD();
       // Transport C1 = new Transport("Voiture", 12345678, 1);
       ad.calculPrixTot();
       //   cl.ajouterTransport(C1);
         //List<Transport> listTransport = cl.affichageTransport();
       // for (Transport cli : listTransport) {
          // System.out.println(cli.toString());
         //}
        // cl.modifierTransport(new Transport (11,"Voiture",12345679,1)); 
         //cl.supprimerTransport(13);
      //  cl.RechercheTransport(13);

    }
}
