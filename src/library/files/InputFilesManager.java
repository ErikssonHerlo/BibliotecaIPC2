/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.files;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import library.Book;
import library.BookManager;
import library.StudentManager;

/**
 *
 * @author zofia
 */
public class InputFilesManager {
    private int flag = 0;
    private String path;
    private String line;
    private List<String> data = new ArrayList<>();
    private FileReader reader = null;
    private BufferedReader buffer = null;
    private Book book;
    private BookManager bookManager = new BookManager();
    private StudentManager studentManager = new StudentManager();
    private OutputFilesManager outputFiles = new OutputFilesManager();
    private static final String BOOK = "LIBRO";
    private static final String STUDENT = "ESTUDIANTE";
    private static final String LOAN = "PRESTAMO";
    
    public String getPath(java.io.File path) {
        this.path = String.valueOf(path);
        System.out.println(this.path);
        return this.path;
    }
    
    public void readInputFile(String path) {    
        try {
            reader = new FileReader(new File(path));
            buffer = new BufferedReader(reader);
            while((line = buffer.readLine()) != null) {
                data.add(line);

                findData(data,line);

                data.clear(); 
            }   
        } catch(EOFException e) {
            JOptionPane.showInputDialog("La lectura no se ha finalizado en su totalidad debido a errores.");
        } catch(IOException e) {
            JOptionPane.showInputDialog("No se ha podido leer el archivo.");
    } finally {
                try {
                    buffer.close();
                } catch(IOException e) {
                    JOptionPane.showInputDialog("No se ha podido cerrar el canal.");
                }
        }
    }
    
    public void findWordKey(String line) {
        if(line.startsWith(BOOK)) {
            this.flag = 1;
        } else if (line.startsWith(STUDENT)) {
            this.flag = 2;
        } else if(line.startsWith(LOAN)) {
            this.flag = 3;
        } 
        System.out.println("algo " +line);
    }
    
    public void findData(List<String> data, String line) {
        findWordKey(line);
        try {
            switch(this.flag){
                case 1:
                    this.book = bookManager.findBookData(line, this.flag);
                    if(this.book.getCode() != null && this.book.getAvailableQuantity() > -1) {
                        outputFiles.createFiles("Book/", book.getCode(), ".book", this.book);
                    }
                break;
                case 2:
                    studentManager.findStudentData(line, this.flag);
                break;
                case 3:
                break;
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
       
    }
}
