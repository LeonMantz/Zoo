public class Snake extends Animal{

    private int poison;

    final String anclass = "REPTILE";
    final double avage = 10.0 ;

    public Snake(String code, String name, double weight,int poison) {
        super(code,name,weight);
        this.poison = poison;
    }

    public int getPoison() {
        return poison;
    }

    public void setPoison(int poison) {
        this.poison = poison;
    }


    public void MakeNoise(){
        System.out.println("SNAKE DOES: SSSSSSSSS");
    }

    @Override
    public String toString() {
        return "Snake{" +
                "poison=" + getPoison() +
                ", name= '"+getName()+'\''+
                ", code='" + getCode() + '\'' +
                ", anclass='" + anclass + '\'' +
                ", weight=" + getWeight() +'\''+
                ", average age= "+ avage+
                '}';




    }
}
