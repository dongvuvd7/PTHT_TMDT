/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Book;

import java.util.List;

/**
 *
 * @author iWinter VD7
 */
public interface BookDAO {
    public List<Book> getAllBook();
    public Book getBook(String id);
    public void updateBook(Book book);
    public void deleteBook(Book book);
    public void addBook(Book book);
}
