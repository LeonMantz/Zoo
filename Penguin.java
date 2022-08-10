public class Penguin extends Animal{

    private int swimmmingspeed;

    final String anclass = "MAMMALS";

    final double avage = 20.0;

    public Penguin(String code,String name,double weight,int swimmmingspeed) {
        super(code,name,weight);
        this.swimmmingspeed=swimmmingspeed;
    }

    public int getSwimmmingspeed() {
        return swimmmingspeed;
    }

    public void setSwimmmingspeed(int swimmmingspeed) {
        this.swimmmingspeed = swimmmingspeed;
    }

    public void MakeNoise(){
        System.out.println("Penguin: IOIOIOIOIOIOI");
    }

    public String toString() {
        return "Penguin{" +
                "swimming speed= " + getSwimmmingspeed() +
                ", name= "+getName()+'\''+

                ", code='" + getCode() + '\'' +
                ", anclass='" + anclass + '\'' +
                ", weight=" + getWeight() + '\'' +
                ", average age= " + avage +
                '}';
    }
}
