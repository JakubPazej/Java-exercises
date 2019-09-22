public class Exercise5_9_testprogram{
    public static void main(String[] args){
        Exercise5_9 a = new Exercise5_9();
        double[][] table = new double[10][4];
    
        //for(int i=1; i<=10; i++){
            table[0] = new double[]{1,a.footToMeter(1),(20+(1*5)),a.meterToFoot(20+(1*5))};
        //}
        System.out.println(table[0]);
        //for(double[] x : table){
            //System.out.format("%-8s%-8s%-8s%-8s\n", x);
            //System.out.println(x);
        //}
    }
}