public class Dog extends Tamagotchi{

    public Dog (String name, int age, int mood, int energy, int dogID) {
        super(name, age, mood, energy, dogID);
    }

    public void henlo() {
        System.out.println("Henlo!");
    }

    public void play() {
        if ( getLevel() < 4) {
            System.out.println(getName() + "fetched a stick");
            setExperience(1);
        } else if ( getLevel() < 7) {
            System.out.println(getName() + "fetched a stick");
            setExperience(1);
        } else if ( getLevel() <= 9) {
            System.out.println(getName() + "fetched a stick");
            setExperience(1);
        } else {
            System.out.println(getName() + "fetched a stick");
            setExperience(1);
        }
    }

    public void bark() {

        int barkType = rand.nextInt(3);

        if (getLevel() < 3) {
            if (barkType == 0) {
                System.out.println("Woof!");
            } else {
                System.out.println("Bark!");
            }
        } else if (getLevel() < 5) {
            if (barkType != 2) {
                System.out.println("Woof!");
            } else {
                System.out.println("Bark!");
            }
        } else if ( getLevel() < 7) {
            if (barkType == 0) {
                System.out.println("Woof!");
            } else if (barkType == 1) {
                System.out.println("Bark!");
            } else {
                System.out.println("Borf!");
            }
            this.setTreat(0.2);
        } else if ( getLevel() <= 9) {
            if (barkType == 0) {
                System.out.println("Woof! Woof");
            } else if (barkType == 1) {
                System.out.println("Bark! Bark!");
            } else {
                System.out.println("Borf! Borf!");
            }
            this.setTreat(0.5);
        } else {
            if (barkType == 0) {
                System.out.println("WOOF!! WOOF!!");
            } else if (barkType == 1) {
                System.out.println("BARK!! BARK!!");
            } else {
                System.out.println("BORF!1! BORF!!");
            }
            this.setTreat(1);
        }
    }



}
