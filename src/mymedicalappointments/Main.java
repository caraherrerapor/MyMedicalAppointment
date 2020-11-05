package mymedicalappointments;

import java.util.Scanner;
import static mymedicalappointments.UIMenu.*;
;



public class Main {
    public static void main(String[] args) {
      
        
        //showMenu();
        Doctor myDoctor = new Doctor("carlos","psiquis");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);
    }
     
}