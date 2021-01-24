package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(getGreatestCommonDivisor(20,30));
    }
    public static int getGreatestCommonDivisor(int first, int second){
        if ((first < 10) || (second < 10)){
            return -1;
        }
        int divisor = 0;
        for (int i = 1; i <= Math.min(first,second); i++ ){
            if (first % i == 0 && second % i == 0){
                divisor = i;
                continue;
            }
        }
        return divisor;
    }
}
