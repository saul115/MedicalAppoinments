/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalappointments115;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Felipe Gasca
 */
public class Doctor {
    
    static int id = 0;
    private String name;
    private String speciality;
    private String email;
    

    Doctor() {  }
    
    Doctor(String name,String speciality){
        System.out.println("The Doctor's name is: " + name);
        id++;
        this.name = name;
        this.speciality = speciality;
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
    
    
    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(Date date,String time)
    {
        availableAppointments.add(new Doctor.AvailableAppointment(date,time));
    }
    
    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }
    
    
    public static class AvailableAppointment
    {

        /**
         * @return the id_availableappointment
         */
        public int getId_availableappointment() {
            return id_availableappointment;
        }

        /**
         * @param id_availableappointment the id_availableappointment to set
         */
        public void setId_availableappointment(int id_availableappointment) {
            this.id_availableappointment = id_availableappointment;
        }

        /**
         * @return the date
         */
        public Date getDate() {
            return date;
        }

        /**
         * @param date the date to set
         */
        public void setDate(Date date) {
            this.date = date;
        }

        /**
         * @return the time
         */
        public String getTime() {
            return time;
        }

        /**
         * @param time the time to set
         */
        public void setTime(String time) {
            this.time = time;
        }
        private int id_availableappointment;
        private Date date;
        private String time;
    
        //Available appointment
        
        public AvailableAppointment(Date date,String time)
        {
            this.date = date;
            this.time = time;
        }

       
    }
    
    
}
