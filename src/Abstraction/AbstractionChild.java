package Abstraction;

public class AbstractionChild extends AbstractionConcept {

    public AbstractionChild(int a) {
        super(a);
    }

    @Override
    public void add() {
        int a=10;
        int b=20;
        System.out.println(a+b);
    }

    public void sub(){
        int a=30;
        int b=20;
        System.out.println(a-b);
    }
}
