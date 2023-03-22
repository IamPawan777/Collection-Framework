import java.util.*;

class ArrayDeq {
    public static void main(String[] args) {
        ArrayDeque ad1 = new ArrayDeque();
        ad1.add(23);
        ad1.add("naveen");
        ad1.add("naveen");
        System.out.println(ad1);

        ad1.addFirst('P');
        ad1.addLast('B');
        System.out.println(ad1);

        ad1.offer(232323);                  //it may be inserted or not also
        System.out.println(ad1);

        System.out.println(ad1.contains(23));                   //value may be insert or not also it is not mandatory
        }
}