class Calculator {
  public static void main(String[] args) {
    //
    if(args.length != 3) {
      showHelp();
    } else {
      // assuming they sent in the correct format
      int leftHand, rightHand; // declare two integer variables
      leftHand = Integer.parseInt(args[1]);
      rightHand = Integer.parseInt(args[2]);
      if(args[0].equals("add"))
        add(leftHand, rightHand);
      else if(args[0].equals("sub"))
        subtract(leftHand, rightHand);
    }
  }

  private static void showHelp() {
    System.out.println("Instructions:");
    System.out.println("Call the program by using the following format");
    System.out.println("       Calculator operation leftHand rightHand");
    System.out.println("where");
    System.out.println("   operation is add, sub, mult, or div");
    System.out.println("   leftHand and rightHand is a number");
    System.out.println("------");
  }

  private static void add(int lh, int rh) {
    int result = lh + rh;
    System.out.println("The result of adding is " + result);
  }

  private static void subtract(int lh, int rh) {
    int result = lh - rh;
    System.out.println("The result of subtracting is " + result);
    
  }
}