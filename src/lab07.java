import java.util.Arrays;
import java.util.Collection;
public class lab07{
    public static void main(String[] args) {

        /** test case **/
        setUsingHashMap <String> a = new setUsingHashMap<>();
        /** check new set **/
        System.out.println("create new set by using Hash map");
        System.out.println(a);
        System.out.println("Size : " + a.size());
        System.out.println("Is empty ? : " + a.isEmpty());
        System.out.println("======================================");

        /** normal add **/
        System.out.println("add one by one");
        a.add("Hello");
        a.add("world");
        a.printSet();
        System.out.println("Is empty ? : " + a.isEmpty());
        System.out.println("======================================");

        /** normal remove **/
        System.out.println("remove one by one");
        a.remove("Hello");
        a.printSet();
        System.out.println("======================================");

        /** normal contain **/
        System.out.println("simple contain check");
        System.out.println("contain Hello > " + a.contains("Hello"));
        System.out.println("contain Hello > " + a.contains("world"));
        System.out.println("======================================");

        /** clear **/
        System.out.println("clear all");
        a.clear();
        a.printSet();
        System.out.println("Size : " + a.size());
        System.out.println("Is empty ? : " + a.isEmpty());
        System.out.println("======================================");

        /** use addAll method to add Strings into set **/
        System.out.println("addAll method");
        Collection<String> collection = Arrays.asList("Merry", "Xmas", "new year", "2022" , "to" , "2023");
        a.addAll(collection);
        a.printSet();
        System.out.println("Size : " + a.size());
        System.out.println("======================================");

        /** removeAll **/
        System.out.println("removeAll method");
        Collection<String> remove = Arrays.asList("2023" , "new year");
        System.out.println("remove : " + remove);
        a.removeAll(remove);
        a.printSet();
        System.out.println("======================================");

        /** retainAll **/
        System.out.println("retainAll method");
        Collection<String> retain = Arrays.asList("Merry" , "Xmas" , "2022");
        System.out.println("Retain all : " + retain + " => " + a.retainAll(retain));
        a.printSet();
        System.out.println("Size : " + a.size());
        System.out.println("======================================");

        /** containAll **/
        System.out.println("containAll method");
        a.printSet();
        System.out.println("Contain all : " + collection + " => " +a.containsAll(collection));
        System.out.println("======================================");
    }
}
