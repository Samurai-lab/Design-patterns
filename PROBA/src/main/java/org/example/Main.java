package org.example;

import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> fishki = new ArrayList<Integer>();
        Scanner scannerFirst = new Scanner(System.in);
        Scanner scannerSecond = new Scanner(System.in);
        int n = 0;
        int k = 0;
        int kHelper = k;
        n = scannerFirst.nextInt();
        k = scannerSecond.nextInt();
        for (int count = 1; count < n; count++) {
            fishki.add(count);
        }
    }
}