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
     

    
        Game theGame = new Game();
        theGame.setThePlayer(new Player());
        theGame.setTheMap(new Map());
        theGame.setTheStorehouse(new Storehouse());
        theGame.setCurrentPopulation(205);
        theGame.setAcresOwned(2000);
        theGame.setWheatInStorage(15000);    
    
        InventoryItem inventoryItem = new InventoryItem();
        inventoryItem.setItemType(ItemType.ANIMAL);
        inventoryItem.setQuantity(7);
        inventoryItem.setCondition(Condition.GOOD);

        Animal animal = new Animal();
        animal.setName("Buddy");
        animal.setAge(15);
        
        Provision provision = new Provision();
        provision.setName("bread");
        provision.setPerishable(true);
        
        Point point = new Point();
        Point pointCurrent;
        point.setRow(3);
        point.setColumn(3);
        
        Map theMap = new Map();
        theMap.setCurrentLocation(point);
        Location[][] locations = theMap.getLocations();
        pointCurrent = theMap.getCurrentLocation();
        //locations[pointCurrent.getRow()][pointCurrent.getColumn()].getMapSymbol();
        
        Location newLocation = new Location();
        newLocation.setName("Temple");
        newLocation.setDescription("This is center of life in the City of Aaron");
        newLocation.setMapSymbol("T");
        newLocation.setGameTips(new String[] {
            "Tip 1", "Tip 2", "Tip 3"
        });
        
        locations[pointCurrent.getRow()][pointCurrent.getColumn()] = newLocation;
                
        //  0  1  2  3  4
        //0
        //1
        //2
        //3          X
        //4
        //   X = newLocation variable, set on line 68
        
        Player player = new Player();
        player.setName("Bob");
        
        Author author = new Author();
        author.setName("Jane");
        author.setTitle("Builder");
        
        Storehouse storehouse = new Storehouse();
        storehouse.setAuthors(new Author[] {author});
        storehouse.setAnimals(new Animal[] {animal});
        storehouse.setTools(new InventoryItem[] {inventoryItem});
        storehouse.setProvisions(new Provision[] {provision});
       
        System.out.println(theGame.toString());
        System.out.println(inventoryItem.toString());
        System.out.println(animal.toString());
        System.out.println(provision.toString());
        System.out.println(point.toString());
        System.out.println(theMap.toString());
        System.out.println(Condition.GOOD);
        System.out.println(newLocation.toString());
        System.out.println(ItemType.ANIMAL);
        System.out.println(player.toString());
        System.out.println(author.toString());
        System.out.println(storehouse.toString());
        
    }  

}
