package Abstraction;

public abstract class AbstractionConcept {
    public AbstractionConcept(int a){
        System.out.println("parent constructor"+a);
    }
    public abstract void add();

    public void mul(){
        int a=40;
        int b=50;
        System.out.println(a*b);
    }
}
