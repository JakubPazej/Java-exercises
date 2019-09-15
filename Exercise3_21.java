import java.util.Scanner;
public class Exercise3_21{
  public static void main(String[] args){
    Scanner scanner = new Scanner (System.in);

    System.out.print("Enter year (e.q., 2012): ");
    String choice = scanner.next();
    int y = Integer.parseInt(choice); 
    
    System.out.print("Enter month 1-12: ");
    String choice2 = scanner.next();
    int m = Integer.parseInt(choice2); 
    if (m == 1){
        m = 13;
        y--;
    }else if(m == 2){
        m = 14;
        y--;
    }
    
    System.out.print("Enter the day of the month 1-31: ");
    String choice3 = scanner.next();
    int d = Integer.parseInt(choice3); 
    
    int h;
    h = (d+((26*(m+1))/10)+(y%100)+((y%100)/4)+((y/100)/4)+((y/100)*5))%7;
    
    String day = "";
    if (h==0){
        day = "Saturday";
    }else if(h==1){
        day = "Sunday";
    }else if(h==2){
        day = "Monday";
    }else if(h==3){
        day = "Tuesday";
    }else if(h==4){
        day = "Wednesday";
    }else if(h==5){
        day = "Thursday";
    }else if(h==6){
        day = "Friday";
    } 
    System.out.print("Day of the week is " + day);
  }
}
