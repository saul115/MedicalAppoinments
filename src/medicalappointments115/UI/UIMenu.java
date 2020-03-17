/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalappointments115.UI;
import java.util.Scanner;
/**
 *
 * @author Felipe Gasca
 */
public class UIMenu {
    
    
    public static final String[] MONTHS = {"January","February","March","April","May","June","July","August","September","October","November","December"};
    
    public  static  void showMenu()
    {
        System.out.println("Welcome to My Appointments");
        System.out.println("Choose an option");
        
        int response = 0;
        do
        {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Exit");
            
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());
            
            switch(response)
            {
                case 1:
                    System.out.println("Doctor");
                    break;
                case 2:
                    response = 0;
                    showPatientMenu();
                    break;
                case 0:
                    System.out.println("Goodbye :)");
                    break;
                    
                default:
                    System.out.println("Please Choose a Valid Option , please");
                    break;
            }
            
        
        }while(response != 0);
        
    }
    
    
    static void showPatientMenu()
    {
        int response = 0;
        do
        {
            System.out.println("*********************");
            System.out.println("Patient");
            System.out.println("1. Book an Appointment");
            System.out.println("2. My Appointments");
            System.out.println("0. Return");
            
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());
            
            switch(response)
            {
                case 1:
                    System.out.println("::Book an Appointment");
                    for(int i=1;i<4;i++)
                    {
                        System.out.println(i+". "+MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println("::Add an Appointment");
                    break;
                    
                case 0:
                    showMenu();
                    break;
                    
                default:
                    System.out.println("Please, Choose a Valid option");
                    break;
            }
            
            
        }while(response != 0);
    }
    
}
