package com.company;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static int roll(int n) {
        ArrayList<Integer> values = new ArrayList<>();

//        int[] arr = new int[n];
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            double doubleRandomNumber = Math.random() * 7;
            int randomNumber = (int) doubleRandomNumber;
            System.out.print(randomNumber + ",");
        }
        System.out.println("]");

        return n;
    }

    public static boolean containsDuplicates(int[] array , int num) {
        Set<Integer> value = new HashSet<>();
        boolean check = true;
        for (int i =0; i < array.length; i++) {
            if (value.contains(array[i])) {
                check= true;
            }else{
                check=false;
            }
            }
        return check;
    }

    public static int avgCal(int[] arr)
    {
        ArrayList<Integer> val= new ArrayList<>();

        int sum=0;
        for (int i=0; i<arr.length-1 ;i++)
        {
            sum+=arr[i];
        }
        int avg= sum/(arr.length);

        return avg;
}

     public static void arrayOfArray()
     {
         int[][] weeklyMonthTemperatures = {
                 {66, 64, 58, 65, 71, 57, 60},
                 {57, 65, 65, 70, 72, 65, 51},
                 {55, 54, 60, 53, 59, 57, 61},
                 {65, 56, 55, 52, 55, 62, 57}
         };

         int minimum=0;
         int sum;
         int avg;
         for(int i=0; i<weeklyMonthTemperatures.length; i++){
             sum=0;
             for(int j=0; j<weeklyMonthTemperatures[i].length;j++){
                 sum+=weeklyMonthTemperatures[i][j];
             }
             avg = sum/weeklyMonthTemperatures[i].length;
             minimum=sum/weeklyMonthTemperatures[0].length;
             if(minimum >avg){
                 minimum=avg;
             }
         }
         System.out.println(minimum);
     }


    public static void main(String[] args) throws InterruptedException
    {

        arrayOfArray();
           roll(6);
            int[] arr={2,5,3,8,6};
           System.out.println(containsDuplicates(arr,3));

           int [] array={2,5,2,3,6};
           System.out.println(avgCal(array));









    }
}
