public class NextDayCalculator {
    public static int LASTOFMONTH = 31;
    public static final int FIRSTOFMONTH = 1;
    public static int LASTMONTHOFYEAR = 12;

    public static String getNextDay(int day, int month, int year) {
        int LASTOFMONTH = getLastofmonth(month, year);

        if (day == LASTOFMONTH && month==LASTMONTHOFYEAR) {
            day = 1;
            month = FIRSTOFMONTH;
            year++;}

        else if (day == LASTOFMONTH) {
            day = FIRSTOFMONTH;
            month++;
        }

        else day++;
        String result = day + "-" + month + "-" + year;
        return result;
    }

    private static int getLastofmonth(int month, int year) {
        int LASTOFMONTH = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                LASTOFMONTH = 31;
                break;
            case 12:
                LASTOFMONTH = 31;

                break;
            case 4:
            case 6:
            case 9:
            case 11:
                LASTOFMONTH = 30;
                break;
            case 2:
                LASTOFMONTH = leapYearMonth(year);

        }
        return LASTOFMONTH;
    }

    private static int leapYearMonth(int year) {
        if (year % 400 == 0) return 29;
        else if (year % 100 == 0) return 28;
        else if (year % 4 == 0) return 29;
        return 28;
    }

}
