import java.util.scanner;
public class Exercise6_21{
  public static void main(String[] args){
    Scanner scanner = new Scanner (System.in);

    System.out.print("Enter the number of balls to drop: ");
    String choice = scanner.next();
    int balls = Integer.toInt(choice);

    System.out.print("Enter the number of slots in the bean machine: ");
    String choice2 = scanner.next();
    int[] slots = new int[Integer.toInt(choice2)];
    System.out.println("")

    for(int i=0;i<balls;i++){
      for(int k=0;k<Integer.toInt(choice2)-1;k++){
        int r = Math.random()*2;
        int sum = 0;
        if(r>1){
          System.out.print("R")
          sum
        }else{
          System.out.print("L")
        }
      }
    }
  }
}
