public class Cilinder extends Drugoe{
    private double radius;
    private double hight;
    @Override
    void create(double radius, double hight) {
        this.radius = radius;
        this.hight = hight;
    }
    public void getVolume(){
        double square = Math.PI * radius * radius;
        double volume = square * hight;
        volume1 = volume;
        String ans = String.format("%.3f", volume);
        System.out.println(ans);
    }

    @Override
    void create(double smth) {
        // АААААААААА СНОВА ТЫЫЫЫ!!!!!
    }
}
