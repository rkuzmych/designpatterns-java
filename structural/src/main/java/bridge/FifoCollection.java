package bridge;

public interface FifoCollection<T> {

    void offer(T element);

    T poll();
}
