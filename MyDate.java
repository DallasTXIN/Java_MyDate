//Dallas Lawson
//November 1, 2023
//Professor Bowman
//SDEV200-1AH
//Chapter 10, Exercise 10.14: MyDate Class

import java.util.GregorianCalendar;

public class MyDate {
  public void setYear(final int year) {
    this.year = year;
  }

  public void setMonth(final int month) {
    this.month = month;
  }

  public void setDay(final int day) {
    this.day = day;
  }

private int year;
  private int month;
  private int day;

  MyDate() {
    final GregorianCalendar calander = new GregorianCalendar();
    year = calander.get(GregorianCalendar.YEAR);
    month = calander.get(GregorianCalendar.MONTH);
    day = calander.get(GregorianCalendar.DAY_OF_MONTH);
  }

  MyDate(final long elapsedTime) {
    setDate(elapsedTime);
  }

  MyDate(final int year, final int month, final int day) {
    this.year = year;
    this.month = month;
    this.day = day;
  }

  public int getYear() {
    return year;
  }

  public String getMonth() {
    final String m = String.valueOf(month + 1);
    return (month < 10 ? "0" + m : m);
  }

  public String getDay() {
    final String d = String.valueOf(day);
    return (day < 10 ? "0" + d : d);
  }

  public void setDate(final long elapsedTime) {
    final GregorianCalendar calander = new GregorianCalendar();
    calander.setTimeInMillis(elapsedTime);
    year = calander.get(GregorianCalendar.YEAR);
    month = calander.get(GregorianCalendar.MONTH);
    day = calander.get(GregorianCalendar.DAY_OF_MONTH);
  } 
}