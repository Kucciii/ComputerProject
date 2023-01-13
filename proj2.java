import java.io.*;

class proj2 {
    public static void main(String[] args) throws Exception{
        DataInputStream ob = new DataInputStream(System.in);
        int ch;
        System.out.println("Enter choice: ");
        ch = Integer.parseInt(ob.readLine());
        switch(ch)
        {
            case 1:
                String s1, ns = "", w1 = "";
                char c, v;
                int l1;
                System.out.println("Input a string - ");
                s1 = ob.readLine();
                s1 = s1 + " ";
                l1 = s1.length();
                for (int x = 0; x < l1; x++)
                {
                    c = s1.charAt(x);
                    if (c != ' ')
                        w1 += c;
                    else
                    {
                        v = w1.charAt(0);
                        if (v != 'a' && v != 'e' && v != 'i' && v != 'o' && v != 'u')
                            ns = ns + w1 + " ";
                        w1 = "";
                    }
                }
                System.out.println("New String = " + ns);
                break;

            case 2:
                String s2, w2, w3 = "";
                int a = 0, l2;
                char c2;
                System.out.print("Enter a string - ");
                s2 = ob.readLine();
                System.out.print("Enter a word - ");
                w2 = ob.readLine();
                l2 = s2.length();
                for (int y = 0; y < l2; y++) {
                    c2 = s2.charAt(y);
                    if (c2 != ' ')
                        w3 = w3 + c2;
                    else {
                        if (w2.equalsIgnoreCase(w3))
                            a++;
                        w3 = "";
                    }
                }
                System.out.println("Frequency - " + a);
                break;
            default:
                System.out.println("Wrong choice");
        }
    }
}
