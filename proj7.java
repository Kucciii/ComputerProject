import java.io.*;

class proj7 {
    public static void main(String[] args) throws Exception {
        DataInputStream ob = new DataInputStream(System.in);
        int ch;
        System.out.println("Enter choice:");
        ch = Integer.parseInt(ob.readLine());
        switch(ch)
        {
            case 1:
                char c = 'A';
                int n = 1;
                for(int x = 1; x <= 5; x++)
                {
                    for (int y = 1; y <= x; y++)
                        System.out.print(c++);
                    for (int z = x; z <= 5; z++)
                        System.out.print(n++);
                    System.out.println();
                  c = 'A';
                  n = 1;
                }
                break;
            case 2:
                int a = 5;
                for (int p = 5; p >= 1; p--) {
                    for (int q = 5; q >= p; q--)
                        System.out.print(q);
                    for (int k = p-1; k >= 1; k--)
                        System.out.print(a);
                    System.out.println();
                    a--;
                }
                break;
            default:
                System.out.println("Wrong choice.");
        }
    }
}
