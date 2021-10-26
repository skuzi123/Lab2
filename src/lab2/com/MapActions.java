package lab2.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MapActions implements CollectionTypes{


  void addHashMapElement(Integer key, Person person)
  {
      hashMap.put(key,person);
  }
    void addTreeMapElement(Integer key, Person person)
    {
        treeMap.put(key,person);
    }
 void removeHashMapElement(Integer key)
 {
     hashMap.remove(key);
 }
    void removeTreeMapElement(Integer key)
    {
        treeMap.remove(key);
    }

    void displayHashMap()
    {
        for(Person person : hashMap.values())
        {
            String output= String.format("| %10s | %10s| %5d | %10s |",person.getName(),person.getLastName(),person.getAge(),person.getJob());
            System.out.println(output);
        }
    }
    void displayTreeMap()
    {
        for(Person person : treeMap.values())
        {
            String output= String.format("| %10s | %10s| %5d | %10s |",person.getName(),person.getLastName(),person.getAge(),person.getJob());
            System.out.println(output);
        }
    }

    @Override
    public void actions() {
        Scanner s = new Scanner(System.in);
            System.out.println("Wybierz rodzaj Mapy, z której chcesz skorzystać");
            System.out.println("1.HashMap");
            System.out.println("2.TreeMap");
            int wybor_1=Integer.parseInt(s.nextLine());
            switch(wybor_1)
            {
                case 1:
                {
                    System.out.println("Wybierz operację, którą chcesz wykonać");
                    System.out.println("1.Dodawanie");
                    System.out.println("2.Odejmowanie");
                    System.out.println("3.Wyświetlanie");
                    int wybor_2 = Integer.parseInt(s.nextLine());

                    switch(wybor_2)
                    {

                        case 1:
                        {
                            System.out.println("Podaj imie: ");
                            String name = s.nextLine();
                            System.out.println("Podaj nazwisko: ");
                            String lastName=s.nextLine();
                            System.out.println("Podaj zawód: ");
                            String job=s.nextLine();
                            System.out.println("Podaj klucz: ");
                            Integer keys=s.nextInt();
                            Person person = new Person(name,lastName,job);
                            addHashMapElement(keys,person);
                            System.out.println(person.getName()+" "+person.getLastName()+" "+person.getAge()+" zostal dodany do HashMapy");
                            break;
                        }
                        case 2:
                        {

                            int key= Integer.parseInt(s.nextLine());
                            removeHashMapElement(key);
                            System.out.println("Element o kluczu "+key+" zostal usunięty z HashMapy");
                            break;
                        }
                        case 3:
                        {
                            displayHashMap();
                            break;
                        }
                    }
                    break;
                }
                case 2:
                {
                    int wybor_2 = s.nextInt();

                    switch(wybor_2)
                    {

                        case 1:
                        {
                            System.out.println("Podaj imie: ");
                            String name = s.nextLine();
                            System.out.println("Podaj nazwisko: ");
                            String lastName=s.nextLine();
                            System.out.println("Podaj zawód: ");
                            String job=s.nextLine();
                            System.out.println("Podaj klucz: ");
                            Integer keys=s.nextInt();
                            Person person = new Person(name,lastName,job);
                            addTreeMapElement(keys,person);
                            System.out.println(person.getName()+" "+person.getLastName()+" "+person.getAge()+" zostal dodany do TreeMapy");
                            break;
                        }
                        case 2:
                        {

                            int key= Integer.parseInt(s.nextLine());
                            removeTreeMapElement(key);
                            System.out.println("Element o kluczu "+key+ " zostal usunięty z TreeMapy");
                            break;
                        }
                        case 3:
                        {
                            displayTreeMap();
                            break;
                        }
                    }
                    break;
                }

    }
}
}
