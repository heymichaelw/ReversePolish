public class Main {

    public static void main(String[] args) {
        ReversePolishCalc rpc = new ReversePolishCalc();

        String rpnExpression = "2.5,4.8,+";
        double expectedResult = 7.3;
        double actualResult = (Double)(rpc.calculate(rpnExpression));
        checkResult(rpnExpression, expectedResult, actualResult);

        String rpnEx = "2.5,4.8,-";
        double otherResult = 2.3;
        double actualR = (Double)(rpc.calculate(rpnEx));
        checkResult(rpnEx, otherResult, actualR);

        String rpnE = "2.0,3.0,*";
        double other = 6.0;
        double actual = (Double)(rpc.calculate(rpnE));
        checkResult(rpnE, other, actual);

        // Write tests for the other operators (-, *, /)

        // Uncomment this test which has many operators
//        rpnExpression = "5,1,2,+,4,*,+,3,-";
//        expectedResult = 14.0;
//        actualResult = rpc.calculate(rpnExpression);
//        checkResult(rpnExpression, expectedResult, actualResult);
    }

    private static void checkResult(String expression, double expected, double actual) {
        if (expected == actual) {
            System.out.println("SUCCESS: " + expression + " is " + expected);
        } else {
            System.out.println("ERROR: " + expression + " expected " + expected + " actual " + actual);
        }
    }
}
