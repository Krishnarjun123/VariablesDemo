package OOPSPolymorphisam;

public class MethodOverloading {
    public MethodOverloading(int a){
        System.out.println(a);
    }
    public MethodOverloading(int a, int b){
        System.out.println(a+b);
    }

    public void add(int a, int b){
      int c=a+b;
      System.out.println(c);
    }
    public void add(int a, int b, int c){
        int d=a+b;
        System.out.println(d);
    }
    public  void  add(float a, int b, int c){
        float d=a+b;
        System.out.println(d);
    }
}
