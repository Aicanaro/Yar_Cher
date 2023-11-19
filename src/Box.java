import java.util.ArrayList;

public class Box extends Sharp{
    private double mass;

    ArrayList<Sharp> sharpArrayList = new ArrayList<>();

    @Override
    void create(double mass) {
        this.mass = mass;
    }
    public boolean poloj(Sharp sharp){
        if(sharp.volume1 < mass){
            sharpArrayList.add(sharp);
            mass -= sharp.volume1;
            System.out.println("True");
            return true;
        }else {
            System.out.println("False");
            return false;
        }
    }
}
