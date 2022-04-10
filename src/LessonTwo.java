public class LessonTwo {
    public static void main (String[]args) {
        doAnotherNestedLoop();

        /*char operator = '*';
        switch (operator) {
            case '+':
                System.out.println(sum(2,3));
                break;
            case '-':
                System.out.println(minus(2,3));
                break;
            case '*':
                System.out.println(multiply(2,3));
                break;
            case '/':
                System.out.println(divide(2,3));
                break;
        }*/

    }
    private static int sum (int a, int b) {
        return a + b;
    }
    private static int minus ( int a, int b) {
        return a - b;
    }

    private static int multiply (int a, int b) {
        return a * b;
    }
    private static int divide (int a, int b) {
        return a / b;
    }
    private static void printNum() {
        for(int i = 1000000; i > 0; i = i -2){
            System.out.println(i);
        }
        for (int i = 0; i < 0; i += 2) {
            System.out.println(i);
        }
    }
    private static void doNestedLoop() {
        for (int c = 1; c < 4; c++) {
            for (int j = 1; j < 4; j++) {
                System.out.println("c = " + c + "; j = " + j);
            }
        }
    }
    private static void doWhileMethod() {
        int x = 3;
        while (x < 100000) {
            x = (x + 4) * x + 12;
            System.out.println(x);
        }
    }
    private static void doAnotherNestedLoop() {
        int c = 0;
        for (int i = 1; i < 5; i ++) {
            for ( int j = 1; j < 5; j++) {
                c = c + i - j;
                System.out.println(c);
            }
        }
    }
}
