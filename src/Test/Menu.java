package Test;

import java.sql.Date;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import modeles.Chambre;
import modeles.Hotel;
import modeles.Reservation;
import services.ServiceChambre;
import services.ServiceHotel;
import services.ServiceReservation;

public class Menu {
    Scanner in = new Scanner(System.in);
    ServiceHotel sH = new ServiceHotel();
    ServiceChambre sC = new ServiceChambre();
    ServiceReservation sR = new ServiceReservation();

    public void reservee() {
        List<Hotel> list_hotel = sH.getAll();
        list_hotel.forEach(h -> System.out.println(h));
        System.out.println("id= ");
        int id = Integer.valueOf(in.nextLine());

        Hotel h = (Hotel) sH.getById(id);
        h.setChambres();
        //**disponibilite */
        if (h.isDispo()) {
            h.getChambreDispo().forEach(c -> System.out.println(c));
            System.out.println("id_chambre= ");
            int id_chambre = Integer.valueOf(in.nextLine());
            Chambre c = (Chambre) sC.getById(id_chambre);
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MM yyyy");
            System.out.println("Date sous form 31 12 2000");
            System.out.println("entree= ");
            LocalDate entree = LocalDate.parse(in.nextLine(), dtf);
            System.out.println("Sortie= ");
            LocalDate sortie = LocalDate.parse(in.nextLine(), dtf);

            int id_user = 0;
            Period daysBetween = Period.between(entree, sortie);

            Reservation res = new Reservation(id_user, h.getId(), daysBetween.getDays() * c.getPrix(), entree, sortie,
                    c.getNumber(), c.getDescription());

            sR.add(res);
            c.reserve();
            sC.update(c);
        } else {
            System.out.println("Hotel complet");
        }

    }

}
