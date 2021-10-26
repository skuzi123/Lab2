package lab2.com;

import java.util.*;

public class ListActions implements CollectionTypes{


  void addArrayListElement(Person person)
 {
      arrayList.add(person);

  }
    void addLinkedListElement(Person person)
    {
       linkedList.add(person);

    }

    void removeArrayListElement(int index)
    {
        arrayList.remove(index);
    }
    void removeLinkedListElement(int index)
    {
        linkedList.remove(index);
    }
    void displayArrayList()
    {

        for(Person person : arrayList)
        {
             String output= String.format("| %10s | %10s| %5d | %10s |",person.getName(),person.getLastName(),person.getAge(),person.getJob());
             System.out.println(output);

        }
    }
    void displayLinkedList()
    {
        for(Person person : linkedList)
        {
            String output= String.format("| %10s | %10s| %5d | %10s |",person.getName(),person.getLastName(),person.getAge(),person.getJob());
            System.out.println(output);

        }
    }

    Scanner s = new Scanner(System.in);
    @Override
    public void actions() {

        System.out.println("Wybierz rodzaj listy, z której chcesz skorzystać");
        System.out.println("1.ArrayList");
        System.out.println("2.LinkedList");
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
                        addArrayListElement(person);
                        System.out.println(person.getName()+" "+person.getLastName()+" "+person.getAge()+" zostal dodany do Arraylisty");
                        break;
                    }
                    case 2:
                    {

                        int index= Integer.parseInt(s.nextLine());
                        removeArrayListElement(index);
                        System.out.println("Element o indeksie "+index+ " zostal usunięty z Arraylisty");
                        break;
                    }
                    case 3:
                    {
                        displayArrayList();
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
                        addLinkedListElement(person);
                        System.out.println(person.getName()+" "+person.getLastName()+" "+person.getAge()+" zostal dodany do Linkedlisty");
                        break;
                    }
                    case 2:
                    {

                        int index= Integer.parseInt(s.nextLine());
                        removeLinkedListElement(index);
                        System.out.println("Element o indeksie "+index+ " zostal usunięty z Linkedlisty");
                        break;
                    }
                    case 3:
                    {
                        displayLinkedList();
                        break;
                    }
                }
                break;
            }
        }


    }
}
