import java.util.Scanner;

import java.util.Random;

import javax.swing.DefaultBoundedRangeModel;
   public class DiceRoller {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();

     System.out.println("Enter three numbers between 1 to 6");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if(num1 < 1 || num2 < 1 || num3 < 1)
        {
         System.out.println("Cannot choose less than 1...");
         System.exit(404);
        }

        if(num1 > 6 || num2 > 6 || num3 > 6)
        {
         System.out.println("Cannot choose more than 6...");
         System.exit(404);
        }
        
        int sumNum = (num1 + num2 + num3)/3;
        int sumRoll = (roll1 + roll2 + roll3)/3;

        System.out.println("sumNum is equal to " + sumNum + " and sunRoll is equal to " + sumRoll);
        checkWin(sumNum, sumRoll);
        scan.close();


    }

    
        public static int rollDice()
        {
          Random rand = new Random();

          int randomNum = rand.nextInt(6);
          randomNum += 1;
          return randomNum;
        }
        
        
        public static void checkWin(int sumNum , int sumRoll)
        {
          if(sumNum > sumRoll && sumNum - sumRoll < 3)
          {
            System.out.println("Well done you win...");
          }
          else
          {
            System.out.println("Sorry You lose...");
          }
        }
    }