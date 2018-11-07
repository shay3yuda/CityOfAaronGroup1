/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.Random;
import model.Game;

/**
 *
 * @author Brenda
 */
public class GameControl {
    
    private static Random randomGenerator = new Random();
    
    /**
     * Protected setter for tests to inject a mock random object.
     * @param random 
     */
    protected static void setRandomGenerator(Random random) {
        randomGenerator = random;
    }
    
    /**
     * Generates a random integer between min and max, inclusive
     * <ul>Requirements:
     * <li>min and max must be positive integers (return -1)</li>
     * <li>max must be greater than min (return -2)</li>
     * <li>max cannot be equal to the maximum value for integers (return -3)</li>
     * </ul>
     * @param min
     * @param max
     * @return The random number
     */
    public static int getRandomNumber(int min, int max) {
        //if min < 0 or max < 0 then return -1
        if (min < 0 || max < 0) {
            return -1;
        }
        
        //if max <= min then return -2
        if (max <= min) {
            return -2;
        }
        
        //if max is the maximum value for integers, then return -3
        if (max == Integer.MAX_VALUE) {
            return -3;
        }
        
        //calculate the size of the range; add one so Random() includes high value
        int range = (max - min) + 1;
        
        //return low + random(range size)
        return min + randomGenerator.nextInt(range);
  
    }
    
    public static String loadGameFromFile(String filename) {
        // place holder function.
       String name = filename;
        
       return name;
    }
    
    public static boolean gameShouldEnd(int mortalityRate) {
        //stub function that will be implemented fully later
        return false;
    }
    
    public static void saveGameToFile(Game game, String filename) {
         //stub function that will be implamented later
    }
    
    public static void saveReportToFile(String[] filename) {
        
    }
    
//    public static String createNewGame(String playerName) {
//        
//    }
    
}
