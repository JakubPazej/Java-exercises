import java.util.scanner;
public class Exercise7_9{
  public static void main(String[] args){
    String[][] board = new String[3][3]
    Scanner scanner = new Scanner (System.in);

    System.out.print("Enter a row (0, 1 or 2) for player X: ");
    String pxRow = scanner.next();
    int x = Integer.parseInt(pxRow);

    System.out.print("Enter a column (0, 1 or 2) for player X: ");
    String pxCol = scanner.next();
    int x1 = Integer.parseInt(pxCol);

    System.out.print("Enter a row (0, 1 or 2) for player O: ");
    String poRow = scanner.next();
    int o = Integer.parseInt(poRow);

    System.out.print("Enter a column (0, 1 or 2) for player O: ");
    String poCol = scanner.next();
    int o1 = Integer.parseInt(poCol);
  }
}
