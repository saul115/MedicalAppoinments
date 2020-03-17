/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalappointments115;
import java.util.Date;
import static medicalappointments115.UI.UIMenu.*;
import java.util.Scanner;



/**
 *
 * @author Felipe Gasca
 */
public class MedicalAppointments115 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//         Doctor myDoctor  = new Doctor();
//         myDoctor.name = "Saul Gasca";
//         myDoctor.showName();
//         myDoctor.showId();
//         System.out.println(Doctor.id);
//         
//         Doctor myDoctor2 = new Doctor("Ernesto");
//         myDoctor2.showId();
//         System.out.println(Doctor.id);
         
         //showMenu();
         
         Doctor mydoctor = new Doctor("Saul","Odontology");
         mydoctor.addAvailableAppointment(new Date(), "4 pm.");
         mydoctor.addAvailableAppointment(new Date(), "10 pm.");
         
         System.out.println(mydoctor.getAvailableAppointments());
         
         for (Doctor.AvailableAppointment aAppointment: mydoctor.getAvailableAppointments())
         {
             System.out.println(aAppointment.getDate() + " " + aAppointment.getTime());
         }
//         Patient patient = new Patient();
//         patient.setWeight(115.5);
//         System.out.println(patient.getWeight());
//         
//         patient.setPhoneNumber("123456789");
//         System.out.println(patient.getPhoneNumber());
         
                 
    }
    
}
