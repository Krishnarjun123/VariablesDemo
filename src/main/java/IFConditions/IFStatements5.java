package IFConditions;
//Requirement=Student should have first class and need to be check.

public class IFStatements5 {
    public static void main(String[] args) {
        int marks=65;
        String name="Phani";
        if(marks<35){
            System.out.println("fail");
        }
        if(marks>=60 && marks<=100){
            System.out.println("first class");
            if(name.equals("phani")){
                System.out.println("good");
            }
            else{
                System.out.println("improve");
            }
        }


        if(marks>=45 && marks<=59){
            System.out.println("second class");
        }
        if(marks>=35 && marks<=44){
            System.out.println("third class");
        }

    }
}
