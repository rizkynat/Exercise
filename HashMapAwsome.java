package algorithm;
import java.util.HashMap;
public class HashMapAwsome {
    public static void main(String [] args){
        HashMap<String, Integer> happy = new HashMap<String,Integer>();
        System.out.println(happy.containsKey("a"));
        happy.put("a",10);
        happy.put("b", 3);
        happy.put("c", 88);
        //happy.clear();
        System.out.println(happy.get("c"));
    }
}
