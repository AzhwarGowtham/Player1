import java.util.Scanner;
public class IndexNumber
{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        int flag=0;
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the array");
		for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            if(i==size-1)
            {
                if(arr[i]==i)
                System.out.println(arr[i]);
            }
            else if(arr[i]<arr[i+1])
        	{
	            if(i==arr[i])
	            {
	                flag=1;
	                System.out.println(arr[i]);
            	}
        	}
        	else if(arr[i]==arr[i+1])
        	{
        		System.out.println("Elements are not unique");
        		break;
        	}
        	else
        	{
        		System.out.println("Elements are not in sorted order..");
        		break;
        	}
        }
       		if(flag==0)
            System.out.println("There is no number equals index");
    }
}
