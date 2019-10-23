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
public class oishilaBean {
    private String id;
    private String name;
    private String roll;
    private String CS402;
    private String CS412;
    
    public oishilaBean(String id, String name,String roll,String CS402,String CS412){
        this.id = id;
        this.name = name;
        this.roll = roll;
        this.CS402 = CS402;
        this.CS412 = CS412;
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

    public String getCS402() {
        return CS402;
    }

    public void setCS402(String CS402) {
        this.CS402 = CS402;
    }

    public String getCS412() {
        return CS412;
    }

    public void setCS412(String CS412) {
        this.CS412 = CS412;
    }


    
}
