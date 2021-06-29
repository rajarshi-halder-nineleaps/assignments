import java.util.HashMap;

public class hashMap {
    public static void main(String args[]){
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"ONE");
        map.put(2,"TWO");
        map.forEach((key,value) -> System.out.println(key + " : " + value));
    }
}