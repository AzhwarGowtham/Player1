import java.util.*;
public class RevStr
{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String revStr="";
        for(int i=str.length()-1;i>=0;i--)
        {
            revStr=revStr+str.charAt(i);
        }
        System.out.println(revStr);
    }
}
