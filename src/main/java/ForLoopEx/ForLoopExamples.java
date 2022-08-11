package ForLoopEx;

public class ForLoopExamples {
    public static void main(String[] args) {
        //SUM OF FIRST 10 NUMBERS;
    /*     int sum=0;
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
        System.out.println(sum);*/
//SWAPPING OF TWO NUMBERS WITH THIRD VARIABLE.
       /* int c=10;
        int d=20;
        int temp;
        temp=c;
        c=d;
        d=temp;
        System.out.println(c);
        System.out.println(d);*/
//SWAPPING OF TWO NUMBERS WITHOUT THIRD VARIABLE.
       /* int e=10;
        int f=20;
        e=e+f;
        f=e-f;
        e=e-f;
        System.out.println(e);
        System.out.println(f);*/
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
   /*     String [] names={"Manoj","naveen","Krishna","Arjun"};
         for(int m=0;m<= names.length-1;m++){
             System.out.println(names[m]);
             if(names[m].equals("naveen")){
                 System.out.println("Naveen is available");
                 break;
             }
         }
*/
        //Reverse characters of a string; i.e we want to print hseniD;
       /* String input="Dinesh";
        String output="";
        char [] ch=input.toCharArray();
        for(int i=0;i<=ch.length-1;i++){
            output=ch[i]+output;
        }
        System.out.println(output);*/
        //One more example for above things.
      /*  String input="I love my country";
        String output="";
        String [] splittedstring=input.split(" ");
        for(int i=0;i<=splittedstring.length-1;i++){
            output=splittedstring[i]+" "+output;

        }
        System.out.println(output);*/
       /* //Retrieve the substring frm a string
        String input="Vasundhara@gmail.com";*/

        //sum of the elements in a string.
      /*  String input="na12ve34en56";
        int sum=0;
        char [] ch=input.toCharArray();
        for(int i=0;i<=ch.length-1;i++){
            if(Character.isDigit(ch[i])){
                char ch1=ch[i];
                int no=Character.getNumericValue(ch1);
                sum=sum+no;
            }
        }
        System.out.println(sum);*/

        //Sum of the elements in a int array;
       /* int [] a={10,20,30,40,50};
        int sum=0;
        for(int i=0;i<=a.length-1;i++){
            sum=sum+a[i];
        }
        System.out.println(sum);*/
        // ASCENDING ORDER OF AN ARRAY;
        int [] a={10,3,5,11,20,18,9};
        int temp;
        for (int i=0;i<=a.length-1;i++){
            for(int j=i+1;j<=a.length-1;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }

        }
        for(int k=0;k<=a.length-1;k++){
            System.out.println(a[k]);
        }
//DESCENDING ORDER OF AN ARRAY;
        for(int l=a.length-1;l>=0;l--){
            System.out.println(a[l]);
        }
//FIND THE 2ND HIGHEST ELEMENT IN THE ARRAY;
        System.out.println("Second highest element:"+a[a.length-2]);
        System.out.println("Second smallest number:"+a[1]);
    }
}
