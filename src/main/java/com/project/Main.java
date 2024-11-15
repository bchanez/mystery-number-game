package com.project;

import java.util.Random;

public class Main {
  public static void main(String[] args) throws Exception {
    Random random = new Random();
    int nombre = random.nextInt(100);
    System.out.println(nombre);
  }
}
