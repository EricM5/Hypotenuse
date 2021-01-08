import java.util.Scanner;
import java.lang.Math;
class Main {
  public static void main(String[] args) {
    System.out.print("Enter the first length: ");
    Scanner in = new Scanner(System.in);
    double firstnum = in.nextInt();
    System.out.print("Enter the second length: ");
    double secondnum = in.nextInt();
    double firstanswer = Math.pow(firstnum, 2) + Math.pow(secondnum, 2);
    double answer = Math.sqrt(firstanswer);
    System.out.print("The hypotenuse is: " + answer );
  }
}