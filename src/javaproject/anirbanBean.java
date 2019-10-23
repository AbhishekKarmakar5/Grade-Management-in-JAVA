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
public class anirbanBean {
    private String id;
    private String name;
    private String roll;
    private String MA401;
    private String CS413;
    
    public anirbanBean(String id, String name,String roll,String MA401,String CS413){
        this.id = id;
        this.name = name;
        this.roll = roll;
        this.MA401 = MA401;
        this.CS413 = CS413;
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
    public String getMA401() {
        return MA401;
    }

    /**
     * @param MA401 the MA401 to set
     */
    public void setMA401(String MA401) {
        this.MA401 = MA401;
    }

    /**
     * @return the CS413
     */
    public String getCS413() {
        return CS413;
    }

    /**
     * @param CS413 the CS413 to set
     */
    public void setCS413(String CS413) {
        this.CS413 = CS413;
    }
}
