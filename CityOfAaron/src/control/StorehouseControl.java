
package control;

import model.InventoryItem;
import model.ItemType;
import model.Condition;
import model.Storehouse;
import cityofaaron.CityOfAaron;
import model.Author;
import model.Animal;
import model.Provision;

/**
 *
 * @author Brenda
 */
public class StorehouseControl {
    
    public StorehouseControl() {
        //empty constructor
    }
    
    public static InventoryItem[] createTools() {
        InventoryItem[] tools = new InventoryItem[5];
        
        tools[0] = new InventoryItem(ItemType.TOOLS, 225, Condition.GOOD, "shovels");
        tools[1] = new InventoryItem(ItemType.TOOLS, 213, Condition.GOOD, "hoes");
        tools[2] = new InventoryItem(ItemType.TOOLS, 300, Condition.GOOD, "axes");
        tools[3] = new InventoryItem(ItemType.TOOLS, 283, Condition.GOOD, "saws");
        tools[4] = new InventoryItem(ItemType.TOOLS, 411, Condition.GOOD, "hammers");      
       
        return tools;
    }
    
    public static Animal[] createAnimals() {

        
        Animal[] animals = new Animal[5];
        
        animals[0] = new Animal(ItemType.ANIMAL, 50, Condition.GOOD, "Horses", 5);
        animals[1] = new Animal(ItemType.ANIMAL, 100, Condition.GOOD, "Dogs", 3);
        animals[2] = new Animal(ItemType.ANIMAL, 150, Condition.GOOD, "Cats", 4);
        animals[3] = new Animal(ItemType.ANIMAL, 85, Condition.GOOD, "llamas", 2);
        animals[4] = new Animal(ItemType.ANIMAL, 1, Condition.FAIR, "Unicorn", 3000); 
        
        return animals;
    }
    
    public static Provision[] createProvisions() {
       
        Provision[] provisions = new Provision[6];
        provisions[0] = new Provision(ItemType.PROVISIONS, 9, Condition.GOOD, "Food", true);
        provisions[1] = new Provision(ItemType.PROVISIONS, 1, Condition.FAIR, "Water Bottle", false);
        provisions[2] = new Provision(ItemType.PROVISIONS, 3, Condition.FAIR, "Blanket", false);
        provisions[3] = new Provision(ItemType.PROVISIONS, 8, Condition.POOR, "Clothing", false);
        provisions[4] = new Provision(ItemType.PROVISIONS, 4, Condition.GOOD, "Tent", false);
        provisions[5] = new Provision(ItemType.PROVISIONS, 5, Condition.GOOD, "Soap", false);
        
        return provisions;
    }
}
