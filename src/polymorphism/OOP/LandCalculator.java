package polymorphism.OOP;

public class LandCalculator {
    public int getTotalArea(int a, int b){
        int total = a * b;
        return  total;
    }

    public int getTotalArea(int a, int b, int c){
        int total = (a * b) + c;
        return  total;
    }

    public int getTotalArea(int a, int b, int c, int d){
        int total = (a * b) * (c - d);
        return  total;
    }

    public int getTotalArea(String a, int b){
        int total = b;
        return  total;
    }
}
