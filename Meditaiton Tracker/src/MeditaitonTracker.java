import java.util.*;
import java.lang.*;

public class MeditaitonTracker {
    
    public static String date;
    
    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);
        Scanner userInput2 = new Scanner(System.in);
        List<String> dateRec = new ArrayList<String>();

        boolean i = true;
        do {
            System.out.println("[1]New Record\n[2]View Records \n[3]Quit");
            byte option = userInput.nextByte();

            if (option == 1) {

                int b = 1;
                do{
                    System.out.print("\nEnter Month: ");
                    String month = (userInput2.nextLine().toUpperCase());
                    switch(month) {
                        case "JAN":
                        case "FEB":
                        case "MAR":
                        case "APR":
                        case "MAY":
                        case "JUN":
                        case "JUL":
                        case "AUG":
                        case "SEP":
                        case "OCT":
                        case "NOV":
                        case "DEC":
                            int x = 1;
                            do {
                                System.out.print("\nEnter Day: ");
                                byte day = (userInput2.nextByte());
                                if (day==1||day==21||day==31){
                                    date = month + " " + day + "st";
                                    x--;
                                } else if (day==2||day==22) {
                                    date = month + " " + day + "nd";
                                    x--;
                                }else if (day==3||day==23) {
                                    date = month + " " + day + "rd";
                                    x--;
                                }else {
                                    date = month + " " + day + "th";
                                    x--;
                                }
                            }while(x == 1);
                            b--;
                            break;
                        default:
                            System.out.println("Enter a valid month");
                    }
                }while(b == 1); // add date to record

                int c = 1;
                do{
                    System.out.print("\nEnter Mins Meditated: ");
                    byte mins = (userInput.nextByte());
                    date = date + " " + mins + "mins";
                    c--;
  
                }while(c == 1); // add mins to records

                dateRec.add(date);
                System.out.print("\n");

            } else if (option == 2) {
                System.out.print("\n");
                for(int a = 0; a <dateRec.size(); a++) {
                    System.out.println(dateRec.get(a));
                }
                System.out.print("\n");

            } else if (option == 3) {
                System.exit(0);

            } else {
                i = false;

            }
        } while(i == true); // add record

        System.exit(0);

    }
    
}