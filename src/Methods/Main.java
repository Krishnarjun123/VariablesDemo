package Methods;

public class Main {
    public static void main(String[] args) {
        DefaultMethods obj=new DefaultMethods();
        obj.add();
        MethodWithReturnType obj1=new MethodWithReturnType();
       int output= obj1.add();
       System.out.println(output);
       String name=obj1.name();
       System.out.println(name);
       boolean flag=MethodWithReturnType.displayed();



       obj1.add1(30,40);

        MethodsWithParameters obj2=new MethodsWithParameters();
        obj2.add1(50,60);
        obj2.selectitem("men","Tshirts");

    }
}
