import java.util.ArrayList;
public class Exercise4_16{
  public static void factorsOfNumber(int number){
      int i=2;
      ArrayList<Integer> list = new ArrayList<Integer>();
      String answer ="";
      while(number>1){
          if(number%i == 0){
              if(!list.contains(i)){
                  answer += Integer.toString(i) +",";
                  list.add(i);
              }
              number=number/i;
            }else{
              i++;
          }
      }
      answer = answer.substring(0, answer.length()-1);
      System.out.println(answer);
  }
}