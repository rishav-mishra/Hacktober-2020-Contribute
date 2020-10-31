import java.io.*;
class Dequeue
{
    int cap;int Front,rear;
    int Dque[]=new int[200];
    Dequeue()
    {
        int i;
        for(i=0;i<200;i++)
        {
            Dque[i]=0;
        }
    }
    Dequeue(int nc,int nf,int nr)
    {
        Front=nf;
        rear=nr;
        cap=nc;
    }
    void pushrear(int num)
    {
        if(rear==(cap-1))
        {
            System.out.println("overflow");
        }
        else
        {
            rear++;
            Dque[rear]=num;
        }
    }
    void pushfront(int num1)
    {
        if(Front==0)
        {
            System.out.println("overflow");
        }
        else
        {
            Front--;
            Dque[Front]=num1;
        }
    }
    int removefront()
    {
        if(Front>rear)
        {
            System.out.println("Dequeue is empty");
            return(-999);
        }
        else
        {
            int t=Dque[Front];
            Front++;
            return(t);
        }
    }
    int removerear()
    {
        if(Front>rear)
        {
            System.out.println("Empty");
            return(-999);
        }
        else
        {
            int t=Dque[rear];
            rear--;
            return(t);
        }
    }
    public static void main()throws IOException
    {int nc1=0,nr1=0,nf1=0,n1=0,n2=0;
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        Dequeue ob=new Dequeue(nc1,nf1,nr1);
        ob.pushrear(n1);
        ob.pushfront(n2);
        ob.removefront();
        ob.removerear();
    }
}
