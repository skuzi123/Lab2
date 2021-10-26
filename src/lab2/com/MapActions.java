package lab2.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MapActions implements CollectionTypes{

    private static final String MAP_MENU =
            """
                    Wybierz rodzaj mapy, z której chcesz skorzystać
                    1.HashMap
                    2.TreeMap
                    """;
 public void addHashMapElement(Integer key, Person person)
  {
      hashMap.put(key,person);
  }
    public  void addTreeMapElement(Integer key, Person person)
    {
        treeMap.put(key,person);
    }
    public void removeHashMapElement(Integer key)
 {
     hashMap.remove(key);
 }
    public  void removeTreeMapElement(Integer key)
    {
        treeMap.remove(key);
    }

    public  void displayHashMap()
    {
        for(Person person : hashMap.values())
        {
            String output= String.format("| %10s | %10s| %5d | %10s |",person.getName(),person.getLastName(),person.getAge(),person.getJob());
            System.out.println(output);
        }
    }
    public void displayTreeMap()
    {
        for(Person person : treeMap.values())
        {
            String output= String.format("| %10s | %10s| %5d | %10s |",person.getName(),person.getLastName(),person.getAge(),person.getJob());
            System.out.println(output);
        }
    }
    Scanner s = new Scanner(System.in);
    @Override
    public void actions() {

            System.out.println(MAP_MENU);
            int wybor_1=Integer.parseInt(s.nextLine());
            switch(wybor_1)
            {
                case 1:
                {
                    System.out.println(ACTION_MENU);
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
                            System.out.println("Podaj klucz(LICZBA): ");
                            Integer keys=s.nextInt();
                            Person person = new Person(name,lastName,job);
                            addHashMapElement(keys,person);
                            System.out.println(person.getName()+" "+person.getLastName()+" "+person.getAge()+" zostal dodany do HashMapy");
                            break;
                        }
                        case 2:
                        {
                            System.out.println("Podaj klucz(LICZBA): ");
                            if(hashMap.size()>=1)
                            {
                                try{
                                    int key= Integer.parseInt(s.nextLine());
                                    removeHashMapElement(key);
                                    System.out.println("Element o kluczu "+key+" zostal usunięty z HashMapy");
                                    break;
                                }catch(Exception e){
                                    System.out.println("NIE MA TAKIEGO ELEMENTU W HASHMAPIE");
                                }
                            }
                            else {
                                System.out.println("HASHMAPA JEST PUSTA");
                                break;
                            }
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
                    System.out.println(ACTION_MENU);
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
                            System.out.println("Podaj klucz(LICZBA): ");
                            Integer keys=s.nextInt();
                            Person person = new Person(name,lastName,job);
                            addTreeMapElement(keys,person);
                            System.out.println(person.getName()+" "+person.getLastName()+" "+person.getAge()+" zostal dodany do TreeMapy");
                            break;
                        }
                        case 2:
                        {

                            System.out.println("Podaj klucz(LICZBA): ");
                            if(treeMap.size()>=1)
                            {
                                try{
                                    int key= Integer.parseInt(s.nextLine());
                                    removeTreeMapElement(key);
                                    System.out.println("Element o kluczu "+key+" zostal usunięty z TreeMapy");
                                    break;
                                }catch(Exception e){
                                    System.out.println("NIE MA TAKIEGO ELEMENTU W TREEMAPIE");
                                }
                            }
                            else {
                                System.out.println("TREEMAPA JEST PUSTA");
                                break;
                            }
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
