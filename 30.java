import java.util.*;

public class MyClass 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner (System.in);
        int hour1 = sc.nextInt();
        int min1 = sc.nextInt();
        int hour2 = sc.nextInt();
        int min2 = sc.nextInt();
        int time1 = (hour1 * 60) + min1;
        int time2 = (hour2 * 60) + min2;
        int time = Math.abs(time1 - time2);
        int hour = time / 60;
        int min = time - (hour * 60);
        System.out.println(hour + " " + min);
        
    }
}
