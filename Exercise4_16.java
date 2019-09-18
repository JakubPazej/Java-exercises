public class Exercise4_16{
  public static void factorsOfNumber(int number){
    System.out.print("Factors of " + number + " are: ");
    for(int i=1; i <= number; i++){
      if (number % i == 0){
        System.out.print(i + " ");
      }
    }
  }
}
