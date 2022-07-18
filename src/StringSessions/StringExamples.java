package StringSessions;

import java.util.Locale;

public class StringExamples {
   static String s1="naveen";
   static String s2="I love my country";
   static String s3=new String("India is my country");

   static String firstName="krishna";
   static String lastName="arjun";
   static String fullName;

    public static void main(String[] args) {

        System.out.println(s1.length());
        System.out.println(s2.length());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        String result=s1.toUpperCase();
        int len=s1.length();
        System.out.println(len);
        System.out.println(s3.length());
        System.out.println(s3.contains("India"));
        //fullName =firstName+lastName;
        fullName =firstName.concat(lastName);
        System.out.println(fullName);
        System.out.println("full name of the string is:"+fullName);

        /*String s1="My name is Naveen";
        String s2="my name is naveen";
        System.out.println(s1==s2);
        String s3=new String("My Name is Naveen");
        String s4=new String("my name is naveen");
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));
        System.out.println(s3.equalsIgnoreCase(s4));
        System.out.println(s1.indexOf("Naveen"));*/

        /*String name="purnachandhu";
        char[]  ch=name.toCharArray();
        System.out.println(ch.length);
        System.out.println(ch[0]);
        System.out.println(ch[ch.length-1]);*/


       /* String name ="I Love My India";

        String [] splittedstring=name.split(" ");
        */

        String name="I Love My India";

        String[] splittedstring=name.split(" ");
        System.out.println(splittedstring[0]);
        System.out.println(splittedstring[1]);
        System.out.println(splittedstring[3]);
        System.out.println(splittedstring[2]);


        String name1="I Love My India";
        String[] splittedstring1=name1.split(" ");

    }
}
