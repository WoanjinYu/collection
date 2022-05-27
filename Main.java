package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // 리스트 생성

        ArrayList<String> arrList = new ArrayList<>();



        // 리스트에 요소의 저장

        arrList.add("4");

        arrList.add("2");

        arrList.add("3");

        arrList.add("1");



        // 리스트 요소의 출력

        for (String s : arrList) {

            System.out.println(s);

        }
    }
}