/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hrapp;

/**
 *
 * @author Josh
 */
public class Employee {
    private String name,address,pps;

    public Employee(String name, String address, String pps) {
        this.name = name;
        this.address = address;
        this.pps = pps;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPps() {
        return pps;
    }
    
    
    
}
