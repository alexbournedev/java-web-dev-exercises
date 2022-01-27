package exercises.technology;

public class Smartphone extends Computer{

    private int numApps;
    private int numPhotos;

    public Smartphone(int storage, int ram, String gpu, int numApps, int numPhotos) {
        super(storage, ram, gpu);
        this.numApps = numApps;
        this.numPhotos = numPhotos;
    }

    public void takePhoto(){
        this.numPhotos += 1;
    }

    public void downloadApp(){
        this.numApps += 1;
    }

    public int getNumApps() {
        return numApps;
    }

    public int getNumPhotos() {
        return numPhotos;
    }
}
