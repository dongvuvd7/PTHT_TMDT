/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Book;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author iWinter VD7
 */
public class BookDAOImpl implements BookDAO{
    
    //List thay the tam thoi cho database
    List<Book> books;

    public BookDAOImpl() {
        books = new ArrayList<Book>();
        Book book1 = new Book("Giao Trinh C/C++", "GT01", "Tran Dinh Que");
        Book book2 = new Book("Tham tu Conan tap 21", "TT01", "Agostso");
        books.add(book1);
        books.add(book2);
    }
    
    

    @Override
    public List<Book> getAllBook() {
        return books;
    }

    @Override
    public Book getBook(String id) {
        for(Book i : books) {
            if(i.getId().equals(id)) {
                System.out.println(i.toString());
                return i;
            }
        }
        return null;
    }

    @Override
    public void updateBook(Book book) {
        for(Book i:books) {
            if(i.getId().equals(book.getId())){
                i.setName(book.getName());
                i.setAuthor(book.getAuthor());
            }
        }
        System.out.println("Book with id = " + book.getId() + " updated in database"); 
        
    }

    @Override
    public void deleteBook(Book book) {
        for(Book i:books) {
            if(i.getId().equals(book.getId())){
                books.remove(i);
            }
        }
        System.out.println("Book with id = " + book.getId() + " removed in database"); 
    }

    @Override
    public void addBook(Book book) {
        books.add(book);
    }
    
}
