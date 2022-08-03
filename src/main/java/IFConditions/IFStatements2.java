package IFConditions;
//Nested if.

public class IFStatements2 {
    public static void main(String[] args) {
        int marks=65;
        if(marks<35){
         System.out.println("fail");
        }
        if(marks>=60 && marks<=100){
            System.out.println("first class");
        }
        if(marks>=45 && marks<=59){
            System.out.println("second class");
        }
        if(marks>=35 && marks<=44){
            System.out.println("third class");
        }

    }
}
