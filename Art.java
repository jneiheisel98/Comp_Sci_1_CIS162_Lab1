
/**
 * Write a description of class Art here.
 * title for main method is drawGM because I am drawing the GM logo in this
 *
 * @author Jacob Neiheisel
 * @for_class: CIS 162 section 09 Professor Posada
 * @version 29 August 2020 edition
 */
public class Art
{

    public static void drawGM(){

        //very top of logo
        System.out.println("_____________________________________________________________________________________ _____________________________________________________________________________________________________");

        //before the leffers, the below helps to create the blue space.

        for(int i = 0; i<6; i++){
            System.out.println("|                                                                                                                                                                                        | ");
        }

        System.out.println("|                                              ___________________                               ________                ________                                                        | ");
        System.out.println("|                                             /      ______       \\                              |       \\              /       |                                                        |  ");
        System.out.println("|                                            /      /      \\       \\                             |        \\            /        |                                                        | ");
        System.out.println("|                                            |      |       |_______\\                            |         \\          /         |                                                        | ");
        System.out.println("|                                            |      |       _________                            |    |\\    \\        /    /|    |                                                        | ");
        System.out.println("|                                            |      |      |_        |                           |    | \\    \\      /    / |    |                                                        |");
        System.out.println("|                                            |      |        |       |                           |    |  \\    \\    /    /  |    |                                                        | ");
        System.out.println("|                                            |       \\______/        |                           |    |   \\    \\  /    /   |    |                                                        |");
        System.out.println("|                                            \\_______________/|______|                           |____|    \\__________/    |____|                                                        | ");

        //establishing the blue space again before the bottom GM rectangle logo

        for(int i = 0; i<3; i++){
            System.out.println("|                                                                                                                                                                                        | ");
        }
        System.out.println("|                                             ___________________________________________________________________________________                                                        |");

        //creation of the more white space for the rectangle below the GM

        for(int i=0; i<4; i++){
            System.out.println("|                                            |                                                                                   |                                                       | ");
        }
        System.out.println("|                                            |___________________________________________________________________________________|                                                       | ");

        //more blue space before the logo ends

        for(int i = 0; i<6; i++){
            System.out.println("|                                                                                                                                                                                        | ");
        }

        //end of logo                        
        System.out.println("|________________________________________________________________________________________________________________________________________________________________________________________| ");
    }
}