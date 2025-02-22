package homework;

/*Number of Days In Month
Write a method isLeapYear with a parameter of type int named year.
The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
If the parameter is not in that range return false.
Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is,
otherwise return false.
A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
Example of input/Output:
● isLeapYear(-1600);   should return false since the parameter is not in the range(1-9999)
● isLeapYear(1600); should return true since 1600 is a leap year
● isLeapYear(2017); should return false since 2017 is not a leap year
● isLeapYear(2000);should return true because 2000 is a leap year
Write another method getDaysInMonth with two parameter month and year. Both of type
int.
If parameter month is < 1 or >12 return -1.
If parameter year is <1 or >9999 than return -1.
This method needs to return the number of days in the month. Be careful about leap years
they have 29 days in month 2 (February).
You should check if the year is a leap year using the method isLeapYear describe above.


Example of input/Output:
● getDaysInMonth(1, 2020);  should return 31 since January has 31 days.
● getDaysInMonth(2, 2020);  should return 29 since February has 29 days in a year and 2020 is a leap
                                                 year.
● getDaysInMonth(2, 2018);  should return 28 since February has 28 days if it’s not a leap year and
                                                 2018 is not a leap year.

● getDaysInMonth(-1, 2020); should return -1 since the parameter month is invalid.
● getDaysInMonth(1, -2020); should return -1 since the parameter year is outside the range of 1 to
                                                  9999

HINT: Use the switch statement.
NOTE: Methods isLeapYear and getDaysInMonth need to be public static*/

import java.util.Scanner;

public class Program_4 {

    // Method to check if the year is a leap year
    public static boolean isLeapYear(int year) {
        // Check if year is within the valid range
        if (year < 1 || year > 9999) {
            return false;
        } else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    // Method to get the number of days in a month
    public static int getDaysInMonth(int month, int year) {
        // Check if the month and year are within valid range
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }

        // Use switch to return the number of days in each month
        switch (month) {
            case 1: // January
            case 3: // March
            case 5: // May
            case 7: // July
            case 8: // August
            case 10: // October
            case 12: // December
                return 31;

            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                return 30;

            case 2: // February
                // Check if the year is a leap year to determine days in February
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }

            default:
                return -1; // Invalid month
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any year : ");
        System.out.println(isLeapYear(sc.nextInt()));  // Call method for leap year

        System.out.println("Please enter any number of month : ");
        int month = sc.nextInt();
        System.out.println("Please enter any year : ");
        int year = sc.nextInt();
        System.out.println(getDaysInMonth(month, year)); // call method for get days of month

    }
}
