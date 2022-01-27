package exercises.technology;

public abstract class Abstraction {

    private int id;
    private static int count = 0;

    public Abstraction() {
        this.id = ++count;
    }

    public int getId(){
        return this.id;
    }
}
