import java.io.*;

class proj4
{
    public static void main(String[] args) throws Exception
    {
        DataInputStream ob = new DataInputStream(System.in);
        int ch;
        System.out.println("Enter choice:");
        ch = Integer.parseInt(ob.readLine());
        switch(ch)
        {
            case 1:
                String o;
                int n;
                double s1, x1;
                System.out.print("Enter X: ");
                o = ob.readLine();
                x1 = Double.parseDouble(o);
                System.out.print("Enter N: ");
                n = Integer.parseInt(ob.readLine());
                s1 = x1;
                for (int a = 1; a < n; a++)
                {
                    int f1 = 1;
                    for (int b = 1; b <= a+1; b++)
                        f1 = f1 * b;
                    if (a % 2 == 0)
                        s1 = s1 + Math.pow(x1, a)/ f1;
                    else
                        s1 = s1 - Math.pow(x1, a)/ f1;
                }
                System.out.println(s1);
                break;
            case 2:
                String p;
                double s2 = 0.0, x2;
                System.out.print("Enter X: ");
                p = ob.readLine()
                x2 = Double.parseDouble(p);
                for (int x = 10; x >=1; x--)
                {
                    int f2 = 1;
                    for (int y = 1; y <= x; y++)
                        f2 = f2 * y;
                    s2 = s2 + Math.pow(1+x2, y-1)/f2;
                }
                System.out.println("s = " + s2);
                break;
            default:
                System.out.println("Wrong choice.");
        }
    }
}
