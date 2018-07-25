package com.jococo_example;

public class SampleClass {
    public static void main(String[] args) {
        show(0);
    }

    static String show(int num) {
        if (num == 0) {
            return "Test...";
        } else if(num == 1) {
            return ".....";
        } else {
        	return "";
        }
    }
}
