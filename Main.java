import java.util.Scanner;
/**
 *
 * @author 
 */
public class Main {
  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
  firstDigit(3572);
    
}
// number =3
public static void firstDigit(int number){
  while (number > 10){
    number = number / 10; //3
  }
  System.out.println(Math.abs(number));
}
}
