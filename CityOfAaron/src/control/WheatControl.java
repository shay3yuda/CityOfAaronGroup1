/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

/**
 *
 * @author Brenda
 */
public class WheatControl {
    
    public static int calculateLossToRats(int tithesPercent, int wheatInStorage) {
        //Calculate the amount of wheat in storage lost to rats, based on
        //the percentage of tithing paid. Assume that GameControl.getRandomNumber(low,high)
        //is available to be called.
        
        //if wheatInStorage < 0 then return -1
        if (wheatInStorage < 0) {
            return -1;
        }
        
        //if tithingPercent < 0 OR tithingPercent > 100 then return -2
        if (tithesPercent < 0 || tithesPercent > 100) {
            return -2;
        }
        
        //chanceOfRats = GameControl.getRandomNumber(1,100)
        int chanceOfRats = GameControl.getRandomNumber(1,100);
        
        //if chanceOfRats >= 30 then return 0
        if (chanceOfRats >= 30) {
            return 0;
        }
        
      
        //if tithingPercent < 8 then low = 6, high = 10


        if (tithesPercent < 8) {
            double lossToRats = GameControl.getRandomNumber(6,10);
            double percentLost = lossToRats * 0.01;
            int bushelsLost = (int)(wheatInStorage * percentLost);
            return bushelsLost; 
        }
        
        
        //if tithingPercent >= 8 AND tithingPercent <= 12 then low = 3, high = 7
        //percentLost = getRandomNumber(low, high)*0.01 //turn into a fraction
        if (tithesPercent >= 8 && tithesPercent <= 12) {
            double lossToRats = GameControl.getRandomNumber(3,7);
            double percentLost = lossToRats * 0.01;
            int bushelsLost = (int)(wheatInStorage * percentLost);
            return bushelsLost; 
        }
        
        //if tithingPercent > 12 then low = 3, high = 5
        //percentLost = getRandomNumber(low, high)*0.01 //turn into a fraction
        if (tithesPercent > 12) {
            double lossToRats = GameControl.getRandomNumber(3,5);
            double percentLost = lossToRats * 0.01;
            int bushelsLost = (int)(wheatInStorage * percentLost);
            return bushelsLost; 
        }
       
        //percentLost = getRandomNumber(low, high)*0.01 //turn into a fraction
    //    percentLost = lossToRats * 0.01;
        
           //return wheatInStorage * percentLost //will need to be cast back to int
    //    int bushelsLost = wheatInStorage * percentLost;
        //return bushelsLost;
        return -100;
    }
    
}
