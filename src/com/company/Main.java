package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String byteNum = "(\\d|\\d\\d|1\\d\\d|2[0-4]\\d|25[0-5])";
        String ipRegex = String.join("\\.", byteNum, byteNum, byteNum, byteNum);

        String ipNum = sc.nextLine();

        System.out.println(ipNum.matches(ipRegex) ? "YES" : "NO");
    }
}
