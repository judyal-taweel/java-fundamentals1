package com.company;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Main {


    public static String pluralize (String word , int num)
    {
        if(num == 1){
            return word;
        }else{
            return word+"s";
        }
}

   public static void flipNHeads(int n)
   {
       int countOfHeds=0;
       int countOfFlips=0;
       for (int i=1; i<=n;i++){
           Random random=new Random();
           int flip= random.nextInt();
           if(flip<0.5D){
               System.out.println("tail");
           }else{
               System.out.println("head");
               countOfHeds++;
           }
           countOfFlips++;
       }
       System.out.println("It took" +countOfFlips +"flips to flip"+ countOfHeds +"head in a row.");
   }

    public static void clock()
    {
        LocalDateTime now = LocalDateTime.now();

            int hour = now.getHour();
            int minute = now.getMinute();
            int second = now.getSecond();
            String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            System.out.println(time);

    }


    public static void main(String[] args) throws InterruptedException {

        flipNHeads(4);
        flipNHeads(5);
        

        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");



        while (true) {
            clock();
            for (int i = 0; i < 15; i++) {
                Thread.sleep(60);
            }


        }

    }
}
