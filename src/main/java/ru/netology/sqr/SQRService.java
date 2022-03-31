package ru.netology.sqr;

public class SQRService {
    public int squareAmount (int from, int to){
        int result = 0;
        for (int i = 10; i <= 99; i++){
            int square = i * i;
            if (square >= from && square <= to){
                result++;
            }
        }
        return result;
    }
}
