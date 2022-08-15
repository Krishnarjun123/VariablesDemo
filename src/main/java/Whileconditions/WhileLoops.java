package Whileconditions;
public class WhileLoops {
    // Sum of 10 numbers using while loops.
    public static void main(String[] args) {
      /*  int i=1;
        int sum=0;
        while(i<=10){
            sum=sum+i;
            i++;
        }
        System.out.println(sum);*/

        //REVERSE DIGITS OF A NUMBER;
      /*  int no=987654;
        int reverse=0;
        while (no!=0){

            int remainder=no%10;
            reverse=reverse*10+remainder;
            no=no/10;

        }
        System.out.println(reverse);*/
        //DO WHILE.
        //Sum of 10 numbers;

      /*  int i=1;
        int sum=0;
        do{
            sum=sum+i;
            i++;
        }while (i<=10);
        System.out.println(sum);*/

        //SWITCH STATEMENTS
        String browser="chrome";
        switch (browser){
            case "chrome":System.out.println("working on chrome browser");
                       break;
            case "ie":System.out.println("working on ie browser");
                        break;
            case "edge":System.out.println("working on edge browser");
                        break;
            default:System.out.println("chrome browser");
                       break;
        }

    }
}
