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
public class daliaBean {
    private String id;
    private String name;
    private String roll;
    private String EC401;    
    
    public daliaBean(String id, String name,String roll,String EC401){
        this.id = id;
        this.name = name;
        this.roll = roll;
        this.EC401 = EC401;        
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
    public String getEC401() {
        return EC401;
    }

    /**
     * @param MA401 the MA401 to set
     */
    public void setEC401(String EC401) {
        this.EC401 = EC401;
    }
 
}
