import java.util.*;
import java.util.NumberFormat;
public class Exercise5_9_testprogram{
    public static void main(String[] args){
        Exercise5_9 a = new Exercise5_9();
        double[][] table = new double[10][5];
        double i = 1;
        System.out.println("Feet    Meters    Meters    Feet");
        System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
        NumberFormat formatter = new DecimalFormat("#0.000");
        for(int row=0; row<10; row++){
           table[row][0] = i;
           table[row][1] = a.footToMeter(i);
           table[row][2] = (15+(i*5));
           table[row][3] = a.meterToFoot(15+(i*5));
           i++;
        }
        
        String[][] idk = new String[table.length][table[0].length];
        for(int b=0; b<10; b++){
            for(int c=0; c<4; c++){
                idk[b][c] = String.valueOf(table[b][c]);
            }
        }
        for(String[] string : idk){
            System.out.format("%5s%10s%10s%10s\n", string);
        }
    }
}