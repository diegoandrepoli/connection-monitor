package com.connection.file.writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;

/**
 * File writer handler
 * @author Diego Andre Poli
 */
public class FileWriterHandler {
    
    /**
     * File writer
     */
    private FileWriter file;
    
    /**
     * Custom constructor
     * @param file to write
     */
    public FileWriterHandler(File ft){
        initialize(ft);   
    }
    
    /**
     * Initialize writer
     * @param file to writer
     */
    private void initialize(File ft){
        try {
            file = new FileWriter(ft);
        } catch (IOException e) {
            Logger.getLogger(e.getMessage());
        }
    }
    
    /**
     * Write file content
     * @param content file as string
     * @throws IOException 
     */
    private void write(String content) throws IOException{
        file.write(content);
    }
    
    /**
     * Flush file writer
     * @throws IOException 
     */
    private void flush() throws IOException{
        file.flush();
    }
    
    /**
     * Close file writer
     * @throws IOException 
     */
    private void close() throws IOException{
        file.close();
    }
    
    /**
     * Write a content and close file
     * @param content file as string
     */
    public void create(String content){
        try {               
            write(content);
            flush();  
            close();
        } catch (IOException e) {
            Logger.getLogger(e.getMessage());
        }
    }
}
