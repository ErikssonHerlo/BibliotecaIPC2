/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 *
 * @author zofia
 */
public class Student implements Serializable {
    private String id;
    private String name;
    private int careerCode;
    private LocalDate bornDate;
    private static final String DATE_PATTERN = "yyyy/MM/dd"; //Pattern para fecha.

    public Student(String id, String name, int careerCode) {
        this.id = id;
        this.name = name;
        this.careerCode = careerCode;
    }

    public Student(String id, String name, int careerCode, String bornDate) {
        this.id = id;
        this.name = name;
        this.careerCode = careerCode;
        this.bornDate = validateDate(bornDate);
    }
        
    public LocalDate validateDate(String date) throws DateTimeParseException {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern(DATE_PATTERN);
        LocalDate parsedDate = LocalDate.parse(date, formato);
        return parsedDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCareerCode() {
        return careerCode;
    }

    public void setCareerCode(int careerCode) {
        this.careerCode = careerCode;
    }

    public LocalDate getBornDate() {
        return bornDate;
    }

    public void setBornDate(LocalDate bornDate) {
        this.bornDate = bornDate;
    }    
}
