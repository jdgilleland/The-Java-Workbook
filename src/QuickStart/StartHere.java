// In Java, the name of a class must match the name of the file.
class StartHere {
  // The main method is the entry point of the program.
  // A "method" is a "set of instructions" to be executed.
  // The "method syntax" is the grammar of how to write a method.
  public static void main(String[] args) {
    System.out.println("Start your programming lessons here");
    // The args parameter is an array of strings that the user
    // can "pass in" to the main method when they run your
    // program.
    System.out.println("There are " + args.length + " strings passed in.");
    // Inside the .println() method, we are passing in an "expression".
    // The expression in this case involves "string concatenation",
    // which basically "combines" the literal text with a value
    // that indicates the number of items in the args string array.

    int result; // declare a variable
    result = add(5, 2); // this is a method call.
    // TODO: Write the line of code that outputs the calculated result.
    System.out.println(result);
  }


  /* The method syntax follows this pattern
  accessModifier static returnType methodName(parameterList) {
    // body of method
  }

  - accessModifier: the keywords public, private or protected
  - static: this is an optional keyword to indicate that this method
            "stands alone" and is "shared" by all objects based on
            this class.
            The main method is always static because it is the entry
            point of the program.
  - returnType: this is the data type of the information that is
                returned by the method to whoever called the method.
                A return type of void means that the method does
                not return information.
                A method can only return one value (that is, one "thing").
  - methodName: this is the name you give to the method; it helps to 
                identify the method.
  - parameterList: this is a comma-separated list of variable declarations.  
  */

  public static int add(int x, int y) {
    int total = x + y;
    return total;
  }
}