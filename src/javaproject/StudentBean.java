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
public class StudentBean {
    private String id;
    private String name;
    private String roll;
    private String MA401;
    private String CS401;
    private String CS402;
    private String EC401;
    private String EC402;
    private String CS411;
    private String CS412;
    private String CS413;
    
    public StudentBean(String id, String name,String roll,String MA401,String CS401,String CS402,String EC401,String EC402,String CS411,String CS412,String CS413){
        this.id = id;
        this.name = name;
        this.roll = roll;
        this.MA401 = MA401;
        this.CS401 = CS401;
        this.CS402 = CS402;
        this.EC401 = EC401;
        this.EC402 = EC402;
        this.CS411 = CS411;
        this.CS412 = CS412;
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
     * @return the CS401
     */
    public String getCS401() {
        return CS401;
    }

    /**
     * @param CS401 the CS401 to set
     */
    public void setCS401(String CS401) {
        this.CS401 = CS401;
    }

    /**
     * @return the CS402
     */
    public String getCS402() {
        return CS402;
    }

    /**
     * @param CS402 the CS402 to set
     */
    public void setCS402(String CS402) {
        this.CS402 = CS402;
    }

    /**
     * @return the EC401
     */
    public String getEC401() {
        return EC401;
    }

    /**
     * @param EC401 the EC401 to set
     */
    public void setEC401(String EC401) {
        this.EC401 = EC401;
    }

    /**
     * @return the EC402
     */
    public String getEC402() {
        return EC402;
    }

    /**
     * @param EC402 the EC402 to set
     */
    public void setEC402(String EC402) {
        this.EC402 = EC402;
    }

    /**
     * @return the CS411
     */
    public String getCS411() {
        return CS411;
    }

    /**
     * @param CS411 the CS411 to set
     */
    public void setCS411(String CS411) {
        this.CS411 = CS411;
    }

    /**
     * @return the CS412
     */
    public String getCS412() {
        return CS412;
    }

    /**
     * @param CS412 the CS412 to set
     */
    public void setCS412(String CS412) {
        this.CS412 = CS412;
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
