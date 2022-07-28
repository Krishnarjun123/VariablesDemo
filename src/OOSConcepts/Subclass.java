package OOSConcepts;

public class Subclass extends Base{
    public Subclass (String name){
        super(name);
    }


    public void sub (int a, int b, int c){
       int addoutput= super.add(10,20);
        int d=addoutput-c;
        System.out.println(d);


    }
}
