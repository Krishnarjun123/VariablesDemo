package ForLoopEx;

public class ForLoopExamples {
    public static void main(String[] args) {
        //SUM OF FIRST 10 NUMBERS;
         int sum=0;
         for (int i=1;i<=10;i++){
             sum=sum+i;
         }
        System.out.println(sum);

         //AVG OF FIRST 10 NUMBERS;
        double Average=(double) sum/10;
        System.out.println(Average);

        //SUM OF THE ELEMENTS IN THE ARRAY;
        int [] a={1,2,3,4,5,6,7,8,9,10};
          sum=0;
        for (int i=0;i<=a.length-1;i++){
            sum=sum+a[i];
        }
        System.out.println(sum);
//SWAPPING OF TWO NUMBERS WITH THIRD VARIABLE.
        int c=10;
        int d=20;
        int temp;
        temp=c;
        c=d;
        d=temp;
        System.out.println(c);
        System.out.println(d);
//SWAPPING OF TWO NUMBERS WITHOUT THIRD VARIABLE.
        int e=10;
        int f=20;
        e=e+f;
        f=e-f;
        e=e-f;
        System.out.println(e);
        System.out.println(f);
//PATTERN PROGRAM-1 i.e PRINTING OF STARS; i.e Stars are printing with respect to rows with increasing level.i.e first Row-*, 2nd Row-**;
       // 3rd Row-***;  Here i=Rows; j=Columns(stars);
        for(int i=1; i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
 // PATTERN PROGRAM-2 i.e PRINTING OF STARS; i.e Stars are printing with respect to rows  with decreasing level;
        //k=Rows; l=Columns(stars);

         for(int k=1;k<=5;k++){
             for(int l=5;l>=k;l--){
                 System.out.print("*");
             }
             System.out.println();

         }
 //Particular name finding in Names array;
        String [] names={"Manoj","naveen","Krishna","Arjun"};
         for(int m=0;m<= names.length-1;m++){
             System.out.println(names[m]);
             if(names[m].equals("naveen")){
                 System.out.println("Naveen is available");
                 break;
             }
         }




    }
}
