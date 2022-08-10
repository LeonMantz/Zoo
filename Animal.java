public abstract class Animal implements AnimalSound {

    private String code;
    private String name;
    private  String anclass ;
    private  double weight;

    public Animal(String code,String name,double weight) {
        this.code=code;
        this.name=name;
        this.weight=weight;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnclass() {
        return anclass;
    }

    public void setAnclass(String anclass) {
        this.anclass = anclass;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
         this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}


