package aufgaben.interfaces.stack;

import java.util.PriorityQueue;
import java.util.Queue;

public class IntegerQStack implements Stack {

    Queue<Integer> iStack = new PriorityQueue<>();


    @Override
    public void push(Integer i) {
        iStack.add(i);
    }

    @Override
    public Integer pop() {
        return iStack.remove();
    }

    @Override
    public Integer peek() {
        return iStack.poll();
    }

    @Override
    public boolean empty() {
        return iStack.isEmpty();
    }

    @Override
    public void clear() {
        iStack = new PriorityQueue<>();
    }
}
