
public class GetTime
{
    static String duration(long endtime, long startime)
    {
        long millis = endtime-startime;
        long minutes = millis/60000;
        long seconds = (millis / 1000) % 60;
        return (minutes + "mn " + seconds+"s" );
    }
}