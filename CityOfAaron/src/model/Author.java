/*
 * Author class
 */
package model;

import java.io.Serializable;

/**
 *
 * @author estherhsia
 */
public class Author implements Serializable {
    
    private String name;
    private String title;
    
    public Author() {
        //empty constructor for JavaBeans
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
     public String getTitle() {
         return title;
     }
     
     public void setTitle(String title) {
         this.title = title;
     }
     
     @Override
     public String toString() {
         return "Author {"
                 + " name = " + name
                 + ", title = " + title
                 + " }";
     }
}
