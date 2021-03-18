import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many pets do you have?: ");
        int amountOfPets = input.nextInt();

        ArrayList<ArrayList<String>> petsNameAndType = new ArrayList<ArrayList<String>>();
        ArrayList<Pet> pets = new ArrayList<Pet>();


        for(int i = 1; i <= amountOfPets; i++){
            ArrayList<String> pet = new ArrayList<>();

            System.out.print("What is the name of pet #" + i + "?: ");
            String petName = input.next();
            pet.add(petName);



            System.out.print("What is type of animal is " + petName + "?: ");
            String petType = input.next();
            pet.add(petType);
            System.out.println();


            petsNameAndType.add(pet);


            switch(petType){
                case "Dog":
                    pets.add(new Dog(petName));
                    break;
                case "Cat":
                    pets.add(new Cat(petName));
                    break;
                case "Horse":
                    pets.add(new Horse(petName));
                    break;
                case "Bird":
                    pets.add(new Bird(petName));
                    break;
                case "Snake":
                    pets.add(new Snake(petName));
                    break;
                default:
                    break;
            }


        }



        for(int j = 0; j < petsNameAndType.size(); j++){
            String nameToGive = petsNameAndType.get(j).get(0);
            pets.get(j).setName(nameToGive);
        }

        System.out.println(petsNameAndType);

        for(int x = 0; x < pets.size(); x++){
            System.out.print(pets.get(x).getName());
            System.out.print(" says ");
            pets.get(x).speak();
            System.out.println();
        }



    }
}
