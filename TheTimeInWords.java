//PROBLEM LINK:https://www.hackerrank.com/challenges/the-time-in-words/problem
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static void main(String[] args) {
        String[] Words = new String[] {
                "",
                "one",
                "two",
                "three",
                "four",
                "five",
                "six",
                "seven",
                "eight",
                "nine",
                "ten",
                "eleven",
                "twelve",
                "thirteen",
                "fourteen",
                "fifteen",
                "sixteen",
                "seventeen",
                "eighteen",
                "nineteen",
                "twenty",
                "twenty one",
                "twenty two",
                "twenty three",
                "twenty four",
                "twenty five",
                "twenty six",
                "twenty seven",
                "twenty eight",
                "twenty nine"
        };
        
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        
        int nxtHour = (hour % 12) + 1;
        
        if(minute == 0) {
        System.out.printf("%s o' clock\n", Words[hour]);
        }
         else if(minute ==1) {
        System.out.printf("%s minute past %s\n", Words[minute],Words[hour]);
        }
        
        else if(minute == 15) {
        System.out.printf("quarter past %s\n", Words[hour]);
        }
        
        else if(minute == 30) {
        System.out.printf("half past %s\n", Words[hour]);
        }
        
        else if(minute == 45) {
        System.out.printf("quarter to %s\n", Words[nxtHour]);
        }
        
        else if(minute < 30) {
        System.out.printf("%s minutes past %s\n", Words[minute],Words[hour]);
        }
        
        else {
        System.out.printf("%s minutes to %s\n",Words[60 - minute],Words[nxtHour]);
        }
    }
}
