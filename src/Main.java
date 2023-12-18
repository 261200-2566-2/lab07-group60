public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new Set<>("set1");
        set1.add(1);
        set1.add(2);
        set1.add(3);
//        set1.add(4);
        set1.print();

        Set<Integer> set2 = new Set<>("set2");
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.print();

//        set1.addAll(set2);
//        set1.print();
//        set1.removeAll(set1);
//        set1.print();

//        set1.containsAll(set2);
        set1.retainAll(set2);
        set1.print();

    }
}
