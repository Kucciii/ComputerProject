import java.io.*;

class proj6 {
    public static void main(String[] args) throws Exception{
        DataInputStream ob = new DataInputStream(System.in);
        int ch;
        System.out.println("Enter choice:");
        ch = Integer.parseInt(ob.readLine());
        switch (ch) {
            case 1:
                int n1, d1 = 0, a, s = 0, p;
                System.out.println("Enter a number - ");
                n1 = Integer.parseInt(ob.readLine());
                a = n1%10;
                while(n1!=0)
                {
                    d1 = n1%10;
                    n1 = n1/10;
                    s = s + d1;
                }
                s = s - (d1 + a);
                p = d1 * a;
                System.out.println("Product = " + p);
                System.out.println("Sum = " + s);
                break;
            case 2:
                // CASE 2 WILL BE UPLOADED AS SOON AS I CAN MAKE IT
                break;
            default:
                System.out.println("Wrong choice.");
        }
    }
}
