import java.util.*;


public class Program {
    
    private static HashMap<Integer,Object> hashMap = new HashMap<>();
    private static final Object o = new Object();

    private static String getToString(){
        return hashMap.keySet().toString();
    }

    private static int numb(int num){
        return (Integer)hashMap.keySet().toArray()[num];
    }

    private static void getAdd(Integer numbs){
        hashMap.put(numbs, o);
    }

    public static void main(String[] args) {
        getAdd(1);
        getAdd(2);
        getAdd(3);

        System.out.println(numb(1));
        System.out.println(numb(2));

        System.out.println(getToString());

    }
}