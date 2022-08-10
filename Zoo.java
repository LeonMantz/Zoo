import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Zoo implements AnimalSound {

    static ArrayList<Animal> names = new ArrayList<Animal>();  //create an arraylist with type Animal

    public Zoo(ArrayList<Animal> names) {
        this.names = names;
    }

    public static ArrayList<Animal> getNames() {
        return names;
    }

    public static void setNames(ArrayList<Animal> names) {
        Zoo.names = names;
    }

    public static void searchName() {
        System.out.println("Enter the name of the animal you want to search for: ");
        Scanner a = new Scanner(System.in);                                             //get the user's input and search for it in the array list
        String b = a.next();
        boolean exists = false;
        for (var d : Zoo.names) {
            if (d.getName() != null && d.getName().contains(b)) {
                System.out.println("The animal exists");
                exists = true;
                break;
            }
        }
        if (!exists)
            System.out.println("The animal does not exits");

    }

    public static int searchCode() {

        Scanner a = new Scanner(System.in);
        System.out.println("Enter the code of the animal you want to search for: ");
        boolean c = false;                             //get the user's input and search for it in the array list
        String b = a.next();
        int position = 0;
        for (var d : Zoo.names) {
            if (d.getCode() != null && d.getCode().contains(b)) {
                System.out.println("The animal with code " + b + " exists");
                c = true;
                return position;
            }
            position = position + 1;
        }
        if (!c)
            System.out.println("The animal with code " + b + ", does not exits");
        return -1;
    }

    public static void PrintZoo() {  //print all the elements of array list if it is not empty

        if (Zoo.names.isEmpty()) {
            System.out.println("There are no animals in the Zoo");
        } else {
            System.out.println("These are all the animals in zoo: ");

            for (int i = 0; i < Zoo.names.size(); i++) {

                System.out.println(Zoo.names.get(i));
            }
        }
    }
    public static void DeleteAnimal(){  //delete an animal from the array list

        Scanner a = new Scanner(System.in);
        System.out.println("Enter the code of the animal you want to delete from the list of animals: ");
        boolean i = false;
        String b = a.next();                              //get user's input and search if it exists and then delete it from the arraylist
        for (var d : Zoo.names) {
            if (d.getCode() != null && d.getCode().contains(b)) {
                System.out.println("The animal with code " + b + " exists and it will be deleted");
                i = true;
                Zoo.names.remove(d);
                break;
            }
        }
        if (!i)
            System.out.println("The animal with code: " + b + ", does not exits");
    }



    public static void EditCharacteristic(Scanner input){

        Scanner a = new Scanner(System.in);
        System.out.println("Enter the code of the animal you want to process: ");
        boolean o = false;
        int p=0; //variable to save the position of the animal in the array list if it exists
        String b = a.next();
        for (var d : Zoo.names) {
            if (d.getCode() != null && d.getCode().contains(b)) {
                System.out.println("The animal with code " + b + " exists");
                o = true;
                System.out.println("What characteristic of the animal with code" + b + " do you want to search: ");
                System.out.println("------------------------------------\n");
                System.out.println("Press 1 to change it's name");
                System.out.println("Press 2 to change it's code");
                System.out.println("Press 3 to change it's weight");
                System.out.println("Press 4 to change it's special characteristic");
                System.out.print("Enter you choice here: ");
                Scanner input2 = new Scanner(System.in);
                int choice2 = input2.nextInt();
                if (choice2 == 1) {
                    System.out.print("Give a new name to the animal: ");
                    String name = input.next();
                    d.setName(name);
                } else if (choice2 == 2) {
                    System.out.print("Give a new code to the animal: ");
                    String code = input.next();
                    d.setCode(code);

                } else if (choice2 == 3) {
                    System.out.print("Give the real animal weight that you think the animal has : ");
                    float weight = input.nextFloat();
                    d.setWeight(weight);


                }
                else if(choice2 == 4){
                    if(Zoo.names.get(p) instanceof Snake){  //check if the animal that we want to edit is Snake
                        System.out.println("Enter the new level of poison");
                        int poison = input.nextInt();
                        ((Snake)Zoo.names.get(p)).setPoison(poison);
                    } else if (Zoo.names.get(p) instanceof Bear) {  //check if the animal that we want to edit is Bear
                        System.out.println("Enter the new height of the bear: ");
                        float height = input.nextFloat();
                        ((Bear)Zoo.names.get(p)).setHeight(height);
                    } else if (Zoo.names.get(p) instanceof Lion) {  //check if the animal that we want to edit is Lion
                        System.out.println("Enter the new strength of the lion: ");
                        int strength = input.nextInt();
                        ((Lion) Zoo.names.get(p)).setStrenght(strength);
                    } else if (Zoo.names.get(p) instanceof Giraffe) {  //check if the animal that we want to edit is Giraffe
                        System.out.println("Enter the new length of the giraffe's neck : ");
                        int length = input.nextInt();
                        ((Giraffe) Zoo.names.get(p)).setLengthneck(length);
                    } else if (Zoo.names.get(p) instanceof Penguin) {  //check if the animal that we want to edit is Penguin
                        System.out.println("Enter the new swimming speed of the penguin: ");
                        int speed = input.nextInt();
                        ((Penguin) Zoo.names.get(p)).setSwimmmingspeed(speed);
                    }
                }


                break;
            }
            p = p + 1;
        }
        if (!o)
            System.out.println("The animal with code: " + b + ", does not exits");

    }

    static void SaveFile(){            //save the array list
        File f = new File("filename.bin");

        try(ObjectOutputStream os = new ObjectOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(f)))) {
            os.writeObject(String.valueOf(names));
        }
        catch (IOException e) {
            System.err.println(e);
        }


    }


}




