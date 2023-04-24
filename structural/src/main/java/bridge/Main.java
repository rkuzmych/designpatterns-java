package bridge;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

    private static final String POLLING_MESSAGE = "Polling result: {}";

    public static void main(String[] args) {
        FifoCollection<Integer> fifoCollection = new Queue<>(new SinglyLinkedList<>());

        fifoCollection.offer(10);
        fifoCollection.offer(23);
        fifoCollection.offer(44);

        log.info(POLLING_MESSAGE, fifoCollection.poll());
        log.info(POLLING_MESSAGE, fifoCollection.poll());
        log.info(POLLING_MESSAGE, fifoCollection.poll());
        log.info(POLLING_MESSAGE, fifoCollection.poll());
    }
}
