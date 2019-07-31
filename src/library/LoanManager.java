/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

/**
 *
 * @author zofia
 */
public class LoanManager {
    ExceptionManager exceptions = new ExceptionManager();
    String bookCode = null;
    String studentId = null;
    String date = null;
    Loan loan;
    
    public Loan findLoanData(String line, int flag) throws Exception{
        String[] data = line.split(":");
        if(data[0].startsWith("CODIGOLIBRO")) {
            exceptions.determinateEmptyField(line, "CODIGOLIBRO");
            bookCode = data[1];
        } else if(data[0].startsWith("CARNET")) {
            exceptions.determinateEmptyField(line, "CARNET");
            studentId = data[1];
        } else if(data[0].startsWith("FECHA")) {
            date = data[1];
        }
        return fillStudentData(flag);
    }
    
    public Loan fillStudentData(int flag) {
        if(this.studentId != null && this.bookCode != null && this.date != null) {
            loan = new Loan(bookCode, studentId, date);
            restartData(flag);
        }
        return this.loan;
    }
    
    public void restartData(int flag) {
        studentId = null;
        bookCode = null;
        date = null;
        flag = 0;
    }
}
