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
public class ExceptionManager {
    
    public void determinateEmptyField(String word, String key) throws Exception {      
        String[] data = word.split(":");
        if(data[0].startsWith(key) && data[1].equals(" ")) {
            throw new Exception("Campo Vacio"); 
        } 
    }
    
    public void determinateValidCode(String word) throws Exception{
        int code = Integer.valueOf(word);
        if(code >= 1 && code <= 5 ) {
            System.out.println("thumbs up");
        } else {
            throw new Exception("Codigo Invalido");
        }
    }
}
