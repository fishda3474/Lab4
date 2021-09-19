
/*
Lab 4
Devin Fish
9/19/2021
*/
import java.util.Random;
class Main {
  public static void main(String[] args) {
    Random r = new Random();
    //creating the random number
    int randomNum = r.nextInt(50) + 1;
    int countNum = randomNum;
    System.out.println("The Random Number is: " + randomNum);

    //count down or up if statements
    if (countNum > 0){
      while(countNum > 0){
        System.out.println(countNum);
        countNum--;
      }
    }
    System.out.println(countNum);

    //if statements for what to print last
    if (randomNum <= 5) {
       System.out.println("Ahoy Mateys!");
    } else if (randomNum > 25 && randomNum < 42) {
        System.out.println("Cannonball!");
    } else {
      System.out.println("Blast off!");
    }
  }
}