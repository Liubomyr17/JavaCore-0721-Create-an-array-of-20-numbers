package com.company;

import sun.awt.windows.WPrinterJob;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*

Create an array of 20 numbers.
Fill it with numbers from the keyboard.
Find the maximum and minimum numbers in the array.
Display the maximum and minimum numbers with a space.

Requirements:
1. Create an array of integers (int []) for 20 elements.
2. Read 20 integers from the keyboard and add them to the array.
3. Find and display the maximum and minimum numbers through a space.
4. Use the for loop.

 */

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum=Integer.MIN_VALUE;
        int minimum= Integer.MAX_VALUE;
        int[] list = new int[20];
        for(int i=0;i<list.length;i++) {
            list[i]=Integer.parseInt(reader.readLine());
            if(list[i]>maximum)
                maximum=list[i];
            if(list[i]<minimum)
                minimum=list[i];
        }
        System.out.println(maximum + " " + minimum);
    }
}








