package com.connection.file;

import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;

/**
 * File handler
 * @author Diego Andre Poli <diegoandrepoli@gmail.com>
 */
public class FileHandler {

    /**
     * File manipulate
     */
    File file;

    /**
     * File handler custom constructor
     * @param file name 
     */
    public FileHandler(String name){
        initialize(name);
        create();
    }
    
    /**
     * Initialize file handler
     * @param file name 
     */
    private void initialize(String name){
        file = new File(name);
    }
    
    /**
     * Create file
     */
    private void create(){
        try {
            file.createNewFile();
        } catch (IOException e) {
            Logger.getLogger(e.getMessage());
        }
    }
    
    /**
     * Get file
     * @return file created
     */
    public File getFile(){
        return this.file;
    }
}
