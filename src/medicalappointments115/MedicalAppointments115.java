/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalappointments115;
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
         Doctor myDoctor  = new Doctor();
         myDoctor.name = "Saul Gasca";
         myDoctor.showName();
         myDoctor.showId();
         System.out.println(Doctor.id);
         
         Doctor myDoctor2 = new Doctor("Ernesto");
         myDoctor2.showId();
         System.out.println(Doctor.id);
         
         showMenu();
                 
    }
    
}
