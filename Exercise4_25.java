public class Exercise4_25{
  public static double sumSeries(double n){
     double result=0, b=1, c=0;
     for(int i = 0; i<n; i++){
         result= result+b+c;
         b++;
         c++;
        }
     return result;
  }
}
