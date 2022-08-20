package Collections;

import com.sun.javafx.collections.MappingChange;

import java.util.HashMap;
import java.util.Map;

public class HashmapEx {
    public static void main(String[] args) {
        Map<String,Integer> obj=new HashMap<String,Integer>();
//Adding the elements in Map by using put method;
        obj.put("Naveen", 100);
        obj.put("Srinivas", 200);
        obj.put("Raju", 300);
        obj.put("null", 800);
        obj.put("null", 900);
        obj.put("cb",null);
        obj.put("cb1",null);
        System.out.println(obj);
//It will allow unique key but multiple values;
// HashMap will allow values through key and value;
// To Retrieve the all the values by using for each loop;
        obj.forEach((k,v)->System.out.println(k+":"+v));

//Entry set method;
     for (Map.Entry m:obj.entrySet()){
         System.out.println(m.getKey()+""+m.getValue());
//CONTAINS METHOD;
      System.out.println(obj.containsKey("Naveen"));
//REPLACE METHOD;
       obj.replace("Naveen",200) ;
       System.out.println(obj);
//REMOVE METHOD;
       obj.remove("cb1");
       System.out.println(obj);
     }

    }
}
