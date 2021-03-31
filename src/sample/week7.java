// Virender Singh(C0789760)
package sample;

import java.util.Arrays;
import java.util.Collections;

public class week7 {

    public static void main(String [] args){
        Integer[] intArr = new Integer[] {21, 13,14, 22,35,46, 11,18,15,24};

        // show in reverse order
        System.out.println("showing in reverse order");
        for(int i=intArr.length-1;i>=0;i--){
            System.out.println(intArr[i]);
        }

        System.out.println("showing in Decending order");

        Arrays.sort(intArr, Collections.reverseOrder());

        for(int i=0;i<intArr.length;i++){
            System.out.println(intArr[i]);
        }

        System.out.println("showing in Ascending order");

        Arrays.sort(intArr);

        for(int i=0;i<intArr.length;i++){
            System.out.println(intArr[i]);
        }

        System.out.println("showing only ODDs");

        for(int i=0;i<intArr.length;i++){
            if(intArr[i]%2!=0)
                System.out.println(intArr[i]);
        }

        System.out.println("showing only EVENs");

        for(int i=0;i<intArr.length;i++){
            if(intArr[i]%2==0)
                System.out.println(intArr[i]);
        }

        System.out.println("Sum of all");

        int sum = 0;
        for(int i=0;i<intArr.length;i++){
            sum += intArr[i];
        }
        System.out.println(sum);
    }

}