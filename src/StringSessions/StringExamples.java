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
    }
}
