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
public class tamalBean {
    
    private String id;
    private String name;
    private String roll;
    private String EC402;    
    
    public tamalBean(String id, String name,String roll,String EC402){
        this.id = id;
        this.name = name;
        this.roll = roll;
        this.EC402 = EC402;        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public String getEC402() {
        return EC402;
    }

    public void setEC402(String EC402) {
        this.EC402 = EC402;
    }
    
}
