package com.example;

import com.example.common.Month;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner systemInScanner = new Scanner(System.in);

    ArrayList<Month> currentMonthAndRemainingMonths = new ArrayList<>();

    System.out.println("Choose a month from the following choices:");

    for (int i=0; i<Month.values().length - 1; i++) {
      System.out.print(Month.values()[i].getEnglishName() + ", ");
    }
    System.out.println("or " + Month.values()[Month.values().length - 1].getEnglishName());
    System.out.println();

    System.out.print("Enter your choice: ");
    Month myMonth = Month.valueOf(systemInScanner.next().toUpperCase());

    System.out.println("Your choice was " + myMonth.getEnglishName());
    System.out.println("Your choice is month " + (myMonth.ordinal() + 1) + " out of 12.");

    for (int i=myMonth.ordinal(); i<Month.values().length; i++) {
      currentMonthAndRemainingMonths.add(Month.values()[i]);
    }

    System.out.println("Here is the month you chose and every month afterward: ");
    for (Month month : currentMonthAndRemainingMonths) {
      System.out.println(month.getEnglishName());
    };

    switch (myMonth.ordinal()) {
      case 0:
        System.out.println("Counting the entire month of " + myMonth.getEnglishName() + ", 365 days remain in the year.");
        break;
      case 1:
        System.out.println("Counting the entire month of " + myMonth.getEnglishName() + ", 334 days remain in the year.");
        break;
      case 2:
        System.out.println("Counting the entire month of " + myMonth.getEnglishName() + ", 306 days remain in the year.");
        break;
      case 3:
        System.out.println("Counting the entire month of " + myMonth.getEnglishName() + ", 275 days remain in the year.");
        break;
      case 4:
        System.out.println("Counting the entire month of " + myMonth.getEnglishName() + ", 245 days remain in the year.");
        break;
      case 5:
        System.out.println("Counting the entire month of " + myMonth.getEnglishName() + ", 214 days remain in the year.");
        break;
      case 6:
        System.out.println("Counting the entire month of " + myMonth.getEnglishName() + ", 184 days remain in the year.");
        break;
      case 7:
        System.out.println("Counting the entire month of " + myMonth.getEnglishName() + ", 153 days remain in the year.");
        break;
      case 8:
        System.out.println("Counting the entire month of " + myMonth.getEnglishName() + ", 122 days remain in the year.");
        break;
      case 9:
        System.out.println("Counting the entire month of " + myMonth.getEnglishName() + ", 92 days remain in the year.");
        break;
      case 10:
        System.out.println("Counting the entire month of " + myMonth.getEnglishName() + ", 61 days remain in the year.");
        break;
      case 11:
        System.out.println("Counting the entire month of " + myMonth.getEnglishName() + ", 31 days remain in the year.");
        break;
    }

  }
}