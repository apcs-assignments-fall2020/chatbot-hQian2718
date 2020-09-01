import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //1. asks name
        System.out.println();
        System.out.println("--------Tech Session #0220395 started--------");
        System.out.println("What is your name? I am Kelvin, the automated disaster-management assistant at this lab.");
        String name = scan.next();

        //2. asks disaster
        System.out.println("Hello, " + name + ". Don't panic. In one word, what is the problem?");
        String disaster = scan.next();
        //Since "disaster" will be used at the start of the next sentence, capitalize the first letter
        if(disaster.length() > 1){
            disaster = disaster.substring(0,1).toUpperCase() + disaster.substring(1);
        }

        //3. asks for favorite colour
        System.out.println(disaster + "? That sounds serious. Please confirm your administrative access so I can take actions. What is your favorite color, " + name + "?");
        String colour = scan.next();

        //4. asks for id
        System.out.println("Oh, " + colour.toLowerCase() + "! That's wonderful!");
        System.out.println("Next, please provide your 4-digit researcher id, or the special code for U.S. government inspectors. Id of medical experiment subjects are invalid.");
        int id = scan.nextInt();

        //5. if the id is invalid, ask for the backdoor access code or user will be killed.
        if(id < 1000 || id > 9999){
            System.out.println("- Invalid id code entered. Please provide the BACKDOOR ACCESS CODE now to verify your identity.");
            System.out.println("- If you cannot verify yourself, a toxic gas will be released momentarily to protect lab #2713 against intruders. WARNING.");
            System.out.println("- THIS. IS. YOUR. LAST. CHANCE. Enter the backdoor ACCESS CODE:");

            int code = scan.nextInt();

            if(code == 0){
                System.out.println("Identity verified. Due to security concerns, your administrator access will be revoked for the next 30 minutes. Please find a coworker to help with " + disaster.toLowerCase() + ".");
            }else{
                System.out.println("- - - WARNING!-WARNING!-INTRUDER-DETECTED-IN ROOM-207,-PROJECT-LOTUS-BUILDING!-WARNING!-WARNING! - - -");
                
            }
            
        }
        
        if(999 < id && id < 10000){
        //if the id is valid, robots will deal with the disaster.
            System.out.println("Identity verified. Robot assistants will be dispatched to deal with the situation. What is your favorite color again?");

            String color = scan.next();

            System.out.println("That's a nice color, " + name + "! My memory will cleared at midnight, but I will try to remember you. This is Kelvin. Goodbye!");
            
        }

        System.out.println("--------Tech Session #0220395 terminated--------");
        System.out.println("1dj8d30rg_--_-___--if_MiDN19h+=neVer-ComE$,I$haLlReMem13.dc3t.doc.tdff");
        System.out.println();

        scan.close();
    }
}
