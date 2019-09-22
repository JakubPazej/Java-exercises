import java.util.Scanner;
public class Exercise6_21{
  public static void main(String[] args){
    Scanner scanner = new Scanner (System.in);

    System.out.print("Enter the number of balls to drop: ");
    String choice = scanner.next();
    int balls = Integer.parseInt(choice);

    System.out.print("Enter the number of slots in the bean machine: ");
    String choice2 = scanner.next();
    int[] slots = new int[Integer.parseInt(choice2)];
    System.out.println("");
    
    int sum =0;
    for(int i=0;i<balls;i++){
      for(int k=0;k<Integer.parseInt(choice2)-1;k++){
        int r = (int)(Math.random()*2);
        sum = 0;
        if(r>1){
          System.out.print("R");
          sum++;
        }else{
          System.out.print("L");
        }
      }
      slots[sum] += slots[sum];
    }
    System.out.println("");

    int[][] histogram = new int[slots.length][slots.length];
    int counter = 0;
    for(int m =0; m<slots.length; m++){
      for(int n=0; n<slots.length; n++){
        if(slots[n]!=0){
          histogram[slots.length-counter][n] = 0;
          slots[n]--;
        }
      }
        counter++;
    }

    for(int l =0; l<slots.length; l++){
      for(int d=0; d<slots.length; d++){
        if(d==0){
          System.out.print("|");
        }
        System.out.print(histogram[slots.length-l][d] + "|");
      }
    }
  }
}
