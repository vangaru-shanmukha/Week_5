import java.io.*;
import java.util.*;

public class QueueWithTwoStacks {

    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<Integer>();
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int x=sc.nextInt();
            if(x==1)
            {
                queue.add(sc.nextInt());
            }
            else if(x==2)
                queue.poll();
            else
                System.out.println(queue.peek());
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}

