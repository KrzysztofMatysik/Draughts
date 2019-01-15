import java.util.Scanner;

public class MainMenu {

    private String op1 = "Start game";
    private String op2 = "Load game";
    private String op3 = "Check rules";
    private String op4 = "The best time";
    private String op5 = "Exit";

    private Scanner choiceOpt;


    public void Welcome() {

        System.out.print("Welcome to draughts game.");
        System.out.print("Please select one of the option below.");
    }

    public void Menu() {

        int tempOpt = 0;

        do {
            choiceOpt = new Scanner(System.in);

            if (choiceOpt.hasNextInt()) {
                tempOpt = choiceOpt.nextInt();

                if (tempOpt < 1 || tempOpt > 5) {

                    System.out.println("The select option is no correct. Please choice again!");
                }
            } else {
                System.out.println("The select option is no correct. Please choice again!");
            }


        } while (tempOpt < 1 || tempOpt > 5);

        switch (tempOpt) {
            case 1:
                System.out.print("Opcja 1");
                //StartGame.main();
                break;
            case 2:
                System.out.print("Opcja 2");
                break;
            case 3:
                System.out.print("Opcja 3");
                break;
            case 4:
                System.out.print("Opcja 4");
                break;
            case 5:
                System.out.print("Opcja 5");
                break;
            default:
                System.out.print("Opcja default");
                break;

        }


    }


    public static void main(String[] args) {

        MainMenu mainMenu = new MainMenu();
        System.out.println("Start Tests");
        mainMenu.Menu();
    }
}
