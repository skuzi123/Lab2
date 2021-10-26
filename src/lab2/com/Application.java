package lab2.com;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Application {

private static final String MENU =
        """
                MENU GLOWNE
                Wybierz kolekcję, z której chcesz skorzystać
                1.List
                2.Set
                3.Map
                0.Zakończ program
                """;
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
            System.out.println(MENU);
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
                case 0:
                {
                    System.exit(0);
                }

            }

        }

    }
}
