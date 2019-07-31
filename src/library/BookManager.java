/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zofia
 */
public class BookManager {
    private String title = null;
    private String autor = null;
    private String bookCode = null;
    private int bookQuantity = -1;
    private Book book;
    private List<Book> data = new ArrayList<>();
    
    public Book findBookData(String line, int flag) {
        String data[] = line.split(":");
        System.out.println("datos 0 " + data[0]);
        if(data[0].startsWith("TITULO")) {
            this.title = data[1];
        } else if(data[0].startsWith("AUTOR")) {
            this.autor = data[1];
        } else if(data[0].startsWith("CODIGO")) {
            this.bookCode = data[1];
        } else if(data[0].startsWith("CANTIDAD")) {
            this.bookQuantity = Integer.valueOf(data[1]);
        }
        System.out.println("datos 2 "+data[1]);
        return fillBookData(flag);
    }
    
    public Book fillBookData(int flag) {
        if(this.title != null && this.autor != null && this.bookCode != null && this.bookQuantity > -1) {
            this.book = new Book(title, autor, bookCode, bookQuantity);
            restartData(flag);
        }
        
        return this.book;
    }
    
    public void restartData(int flag) {
        this.title = null;
        this.autor = null;
        this.bookCode = null;
        this.bookQuantity = 0;
        flag = 0;
    }
    public void writeNewBook(String path) {
        
    }
}
