import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);  
    System.out.print("Enter a number to print its table: ");
    int number = s.nextInt();  

    for (int i = 1; i <= 10; i++) {  
      System.out.println(number + " x " + i + " = " + (number * i));
    }

    s.close();  
  }
}
