// what imports will you need?
import java.util.Scanner;
// can you remember how to set up your main function?
public class ControlFlow {

  public static void main(String[] args){
// find a way to read in user input
  Scanner sc = new Scanner(System.in);
  int input = sc.nextInt();

    if (input % 2 == 0) {
        System.out.println("even");
    } else {
        System.out.println("odd");
    }
  }
}

// write a method that will check if a number is odd or even
// (assume user only ever enters integers)
// print the answer to the console
