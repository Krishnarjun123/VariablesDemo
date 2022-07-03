package AccessModifiers1;

import AccessModifier.PrivateModifier;
import AccessModifier.ProtectedModifier;
import AccessModifier.PublicModifier;

public class main {
    public static void main(String[] args) {
        PublicModifier obj=new PublicModifier();
        obj.publicmodify();
        PrivateModifier obj1=new PrivateModifier();
        //obj1
        ProtectedModifier obj2=new ProtectedModifier();
        //obj2
    }
}
