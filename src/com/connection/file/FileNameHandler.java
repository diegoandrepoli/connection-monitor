package com.connection.file;

/**
 * File name handler
 * @author Diego Andre Poli <diegoandrepoli@gmail.com>
 */
public class FileNameHandler {
    
    /**
     * Sequence name in 
     */
    private static final String SEQUENCE_IN = " ";
    
    /**
     * Sequence name out
     */
    private static final String SEQUENCE_OUT = "_";
    
    /**
     * File name format
     */
    private static final String NAME_FORMAT = "%s.json";
    
    /**
     * Replace name
     * @param name as string
     * @return name as string replaced
     */
    private static String replaceName(String name){
        return name.replace(SEQUENCE_IN, SEQUENCE_OUT);
    }
    
    /**
     * Generate file name
     * @param name as string
     * @return the final file name
     */
    public static String generateName(String name){
        return String.format(NAME_FORMAT, replaceName(name));
    }
}
