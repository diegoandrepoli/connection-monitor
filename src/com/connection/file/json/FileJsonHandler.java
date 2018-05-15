package com.connection.file.json;

import com.connection.model.ConnectionModel;
import org.json.JSONObject;

/**
 * File json handler
 * @author Diego Andre Poli <diegoandrepoli@gmail.com>
 */
public class FileJsonHandler {
    
    /**
     * Get json for connection model
     * @param connection model object
     * @return connection model as json object
     */
    private static JSONObject getForConnectionModel(ConnectionModel model){
        return new JSONObject(model);
    }
    
    /**
     * Get connection model as string
     * @param conection model object
     * @return connection model as string
     */
    public static String getForConnectionModelString(ConnectionModel model){
        return getForConnectionModel(model).toString();
    }
}
