public class Giraffe extends Animal{

    private int lengthneck;

    final String anclass = "MAMMALS";

    final double avage = 20.0;

    public Giraffe(String code,String name,double weight, int lengthneck) {
        super(code,name,weight);
        this.lengthneck=lengthneck;
    }

    public int getLengthneck() {
        return lengthneck;
    }

    public void setLengthneck(int lengthneck) {
        this.lengthneck = lengthneck;
    }

    public void MakeNoise(){
        System.out.println("GIRAFFE: BRRRRRRR");
    }


    public String toString() {
        return "Giraffe{" +
                "neck length= " + getLengthneck() +
                ", name= "+getName()+'\''+

                ", code=' " + getCode() + '\'' +
                ", anclass=' " + anclass + '\'' +
                ", weight= " + getWeight() + '\'' +
                ", average age= " + avage +
                '}';
    }

}
