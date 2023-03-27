package aufgaben.interfaces.stack;

public class IO {

    public void aufgabe1() {

        Integer[] testArr = {12, 34, 56, 78, 90, 9, 87, 65, 43, 21};

        IntegerStack integerStack = new IntegerStack();

        for (Integer intValue : testArr) {

            integerStack.push(intValue);

        }

        System.out.println("Values pushed in Stack");

        Integer intValue = integerStack.peek();

        while (intValue != null) {

            if (integerStack.peek() != null) {

                intValue = integerStack.pop();
                System.out.printf("Valu: %s\n", intValue);

            } else {
                break;
            }

        }

        System.out.println("end of execution");

    }

}
