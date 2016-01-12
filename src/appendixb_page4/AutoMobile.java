/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appendixb_page4;

/**
 *
 * @author vnaidu
 */
public class AutoMobile{
        public AutoMobile(){
            autoCount = autoCount + 1;
        }
        
        public AutoMobile(String make, String model){
            Make = make;
            Model = model;
            
        }
    
        // data
        String Make;
        String Model;
        int Year;
        int Mileage;
        static int autoCount = 0;
        
        //actions / methods
        public void increaseMileage(int mileage){
            Mileage = Mileage + mileage;
        }
        
        public void setMake(String make){
            Make = make;
        }
        
        public String getMake(){
            return  "**"+ Make + "**";
        }
        
        public String toString(){
            String returnData =  "Make: " + Make + " Model:" + Model + " Mileage:" + Mileage;
            return returnData;
        }
        
        public AutoMobile setMileage(int mileage){
            Mileage = mileage;
            return this;
        }
        
        
    }
