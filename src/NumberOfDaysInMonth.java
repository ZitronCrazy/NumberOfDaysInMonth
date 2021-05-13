public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        if ((year % 4) > 0) {
            return false;
        }
        if ((year % 100) > 0) {
            System.out.println(year + " this is a leap year");
            return true;
        }
        if ((year % 400) > 0) {
            return false;
        }
        System.out.println(year + " this is a leap year");
        return true;
    }
    public static int getDaysInMonth(int month, int year) {

        if (year > 1 && year < 9999)
            switch (month) {

                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    System.out.println(month + " has 31 days");
                    return 31;

                case 4: case 6: case 9: case 11:
                    System.out.println(month + " has 30 days");
                    return 30;

                case 2:
                    if (isLeapYear(year))
                        return 29;
                    else
                        return 28;

                default:
                    System.out.println("invalid");
                    return -1;

            }

        return -1;
    }
}
