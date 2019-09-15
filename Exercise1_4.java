public class Exercise1_4{
  public static void main(String[] args){
    String[][] table = new String[5][3];
        table[0] = new String[]{"a","a*2","a*3"};
        table[1] = new String[]{"1","2","3"};
        table[2] = new String[]{"2","4","6"};
        table[3] = new String[]{"3","6","9"};
        table[4] = new String[]{"4","8","12"};
    for(String[] string : table){
        System.out.format("%-8s%-8s%-8s\n", string);
    }
  }
}
