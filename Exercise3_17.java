import java.util.Scanner;
public class Exercise3_17{
  public static void main(String[] args){
    Scanner scanner = new Scanner (System.in);

    System.out.print("scissor (0), rock (1), paper (2): ");
    String choice = scanner.next();
    int pChoice = Integer.parseInt(choice);
    
    int pcChoice = (int)(Math.random()*3);
    if (pcChoice == 0 && pChoice == 0){
            System.out.print("The computer is scissor. You are scissor too. It is a draw.");
        }else if(pcChoice == 0 && pChoice == 1){
            System.out.print("The computer is scissor. You are rock. You win!");
        }else if(pcChoice == 0 && pChoice == 2){
            System.out.print("The computer is scissor. You are paper. You lose...");
        }else if(pcChoice == 1 && pChoice == 0){
            System.out.print("The computer is rock. You are scissor. You lose...");
        }else if(pcChoice == 1 && pChoice == 1){
            System.out.print("The computer is rock. You are rock too. Is is a draw...");
        }else if(pcChoice == 1 && pChoice == 2){
            System.out.print("The computer is rock. You are paper. You win!");
        }else if(pcChoice == 2 && pChoice == 0){
            System.out.print("The computer is paper. You are scissor. You win!");
        }else if(pcChoice == 2 && pChoice == 1){
            System.out.print("The computer is paper. You are rock. You lose...");
        }else if(pcChoice == 2 && pChoice == 2){
            System.out.print("The computer is paper. You are paper too. It is a draw,");
        }else if(pChoice > 2){
            System.out.print("You used shotgun! instawin!");
    }
  }
}
