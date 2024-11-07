package app;

import java.util.concurrent.locks.ReentrantLock;

public class DataHandler {

    private final ReentrantLock lock = new ReentrantLock();

    public int modify(int num) {
        lock.lock(); // блокируем ресурс
        try {
            num = num * 3; // модифицируем значение
            return num;
        } finally {
            lock.unlock(); // обязательно освобождаем блокировку в блоке finally
        }
    }
}
