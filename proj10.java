import java.io.*;

class proj10 {
    public static void main(String[] args) throws Exception{
        DataInputStream ob = new DataInputStream(System.in);
        int n, s = 0;
        System.out.println("Enter a number - ");
        n = Integer.parseInt(ob.readLine());
        while(n!=0)
        {
            int m = n % 10;
            s = s + m;
            n = n / 10;
            if(n == 0)
            {
                n = s;
                s = 0;
            }
        }
        if (s == 1)
            System.out.println("Magic Number");
        else
            System.out.println("Not Magic Number");
    }
}
