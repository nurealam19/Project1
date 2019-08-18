package abstractclass;

public class TestHouse {
    public static void main(String[] args) {
        House myHouse = new TownHouse();

        myHouse.Room();
        myHouse.BackYard();
        myHouse.StoreRoom();


        TownHouse noorsHouse = new TownHouse();
        noorsHouse.BackYard();
    }
}

