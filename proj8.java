import java.io.*;

class proj8 {
    public static void main(String[] args) throws Exception{
        DataInputStream ob = new DataInputStream(System.in);
        int ch;
        System.out.println("Enter choice:");
        ch = Integer.parseInt(ob.readLine());
        switch (ch) {
            case 1:
                int a = 1, a2 = 100;
                char c = 'a';
                for (int x = 1; x <= 4; x++)
                {
                    for (int y = 4; y >= x; y--)
                        System.out.print(c++);
                    if (x > 1)
                    {
                        for (int o = 1; o <= a; o++)
                            System.out.print(" ");
                        a = a+2;
                    }
                    for (int z = a2; z >= 97; z--)
                    {
                        if (z == 100) 
                          z = z - 1;
                        System.out.print((char) z);
                    }
                    System.out.println();
                    a2--;
                }
                break;
            case 2:
                for (int p = 0; p <= 4; p++)
                {
                    for (int q = 4; q >= p; q--)
                        System.out.print(" ");
                    for (int r = p; r >= 0; r--)
                        System.out.print(r);
                    for (int s = 1; s <= p; s++)
                        System.out.print(s);
                    System.out.println();
                }
                break;
            default:
                System.out.println("Wrong choice.");
        }
    }
}
