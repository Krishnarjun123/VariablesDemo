package AccessModifier;

public class PrivateModifier {
    private void privatemodify(){
        System.out.println("private modifier");

    }

    public static void main(String[] args) {
        PrivateModifier obj=new PrivateModifier();
        obj.privatemodify();
    }
}
