
package control;

import model.InventoryItem;
import model.ItemType;
import model.Condition;
import model.Storehouse;
import cityofaaron.CityOfAaron;
import model.Author;
import model.Animal;
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
    
}
