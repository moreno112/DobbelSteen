/*
 * Bij deze applicatie zal er naar een karater worden gevraagd
 * Dit karakter zal worden gebruikt voor de ogen van een dobbelsteen
 * De dobbelsteen zal output blijven geven tot dat deze 6 ogen laat zien
 */
package dobbelsteen;
import java.util.Scanner;

/**
 * @author Moreno Diderich moreno.diderich@hva.nl
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variabelen declareren
        int dobbelsteen = 0;
        
        // Scanner aanmaken
        Scanner input = new Scanner(System.in);
                
        // Vraag stellen aan user
        System.out.print("Give me a character!");
        
        // Antwoord van gebruiker opslaan
        char character = input.next().charAt(0);
        
        // while loop gooi dobbelsteen met ASCII art todat je  6 gooit
        while (dobbelsteen < 6){
        dobbelsteen = 1 + (int)(Math.random() * 6);
        
         if (dobbelsteen == 1){
            //Print art
            System.out.println(
                    " " + " " + " \n"
                  + " " + character + " \n"
                  + " " + " " + " ");
         }
         
         
         else if (dobbelsteen == 2){
            //Print art
            System.out.println(
                    character + " " + " \n"
                  + " " + " " + " \n"
                  + " " + " " + character + "\n");
        } 
         
         
         else if (dobbelsteen == 3){
            //Print art
            System.out.println(
                    character + " " + " \n"
                  + " " + character + " \n"
                  + " " + " " + character + "\n");
        } 
         
         
         else if (dobbelsteen == 4){
            //Print art
            System.out.println(
                    character + " " + character + "\n"
                  + " " + " " + " \n"
                  + character + " " + character + "\n");
        } 
         
         
         else if (dobbelsteen == 5){
            //Print art
            System.out.println(
                    character + " " + character + "\n"
                  + " " + character + " \n"
                  + character + " " + character + "\n");
        } 
         
         
         else {
            //Print art
            System.out.println(
                    character + " " + character + "\n"
                  + character + " " + character + "\n"
                  + character + " " + character);
        }
      
    }
    }
}
