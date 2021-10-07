    import java.util.ArrayList;
    import java.util.Scanner;
    import java.util.Random;

    public class Game {
        static String[] dogNames = {"Booby", "God", "Balder", "Muffe", "Fedtøre", "Gavtyv"};
        static String[] catNames = {"Diablo", "Sorte", "Mille", "Mephisto", "Madonna", "Dramaqueen"};
        static Random rand = new Random();
        static ArrayList<Tamagotchi> pets = new ArrayList<>();
        static Scanner scan = new Scanner(System.in);
        static boolean run;
        static int ID;

        public static String humanName = "";

        public static void userInput() {
            String selectPet = "";
            do {
                run = false;
                try {
                    System.out.println("\nWelcome to RØM's tamagotchi, your own virtual pet!\nWhat's your name?\n");
                    humanName = scan.nextLine();
                    System.out.println("Which pet would you like to nurse?");
                    selectPet = scan.nextLine();

                    if (!selectPet.equals("cat") && !selectPet.equals("dog")) {
                        System.out.println("Wrong input. Please try again.");
                        run = true;
                    } else {
                        createCatOrDogObject(selectPet);
                        ID++;
                    }
                    boolean runChoice;
                    do {

                        runChoice = false;
                        System.out.println("Would you like to create another pet? (Pets can play together) (y/n)");
                        String choice = scan.nextLine();
                        if (choice.equals("y")) {
                            run = true;
                        } else if (choice.equals("n")) {
                            run = false;
                        } else {
                            System.out.println("Illegal value! It must be either \"y\" or \"n\".");
                            runChoice = true;
                        }
                    } while (runChoice);
                } catch (Exception e) {
                    System.out.println("Wrong input. Please try again.");
                    run = true;
                }
            } while (run);


        }

        public static int mainPet() {
            int mainPet;
            if (pets.size() > 1) {
                System.out.println("Which one should be your main pet?");
                for (int i = 1; i <= Game.pets.size(); i++) {
                    System.out.println(i + ". " + Game.pets.get(i - 1).getName());
                }
                System.out.print("Insert the corresponding decimal: ");
                mainPet = scan.nextInt();
                return mainPet;
            } else {
                return 0;
            }
        }

        public static void createCatOrDogObject(String selectPet) {
            if (selectPet.equals("dog"))  {
                pets.add(new Dog(dogNames[random(6)],random(12),random(100), random(100), ID));
            } else {
                pets.add(new Cat(catNames[random(6)],random(12),random(100), random(100), ID));
            }
        }

        public static int random(int randomValue) {
            return rand.nextInt(randomValue);
        }

        public static void main(String[] args) {
            userInput();
        }
    }


