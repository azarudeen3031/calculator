import java.util.*;
import java.lang.Math;

public class calc {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Select the operation:");
        System.out.println("1: Arithmetic");
        System.out.println("2: Logical");
        char op1 = sc.next().charAt(0);
     if (op1 == '1') {
     System.out.println("Enter the values:");
     System.out.println("Enter value 1: ");
     double a = sc.nextDouble();
     System.out.println("Enter value 2: ");
     double b = sc.nextDouble();
     double result = 0;
     System.out.println("+ : Addition");
     System.out.println("- : Subtraction");
     System.out.println("* : Multiplication");
     System.out.println("/ : Division");
     System.out.println("% : Modulus");
     System.out.println("^ : Power");
     System.out.println("p : Percentage");
     char op = sc.next().charAt(0);
     switch (op) {
     case '+':
     result = a + b;
     break;
     case '-':
     result = a - b;
     break;
     case '*':
     result = a * b;
     break;
     case '/':
     if (b != 0)
     {
     result = a / b;
    }
     else
    {
    System.out.println("Error: Division by zero!");
     return;
    }
     break;
    case '%':
    result = (a * b) / 100; 
     break;
    case '^':
    result = Math.pow(a, b);
    break;
    case 'p':
    result = (a * 100) / b; 
    break;
    default:
    System.out.println("Invalid operator!");
    return;
     }
     System.out.println("The result is: " + result);
        } else if (op1 == '2') {
            System.out.println("Choose the operation:");
            System.out.println("1: Power");
            System.out.println("2: Square Root");
            System.out.println("3: Logarithm (base 10)");
            int op2 = sc.nextInt();

  switch (op2) {
                case 1:
                    System.out.println("Enter base value: ");
                    int base = sc.nextInt();
                    System.out.println("Enter power value: ");
                    int pow = sc.nextInt();
                    int temp = 1;
                    for(int i = 1; i <= pow; i++){
                        temp = temp * base;
                    }
                    System.out.println("The result is: " + temp);
                    break;
                case 2:
                    System.out.println("Enter the value: ");
                    double value = sc.nextDouble();
                    if (value >= 0) {
                        double squareRoot = Math.sqrt(value);
                        System.out.println("The square root is: " + squareRoot);
                    } else {
                        System.out.println("Error: Cannot calculate the square root of a negative number!");
                    }
                    break;
                case 3:
                    System.out.println("Enter the value: ");
                    double logValue = sc.nextDouble();
                    if (logValue > 0) {
                        double logarithm = Math.log10(logValue);
                        System.out.println("The logarithm (base 10) is: " + logarithm);
                    } else {
                        System.out.println("Error: Cannot calculate the logarithm of a non-positive number!");
                    }
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        } else {
            System.out.println("Invalid choice!");
        }
    }
}
