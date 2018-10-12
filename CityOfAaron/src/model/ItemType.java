/*
 * ItemType enum
 */
package model;

/**
 *
 * @author estherhsia
 */
public enum ItemType {
    
    ANIMAL, TOOLS, PROVISIONS;

    @Override
    public String toString() {
        return "ItemType {" 
                + " animals = " + ANIMAL
                + ", tools = " + TOOLS
                + ", provisions = " + PROVISIONS
                + "}";
    }
    
}
