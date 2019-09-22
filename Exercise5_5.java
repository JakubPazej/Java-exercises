public class Exercise5_5{
  public static void displayLargestNumber(double num1, double num2, double num3){
    double result;
    if(num1 > num2 && num1> num3){
      result = num1;
    }else if(num2 > num1 && num2 > num3){
      result = num2;
    }else{
      result = num3;
    }
    System.out.println(result);
  }
}
