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
public class DAOPatternDemo {
    public static void main(String[] args) {
        BookDAO bookDAO = new BookDAOImpl();
        
        //get all
        for(Book i : bookDAO.getAllBook()) {
            System.out.println(i.toString());
        }
        
        //get a
        bookDAO.getBook("TT01").toString();
        
        //update
        Book b = bookDAO.getBook("TT01");
        b.setName("Tham tu lung danh Conan");
        System.out.println(b.toString());
        bookDAO.updateBook(b);
        
    }
}
