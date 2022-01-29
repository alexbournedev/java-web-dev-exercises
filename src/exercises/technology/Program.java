package exercises.technology;

public class Program {
    public static void main(String[] args) {

        Computer asus = new Computer(256, 16, "3070 Ti.");
        System.out.println("Asus' ID is: " + asus.getId() + ".");

        System.out.println("Asus had " + asus.getStorage() + "GB of storage.");
        System.out.println("Asus had " + asus.getRam() + "GB of RAM.");

        asus.addRam(16);
        asus.addStorage(256);

        System.out.println("Asus now has " + asus.getStorage() + "GB of storage.");
        System.out.println("Asus now has " + asus.getRam() + "GB of RAM.");
        System.out.println("Asus' GPU is an NVIDIA RTX " + asus.getGpu());

        Laptop macbook = new Laptop(128, 8, "Apple M1 Chip.", 9.3);
        System.out.println("MacBook's ID is: " + macbook.getId() + ".");

        System.out.println("MacBook is clunky? " + macbook.isClunky() + ".");
        System.out.println("MacBook weighs " + macbook.getWeight() + " lbs.");
        System.out.println("MacBook's GPU is an " + macbook.getGpu());

        Smartphone pixel = new Smartphone(64, 8, "Adreno 640.", 39, 999);
        System.out.println("Pixel's ID is: " + pixel.getId() + ".");

        System.out.println("Pixel had " + pixel.getNumPhotos() + " photos stored.");
        System.out.println("Pixel had " + pixel.getNumApps() + " apps downloaded.");

        pixel.downloadApp();
        pixel.takePhoto();

        System.out.println("Pixel now has " + pixel.getNumPhotos() + " photos stored.");
        System.out.println("Pixel now has " + pixel.getNumApps() + " apps downloaded.");

        System.out.println("Pixel's GPU is an " + pixel.getGpu());

    }


}
