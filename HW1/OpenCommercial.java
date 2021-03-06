package HW1;

/* OpenCommercial.java */

import java.net.*;
import java.io.*;

/**  A class that provides a main function to read five lines of a commercial
 *   Web page and print them in reverse order, given the name of a company.
 */

class OpenCommercial {

  /** Prompts the user for the name X of a company (a single string), opens
   *  the Web site corresponding to www.X.com, and prints the first five lines
   *  of the Web page in reverse order.
   *  @param arg is not used.
   *  @exception Exception thrown if there are any problems parsing the 
   *             user's input or opening the connection.
   */
  public static void main(String[] arg) throws Exception {

    BufferedReader keyboard;
    String inputLine;
    String url;
    URL address;

    keyboard = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Please enter the name of a company (without spaces): ");
    System.out.flush();        /* Make sure the line is printed immediately. */
    inputLine = keyboard.readLine();

    /* Replace this comment with your solution.  */
    url= "http://www."+ inputLine + ".com";
    address = new URL(url);
    
    InputStreamReader ins = new InputStreamReader(address.openStream());//字节流到字符流转换
    BufferedReader br = new BufferedReader(ins);//将字符流读到缓冲中
    
    String line1 = br.readLine();
    String line2 = br.readLine();
    String line3 = br.readLine();
    String line4 = br.readLine();
    String line5 = br.readLine();
    
    System.out.println(line5);
    System.out.println(line4);
    System.out.println(line3);
    System.out.println(line2);
    System.out.println(line1);
  }
}