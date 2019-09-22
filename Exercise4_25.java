public class Exercise4_25{
  public static double sumSeries(double n){
     double a=1, b=1, result=0;
     while(a<=n){
         b=1;
         while(b<=a){
             result=result+b;
             b++;
         }
         a++;
     }
     return result;
  }
}