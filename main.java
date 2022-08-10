import java.util.Scanner;

public class main {

    private static int snakes;   /* create a counter for each animal that I use for the auto complete of the animal code*/
    private static int bears;
    private static int lions;
    private static int giraffes;
    private static int penguins;

    public static void main(String[] args) {

        int selection;
        Scanner input = new Scanner(System.in);   /* ask from the user to choose one selection from the menu*/

        System.out.println("Choose from these choices");
        System.out.println("-------------------------\n");
        System.out.println("1 FOR PRINT ALL THE ANIMALS IN ZOO");
        System.out.println("2 FOR ADD A NEW ANIMAL");
        System.out.println("3 FOR SEARCH AN ANIMAL BY NAME");
        System.out.println("4 FOR SEARCH AN ANIMAL BY CODE (SN...for snakes,BR...for bears, etc)");
        System.out.println("5 FOR EDIT AN ANIMAL BY CODE (SN...for snakes,BR...for bears, etc)");
        System.out.println("6 FOR DELETE AN ANIMAL");
        System.out.println("7 FOR EXIT");
        System.out.println("GIVE THE CHOICE (NUMBER FROM 1 TO 7) : ");

        selection = input.nextInt();

        while (selection != 7) {


            if (selection == 2) {  //add an animal

                System.out.println("Which animal do you want to add in the zoo?");
                System.out.println("---------------------------\n");
                System.out.println("GIVE 1 For Snake");
                System.out.println("GIVE 2 For Bear");
                System.out.println("GIVE 3 For Lion");
                System.out.println("GIVE 4 For Giraffe");
                System.out.println("GIVE 5 For Penguin");
                System.out.println("Choose the animal: ");

                int choice = input.nextInt();

                System.out.println("Give a name: ");
                String name = input.next();
                System.out.println("Give weight: ");

                double weight = input.nextDouble();

                if (choice == 1) {  //check if the animal selection is Snake

                    System.out.println("Give how poisonous the snake is: ");

                    int poison = input.nextInt();

                    snakes = snakes + 1;  //increase the animal's counter

                    String code = String.format("SN%03d", snakes);

                    Snake s1 = new Snake(code, name, weight, poison);


                    Zoo.names.add(s1);  //add the new animal into the Zoo list


                } else if (choice == 2) {  //check if the animal selection is Bear

                    System.out.println("Give the tall of the bear: ");

                    int height = input.nextInt();

                    bears = bears + 1;   //increase the animal's counter

                    String code = String.format("BE%03d",bears);  //create the code of the Snake

                    Bear b1 = new Bear(code, name, weight, height);

                    Zoo.names.add(b1);   //add the new animal into the Zoo list


                } else if (choice == 3) {   //check if the animal selection is Lion

                    System.out.println("Give the strength of the lion: ");

                    int strength = input.nextInt();

                    lions = lions + 1;  //increase the animal's counter

                    String code = String.format("LI%03d",lions);   //create the code of the Lion

                    Lion l1 = new Lion(code, name, weight, strength);

                    Zoo.names.add(l1);  //add the new animal into the Zoo list

                } else if (choice == 4) {   //check if the animal selection is Giraffe

                    System.out.println("Give the length of giraffe's necks: ");

                    int lengthneck = input.nextInt();

                    giraffes = giraffes + 1;  //increase the animal's counter

                    String code = String.format("GI%03d",giraffes);   //create the code of the Giraffe

                    Giraffe g1 = new Giraffe(code, name, weight, lengthneck);

                    Zoo.names.add(g1);  //add the new animal into the Zoo list

                } else {   //check if the animal selection is Penguin

                    System.out.println("Give the swimming speed of the Penguin: ");

                    int swimmingspeed = input.nextInt();

                    penguins = penguins + 1;   //increase the animal's counter

                    String code = String.format("PE%03d",penguins);  //create the code of the Penguin

                    Penguin p1 = new Penguin(code, name, weight, swimmingspeed);

                    Zoo.names.add(p1);  //add the new animal into the Zoo list
                }


            } else if (selection == 1) {

                Zoo.PrintZoo();  //call the Print function

            } else if (selection == 3) {

                Zoo.searchName(); //call the SearchName function that searches an animal by name

            } else if (selection == 4) {

                Zoo.searchCode();  //call the SearchCode function that searches an animal by code

            } else if (selection == 6) {

                Zoo.DeleteAnimal();  //call the Delete function to delete an animal by code

            }else if(selection == 5) {

                Zoo.EditCharacteristic(input);  // call the Edit function that edit an animal characteristic by code

            }
            System.out.println("Enter another choice from the menu or enter 7 for exit: ");
            selection = input.nextInt();
            }
        Zoo.SaveFile();  //call the function that save the animals that the list has
        }
}




