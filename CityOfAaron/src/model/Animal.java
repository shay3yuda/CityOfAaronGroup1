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
public class Animal extends InventoryItem implements Serializable {
    private int age;
        
    public Animal() {
     //empty default constructor for JavaBeans  
    }  
    
    public Animal(ItemType itemType, int quantity, Condition condition, String name, int age){
        setItemType(itemType);
        setQuantity(quantity);
        setCondition(condition);
        setName(name);
        setAge(age);
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Animal {%s, age=%s}", 
                super.toString(), age);
    }
    
//        public static Animal[] createAnimals() { StorhouseControl
//
//        
//        Animal[] animals = new Animal[5];
//        
//        animals[0] = new Animal(ItemType.ANIMAL, 50, Condition.GOOD, "Horses", 5);
//        animals[1] = new Animal(ItemType.ANIMAL, 100, Condition.GOOD, "Dogs", 3);
//        animals[2] = new Animal(ItemType.ANIMAL, 150, Condition.GOOD, "Cats", 4);
//        animals[3] = new Animal(ItemType.ANIMAL, 85, Condition.GOOD, "llamas", 2);
//        animals[4] = new Animal(ItemType.ANIMAL, 1, Condition.FAIR, "Unicorn", 3000); 
//        
//        return animals;
//    }
    
//}private void animalsInStorehouse() { ReportsMenu
//        System.out.println("The Animlas in this game are:");
//
//        
//        Game game = CityOfAaron.getCurrentGame();
//        Storehouse storehouse = game.getTheStorehouse();
//        Animal[] animals = storehouse.getAnimals();
//        
//        if (animals == null) {
//            System.out.println("There are no animals in the Storehouse.");
//        } else {
//            String animalName;
//            int animalCount;
//            int animalAge;
//            for (Animal animal : animals) {
//                animalName = animal.getName();
//                animalCount = animal.getQuantity();
//                animalAge = animal.getAge();
//                System.out.println(animalCount + " " + animalName + ": " + animalAge + "-years-old");
//            }
//            int maxValue = animals[0].getAge();
//            String name;
//            for (int i=0; i< animals.length; i++) {
//               if (animals[i].getAge()> maxValue) {
//                   maxValue = animals[i].getAge();
//                   name = animals[i].getName();
//                   
//                   System.out.println("\nYour " + name + " is the oldest animal\n"
//                                    + "you have, at " + maxValue + "-years old.\n"
//                                    + "Concider aquiring a new one\n");
//               } 
//            }  
//        }
//        saveReport();
//    }

//Animal[] animals = StorehouseControl.createAnimals(); GameControl
//        storehouse.setAnimals(animals);