import java.util.Scanner;
public class Exercise7_9{
  static String[][] board = new String[3][3];
  public static void main(String[] args){
    Scanner scanner = new Scanner (System.in);
    
    for(int row=0; row<board.length;row++){
          for(int col=0; col<board[0].length;col++){
              if(board[row][col]==null){
                  board[row][col]=" ";
              }
          }
      }
    
    for(int rounds = 0; rounds<9; rounds++){
        for(int i=1; i<2;i++){
            System.out.print("Enter a row (0, 1 or 2) for player X: ");
            int pxRow = scanner.nextInt();

            System.out.print("Enter a column (0, 1 or 2) for player X: ");
            int pxCol = scanner.nextInt();
            if(" ".equals(board[pxRow][pxCol]) == false){
                System.out.println("Spot already taken.");
                i--;
            }else{
                board[pxRow][pxCol] = "X";
                table();
            }
        }
        for(int x=1; x<2; x++){
            System.out.print("Enter a row (0, 1 or 2) for player O: ");
            int poRow = scanner.nextInt();

            System.out.print("Enter a column (0, 1 or 2) for player O: ");
            int poCol = scanner.nextInt();
            if(" ".equals(board[poRow][poCol]) == false){
                System.out.println("Spot already taken.");
                x--;
            }else{
                board[poRow][poCol] = "O";
                table();
            }
        }
    }
  }
  private static void table(){
      System.out.println("-------");
      System.out.println("|"+board[0][0]+"|"+board[0][1]+"|"+board[0][2]+"|");
      System.out.println("-------");
      System.out.println("|"+board[1][0]+"|"+board[1][1]+"|"+board[1][2]+"|");
      System.out.println("-------");
      System.out.println("|"+board[2][0]+"|"+board[2][1]+"|"+board[2][2]+"|");
      System.out.println("-------");
  }
  private static boolean checkWinner(){
      if((board[0][0])==(board[0][1])&&(board[0][1])==(board[0][2])&&board[0][0]!=""){
             return true;
        }else if(((board[1][0])==(board[1][1])&&(board[1][1])==(board[1][2]))&&board[1][0]!=""){
             return true;
         }else if(((board[2][0])==(board[2][1])&&(board[2][1])==(board[2][2]))&&board[2][0]!=""){
             return true;
         }else if(((board[0][0])==(board[1][0])&&(board[1][0])==(board[2][0]))&&board[0][0]!=""){//vertical win       
             return true;
         }else if(((board[0][1])==(board[1][1])&&(board[1][1])==(board[2][1]))&&board[0][1]!=""){
             return true;
         }else if(((board[0][3])==(board[1][3])&&(board[1][3])==(board[2][3]))&&board[0][3]!=""){
             return true;
         }else if(((board[0][0])==(board[1][1])&&(board[1][1])==(board[2][2]))&&board[0][0]!=""){//horizontal      
             return true;
         }else if(((board[0][2])==(board[1][1])&&(board[1][1])==(board[2][0]))&&board[0][2]!=""){ //cross win
             return true;
      }else{
          return false;
        }
    }
}
