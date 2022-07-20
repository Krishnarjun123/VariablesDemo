package OOPSPolymorphisam;

public class MethodOverridingChild extends MethodOverridingParent{
    public int add(int a, int b){
        int parentoutput=super.add(a,b);
        return parentoutput+5;
    }
}
