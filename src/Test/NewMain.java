/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.sql.Date;

import modeles.Agence;
import modeles.Vol;
import modeles.Vol_command;
import services.ServiceAgence;
import services.ServiceVol;
import services.ServiceVol_command;

public class NewMain {
    public static void main(String[] args) {
        ServiceAgence sA = new ServiceAgence();
        ServiceVol sV = new ServiceVol();
        ServiceVol_command sVc = new ServiceVol_command();

        // Vol_command v = new Vol_command(1,001,5,850);

        // sV.add(v);
        // System.out.println(sV.getAll());
        // Agence a = new Agence(001,"hana",27000123,5,"tunis");

        Agence a = new Agence();
        Vol v = new Vol();
        Vol_command vc = new Vol_command();

        // sA.add(a.add());
        // sV.add(v.add());

        sVc.add(vc.add());
    }

}
