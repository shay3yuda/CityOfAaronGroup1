
package control;

import model.InventoryItem;
import model.ItemType;
import model.Condition;
import model.Storehouse;
import cityofaaron.CityOfAaron;
import model.Game;
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
    
    
    
}
