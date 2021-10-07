import java.util.Random;
import java.util.Timer;

public class Tamagotchi {

    public Random rand = new Random();

    private String name;
    private int age;
    private int mood = 50;
    private int energy = 50;
    private double treat = 0;
    private int level = 0;
    private int experience = 0;
    private int health = 100;
    private int ID;

    public Tamagotchi (String name, int age, int mood, int energy, int ID) {
        this.name = name;
        this.age = age;
        this.mood = mood;
        this.energy = energy;
        this.ID = ID;
    }

    public void setEnergy(int energy) {
        if (energy > 0) {
            System.out.println(this.getName() + " gets " + energy + " energy.");
        } else {
            System.out.println(this.getName() + " loses " + energy + " energy.");
        }
        this.energy += energy;
    }

    public void setHealth(int health) {
        if (health > 0) {
            System.out.println(this.getName() + " gets " + health + "health.");
        } else {
            System.out.println(this.getName() + " loses " + health + "health.");
        }
        this.health += health;
    }

    public void tick() {
        energy -= 1;
        mood -= 1;
        if (energy == 0 && mood == 0) {
            health -= 2;
        } else if (energy == 0) {
            health -= 1;
        }
    }
    public void playWithOtherPet() {
        System.out.println("Which pet does " + name + " want to play with?");
        for (int i = 1; i <= Game.pets.size(); i++) {
            System.out.println(i + ". " + Game.pets.get(i - 1).getName());
        }
        System.out.print("Insert corresponding decimal value: ");
        int play = Game.scan.nextInt();
        System.out.println(name + " played with " + Game.pets.get(play - 1).getName() + ".");
        this.setExperience(50);
        this.setMood(10);
        this.setEnergy(-10);
        Game.pets.get(play - 1).setExperience(50);
        Game.pets.get(play - 1).setMood(10);
        Game.pets.get(play - 1).setEnergy(-10);
    }

    public void setMood(int mood) {
        this.mood += mood;
    }

    public String getMood() {
        if (mood < 20) {
            return "has " + mood + ", so it is very sad";
        } else if (mood < 40) {
            return "has " + mood + ", so it is sad";
        } else if (mood < 60) {
            return "has " + mood + ", so it is neutral";
        } else if (mood < 80) {
            return "has " + mood + ", so it is happy";
        } else {
            return "has " + mood + ", so it is very happy";
        }
    }

    public int getMoodInt() {
        return mood;
    }

    public void setExperience(int experience) {
        System.out.println(name + " gets " + experience + ".");
        this.experience += experience;
    }

    public int getExperience() {
        return experience;
    }

    public void setTreat(double treat) {
        this.treat += treat;
    }

    public double getTreat() {
        return treat;
    }

    public void eat() {
        if (treat >= 1) {
            treat -= 1;
            System.out.println(name + "ate a treat");
            energy += 2;
        } else {
            System.out.println(name + " has no treats! Go do some intense groveling for " + Game.humanName);
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void levelUp() {
        if (experience >= 50 && level == 0) {
            level += 1;
            System.out.println(getName() + " has reached level 1!");
        } else if (experience >= 200 && level == 1) {
            level += 1;
            System.out.println(getName() + " has reached level 2!");
        } else if (experience >= 500 && level == 2) {
            level += 1;
            System.out.println(getName() + " has reached level 3!");
        } else if (experience >= 1000 && level == 3) {
            level += 1;
            System.out.println(getName() + " has reached level 4!");
        } else if (experience >= 2000 && level == 4) {
            level += 1;
            System.out.println(getName() + " has reached level 5!");
        } else if (experience >= 3500 && level == 5) {
            level += 1;
            System.out.println(getName() + " has reached level 6!");
        } else if (experience >= 5500 && level == 6) {
            level += 1;
            System.out.println(getName() + " has reached level 7!");
        } else if (experience >= 8000 && level == 7) {
            level += 1;
            System.out.println(getName() + " has reached level 2!");
        } else if (experience >= 11000 && level == 8) {
            level += 1;
            System.out.println(getName() + " has reached level 9!");
        } else if (experience >= 20000 && level == 9) {
            level += 1;
            System.out.println("Congrats! " + getName() + " has reached maximum level 10!");
        }
    }

    public void setLevel(int level) {
        this.level = level;
    }

    int getLevel() {
        return level;
    }
    public void sleep() {
        System.out.println(name + " has been sleeping!");
        setEnergy(20);
    }

    public void options() {
        System.out.println(name + " is " + age + " years old, has " + energy + " energy, has " + mood + " mood, so it is " + getMood() + ".");
        System.out.println("What do you want to do now?");
        System.out.println("1. play\n2. eat\n3. sleep");

    }
}
