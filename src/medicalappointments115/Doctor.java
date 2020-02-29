/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalappointments115;

/**
 *
 * @author Felipe Gasca
 */
public class Doctor {
    
    int id;
    String name;
    String speciality;
    
    Doctor() {}
    
    Doctor(String name){
        System.out.println("The Doctor's name is: " + name);
    }
    
    //Behaviours
    public void showName()
    {
        System.out.println(name);
    }
}
