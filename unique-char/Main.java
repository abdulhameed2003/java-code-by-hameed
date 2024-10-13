import java.util.*;
public class Main
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String s=new String();
        s=sc.nextLine();
        char[]c=s.toCharArray();
        for(int i=0;i<c.length;i++)
        {
            int count=0;
            for(int j=0;j<c.length;j++)
            {
                if(c[i]==c[j]&&i!=j)
                {count++;
            }}
            if(count==0)
            {
                System.out.print(c[i]);
            }
        }
    
}}