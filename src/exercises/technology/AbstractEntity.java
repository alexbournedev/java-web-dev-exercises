package exercises.technology;

public abstract class AbstractEntity {

    private int id;
    private static int count = 0;

    public AbstractEntity() {
        this.id = ++count;
    }

    public int getId(){
        return this.id;
    }
}
