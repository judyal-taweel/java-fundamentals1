package com.company;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
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

//    public static int dimensionalArr(int[][] arr) {
//        int sum=0;
//        int avg=0;
//        for (int i = 0; i< arr[0].length; i++) {
//            sum += i;
//        }
//        avg=sum/arr[0].length;
//
//        for(int j=0 ;j<arr.length;j++)
//        {
//            sum=0;
//
//        }
//    }


//    public static String pluralize (String word , int num)
//    {
//        if(num == 1){
//            return word;
//        }else{
//            return word+"s";
//        }
//}
//
//    public static void clock()
//    {
//        LocalDateTime now = LocalDateTime.now();
//
//            int hour = now.getHour();
//            int minute = now.getMinute();
//            int second = now.getSecond();
//            String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
//            System.out.println(time);
//
//    }


        public static void main (String[]args)
//                throws InterruptedException
        {
            roll(6);
            int[] arr={2,5,3,8,6};
           System.out.println(containsDuplicates(arr,3));

           int [] array={2,5,2,3,6};
           System.out.println(avgCal(array));


            int[][] weeklyMonthTemperatures = {
                    {66, 64, 58, 65, 71, 57, 60},
                    {57, 65, 65, 70, 72, 65, 51},
                    {55, 54, 60, 53, 59, 57, 61},
                    {65, 56, 55, 52, 55, 62, 57}
            };



//        int dogCount = 1;
//        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");
//
//        int catCount = 2;
//        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");
//
//        int turtleCount = 0;
//        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");
//
//
//
//        while (true) {
//            clock();
//            for (int i = 0; i < 15; i++) {
//                Thread.sleep(60);
//            }
//
//
//        }
//

        }
    }
