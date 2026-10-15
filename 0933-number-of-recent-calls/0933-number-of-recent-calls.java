import java.util.*;

class RecentCounter {
    private Queue<Integer> queue;

    public RecentCounter() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        // Add the new request time
        queue.offer(t);

        // Remove all requests older than (t - 3000)
        while (queue.peek() < t - 3000) {
            queue.poll();
        }

        // The size of the queue is the number of recent calls
        return queue.size();
    }
}
