package lab2.com;

import java.util.*;

public interface CollectionTypes  {
    //private Collection<Person> collection = null;
    List<Person> arrayList=new ArrayList<>();
    List<Person> linkedList=new LinkedList<>();
    Set<Person> hashSet=new HashSet<>();
    Set<Person> treeSet=new TreeSet<>();
    Map<Integer,Person> hashMap= new HashMap<>();
    Map<Integer,Person> treeMap= new TreeMap<>();

    void actions();


}
