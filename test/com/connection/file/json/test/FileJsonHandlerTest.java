package com.connection.file.json.test;

import com.connection.file.json.FileJsonHandler;
import com.connection.model.ConnectionModel;
import junit.framework.TestCase;
import org.junit.Test;

/**
 *  Diego Andre Poli
 * @author <diegoandrepoli@gmail.com>
 */
public class FileJsonHandlerTest extends TestCase {
    
    @Test
    public void testGetForConnectionModel(){
        
        //Generate connection model
        ConnectionModel model = new ConnectionModel();
        model.setName("name");
        model.setUsername("username");
        model.setPassword("s932");
        model.setUrl("/erd");
        
        //get string json result
        String result = FileJsonHandler.getForConnectionModelString(model);
        
        //test compare case
        String input = "{\"name\":\"name\",\"username\":\"username\",\"password\":\"s932\",\"url\":\"/erd\"}";
        
        //test results
        assertEquals(result, input);
    }
    
}
