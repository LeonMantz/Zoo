public class Lion extends Animal{

    int strenght;

    final String anclass = "MAMMALS";

    final double avage = 25.0;

    public Lion(String code, String name, double weight, int strenght) {
        super(code,name,weight);
        this.strenght = strenght;
    }

    public int getStrenght() {
        return strenght;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    public void MakeNoise(){
        System.out.println("LION DOES: ARRRRRRRRRRRRRRRR");
    }

    public String toString() {
        return "Lion{" +
                "strength= " + getStrenght() +
                ", name= "+getName()+'\''+

                ", code=' " + getCode() + '\'' +
                ", anclass=' " + anclass + '\'' +
                ", weight= " + getWeight() + '\'' +
                ", average age= " + avage +
                '}';
    }




}
