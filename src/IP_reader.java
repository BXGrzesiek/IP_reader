import java.net.Inet4Address;
import java.net.UnknownHostException;
import java.util.Scanner;


public class IP_reader
{
    public static void main(String args[])
    {
        String domain;
        int choice;
            Scanner scanner = new Scanner(System.in);
        System.out.println("Do You wanna start [1 / 0] : ");
        choice = scanner.nextInt();

        while(choice==1)
        {
            try {
                //InetAddress host = InetAddress.getByName("facebook.com");
                System.out.println("Please provide HostName (without 'www') : ");
                domain = scanner.next();
                System.out.println(domain);

                Inet4Address host = (Inet4Address) Inet4Address.getByName(domain);
                String ipAdress = new String();
                ipAdress = host.getHostAddress();
                String[] split = ipAdress.split("\\.");

                System.out.println(ipAdress);
                Integer val1 = Integer.valueOf(split[0]);
                Integer val2 = Integer.valueOf(split[1]);
                Integer val3 = 1337;

                System.out.println(Integer.parseInt(split[3]) + "."
                        + Integer.toHexString(val1) + "."
                        + (Integer.valueOf(val2) * 2 + 1) + "."
                        + val3);

                System.out.println("One more time? [1/0] : ");
                choice = scanner.nextInt();
            }
            catch (UnknownHostException ex)
            {
                //ex.printStackTrace();
                System.out.println("Unknown hostName");
            }
        }
    }
}
