
package numberproblems;
import java.math.*;
public class BinToDec {
    public static void main(String[] args)
    {
        int n=1010;
        int r=0;
        int base=2;
        int i=0;
        int sum=0;
        while(n>0)
        {
            r=n%10;
            sum=sum+r*(int)Math.pow(base,i);
            i++;
            n=n/10;
        }
        System.out.println(sum);
    }
}
