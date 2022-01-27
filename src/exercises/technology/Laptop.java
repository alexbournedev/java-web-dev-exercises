package exercises.technology;

public class Laptop extends Computer{

    private double weight;

    public Laptop(int storage, int ram, String gpu, double weight){
        super(storage, ram, gpu);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isClunky(){
        if (weight > 12){
            return true;
        } else {
            return false;
        }
    }
}
