package com.company.lab1;

public class ex6 {
    public static void main(String[] args) {
        String[] lines = splitLines("line 1\nline 2\nline 3");
        for (String line : lines) {
            System.out.println(line);
        }
    }

    static String[] splitLines(String text) {
        return text.split("\r\n|\n\r|\n|\r");
    }
}