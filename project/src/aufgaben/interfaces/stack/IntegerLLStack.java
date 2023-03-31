package aufgaben.interfaces.stack;

import java.util.ArrayList;
import java.util.LinkedList;

public class IntegerLLStack implements Stack {

    LinkedList<Integer> iStack = new LinkedList<>();

    @Override
    public void push(Integer i) {
        iStack.add(i);
    }

    @Override
    public Integer pop() {
        return iStack.removeLast();
    }

    @Override
    public Integer peek() {

        ArrayList<Integer> test;
        

        return iStack.peek();
    }

    @Override
    public boolean empty() {
        return iStack.isEmpty();
    }

    @Override
    public void clear() {
        iStack = new LinkedList<>();
    }
}
