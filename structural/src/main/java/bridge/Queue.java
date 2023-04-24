package bridge;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Queue<T> implements FifoCollection<T> {

    private LinkedList<T> linkedList;

    @Override
    public void offer(T element) {
        linkedList.addLast(element);
    }

    @Override
    public T poll() {
        return linkedList.removeFirst();
    }
}
