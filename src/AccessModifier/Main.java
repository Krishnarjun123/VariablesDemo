package AccessModifier;

public class Main {
    public static void main(String[] args) {
        PublicModifier obj=new PublicModifier();
        obj.publicmodify();
        PrivateModifier obj1=new PrivateModifier();
        //obj1
        ProtectedModifier obj2=new ProtectedModifier();
        obj2.protectmodify();

    }
}
