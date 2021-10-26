package lab2.com;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SetActions implements CollectionTypes {

    void addHashSetElement(Person person)
    {
        hashSet.add(person);
    }
    void addTreeSetElement(Person person)
    {
        treeSet.add(person);
    }
   void removeHashSetElement(Person person)
   {
       hashSet.remove(person);
   }
    void removeTreeSetElement(Person person)
    {
        treeSet.remove(person);
    }
    void displayHashSet()
    {
        for(Person person : hashSet)
        {
            String output= String.format("| %10s | %10s| %5d | %10s |",person.getName(),person.getLastName(),person.getAge(),person.getJob());
            System.out.println(output);
        }
    }
    void displayTreeSet()
    {
        for(Person person  : treeSet)
        {
            String output= String.format("| %10s | %10s| %5d | %10s |",person.getName(),person.getLastName(),person.getAge(),person.getJob());
            System.out.println(output);
        }
    }


    @Override
    public void actions() {
        Scanner s = new Scanner(System.in);
        System.out.println("Wybierz rodzaj set, z której chcesz skorzystać");
        System.out.println("1.HashSet");
        System.out.println("2.TreeSet");
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
                        Person person = new Person(name,lastName,job);
                        addHashSetElement(person);
                        System.out.println(person.getName()+" "+person.getLastName()+" "+person.getAge()+" zostal dodany do HashSetu");
                        break;
                    }
                    case 2:
                    {
                        System.out.println("Podaj imie: ");
                        String name = s.nextLine();
                        for (Person person: hashSet)
                        {
                            if (person.getName().equals(name))
                            {
                                removeHashSetElement(person);
                                break;
                            }
                        }
                        System.out.println("Element zostal usunięty z HashSetu");
                        break;
                    }
                    case 3:
                    {
                        displayHashSet();
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
                        Person person = new Person(name,lastName,job);
                        addHashSetElement(person);
                        System.out.println(person.getName()+" "+person.getLastName()+" "+person.getAge()+" zostal dodany do TreeSetu");
                        break;
                    }
                    case 2:
                    {

                        System.out.println("Podaj imie: ");
                        String name = s.nextLine();
                        for (Person person: treeSet)
                        {
                            if (person.getName().equals(name))
                            {
                                removeTreeSetElement(person);
                                break;
                            }
                        }
                        System.out.println("Element zostal usunięty z TreeSetu");
                        break;
                    }
                    case 3:
                    {
                        displayTreeSet();
                        break;
                    }
                }
                break;
            }
        }
    }
}
