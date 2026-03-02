package Lesson_2;
public class LeapYearChecker {
    public static boolean isLeapYear(int year) {
            if (year % 400 == 0) {
                return true;
            }
            if (year % 100 == 0) {
                return false;
            }
            if (year % 4 == 0) {
                return true;
            }
            return false;
        }
        public static void main(String[] args) {
        int[] years = {1900, 2000, 2023, 2024};
        for (int year : years) {
                boolean result = isLeapYear(year);
                System.out.println(year + " -> " + result);
            }
        }
    }

