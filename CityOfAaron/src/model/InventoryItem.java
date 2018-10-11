/*
 * InventoryItem class
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Brenda
 */
public class InventoryItem implements Serializable{
    private ItemType itemType;
    private int quantity;
    private Condition condition;
    
    public InventoryItem() {
     //empty constructor for JavaBeans  
    }
    
    public ItemType getItemType() {
        return itemType;
    }
    
    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public Condition getCondition() {
        return condition;
    }
    
    public void setCondition(Condition condition) {
        this.condition = condition;
    }
    
    @Override
    public String toString() {
        return "InventoryItem {"
            + " itemType = " + itemType
            + ", quantity = " + quantity 
            + ", condition = " + condition
            + " }";        
    }
    
}

