package com.patel;

import java.util.Arrays;

public class Working {
    public static void main(String[] args) {

        char[] letters = {'A', 'A', 'B', 'C', 'D', 'D', 'D'};

        char searchLetter='A';
        int count;
        count = countOccurrences(letters, searchLetter='A');
        System.out.println(count);
    }
    public static int countOccurrences(char [] letters, char searchLetter ) {

        int count =0;
        for (char letter:letters){
              if (letter==searchLetter){
              count++;

              }
        }
        return count;
    }


}

