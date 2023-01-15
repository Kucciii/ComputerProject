import java.io.*;

class proj9 {
    public static void main(String[] args) throws Exception {
        DataInputStream ob = new DataInputStream(System.in);
        int ch;
        System.out.println("Enter choice:");
        ch = Integer.parseInt(ob.readLine());
        switch(ch)
        {
            case 1:
                String s, s2;
                int l;
                System.out.println("Enter a string - ");
                s = ob.readLine();
                l = s.length();
                for (int x = 0; x <= l; x++)
                {
                    s2 = s.substring(x);
                    s2 = s2 + s.substring(0, x);
                    System.out.println(s2);
                }
                break;
            case 2:
                int n, l = 0, N, a;
                System.out.println("Enter a number - ");
                n = Integer.parseInt(ob.readLine());
                N = n;
                while(n!=0) {
                    l++;
                    n /= 10;
                }
                n = N;

                while(true)
                {
                    int m = (int) (n / (Math.pow(10, l-1)));
                    a = (int) (n % (Math.pow(10, l-1)) * 10) + m;
                    System.out.println(a);
                    n = a;
                    if (a == N)
                        break;
                }
                break;
            default:
                System.out.println("Wrong choice.");
        }
    }
}
