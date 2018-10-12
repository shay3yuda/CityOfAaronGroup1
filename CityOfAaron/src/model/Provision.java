/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
/**
 *
 * @author Brenda
 */
public class Provision extends InventoryItem implements Serializable{
    private String name;
    private Boolean perishable;
    
    public Provision() {
        //empty default constructor for JavaBeans
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Boolean getPerishable() {
        return perishable;
    }
    
    public void setPerishable(Boolean perishable) {
        this.perishable = perishable;
    }

    @Override
    public String toString() {
        return "Provision {" 
                + " name = " + name 
                + ", perishable = " + perishable 
                + " }";
    }
    
}
