import java.io.*;
import java.util.Scanner;
public class information{
    public static void main(String args[])
    {
        String l=null;
        int totaltransactions=0;
        float totalbill=0;
        float max=0;
        float min=9999;
        try{
          BufferedReader buf=new BufferedReader(new FileReader("task.csv"));
            while((l=buf.readLine())!=null){
                String [] transactions=l.split(",");
                totalbill+=Float.parseFloat(transactions[3]);
                totaltransactions++;
            if(Float.parseFloat(transactions[3])>max)
            max=Float.parseFloat(transactions[3]);
            if(Float.parseFloat(transactions[3])<min){
                min=Float.parseFloat(transactions[3]);
            }
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the choice/n");
        System.out.println("1.total no of transactions");
        System.out.println("2.total bill");
        System.out.println("3.max amount");
        System.out.println("4.min amount");
        int n=sc.nextInt();
        sc.close();
        if(n==1){
            System.out.println("total no of transactions: "+totaltransactions);
        }
        if(n==2){
            System.out.println("total bill: "+totalbill);
        }
        if(n==3){
            System.out.println("max ammount: "+max);
        }
        if(n==4){
            System.out.println("min ammount: "+min);
        }

    }
}