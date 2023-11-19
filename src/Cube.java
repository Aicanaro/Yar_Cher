public class Cube extends Sharp{
    private double side;
    @Override
    void create(double side) {
        this.side = side;
    }
    public void getVolume() {
        double volume = side * side * side;
        volume1 = volume;
        String ans = String.format("%.3f", volume);
        System.out.println(ans);
    }
}
