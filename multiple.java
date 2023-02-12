import java.util.Scanner;
import java.util.ArrayList;
public class multiple
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            ArrayList<Integer>num=new ArrayList<Integer>(n);
            for(int i=0;i<n;i++)
            {
                num.add(a[i]);
            }
            for(int i=0;i<num.size();i++)
            {
                for(int j=0;j<num.size();j++){
                if(num.get(i)==num.get(j) && i!=j){
                    num.remove(j);
                }
                }
            }
        
    for(int i=0;i<num.size();i++)
    {
        System.out.print(num.get(i)+" ");
    }
     sc.close();
    }
}