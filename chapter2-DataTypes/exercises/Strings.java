public class Strings {
  public static void main(String[] args) {
    // declare the first name
    String name = "Ellie";
    // declare the second name
    String secondName = "Keen";
    // create your message
    Integer message = 24;
    // print your message!
    String output = String.format("My name is %s %s I am %d", name, secondName, message);

    System.out.println(output);
  }
}
