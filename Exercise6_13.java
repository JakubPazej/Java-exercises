public class Exercise6_13{
  public static int getRandom(int[] numbers){
    int n = Math.random()*54;
    for(int i=0; i<numbers.length;i++){
      if(numbers[i]>n){
        return n;
      }
      n++;
    }
    return n;
  }
}
