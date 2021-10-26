package lab2.com;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        Application application= new Application();
        application.startLoop();
    }
    
    public void startLoop()
    {
        ListActions listActions= new ListActions();
        SetActions setActions= new SetActions();
        MapActions mapActions= new MapActions();

        Scanner s = new Scanner(System.in);
        while(true)
        {
            System.out.println();
            System.out.println("MENU GLOWNE");
            System.out.println("Wybierz kolekcję, z której chcesz skorzystać");
            System.out.println("1.List");
            System.out.println("2.Set");
            System.out.println("3.Map");
            int wybor=Integer.parseInt(s.nextLine());

            switch(wybor)
            {
                case 1:
                {
                    listActions.actions();
                    break;
                }
                case 2:
                {

                    setActions.actions();
                    break;
                }
                case 3:
                {

                    mapActions.actions();
                    break;
                }

            }

        }

    }
}
