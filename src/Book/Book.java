/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Book;

/**
 *
 * @author iWinter VD7
 */
public class Book {
    private String name;
    private String id;
    private String author;

    public Book(String name, String id, String author) {
        this.name = name;
        this.id = id;
        this.author = author;
    }

    public Book() {
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" + "name=" + name + ", id=" + id + ", author=" + author + '}';
    }
    
    
    
}
