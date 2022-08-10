public class Bear extends Animal {

    private float height;

    final String anclass = "MAMMALS";
    final double avage = 20.0;


    public Bear(String code, String name, double weight, int height) {
        super(code, name, weight);
        this.height = height;
    }

    public float getHeight() {
        return height;}


    public void setHeight(float height) {
        this.height = height;
    }

    public void MakeNoise() {
        System.out.println("BEAR DOES: GRRRRRR");
    }

    public String toString() {
        return "Bear{" +
                "height= " + getHeight() +
                ", name= "+getName()+'\''+

                ", code='" + getCode() + '\'' +
                ", anclass='" + anclass + '\'' +
                ", weight=" + getWeight() + '\'' +
                ", average age= " + avage +
                '}';
    }
}

