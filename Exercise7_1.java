import java.util.Scanner;
public class Exercise7_1{
  public static double sumColumn(double[][] m, int columnIndex){
    Scanner scanner = new Scanner (System.in);
    System.out.print("Enter a 3-by-4 matrix row by row: ");
    System.out.print("Row 1: ");
    double r1p1 = scanner.nextDouble();
    double r1p2 = scanner.nextDouble();
    double r1p3 = scanner.nextDouble();
    double r1p4 = scanner.nextDouble();
    System.out.print("Row 2: ");
    double r2p1 = scanner.nextDouble();
    double r2p2 = scanner.nextDouble();
    double r2p3 = scanner.nextDouble();
    double r2p4 = scanner.nextDouble();
    System.out.print("Row 3: ");
    double r3p1 = scanner.nextDouble();
    double r3p2 = scanner.nextDouble();
    double r3p3 = scanner.nextDouble();
    double r3p4 = scanner.nextDouble();
    
    double[][] table = new double[][]{
                                     {r1p1,r1p2,r1p3,r1p4,},
                                     {r2p1,r2p2,r2p3,r2p4,},
                                     {r3p1,r3p2,r3p3,r3p4,}
                                                          };
  }
}
