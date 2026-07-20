package problmes;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            int ele=sc.nextInt();
            arr.add(ele);
        }
        int sum=0;
        for(int i:arr){
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
