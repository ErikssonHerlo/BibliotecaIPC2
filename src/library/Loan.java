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
public class Loan implements Serializable {
    private String bookCode;
    private String studentId;
    private LocalDate loanDate;
    private static final String DATE_PATTERN = "yyyy-MM-dd"; //Pattern para fecha.

    public Loan(String bookCode, String studentId, String loanDate) {
        this.bookCode = bookCode;
        this.studentId = studentId;
        this.loanDate = validateDate(loanDate);
    }
    
    public LocalDate validateDate(String date) throws DateTimeParseException {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern(DATE_PATTERN);
        LocalDate parsedDate = LocalDate.parse(date, formato);
        return parsedDate;
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public LocalDate getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(LocalDate loanDate) {
        this.loanDate = loanDate;
    }
    
}
