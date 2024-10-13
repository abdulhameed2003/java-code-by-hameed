import java.util.*;

class Message extends Exception
{
    Message()
   {
    
    super("Invalid Input");
   }
}
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    int id=sc.nextInt();
	    String name=sc.nextLine();
	    name=sc.nextLine();
	    double bal=sc.nextDouble();
	    try{
	        if(bal<0)
	        throw(new Message());
	        else
	        System.out.println(id+" "+name+" "+bal+" ");
	    }
	    catch(Message Ex)
	    {
	        System.out.println(Ex);
	    }
	}
}
}