package co.com.orange.utils;

public class Time {
    private Time() {
    }

    public static void waiting(int waiting) {
        try {
            Thread.sleep(waiting * 10L);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}
