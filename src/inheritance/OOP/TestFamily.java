package inheritance.OOP;

public class TestFamily{
    public static void main(String[] args) {
        GrandParents nana = new GrandParents();
        nana.skinColor();

        Parents baba = new Parents();
                baba.familyName();

                Child girl = new Child();
                girl.averageHeight();
    }



}
