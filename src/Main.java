
public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        box.create(570);

        Shar shar = new Shar();
        shar.create(5);
        shar.getVolume();
        box.poloj(shar);

        Cube cube = new Cube();
        cube.create(4);
        cube.getVolume();
        box.poloj(cube);

        Pyramid pyramid = new Pyramid();
        pyramid.create(3,4);
        pyramid.getVolume();
        box.poloj(pyramid);

        Cilinder cilinder = new Cilinder();
        cilinder.create(5,5);
        cilinder.getVolume();
        box.poloj(cilinder);
    }
}