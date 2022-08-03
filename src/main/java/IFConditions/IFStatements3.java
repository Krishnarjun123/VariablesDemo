package IFConditions;
 //Nested if else;

public class IFStatements3 {
 public static void main(String[] args) {
  int marks=105;
  if(marks<35){
   System.out.println("fail");
  }
 else if(marks>=60 && marks<=100){
   System.out.println("first class");
  }
  else if(marks>=45 && marks<=59){
   System.out.println("second class");
  }
  else if(marks>=35 && marks<=44){
   System.out.println("third class");
  }
  else{
   System.out.println("marks are not valid");
  }

 }
}
