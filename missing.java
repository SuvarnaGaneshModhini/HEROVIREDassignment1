import java.util.Scanner;
public class missing{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int b=a[n-1];
        int c=0;
        int d[]=new int[a];
        for(int i=0;i<b;i++)
        {
            d[i]=i+1;
        }
        for(int i=0;i<b;i++)
        {
            for(int j=0;j<n;j++)
            {
               if(a[j]==d[i])
               c++;
            }
            if(c==0)
            {
                System.out.println(d[i]+" ");
            }
            c=0;
        }
    }
}