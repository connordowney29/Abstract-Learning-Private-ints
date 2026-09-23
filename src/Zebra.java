public class Zebra extends Animal{
    private int grassPiecesEaten;
    private int stripes;

    public Zebra(){
        grassPiecesEaten = 10000;
        stripes = 10;
        numLegs = 4;
    }
    //getter
    public int getGrassPiecesEaten(){
        return grassPiecesEaten;
    }
    //setter
    public void setGrassPiecesEaten(int grassPiecesEaten){
        this.grassPiecesEaten = grassPiecesEaten;
    }
    //getter
    public int getStripes(){
        return stripes;
    }
    //setter
    public void setStripes(int stripes){
        this.stripes = stripes;
    }

    @Override
    public void makeSound() {
        System.out.println("i neigh");
    }

}