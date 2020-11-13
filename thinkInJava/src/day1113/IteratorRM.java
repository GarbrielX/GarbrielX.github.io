package day1113;

import java.util.*;

public class IteratorRM {
    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();
        for (int i=0;i<10;i++){
            list.add(i);
        }
        Iterator<Integer> it = list.iterator();
        for (int i=0;i<5;i++){
            it.next();
            it.remove();
        }
        System.out.println(list);
    }
}
