package ua.lviv.iot;

public class Main {

    public static void main(String[] args) {
        Ship ship1 = new Ship(3748, "One" , 12023 , 30 , 40 , 100  );
        Ship ship2 = new Ship(8474, "Secondhand",40);
        Ship ship3 = new Ship();
        System.out.println(ship1);
        System.out.println(ship2);
        System.out.println(ship3);
        Ship.GetTime();
    }
}