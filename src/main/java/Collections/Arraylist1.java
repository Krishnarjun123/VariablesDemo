
package Collections;

import java.util.ArrayList;

public class Arraylist1 {
    public static void main(String[] args) {
        ArrayList obj=new ArrayList();
        //Retrieving size of n array;
        System.out.println(obj.size());
        // Adding elements into the arraylist;
        obj.add(10);
        obj.add(20);
        obj.add(30);
        obj.add("naveen");
        System.out.println(obj);
//Retrieving elements into the array;
        System.out.println(obj.get(0));
//Print all the elements in the array list;
        for(int i=0;i<=obj.size()-1;i++){
            System.out.println(obj.get(i));
//Print all the elements using for each loop;
            for (Object e:obj){
                System.out.println(e);
//Here Object=data type, e=variable, obj=data saved object i.e= as mentioned above.

//GENERIC COLLECTIONS.Only applicable for specific data type.
                ArrayList<Integer> a=new ArrayList<Integer>();

//Ex: to find the all the link elements in the Amazon application;
             ArrayList<String> linknames=new ArrayList<String>();
             linknames.add("naveen");
             linknames.add("sreenu");
             linknames.add("suhasini");
             linknames.add("cb");
//Contains method;
           /*  System.out.println(linknames.contains("cb")); */
             int count=linknames.size();
             for (i=0;i<=count-1;i++){
                 System.out.println(linknames.get(i));
                 if(linknames.get(i)=="suhasini"){
                     System.out.println("click operation");
                     break;
                 }
             }



            }
        }
       //Normal Array Declaration;
       /*int [] a=new int[5];*/
    }
}
