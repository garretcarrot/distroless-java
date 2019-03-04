package examples;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class HelloJava {
  public static void main(String... args) throws InterruptedException {
    System.out.println("Hello from the container.");

    System.out.printf("LOCAL: %s\n", System.getProperty("LOCAL"));

    if (args.length == 0) {
      return;
    }

    String hostname = args[0];
    while (true) {
      System.out.printf("==> Looking up %s%n", hostname);
      try {
        InetAddress address = InetAddress.getByName(hostname);
        System.out.println(address);
      } catch (UnknownHostException e) {
        System.err.println("ERROR: failed host lookup");
      }
      Thread.sleep(2000);
    }
  }
}
