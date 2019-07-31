/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import library.Book;

/**
 *
 * @author zofia
 */
public class OutputFilesManager {
    
    public void createDirectory(String path) {
        File file = new File(path);
        if(file.exists() && file.isDirectory()) {
        } else {
            file.mkdirs();
        }
    }
    
    public void createFiles(String directory, String path, String extension, Object object) {
        createDirectory(directory);
        File file = new File(directory + path + extension);
            try(FileOutputStream output = new FileOutputStream(file);
                ObjectOutputStream outputStream = new ObjectOutputStream(output);) {
                outputStream.writeObject(object); 
            } catch(IOException e) {
                System.out.println("Error: " + e.getMessage());
            } 
    }
}
