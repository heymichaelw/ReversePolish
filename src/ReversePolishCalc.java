import java.util.Stack;

public class ReversePolishCalc {

    // The stack
//    private String[] stack;
    private Stack<Double> stack = new Stack<>();

    // You'll need a variable here to keep track of the top of the stack
//    public String topOfStack = stack[0];

    // The array of the input string split up
    private String[] tokens;

    public Object calculate(String input) {

        // 1. Use the String split method to split the string into tokens at the commas
        tokens = input.split(",");

        // 2. Allocate a stack as big as the number of tokens
//        stack = new String[tokens.length];


        // 3. write the algorithm
        for(int i = 0; i < tokens.length; i++) {
            // calls to push() and pop() and do the math here
            try {
                switch(tokens[i]){
                    case "+":
                        double firstNum = stack.pop();
                        double secondNum = stack.pop();
                        double result = firstNum +secondNum;
                        stack.push(result);
                        break;
                    default:
                        stack.push(Double.parseDouble(tokens[i]));
                        break;
                }
            } catch (NumberFormatException ex) {
                ex.printStackTrace();
            }
        }
        System.out.println(stack);
        // 4. return the result
        return stack.pop();
    }

//    private void push(String number) {
//
//        topOfStack = number;
//    }

//    private void push(double d) {
//        // change the double to a string and then push it on the stack
//        String numString = Double.toString(d);
//        this.push(numString);
//
//    }

//    private double pop() {
//        // remove the string from the top of the stack and convert it to a double and return it
//        String num = topOfStack;
//        topOfStack = null;
//        return Double.parseDouble(num);
//    }
}

