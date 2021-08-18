package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DBMeneger db = new DBMeneger();
        db.connect();
        System.out.println();
    }
}
