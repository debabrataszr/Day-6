package com.bl;

public class PerfectNumber {
    public static void main(String[] args) {
        int N = 6;
        if (isPerfect(N)) {
            System.out.println(N + " is a perfect number.");
        } else {
            System.out.println(N + " is not a perfect number.");
        }
    }

    static boolean isPerfect(int N) {
        if (N == 1) {
            return false;
        }
        int sum = 1;
        for (int i = 2; i * i <= N; i++) {
            if (N % i == 0) {
                if (i * i == N) {
                    sum += i;
                } else {
                    sum += i + (N / i);
                }
            }
        }

        if (sum == N) {
            return true;
        } else {
            return false;
        }
    }
    }