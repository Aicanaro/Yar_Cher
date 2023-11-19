public class Shar extends Sharp{
    private double radius;
    @Override
    void create(double radius) {
        this.radius = radius;
    }
    public void getVolume() {
        double volume  = (4 * Math.PI * radius * radius * radius) / 3;
        volume1 = volume;
        String ans = String.format("%.3f", volume);
        System.out.println(ans);
    }
}
