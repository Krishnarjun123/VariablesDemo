package Methods;

public class MethodsWithParameters {
    public void add1(int a, int b){
        int c=a+b;
        System.out.println(c);

    }

    public void sub(int a, float b){
        float c=b-a;
        System.out.println(c);
    }
    public void selectitem(String menuname, String item){
        System.out.println("Selecting"+menuname);
        System.out.println("Selecting"+item);
    }
}
