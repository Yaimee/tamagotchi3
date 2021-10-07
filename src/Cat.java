import java.sql.SQLOutput;

public class Cat extends Tamagotchi {


    public Cat(String name, int age, int mood, int energy, int catID) {
        super(name, age, mood, energy, catID);
    }

    public void miauv() {
        System.out.println("miauv!");
        setExperience(1);
    }

    public void hunt() {

        int huntType = rand.nextInt(5);
        int huntSuccess = rand.nextInt(9);

        if (getLevel() < 4) {
            if (huntType == 0) {
                if (huntSuccess < 6) {
                    System.out.println(getName() + "goes on a hunt in" + Game.humanName + "'s garden." + getName() + " spots a little mouse sitting on a rock, chewing on a juicy beetle. \n" + getName() + " accelerates towards the mouse, but the mouse unfortunately got away. Better luck next time!");
                    setExperience(1);
                } else {
                    System.out.println(getName() + "goes on a hunt in" + Game.humanName + "'s garden." + getName() + " spots a little mouse sitting on a rock, chewing on a juicy beetle. \n" + getName() + " accelerates towards the mouse and kills it! The mouse is left at" + Game.humanName + "'s door as a trophy.");
                    setExperience(2);
                    setTreat(1);
                }
            } else if (huntType == 1) {
                if (huntSuccess < 6) {
                    System.out.println(getName() + "goes on a hunt in" + Game.humanName + "'s garden." + getName() + " spots a blindworm. \n" + getName() + " accelerates towards the blindworm, but the blindworm unfortunately got away. Better luck next time!");
                    setExperience(1);
                } else {
                    System.out.println(getName() + "goes on a hunt in" + Game.humanName + "'s garden." + getName() + " spots a blindworm. \n" + getName() + " accelerates towards the blindworm and kills it! The blindworm is left at" + Game.humanName + "'s door as a trophy.");
                    setExperience(2);
                    setTreat(1);
                }
            } else if (huntType == 2) {
                if (huntSuccess < 6) {
                    System.out.println(getName() + "goes on a hunt in" + Game.humanName + "'s garden." + getName() + " spots a squirrel. \n" + getName() + " accelerates towards the squirrel, but the squirrel unfortunately got away. Better luck next time!");
                    setExperience(1);
                } else {
                    System.out.println(getName() + "goes on a hunt in" + Game.humanName + "'s garden." + getName() + " spots a squirrel. \n" + getName() + " accelerates towards the squirrel and kills it! The squirrel is left at" + Game.humanName + "'s door as a trophy.");
                }
            } else if (huntType == 3) {
                if (huntSuccess < 6) {
                    System.out.println(getName() + "goes on a hunt in" + Game.humanName + "'s garden." + getName() + " spots a big moth. \n" + getName() + " accelerates towards the moth, but the moth unfortunately got away. Better luck next time!");
                    setExperience(1);
                } else {
                    System.out.println(getName() + "goes on a hunt in" + Game.humanName + "'s garden." + getName() + " spots a big moth. \n" + getName() + " accelerates towards the moth and kills it! The moth is left at" + Game.humanName + "'s door as a trophy.");
                }
            } else {
                if (huntSuccess < 6) {
                    System.out.println(getName() + "goes on a hunt in" + Game.humanName + "'s garden." + getName() + " spots a hummingbird. \n" + getName() + " accelerates towards the hummingbird, but the hummingbird unfortunately got away. Better luck next time!");
                    setExperience(4);
                } else {
                    System.out.println(getName() + "goes on a hunt in" + Game.humanName + "'s garden." + getName() + " spots a hummingbird. \n" + getName() + " accelerates towards the hummingbird and kills it! The hummingbird is left at" + Game.humanName + "'s door as a trophy.");
                }
            }
            setEnergy(-60);
        } else if (getLevel() < 7) {
            if (huntType == 0) {
                if (huntSuccess < 5) {
                    System.out.println(getName() + "goes on a hunt in the neighbours garden." + getName() + " spots a blackbird on a fence. \n" + getName() + " accelerates towards the blackbird, but the blackbird unfortunately got away. Better luck next time!");
                } else {
                    System.out.println(getName() + "goes on a hunt in the neighbours garden." + getName() + " spots a blackbird on a fence. \n" + getName() + " accelerates towards the blackbird, and kills it! The blackbird is left at" + Game.humanName + "'s door as a trophy.");
                }
            } else if (huntType == 1) {
                if (huntSuccess < 5) {
                    System.out.println(getName() + "goes on a hunt in the neighbours garden." + getName() + " spots a duck. \n" + getName() + " accelerates towards the duck, but the duck unfortunately got away. Better luck next time!");
                } else {
                    System.out.println(getName() + "goes on a hunt in the neighbours garden." + getName() + " spots a duck. \n" + getName() + " accelerates towards the duck, and kills it! The duck is left at" + Game.humanName + "'s door as a trophy.");
                }
            } else if (huntType == 2) {
                if (huntSuccess < 5) {
                    System.out.println(getName() + "goes on a hunt in the neighbours garden." + getName() + " spots a chicken. \n" + getName() + " accelerates towards the chicken, but the chicken unfortunately got away. Better luck next time!");
                } else {
                    System.out.println(getName() + "goes on a hunt in the neighbours garden." + getName() + " spots a chicken. \n" + getName() + " accelerates towards the blackbird, and kills it! The chicken is left at" + Game.humanName + "'s door as a trophy.");
                }
            } else if (huntType == 3) {
                if (huntSuccess < 5) {
                    System.out.println(getName() + "goes on a hunt in the neighbours garden." + getName() + " spots a rat. \n" + getName() + " accelerates towards the rat, but the rat unfortunately got away. Better luck next time!");
                } else {
                    System.out.println(getName() + "goes on a hunt in the neighbours garden." + getName() + " spots a rat. \n" + getName() + " accelerates towards the rat, and kills it! The rat is left at" + Game.humanName + "'s door as a trophy.");
                }
            } else {
                if (huntSuccess < 5) {
                    System.out.println(getName() + "goes on a hunt in the neighbours garden." + getName() + " spots a frog. \n" + getName() + " accelerates towards the frog, but the frog unfortunately got away. Better luck next time!");
                    setExperience(8);
                } else {
                    System.out.println(getName() + "goes on a hunt in the neighbours garden." + getName() + " spots a frog. \n" + getName() + " accelerates towards the frog, and kills it! The frog is left at" + Game.humanName + "'s door as a trophy.");
                }
            }
            setEnergy(-50);
        } else if (getLevel() <= 9) {
            if (huntType == 0) {
                if (huntSuccess < 4) {
                    System.out.println(getName() + "goes on a hunt in the park nearby." + getName() + " spots a bunny jumping around. \n" + getName() + " accelerates towards the bunny, but the bunny unfortunately jumped into a hole. Better luck next time!");
                } else {
                    System.out.println(getName() + "goes on a hunt in the park nearby." + getName() + " spots a bunny jumping around. \n" + getName() + " accelerates towards the bunny, and kills it! The bunny is left at" + Game.humanName + "'s door as a trophy.");
                }
            } else if (huntType == 1) {
                if (huntSuccess < 4) {
                    System.out.println(getName() + "goes on a hunt in the park nearby." + getName() + " spots a crow doing crow things. \n" + getName() + " accelerates towards the crow, but the crow unfortunately got away. Better luck next time!");
                } else {
                    System.out.println(getName() + "goes on a hunt in the park nearby." + getName() + " spots a crow doing crow things. \n" + getName() + " accelerates towards the crow, and kills it! The crow is left at" + Game.humanName + "'s door as a trophy.");
                }
            } else if (huntType == 2) {
                if (huntSuccess < 4) {
                    System.out.println(getName() + "goes on a hunt in the park nearby." + getName() + " spots a seagul on a soccer goal. \n" + getName() + " accelerates towards the seagul, but the seagul unfortunately got away. Better luck next time!");
                } else {
                    System.out.println(getName() + "goes on a hunt in the park nearby." + getName() + " spots a seagul on a soccer goal. \n" + getName() + " accelerates towards the seagul, and kills it! The seagul is left at" + Game.humanName + "'s door as a trophy.");
                }
            } else if (huntType == 3) {
                if (huntSuccess < 4) {
                    System.out.println(getName() + "goes on a hunt in the park nearby." + getName() + " spots a magpie. \n" + getName() + " accelerates towards the magpie, but the magpie unfortunately got away. Better luck next time!");
                } else {
                    System.out.println(getName() + "goes on a hunt in the park nearby." + getName() + " spots a magpie. \n" + getName() + " accelerates towards the magpie, and kills it! The magpie left at" + Game.humanName + "'s door as a trophy.");
                }
            } else {
                if (huntSuccess < 4) {
                    System.out.println(getName() + "goes on a hunt in the park nearby." + getName() + " spots a pidgeon. \n" + getName() + " accelerates towards the pidgeon, but the pidgeon unfortunately got away. Better luck next time!");
                    setExperience(16);
                } else {
                    System.out.println(getName() + "goes on a hunt in the park nearby." + getName() + " spots a pidgeon. \n" + getName() + " accelerates towards the pidgeon, and kills it! The pidgeon is left at" + Game.humanName + "'s door as a trophy.");
                }
            }
            setEnergy(-40);
        } else {
            if (huntType == 0) {
                if (huntSuccess < 3) {
                    System.out.println(getName() + "goes on a hunt in the forest." + getName() + " spots a fox. \n" + getName() + " accelerates towards the fox, but the fox unfortunately got away. Better luck next time!");
                } else if (huntSuccess < 6) {
                    System.out.println(getName() + "goes on a hunt in the forest." + getName() + " spots a fox. \n" + getName() + " accelerates towards the fox, and kills it! The fox is left at" + Game.humanName + "'s door as a trophy.");
                } else {
                    System.out.println(getName() + "goes on a hunt in the forest." + getName() + " spots a fox. \n" + getName() + " accelerates towards the fox, but the fox bites " + getName() + ", and " + getName() + " gets wrecked. Better luck next time.");
                    setHealth(-60);
                }
            } else if (huntType == 1) {
                if (huntSuccess == 0) {
                    System.out.println(getName() + "goes on a hunt in the forest." + getName() + " spots a skunk. \n" + getName() + " accelerates towards the skunk, but the skunk unfortunately got away. Better luck next time!");
                } else if (huntSuccess == 1) {
                    System.out.println(getName() + "goes on a hunt in the forest." + getName() + " spots a skunk. \n" + getName() + " accelerates towards the skunk, and kills it! The skunk is left at" + Game.humanName + "'s door as a trophy.");
                } else {
                    System.out.println(getName() + "goes on a hunt in the forest." + getName() + " spots a skunk. \n" + getName() + " accelerates towards the skunk, but the skunk bites " + getName() + ", and " + getName() + " gets wrecked. Better luck next time.");
                    setHealth(-60);
                }
            } else if (huntType == 2) {
                if (huntSuccess == 0) {
                    System.out.println(getName() + "goes on a hunt in the forest." + getName() + " spots an eagle. " + getName() + " accelerates towards the eagle, but the eagle unfortunately got away. Better luck next time!");
                } else if (huntSuccess == 1) {
                    System.out.println(getName() + "goes on a hunt in the forest." + getName() + " spots an eagle. " + getName() + " accelerates towards the eagle, and kills it! The eagle is left at" + Game.humanName + "'s door as a trophy.");
                } else {
                    System.out.println(getName() + "goes on a hunt in the forest." + getName() + " spots an eagle. \n" + getName() + " accelerates towards the eagle, but the eagle bites " + getName() + ", and " + getName() + " gets wrecked. Better luck next time.");
                    setHealth(-60);
                }
            } else if (huntType == 3) {
                if (huntSuccess == 0) {
                    System.out.println(getName() + "goes on a hunt in the forest." + getName() + " spots a fawn. \n" + getName() + " accelerates towards the fawn, but the fawn unfortunately got away. Better luck next time!");
                } else if (huntSuccess == 1) {
                    System.out.println(getName() + "goes on a hunt in the forest." + getName() + " spots a fawn. \n" + getName() + " accelerates towards the fawn, and kills it! The fawn is left at" + Game.humanName + "'s door as a trophy.");
                } else {
                    System.out.println(getName() + "goes on a hunt in the forest." + getName() + " spots a fawn. \n" + getName() + " accelerates towards the fawn, but the fawn bites " + getName() + ", and " + getName() + " gets wrecked. Better luck next time.");
                    setHealth(-60);
                }
            } else {
                if (huntSuccess < 7) {
                    System.out.println(getName() + "goes on a hunt in the forest." + getName() + " spots a unicorn! \n" + getName() + " accelerates towards the unicorn, but the unicorn unfortunately got away. Better luck next time!");
                    setExperience(32);
                } else if (huntSuccess == 7) {
                    System.out.println("U+1F386");
                    System.out.println(getName() + "goes on a hunt in the forest." + getName() + " spots a unicorn! \n" + getName() + " accelerates towards the unicorn, and kills it! This is the ultimate achievement! The unicorn is left at" + Game.humanName + "'s door as a trophy.");
                    setExperience(64);
                    setTreat(50);
                } else {
                    System.out.println(getName() + "goes on a hunt in the forest." + getName() + " spots a unicorn! \n" + getName() + " accelerates towards the unicorn, but the unicorn destroys " + getName() + ", and " + getName() + " is now dead. R.I.P.");
                    setHealth(-100);
                }
            }
        setEnergy(-20);
        }
    }


    public void strokeHumanLeg() {
        if (getLevel() < 7) {
            System.out.println(getName() + " makes " + Game.humanName + " happy! " + getName() + " gets treat!");
            this.setTreat(0.2);
        } else if (getLevel() <= 9) {
            System.out.println(getName() + " makes " + Game.humanName + " happy! Now that " + getName() + " is level " + getLevel() + ", " + getName() + " gets a little more treat.");
            this.setTreat(0.5);
        } else {
            System.out.println(getName() + " makes " + Game.humanName + " happy! " + getName() + " gets a whole treat!");
            this.setTreat(1);
        }
    }
    public void catScenery(int ID) {
        if (ID == 0) {
            System.out.println("  /\\_/\\  (");
            System.out.println(" ( ^.^ ) _)");
            System.out.println("   \\\"/  (");
            System.out.println(" ( | | )");
            System.out.println("(__d b__)");
        } else if (ID == 1) {
            System.out.println("   |\\__/,|   (`\\");
            System.out.println("   |o o  |__ _)");
            System.out.println(" _.( T   )  `  /");
            System.out.println("((_ `^--' /_<  \\");
            System.out.println("`` `-'(((/  (((/");
        } 

    }
    public void options() {
        System.out.println();
    }
}
