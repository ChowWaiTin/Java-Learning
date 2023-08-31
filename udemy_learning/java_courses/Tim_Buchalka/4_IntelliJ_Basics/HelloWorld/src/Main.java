/* *--- Access Modifiers ---*
 *   > Allows us to define which parts of our code, or even someone else's code, can access a particular element.
 *   > E.g. "public" java keyword
 * */

/* *--- "Class" keyword ---*
 *   > Used to define a class
 *   > "{" and "}" used to define the code block or class body.
 *   >
 * */
public class Main {
    /* *--- Java Method---*
     *  > Collection of statements, one or more, that perform an operation
     *  > "{" and "}" used to define the code block or class body.
     *  > The name of the java file must match the class name.
     * */
    public static void main(String[] args) {
        // Fifth Example - Ternary Operator (operand1 ? operand2 : operand3)
        String carBrand ="Honda";
        boolean isDomestic = carBrand == "Honda" ? false : true;
        if (isDomestic) {
            System.out.println("This car is domestic to our country.");
        }
        // Fourth Example - Logical AND Operator
        int number = 75;
        int number1 = 50;
        if (number >= 75)
            System.out.println("number is at least 75.");
        if (number1 >=50 && number < 80)
            System.out.println("number1 is at least 50 and number is less then 80.");
        if (number1 >=50 || number < 75)
            System.out.println("number1 is at least 50 or number is less then 90.");

        // Third Example - If Statement
        boolean boolStatus = false;
        // No Code Block
        if (boolStatus == true)
            System.out.println("Statement is printed!");
            System.out.println("If condition fulfilled!");
        // Code Block
        if (boolStatus == true) {
            System.out.println("Statement is printed!");
            System.out.println("If condition fulfilled!");
        }

        // Second Example using System.out.println("");
        System.out.println("Statement Printed using: ");
        System.out.println("System.out.println");

        // First Example using System.out.printf("");
        System.out.printf("Hello and welcome! ");
        System.out.printf("To Creating Your First Class! ");
    }
}