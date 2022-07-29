package WrapperClasses;

public class wrapperclass {
    public static void main(String[] args) {
        int a=20;
        Integer i=Integer.valueOf(a);//Autoboxing.
        Integer j=a;
        System.out.println(a+" "+i+" "+j);

        Integer b=new Integer(3);
        int k=b;
        System.out.println(k);//unboxing;

        //String converted into int;
        String x="100";
        System.out.println(x+20);
        int f=Integer.parseInt(x);
        float h=Float.parseFloat(x);
        double g=Double.parseDouble(x);
        short l=Short.parseShort(x);
        System.out.println(x);

        // int converted into String;
        int y=110;
        String value=String.valueOf(y);
        System.out.println(value);

        //Type casting double z=(double)y; Ex: Integer is converted into double data type'


    }
}
