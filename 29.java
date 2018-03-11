import java.util.*;

public class MyClass 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner (System.in);
        int time = sc.nextInt();
        int hour = time / 60;
        int min = time - (hour * 60);
        System.out.println(hour + " " + min);
        
    }
}
