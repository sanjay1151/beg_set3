import java.util.*;
import java.lang.*;
public class arth{
      public static void main(String aa[]){
      int sum=0;
      int val;
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int f=s.nextInt();
      int l=s.nextInt();
      val=f;
      for(int i=0;i<n;i++){
          sum=sum+val;
          val=val+l;
      }
   System.out.println(sum);

      
}
}
