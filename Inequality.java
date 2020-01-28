
/**
 * A program to determine if there are inequalities between two heights
 *
 * @author (EvanVu)
 * @version (Jan 27th)
 */

import java.util.Scanner;

public class Inequality{
    public static void main(String[] args){
        Inequality ineq1 = new Inequality();
        int times = ineq1.getTimes();
        for (int i=0;i<times;i++){
            ineq1.run();
        }
    }
    
    public int getTimes(){
        Scanner reader = new Scanner(System.in);
        int times;
        try{
            System.out.print("How many times would you want to compare?");
            times = reader.nextInt();
            if (times<=0){
                System.out.println("Must be at least once");
                return 0;
            }
             return times;
        }
        catch (Exception e){
            System.out.println("Exception occurred: " + e);
        }
        return 1;
    }
        
    public void run(){
        Scanner reader = new Scanner(System.in);
        int foot1;
        int foot2;
        float inch1;
        float inch2;
        String compareType;
        try{
            System.out.println("First height's measure in foot: ");
            foot1 = reader.nextInt();
            System.out.println("First height's measure in inch: ");
            inch1 = reader.nextFloat();
            System.out.println("Compare type - gt for greater than, lt for less than, gte for greater than or equals, lte for less than or equals");
            compareType = reader.next();
            while (!compareType.equals("gt") && !compareType.equals("gte") && !compareType.equals("lte") && !compareType.equals("lt") ){
                compareType = reader.next();
            }
            System.out.println("Second height's measure in foot: ");
            foot2 = reader.nextInt();
            System.out.println("Second height's measure in inch: ");
            inch2 = reader.nextFloat();
            float sum1 = foot1*12+inch1;
            float sum2 = foot2*12+inch2;
            if (compareType.equals("gt")){
                if (sum1>sum2){
                    System.out.println("True");
                }
                else{
                    System.out.println("False");
            }
        }
            if (compareType.equals("lt")){
                if (sum1<sum2){
                    System.out.println("True");
                }
                else{
                    System.out.println("False");
            }
        }
            if (compareType.equals("gte")){
                if (sum1>=sum2){
                    System.out.println("True");
                }
                else{
                    System.out.println("False");
            }
        }
            if (compareType.equals("lte")){
                if (sum1<=sum2){
                    System.out.println("True");
                }
                else{
                    System.out.println("False");
            }
        }
    }
    catch(Exception e){
        System.out.println("Exception occurred: " + e);
    }
}
}
