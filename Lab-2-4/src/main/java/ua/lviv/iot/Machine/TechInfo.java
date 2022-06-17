package ua.lviv.iot.Machine;

import ua.lviv.iot.Models.Cloth;
import ua.lviv.iot.Models.Seasons;
import ua.lviv.iot.Models.Size;

public class TechInfo extends MachineInfo {
    private String techItems;
    private int priceInUsd;
    private Size size;

    public TechInfo(Seasons season, Cloth cloth, String techItems,
                    int priceInUsd, Size size) {
        super();
        this.techItems = techItems;
        this.priceInUsd = priceInUsd;
        this.size = size;
        this.season = season;
        this.cloth = cloth;
    }

    public Size getSize(){return(size);}
    public void setSize(Size size){this.size = size;}
    public String getEquipmentItems(){return(techItems);}
    public void setEquipmentItems(String equipmentItems){this.techItems = equipmentItems;}
    public int getPriceInUah(){return(priceInUsd);}
    public void setPriceInUahPrice(int priceInUah){this.priceInUsd = priceInUah;}

    @Override
    public String toString() {
        return this.cloth + ":(Season: " + this.season
                + ", EquipmentItems: " + this.techItems
                + ", PriceInUah: " + this.priceInUsd
                + ", Size: " + this.size + ")";
    }
}

