/*
* Project 1.2.10
*/
import java.util.Scanner;

public class Greeting
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    System.out.println("whats your name: ");
    
    String userInput = sc.nextLine();
    System.out.println("hello: " + userInput);
    

  }
}

