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
import model.Author;

/**
 *
 * @author conta
 */
public class CityOfAaron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Game theGame = new Game();
        theGame.setThePlayer(new Player());
        theGame.setTheMap(new Map());
        theGame.setTheStorehouse(new Storehouse());
        theGame.setCurrentPopulation(205);
        theGame.setAcresOwned(2000);
        theGame.setWheatInStorage(15000);
     
        InventoryItem inventoryItem = new InventoryItem();
        inventoryItem.setItemType(new ItemType());
        inventoryItem.setQuantity(7);
        inventoryItem.setCondition(Condition.GOOD);
        
        Animal animal = new Animal();
        animal.setName("Buddy");
        animal.setAge(15);
        
        Provision provision = new Provision();
        provision.setName("bread");
        provision.setPerishable(true);
       
        Player player = new Player();
        player.setName("Bob");
        
        Author author = new Author();
        author.setName("Jane");
        author.setTitle("Builder");
        
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
        
        
        
        Storehouse storehouse = new Storehouse();
        storehouse.setAuthors(new Author[] {author});
       
        System.out.println(theGame.toString());
        System.out.println(inventoryItem.toString());
        System.out.println(animal.toString());
        System.out.println(provision.toString());
        System.out.println(player.toString());
        System.out.println(author.toString());
        System.out.println(storehouse.toString());
      
    }
    
}
