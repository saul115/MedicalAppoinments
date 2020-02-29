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
    
    static int id = 0;
    String name;
    String speciality;
    
    Doctor() { id++; }
    
    Doctor(String name){
        System.out.println("The Doctor's name is: " + name);
        id++;
    }
    
    //Behaviours
    public void showName()
    {
        System.out.println(name);
    }
    
    public  void showId()
    {
        System.out.println("The Doctor's ID is: " + id);   
    }
    
    
}
