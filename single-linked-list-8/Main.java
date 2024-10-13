import java.util.*;
public class Main{//day14
    public class node{
        int d;
        node next;
        public node(int data)
        {
            d=data;
            next=null;
        }
    }
    node head=null;
    node tail=null;
    public void insert(int v)
    {
        node nn=new node(v);
        if(head==null)
        {
            head=tail=nn;
        }
        else
        {
            tail.next=nn;
            tail=nn;
        }
    }
    public void display()
    {
        node temp=head;
        if(head==null)
        {
            System.out.println("empty");
        }
        else{
            while(temp!=null)
            {
                System.out.print(temp.d+" ");
                temp=temp.next;
            }
        }
    }
    public void insbeg(int k)
    {
        node nn=new node(k);
        if(head==null)
        {
            head=nn;
        }
        else{
            nn.next=head;
            head=nn;
        }
    }
    public void inslast(int k)
    {
        node nn=new node(k);
        if(head==null)
        {
            head=tail=nn;
        }
        else{
         tail.next=nn;
            tail=nn;
        }
    }
     public void inspar(int k,int p)
    {
        node nn=new node(k);
        if(head==null)
        {
          head=tail=nn;
        }
        else{
            node temp=head;
            for(int i=2;i<p;i++)
            {
                temp=temp.next;
            }
            nn.next=temp.next;
            temp.next=nn;
    
        }
    }
    public void delbeg()
    {
        if(head==null)
        {
            System.out.print("empty");
        }
        else{
            head=head.next;
        }
    }
    public void dellast()
    {
        node temp=head;
        node del=head;
        if(head==null)
        {
            System.out.print("empty");
        }
        else{
            while(del.next!=null)
            {
                temp=del;
                del=del.next;
            }
            temp.next=null;
        }
    }
    public void delpos(int k)
    {
        node temp=head;
        if(head==null)
        {
            System.out.print("empty");
        }
        else{
            for(int i=2;i<k;i++)
            {
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Main s=new Main();
        int n=sc.nextInt();
        int v=0;
        for(int i=1;i<=n;i++)
        {
            v=sc.nextInt();
            s.insert(v);
            
        }
        s.display();
        System.out.println();
        s.insbeg(5);
        s.display();
        System.out.println();
        s.inslast(80);
        s.display();
        System.out.println();
        s.inspar(100,3);
        s.display();
        System.out.println();
        s.delbeg();
        s.display();
        System.out.println();
        s.dellast();
        s.display();
        System.out.println();
        s.delpos(2);
        s.display();
        System.out.println();
    }
}

