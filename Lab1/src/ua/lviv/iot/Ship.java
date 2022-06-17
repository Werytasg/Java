package ua.lviv.iot;

public record Ship(int tonnage, String name, int countpas, int width, int height, int length) {

    static String time ="11:20";

    public static String GetTime(){
        return time ;
    }

    public Ship (int tonnage, String name,  int width ){
        this(tonnage,name,12000, width,50,120);
    }

    public Ship (){
        this(4723, "Titanic", 24839,50,60,139);
    }

    @Override
    public String toString() {
        return "Ship's name is " + name + " tonnage is " + tonnage + " countpas is " + countpas + " width is " + width +
                " height is " + height + " lenght is " + length;
    }
}