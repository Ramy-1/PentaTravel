/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.sql.Date;
import java.time.LocalDate;

import modeles.Chambre;
import modeles.Hotel;
import modeles.Reservation;
import modeles.Type;
import services.ServiceChambre;
import services.ServiceHotel;
import services.ServiceReservation;

/**
 *
 * @author Faty
 */
public class NewMain {
  public static void main(String[] args) {
    Menu menu = new Menu();
    ServiceHotel sH = new ServiceHotel();
    ServiceReservation sR = new ServiceReservation();
    ServiceChambre sC = new ServiceChambre();

   // Hotel h = new Hotel(001, "Hotel", "hammamet", Type.Hotel, 4, 20888999, 500);
   //  Hotel h2 = new Hotel(3,2,"nour","abid",Type.Hotel,4,20888999,500000);

     //sH.add(h);

    // Chambre c = new Chambre(6, 50, 120, "image", "vue sur mer", true);
     //Chambre c2 = new Chambre(6, 51, 120, "image", "chambre a deux", true);

     //Hotel hh= new Hotel();
    // hh.add();
    // sH.add(hh);

    //**facturation */
    // menu.reservee();

    //**tri */
    //System.out.println(sH.getAll());
    //System.out.println(sH.Tri());
    //**recherche */
    System.out.println(sH.Chercher("aziza"));
// controle de saisie 
    // System.out.println(sR.getAll());

  }

}
