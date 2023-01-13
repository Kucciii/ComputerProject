import java.io.*;

class proj3
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
                String s, w = "";
                int l1;
                char c;
                System.out.print("Enter a string - ");
                s = ob.readLine();
                s = s + " ";
                l1 = s.length();
                for (int x = 0; x < l1; x++)
                {
                    c = s.charAt(x);
                    if (c != ' ')
                        w = w + c;
                    else
                    {
                        if (w.charAt(0) == w.charAt(w.length()-1))
                            System.out.print(w + " ");
                        w = "";
                    }
                }
                break;
            case 2:
                String w1, w2 = "";
                int l2;
                char v;
                System.out.print("Enter a word - ");
                w1 = ob.readLine();
                l2 = w1.length();
                for (int y = 0; y < l2; y++)
                {
                    v = w1.charAt(y);
                    if (v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u')
                    {
                        w2 = w2 + w1.substring(y);
                        w2 = w2 + w1.substring(0, y) + "ay";
                        break;
                    }
                }
                System.out.println("Output - " + w2);
                break;
            default:
                System.out.println("Wrong choice.");
        }
    }
}
