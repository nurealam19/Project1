package polymorphism.OOP;

public class NewCalculator extends LandCalculator {

    @Override
    public int getTotalArea(int a, int b) {
        int total = a * b + (10 - 2);
        return total;
    }

}
