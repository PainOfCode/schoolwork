package aufgaben.interfaces.stack;

import java.util.Arrays;

public class IntegerStack implements Stack {

    private Integer[] iStack = new Integer[4];

    private boolean empty = true;

    private int posCounter = 0;

    @Override
    public void push(Integer value) {

        posCounter++;

        if (posCounter == iStack.length) {
            widenArray();
        }

        iStack[posCounter] = value;
        empty = false;

    }

    private void widenArray() {

        int oldLength = iStack.length;

        iStack = Arrays.copyOf(iStack, iStack.length * 2);

        //Theoretisch überflüssig, aber sicherheitshalber selbst alles nach den alten Werten auf NULL setzen
        Arrays.fill(iStack, oldLength, iStack.length, null);

    }

    @Override
    public Integer pop() {
        Integer retValue;

        if (posCounter >= 0) {
            retValue = iStack[posCounter];
            iStack[posCounter] = null;
            posCounter--;

            if (posCounter == 0) {
                empty = true;
            }
        } else {
            return null;
        }

        return retValue;
    }

    @Override
    public Integer peek() {
        Integer retValue;

        if (posCounter >= 0) {
            retValue = iStack[posCounter];
        } else {
            return null;
        }

        return retValue;
    }

    @Override
    public boolean empty() {
        return this.empty;
    }

    @Override
    public void clear() {

        Arrays.fill(iStack, null);
        empty = true;

    }

}
