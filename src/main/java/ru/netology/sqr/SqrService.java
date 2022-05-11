package ru.netology.sqr;

public class SqrService {
    int count = 0;

    public int sqrCount(int bottom, int top) {
        for (int i = 10; i < 100; i++) {
            count = (bottom <= i * i) & (i * i <= top) ? count + 1 : count;
        }
        return count;
    }
}
