/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appendixb_page4;

import java.util.Scanner;

/**
 * @author vnaidu
 */
public class AppendixB_Page4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AutoMobile marcsCar = new AutoMobile();
        AutoMobile henrysCar = new AutoMobile();
        
        marcsCar.Make = "nissan";
        marcsCar.Mileage = 20000;
        marcsCar.Model = "Sentra";
        marcsCar.Year = 1994;
        
        henrysCar.Make = "nissan";
        henrysCar.Mileage = 180000;
        henrysCar.Model = "Versa";
        henrysCar.Year = 1990;
        
        henrysCar.increaseMileage(100);
        
        System.out.println(marcsCar);
        System.out.println(henrysCar);
        
        System.out.println(marcsCar.setMileage(1000));
        System.out.println(henrysCar.setMileage(2000));
        
        
    }
    
    
}

