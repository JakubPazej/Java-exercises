import java.util.Scanner; 
public class Exercise2_13{
  public static void main(String[] args){
    Scanner scanner = new Scanner (System.in);
    System.out.print("Enter the monthly saving amount: ");  
    String monthlySaved = scanner.next();
    Double mSaved = Double.parseDouble(monthlySaved);
    double annualInterest = 0.05;
    double monthlyInterest = annualInterest/12;
    int numberMonths = 6;
    int i = 0;
    double saved = 0;
    while(i<numberMonths){
      saved+=mSaved;
      saved*=(1+monthlyInterest);
      i++;
    }
    System.out.println("After the sixth month, the account value is $" 
                      + Math.floor(saved * 100)/100);
  }
}
