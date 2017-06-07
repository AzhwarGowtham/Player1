import java.util.Scanner;
public class FindUnique
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int pos=0;
        String arr[]=str.split(" ");
        int count1=0,flag=0;
        for(int i=0;i<arr.length;i++)
        {
            int count=0;
            for(int j=0;j<arr.length;j++)
            {
                if(i!=j)
                {
                    if(arr[i].equals(arr[j]))
                    count++;
                }
                if(count>1)
                flag=1;
            }
            if(flag==1)
            {
                pos=i;
                break;
            }
            if(count==0)
            {
                count1++;
                System.out.println(arr[i]);
            }
        }
        if(count1==0)
        System.out.println("There is no unique element");
        if(flag==1)
        System.out.println("Element "+arr[pos]+" occurs more than twice");
        if(count1>1)
        {
                    System.out.println("More than one unique element in the code");
        }
    }
}
