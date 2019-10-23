/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

/**
 *
 * @author hp
 */
public class bhaskarBean {
    
    private String id;
    private String name;
    private String roll;
    private String CS401;
    private String CS411;
    
    public bhaskarBean(String id, String name,String roll,String CS401,String CS411){
        this.id = id;
        this.name = name;
        this.roll = roll;
        this.CS401 = CS401;
        this.CS411 = CS411;
    }


    

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the roll
     */
    public String getRoll() {
        return roll;
    }

    /**
     * @param roll the roll to set
     */
    public void setRoll(String roll) {
        this.roll = roll;
    }

    /**
     * @return the MA401
     */
    public String getCS401() {
        return CS401;
    }

    /**
     * @param MA401 the MA401 to set
     */
    public void setCS401(String CS401) {
        this.CS401 = CS401;
    }

    /**
     * @return the CS413
     */
    public String getCS411() {
        return CS411;
    }

    /**
     * @param CS413 the CS413 to set
     */
    public void setCS413(String CS411) {
        this.CS411 = CS411;
    }
    
}
