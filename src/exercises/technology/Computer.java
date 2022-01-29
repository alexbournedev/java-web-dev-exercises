package exercises.technology;

public class Computer extends AbstractEntity {

    private int storage;
    private int ram;
    private String gpu;

    public Computer(int storage, int ram, String gpu) {
        this.storage = storage;
        this.ram = ram;
        this.gpu = gpu;
    }

    public void addRam(int amountOfRam){
        this.ram += amountOfRam;
    }

    public void addStorage(int amountOfStorage){
        this.storage += amountOfStorage;
    }

    public int getStorage() {
        return storage;
    }

    public int getRam() {
        return ram;
    }

    public String getGpu() {
        return gpu;
    }

}
