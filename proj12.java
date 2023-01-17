import java.io.DataInputStream;

class proj12 {
    public static void main(String[] args) throws Exception {
        DataInputStream ob = new DataInputStream(System.in);
        int s, ns, h, l;
        double a;

        System.out.print("Enter score: ");
        s = Integer.parseInt(ob.readLine());
        h = s; l = s; a = s;
        for (int x = 1; x < 10; x++)
        {
            System.out.print("Enter score: ");
            ns = Integer.parseInt(ob.readLine());
            if (ns > h)
                h = ns;
            else if (ns < l)
                l = ns;
            a = a + ns;
        }
        a = a - (h+l);
        a = a / 8;
        System.out.println("Final Score: " + a);
        System.out.println("Highest Score: " + h);
        System.out.println("Lowest Score: " + l);
    }
}
