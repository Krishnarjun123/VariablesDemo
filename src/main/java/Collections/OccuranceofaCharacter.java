package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class OccuranceofaCharacter {
    public static void main(String[] args) {
        String s1="Australia";
        char[] ch=s1.toCharArray();
        HashMap<Character,Integer> map=new LinkedHashMap<Character, Integer>();
        for(int i=0;i<=ch.length-1;i++){
            char ch1=ch[i];
            int count=1;
            if(map.containsKey(ch1)){
                int existingcunt=map.get(ch1);
                existingcunt=existingcunt+1;
                map.replace(ch1,existingcunt);
            }
            else {
                map.put(ch1,count);
            }
        }
        map.forEach((k,v)->System.out.println(k+":"+v));
    }
}
