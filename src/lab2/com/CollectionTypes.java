package lab2.com;

import java.util.*;

public interface CollectionTypes  {
    String ACTION_MENU=
            """
                    Wybierz operację, którą chcesz wykonać
                    1.Dodawanie
                    2.Odejmowanie   
                    3.Wyświetlanie                                   
                    """;
    //private Collection<Person> collection = null;
     List<Person> arrayList=new ArrayList<>();
     List<Person> linkedList=new LinkedList<>();
     Set<Person> hashSet=new HashSet<>();
     Set<Person> treeSet=new TreeSet<>(new SetActions.Tree_SetComparator());
     Map<Integer,Person> hashMap= new HashMap<>();
     Map<Integer,Person> treeMap= new TreeMap<>();

static class Tree_SetComparator implements Comparator<Person>
{
    @Override
    public int compare(Person o1, Person o2) {
        return 0;
    }
}
    void actions();


}
