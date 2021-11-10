package com.company;

public class Main {

    public static void main(String[] args) {
        ToLBSAdapter toLBSAdapter =new ToLBSImplentation(new MyKilogram());
        System.out.println(toLBSAdapter.weight());
    }
}
