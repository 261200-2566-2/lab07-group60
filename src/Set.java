import java.util.HashMap;
import java.util.Iterator;

public class Set<T>{
        private final HashMap<T,Object> map;
        private final Object preset = new Object();
        private String setName;
        private boolean added,removed,modified,containsAll;

        public Set(String setName){
                map = new HashMap<>();
                this.setName = setName;
                this.containsAll = true;
                this.modified = false;
                this.added = false;
                this.removed = false;


        }

        //Specify the size of the set of interest.
        public int size(){
                return map.size();
        }

        //If the set is empty, then add a value to it.
        public boolean add(T value){
                return map.put(value, preset) == null;
        }

        //If the set is not empty, then remove the value.
        public boolean remove(T value){
                return map.remove(value) != null;
        }

        //Check whether this value exists in the set of interest.
        public boolean contains(T value) {
                return map.containsKey(value);
        }

        //Check if the set is empty.
        public boolean isEmpty(){
                return map.isEmpty();
        }

        //Add all the members of this set to the set of interest.
        public boolean addAll(Set<? extends T> s) {
                for (T element : s.map.keySet()) {
                        //Loop through all keys in Set s.
                        if (!map.containsKey(element)) {
                                //If the element we have is not the same as the one being added, then add the differing element to our set.
                                map.put(element, preset);
                                this.added = true;
                        }
                }
                return this.added;
        }

        //Remove all members from the set of interest.
        public boolean removeAll(Set<? extends T> s) {
                Iterator<T> iterator = map.keySet().iterator();
                while (iterator.hasNext()) {
                        //Continue until there are no values left.
                        T element = iterator.next();
                        //Create an element to store the data we have.
                        if (s.map.containsKey(element)) {
                                iterator.remove();
                                //Check which elements we have that do match those of interest and remove all them.
                                this.removed = true;
                        }
                }
                return this.removed;
        }

        //Check if all the members of this set are the same as the members of the set of interest.
        public boolean containsAll(Set<? extends T> s) {
                for (T element : s.map.keySet()) {
                        //Loop through all keys in Set s.
                        if (!map.containsKey(element)) {
                                //If the key in Set s is not in the current object's map, set this.containsAll to false.
                                this.containsAll = false;
                                //Stop the operation.
                                break;
                        }
                }

                if (this.containsAll) {
                        System.out.println(this.setName + " contains all elements of the specified " + s.setName);
                } else {
                        System.out.println(this.setName + " does not contain all elements of the specified " + s.setName);
                }

                return this.containsAll;
        }

        //Keep only the members that are common to both sets and the set of interest.
        public boolean retainAll(Set<? extends T> s) {
                Iterator<T> iterator = map.keySet().iterator();
                //Create an iterator to store data.
                while (iterator.hasNext()) {
                        //Continue until there are no values left.
                        T element = iterator.next();
                        //Create an element to store the data we have.
                        if (!s.map.containsKey(element)) {
                                //Check which elements we have that do not match those of interest and remove them.
                                iterator.remove();
                                this.modified = true;
                        }
                }

                if (this.modified) {
                        System.out.println(this.setName + " has been modified after retainAll operation");
                } else {
                        System.out.println(this.setName + " has not been modified after retainAll operation");
                }

                return this.modified;
        }

        //clear set.
        public void clear() {
                map.clear();
        }

        //Print the name and size of the set.
        public void print(){
                System.out.println(this.setName + " elements are : " + map.keySet());
                System.out.println("Size is: " + map.size() + "\n");
        }
}
