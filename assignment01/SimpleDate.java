package assignment01;

public class SimpleDate {
    private int year;
    private int month;
    private int day;

    //Construct a SimpleDate object
    public static SimpleDate  of(int yr, int m, int d)
    {
        var returnValue = new SimpleDate();

        returnValue.year = yr;
        returnValue.month = m;
        returnValue.day = d;

        return returnValue;
    }

    //Test which date is sooner
    public boolean before(SimpleDate other)
    {
        //Test the year, then the month, then the day
        if (year < other.year)
        {
            return true;
        }
        else
        {
            if (month < other.month)
            {
                return true;
            }
            else
            {
                if (day < other.day)
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }
        }
    }
}