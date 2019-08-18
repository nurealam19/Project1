package polymorphism.OOP;

public class TestCalculator {
    public static void main(String[] args) {

        LandCalculator cal1 = new LandCalculator();
        NewCalculator cal2 = new NewCalculator();

        System.out.println(cal1.getTotalArea(11,22));
        System.out.println(cal1.getTotalArea(5,8));
        System.out.println(cal2.getTotalArea(5,8));
    }


}
