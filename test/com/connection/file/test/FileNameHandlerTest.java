package com.connection.file.test;

import com.connection.file.FileNameHandler;
import junit.framework.TestCase;

/**
 * File name handler test case
 * @author Diego Andre Poli <diegoandrepoli@gmail.com>
 */
public class FileNameHandlerTest extends TestCase {
    
    /**
     * Test file name generator
     */
    public void testFileNameGenerator(){
        String name = FileNameHandler.generateName("name with file");
        assertEquals(name, "name_with_file.json");
    }
    
}
