package arrays;

import com.sun.security.jgss.GSSUtil;

public class VariableArguments {

    /*
    VARARGS
    1. A method can only have one 1 varargs parameter
    2. The varags parameter mush the LAST PARAMETER
     */

    public static void main(String[] args) {
        int sum1 = calculateSum(9,2);
        System.out.println(sum1);

//        varArgsSum();
        varArgsSum(2, 3);
        varArgsSum(2,3 ,4 ,5, 6, 4, 3);
        varArgsSum(2, new int[]{1, 2, 3, 4});

    }

    public static int calculateSum(int a, int b){
        return a + b;
    }

    public static void varArgsSum(double b, int ...a){
        int sum = 0;

        for(int i =0; i < a.length; i++){
            sum = sum + a[i];
        }//for loop

        System.out.println(sum);
    }//method varArgsSum

}//class VariableArguments
