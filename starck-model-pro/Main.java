import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
   Scanner sc=new Scanner(System.in);
   String a=sc.nextLine();
   Stack<Character> s= new Stack<Character>();  
   int k=0;
   for(int i=0;i<a.length();i++)
   {
       if(a.charAt(i)=='(')
       {
           s.push(a.charAt(i));}
           else{
               if(!s.isEmpty()&&s.pop()==a.charAt(i))
               {
                   k++;break;
               }
           }
       }
       if(s.isEmpty()&&k==0)
       {
           System.out.println("Vaild");}
           else
           {
               System.out.println("Invalid");
           }
       }
   }
   


