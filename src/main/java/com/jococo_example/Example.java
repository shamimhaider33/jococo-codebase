package com.jococo_example;

public class Example {
    public static void main(String[] args) {
        display(0);
    }

    static String display(int num) {
        if (num == 0) {
            return "Test...";
        } else if(num == 1) {
            return ".....";
        } else {
        	return "";
        }
    }
}
