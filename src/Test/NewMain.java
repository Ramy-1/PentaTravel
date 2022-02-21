/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.sql.Date;

import modeles.Agence;
import modeles.Vol;
import services.ServiceAgence;
import services.ServiceVol;


public class NewMain {
    public static void main(String[] args) {
        ServiceAgence sA = new ServiceAgence();
        ServiceVol sV = new ServiceVol();
      
        Date d = new Date(120,2,8);
        Vol v = new Vol(1,001,"tttt","aaaa","PRS",d,850);

        sV.update(v); 
        //sV.add(v);
       // System.out.println(sV.getAll());
        
        Agence a = new Agence(1 , 001,"hana",27000123,5,"tunis");
                    
        //sA.add(a);
        //System.out.println(sA.getAll());
       // sA.update(a) ; 



    }

}
