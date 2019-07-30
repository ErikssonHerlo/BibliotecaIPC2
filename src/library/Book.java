/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 *
 * @author zofia
 */
public class Book {
    private String title;
    private String autor;
    private String code;
    private String editorial;
    private int availableQuantity;
    private LocalDate publicationDate;
    private static final String DATE_PATTERN = "yyyy/MM/dd"; //Pattern para fecha.

    public Book(String title, String autor, String code, int availableQuantity) {
        this.title = title;
        this.autor = autor;
        this.code = code;
        this.availableQuantity = availableQuantity;
    }

    public Book(String title, String autor, String code, int availableQuantity, String date) {
        this.title = title;
        this.autor = autor;
        this.code = code;
        this.availableQuantity = availableQuantity;
        this.publicationDate = validateDate(date);
    }
    
    public LocalDate validateDate(String date) throws DateTimeParseException {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern(DATE_PATTERN);
        LocalDate parsedDate = LocalDate.parse(date, formato);
        return parsedDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }    
}
