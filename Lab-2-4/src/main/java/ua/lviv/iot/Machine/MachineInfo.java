package ua.lviv.iot.Machine;

import ua.lviv.iot.Models.Cloth;
import ua.lviv.iot.Models.Cloth.*;
import ua.lviv.iot.Models.Seasons;

public class MachineInfo {
    protected Seasons season;
    protected Cloth cloth;

    public MachineInfo(Seasons timeOfYear, Cloth cloth){
        this.season = timeOfYear;
        this.cloth = cloth;
    }

    public MachineInfo() {

    }

    public Seasons getSeason(){return(season);}
    public Cloth getSportName(){return(cloth);}
    public void setSeason(Seasons season){this.season = season;}
    public void setSportName(Cloth sportName){this.cloth = cloth;}



    public String toString(){
        return null;
    }

}

