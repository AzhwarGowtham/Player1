import java.util.*;
public class TallestStudent
{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        int height[]=new int[50];
        for(int i=0;i<50;i++)
        {
            height[i]=sc.nextInt();
        }
        Arrays.sort(height);
        System.out.println("Enter value of K");
        int k=sc.nextInt();
        if(k>0&&k<=height.length)
        {
        int pos=(height.length)-k;
        System.out.println(k+"th tallest Student height is "+height[pos]);
        }else
        System.out.println("K value is not in the range");
    }
}
