import java.util.Scanner;
public class Exercise5_5_testprogram{
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);

        System.out.print("Enter number one: ");
        double n1 = scanner.nextDouble();
        System.out.print("Enter number two: ");
        double n2 = scanner.nextDouble();
        System.out.print("Enter number three: ");
        double n3 = scanner.nextDouble();
        
        System.out.print("The biggest of these three numbers "
                          +n1+";"+n2+";"+n3+" is: ");
        Exercise5_5 test = new Exercise5_5();
        test.displayLargestNumber(n1,n2,n3);
    }
}