package bridge;

public interface LinkedList<T> {
    void addFirst(T element);

    T removeFirst();

    void addLast(T element);

    @SuppressWarnings("unchecked")
    T removeLast();

    int getSize();
}
