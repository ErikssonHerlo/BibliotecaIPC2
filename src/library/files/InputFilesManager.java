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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author zofia
 */
public class InputFilesManager {
    private String path;
    private String line;
    private List<String> data = new ArrayList<>();
    private FileReader reader = null;
    private BufferedReader buffer = null;
    
    public String getPath(java.io.File path) {
        this.path = String.valueOf(path);
        System.out.println(this.path);
        return this.path;
    }
    
    public void readInputFile(String path, long time, JTextArea textAreaInput, JTextArea textAreaOutput) {
        Thread thread = new Thread() {
        @Override
        public void run() {
                try {
                    Thread.currentThread().sleep(time);
                    reader = new FileReader(new File(path));
                    buffer = new BufferedReader(reader);
                    while((line = buffer.readLine()) != null) {
                        data.add(line);
                        int i = 0;
                       
                        findData(data,line, time, textAreaOutput);
                        textAreaInput.insert(line + "\n", i);
                        
                        data.clear(); 
                        i++;
                }   
                } catch(EOFException e) {
                    JOptionPane.showInputDialog("La lectura no se ha finalizado en su totalidad debido a errores.");
                } catch(IOException e) {
                    JOptionPane.showInputDialog("No se ha podido leer el archivo.");
                } catch (InterruptedException ex) {
                Logger.getLogger(InputFilesManager.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                        try {
                            buffer.close();
                        } catch(IOException e) {
                            JOptionPane.showInputDialog("No se ha podido cerrar el canal.");
                        }
                }
        }
        };
        thread.start();
    }
    
    public void findData(List<String> data, String line, long time, JTextArea output) throws InterruptedException {
        String[] dataLines = line.split("\n");
        
        if (data.get(0).contains("LIBRO")) {
            Thread.currentThread().sleep(time);
            try {
                
            } catch (Exception e) {
            }
            
        }
    }
}
