/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.connection.model;

/**
 * Connection model object
 * @author Diego Andre Poli <diegoandrepoli@gmail.com>
 */
public class ConnectionModel {
    
    /**
     * Connection name
     */
    private String name;
    
    /**
     * Connection URL
     */
    private String url;
    
    /**
     * Connection username
     */
    private String username;
    
    /**
     * Connection password
     */
    private String password;

    /**
     * Get name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Set name
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get URL
     * @return url 
     */
    public String getUrl() {
        return url;
    }

    /**
     * Set URL
     * @param url 
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Get username
     * @return 
     */
    public String getUsername() {
        return username;
    }

    /**
     * Set username
     * @param username 
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Get password
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Set password
     * @param password 
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
