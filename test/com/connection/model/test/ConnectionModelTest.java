package com.connection.model.test;

import com.connection.model.ConnectionModel;
import junit.framework.TestCase;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Connection model test
 * @author Diego Andre Poli <diegoandrepoli@gmail.com>
 */
public class ConnectionModelTest extends TestCase {
    
    @Test
    public void testInsertAndGetData(){
        ConnectionModel model = new ConnectionModel();
        
        //set model data
        model.setName("My name");
        model.setUsername("myusername");
        model.setUrl("/myapplication");
        model.setPassword("d2r5z26f423d4");
        
        //test model data
        assertEquals(model.getName(), "My name");
        assertEquals(model.getUsername(), "myusername");
        assertEquals(model.getUrl(), "/myapplication");
        assertEquals(model.getPassword(), "d2r5z26f423d4");
        
    }
    
}
