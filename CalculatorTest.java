/*Name: Cristiano Pereira
  week: 3 lab 2
  Date: 9/25/2026
  Course:26FA15 Computer Science II (CMP-129-80231)
  */



public class CalculatorTest {
    public static void main(String [] args){
        Calculator calc = new Calculator();
        System.out.println("Sum of 2 integers: " + calc.add(1, 2));
        System.out.println("Sum of 2 doubles: " + calc.add(1.2, 3.5));
        System.out.println("Sum of 3 integers: " + calc.add(1, 2, 4));
        System.out.println("Concactenated string: " + calc.add("Hello ", "Proffeser"));
    }
}
