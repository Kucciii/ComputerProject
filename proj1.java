import java.io.*;

class proj1
{
    public static void main(String[] args) throws Exception
    {
        DataInputStream ob = new DataInputStream(System.in);
        String s;
        int n = 0, l;
        s = ob.readLine();
        s = s.toUpperCase();
        l = s.length();
        for (int x=0; x<l-1; x++)
        {
            if (s.charAt(x) == s.charAt(x+1))
            {
              n++;
              x++;
            }
        }
        System.out.println("Double letter sequences - " + n);
    }
}
