public class Pyramid extends Drugoe{
    private double hight;
    private double side;
    @Override
    void create(double hight, double side) {
        this.hight = hight;
        this.side = side;
    }

    public void getVolume(){
        double square = side * side;
        double volume = square * hight /3;
        volume1 = volume;
        String ans = String.format("%.3f", volume);
        System.out.println(ans);
    }

    @Override
    void create(double smth) {
        //АААААА ЧТО ЭТО ТАКОЕ ВЫЛЕЗЛО!!!
    }
}
