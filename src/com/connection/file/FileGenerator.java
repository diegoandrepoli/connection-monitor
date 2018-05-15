package com.connection.file;

import com.connection.file.json.FileJsonHandler;
import com.connection.file.writer.FileWriterHandler;
import com.connection.model.ConnectionModel;
import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;

/**
 * File Generator class
 * @author Diego Andre Poli <diegoandrepoli@gmail.com>
 */
public class FileGenerator {
    
    /**
     * Get file
     * @param name of file
     * @return file object
     * @throws IOException 
     */
    private File getFile(String name) throws IOException{
        String file = FileNameHandler.generateName(name);
        return (new FileHandler(file)).getFile();
    }
    
    /**
     * Write content file
     * @param file name
     * @param file content as string
     */
    private void write(String fileName, String content){               
        try {            
            (new FileWriterHandler(getFile(fileName))).create(content);                
        } catch (IOException e) {
            Logger.getLogger(e.getMessage());
        }
    }
    
    /**
     * Create file and write content
     * @param model
     */
    public void create(ConnectionModel model){
        String result = FileJsonHandler.getForConnectionModelString(model);
        write(model.getName(), result);
    }
    
}
