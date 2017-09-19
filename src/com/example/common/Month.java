package com.example.common;

public enum Month {
  JANUARY ("January", 31),
  FEBRUARY ("February", 28),
  MARCH ("March", 31),
  APRIL ("April", 30),
  MAY ("May", 31),
  JUNE ("June", 30),
  JULY ("July", 31),
  AUGUST ("August", 31),
  SEPTEMBER ("September", 30),
  OCTOBER ("October", 31),
  NOVEMBER ("November", 30),
  DECEMBER ("December", 31);

  private String englishName;
  private int numOfDays;

  Month (String englishName, int numOfDays) {
    this.englishName = englishName;
    this.numOfDays = numOfDays;
  }

  public String getEnglishName() {
    return this.englishName;
  }

  public int getNumOfDays() {
    return this.numOfDays;
  }

}