import java.util.Scanner;
// can you remember how to set up your main function?
public class JavaBuzz {
  public static void main(String args[]){

  Scanner sc = new Scanner(System.in);
  int input = sc.nextInt();

    if (input % 15 == 0) {
      System.out.println("JavaBuzz");
    } else if (input % 5 == 0) {
      System.out.println("Buzz");
    } else {
      System.out.println("Java");
    }

  }
}

// "Java" if divisible by 3
// "Buzz" if divisible by 5
// "JavaBuzz" if divisible by 15
