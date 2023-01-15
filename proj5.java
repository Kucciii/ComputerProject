import java.io.*;

class proj5 {
    public static void main(String[] args) throws Exception {
        DataInputStream ob = new DataInputStream(System.in);
        int ch;
        System.out.println("Enter choice: ");
        ch = Integer.parseInt(ob.readLine());
        switch(ch)
        {
            case 1:
                int n1, s = 0;
                System.out.println("Enter number - ");
                n1 = Integer.parseInt(ob.readLine());
                for (int x = 1; x < n1; x++)
                {
                    if (n1 % x == 0)
                        s = s + x;
                }
                if (s == n1)
                    System.out.println("Perfect Number");
                else
                    System.out.println("Not a Perfect Number");
                break;
            case 2:
                int n2, a;
                System.out.println("Enter a number - ");
                n2 = Integer.parseInt(ob.readLine());
                a = (n2 * n2) - n2;
                if (a % 10 == 0)
                    System.out.println("Automorphic Number");
                else
                    System.out.println("Not an Automorphic Number");
                break;
            default:
                System.out.println("Wrong choice.");
        }
    }
}
