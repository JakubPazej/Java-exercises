import java.util.Scanner;
public class Exercise2_25{
  public static void main(String[] args){
    Scanner scanner = new Scanner (System.in);
    
    System.out.print("Enter employee's name: ");  
    String name = scanner.next();
    
    System.out.print("Enter number of hours worked in a week: ");  
    String hoursWorked = scanner.next();
    double hWorked = Double.parseDouble(hoursWorked);
    
    System.out.print("Enter hourly pay rate: ");  
    String hourlyPay = scanner.next();
    double hPay = Double.parseDouble(hourlyPay);
    
    System.out.print("Enter federal tax witholding rate: ");  
    String fedTax = scanner.next();
    double fTax = Double.parseDouble(fedTax);
    
    System.out.print("Enter state tax witholding rate: ");  
    String stateTax = scanner.next();
    double sTax = Double.parseDouble(stateTax);
    
    System.out.println("");
    System.out.println("Employee Name: " + name);
    
    System.out.println("Hours Worked: " + hWorked);
    
    System.out.println("Pay Rate: $" + hPay);
    
    double grossPay = hPay*hWorked;
    System.out.println("Gross Pay: $" + Math.floor(grossPay * 100) / 100);
    
    System.out.println("Deductions:");
    double fDed = (fTax*grossPay);
    System.out.println("  Federal Witholding ("+fTax*100+"%): $" 
                        + Math.floor(fDed * 100) / 100);
                        
    double sDed = (sTax*grossPay);
    System.out.println("  State Witholding ("+sTax*100+"%): $" 
                        + Math.floor(sDed * 100) / 100);
                        
    System.out.println("Total Deduction: $" 
                        + Math.floor((fDed+sDed) * 100) / 100);
    System.out.println("Net Pay: $" 
                        + Math.floor(((grossPay-(fDed+sDed))) * 100) / 100);
  }
}
