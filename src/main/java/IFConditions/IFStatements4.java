package IFConditions;

//Along with Result(fail or 1st class), name should print.
public class IFStatements4 {
    public static void main(String[] args) {
        int marks=34;
        String name="phani";
        if(marks<35){
            System.out.println("fail");
            System.out.println("name");
        }
        else if(marks>=60 && marks<=100){
            System.out.println("first class");
            System.out.println("name");
        }
        else if(marks>=45 && marks<=59){
            System.out.println("second class");
            System.out.println("name");
        }
        else if(marks>=35 && marks<=44){
            System.out.println("third class");
            System.out.println("name");
        }
        else{
            System.out.println("marks are not valid");
        }
    }
}
