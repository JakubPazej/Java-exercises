public class Exercise4_16{
  public factorsOfNumber(int number){
    System.out.print("Factors of " + number + " are: ")
    for(int i; i <= number; i++){
      if (number % i == 0){
        System.out.print(i + " ");
      }
    }
  }
}
