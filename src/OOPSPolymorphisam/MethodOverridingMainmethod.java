package OOPSPolymorphisam;

public class MethodOverridingMainmethod {
    public static void main(String[] args) {
        MethodOverridingParent obj=new MethodOverridingChild();
        int output =obj.add(10,20);
        System.out.println(output);
    }
}
