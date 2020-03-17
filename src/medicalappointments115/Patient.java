/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalappointments115;
import java.util.Scanner;
/**
 *
 * @author Felipe Gasca
 */
public class Patient {
    
    private int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private String birthday;
    private double weight;
    private double height;
    private String blood;
    
    Patient(){}
    
    Patient(String name,String email)
    {
        this.name = name;
        this.email = email;
    }
    
    public void setWeight(double weight)
    {
        this.weight = weight;
    }
    
    public String getWeight()
    {
        return this.weight + " Kg.";
    }
    
     /**
     * @return the height
     */
    public String getHeight() {
        return this.height + " mts.";
    }

    /**
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.height = height;
    }


    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
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
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
     
        this.address = address;
    }

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        
        if(phoneNumber.length() > 8)
        {
            System.out.println("The Phone number cannot contain more than 8 digits");
        }else if(phoneNumber.length() == 8)
        {
            this.phoneNumber = phoneNumber;
        }
        
    }

    /**
     * @return the birthday
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * @param birthday the birthday to set
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

   
    /**
     * @return the blood
     */
    public String getBlood() {
        return blood;
    }

    /**
     * @param blood the blood to set
     */
    public void setBlood(String blood) {
        this.blood = blood;
    }
    
    
}
