public class Zoo {
    public static void main(String[] args) {
        Zoo a = new Zoo();
    }

    public Zoo(){
        Zebra a = new Zebra();
        a.makeSound();
        Gorilla g = new Gorilla();
        //bananas
        System.out.println(g.getBananasConsumed() + " bananas!");

        g.setBananasConsumed(4090);
        System.out.println(g.getBananasConsumed() + " bananas!");

        //weight
        System.out.println(g.getWeight() + " lbs!");

        g.setWeight(250);
        System.out.println(g.getWeight() + " lbs!");

        //grass
        System.out.println(a.getGrassPiecesEaten() + " pieces of grass have been eaten by the zebra!");

        a.setGrassPiecesEaten(20000);
        System.out.println(a.getGrassPiecesEaten() + " pieces of grass have been eaten by the zebra!!");

        //stripes
        System.out.println("The zebra has " + a.getStripes() + " stripes");

        a.setStripes(15);
        System.out.println("The zebra has " + a.getStripes() + " stripes");
    }

    public void method1(){
        System.out.println("hi in method 1");
    }


}

