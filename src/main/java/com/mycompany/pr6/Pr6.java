package com.mycompany.pr6;

import java.util.Scanner;

public class Pr6{

public static void main(String[] args) {
        System.out.println("RIBO-04-21 v4 Romanov I.V.");
        Scanner scan = new Scanner(System.in);
        System.out.print("path = ");
    String jj = scan.nextLine();
    System.out.print("name = ");
    String aj = scan.nextLine();
    System.out.print("specie = ");
    String cj = scan.nextLine();
    System.out.print("age = ");
    int bj = scan.nextInt();
    System.out.print("height = ");
    int dj = scan.nextInt();
    System.out.print("weight = ");
    int ej = scan.nextInt();
    

    Plant myPlant = new Plant(aj, cj, bj, dj, ej);
    SaverRunnable sr = new SaverRunnable(myPlant, jj);
     System.out.print(jj + "\n");
    Thread th = new Thread(sr);
    th.start();
    }
}