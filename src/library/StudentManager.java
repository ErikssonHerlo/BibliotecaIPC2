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
public class StudentManager {
    private ExceptionManager exceptions = new ExceptionManager();
    private String studentId = null;
    private String name = null;
    private int careerCode = 0;
    private Student student;
    
    public void findStudentData(String line, int flag) throws Exception{
        String[] data = line.split(":");
        if(data[0].startsWith("CARNET")) {
            exceptions.determinateEmptyField(line, "CARNET");
            studentId = data[1];
        } else if(data[0].startsWith("NOMBRE")) {
            exceptions.determinateEmptyField(line, "NOMBRE");
            name = data[1];
        } else if(data[0].startsWith("CARRERA")) {
            exceptions.determinateValidCode(data[1]);
            careerCode = Integer.valueOf(data[1]);
        }
        fillStudentData(flag);
    }
    
    public void fillStudentData(int flag) {
        if(this.studentId != null && this.name != null && this.careerCode != 0) {
            student = new Student(studentId, name, careerCode);
            restartData(flag);
        }
    }
    
    public void restartData(int flag) {
        studentId = null;
        name = null;
        careerCode = 0;
        flag = 0;
    }
}
