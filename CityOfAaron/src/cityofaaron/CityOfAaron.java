package cityofaaron;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import model.Game;
import model.Player;
import model.Storehouse;
import model.Map;
import model.InventoryItem;
import model.ItemType;
import model.Condition;
import model.Animal;
import model.Provision;
import model.Location;
import model.Point;
import model.Author;
import view.StartProgramView;
       

public class CityOfAaron {

    //keep a copy of the current game Object in the main class   
    public static Game currentGame = null;
    
    public static Game getCurrentGame() {
        return currentGame;
}
    
    public static void setCurrentGame(Game game) {
        currentGame = game;
    } 

    public static void main(String[] args) {
           
    StartProgramView startProgramView = new StartProgramView();
    startProgramView.displayView();
    
    
    }  

}
