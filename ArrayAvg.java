import java.util.*;
public class ArrayAvg
{
    public static void main(String args[])
    {
        int flag=0;
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String strArr[]=str.split(" ");
        int part1=0,part2=0;
        for(int i=0;i<strArr.length;i++)
        {
            String s1="";
            String s2="";
            int sum1=0,sum2=0,count1=0,count2=0;
            for(int j=0;j<strArr.length;j++)
            {
                if(j<=i)
                {
                    if(count1==0)
                    s1=strArr[j];
                    else
                    s1=s1+" "+strArr[j];
                    sum1=sum1+Integer.parseInt(strArr[j]);
                    count1++;
                }
                else
                {
                    if(count2==0)
                    s2=strArr[j];
                    else
                    s2=s2+" "+strArr[j];
                    sum2=sum2+Integer.parseInt(strArr[j]);
                    count2++;
                }
            } 
            if(count1!=0&&count2!=0)
            if((sum1/count1)==(sum2/count2))
            {
                flag=1;
                String arr1[]=s1.split(" ");
                String arr2[]=s2.split(" ");
                List l1=Arrays.asList(arr1);
                List l2=Arrays.asList(arr2);
                System.out.println(l1+","+l2);
                break;
            }
        }
        if(flag==0)
        System.out.println("Not possible");
    }
}
