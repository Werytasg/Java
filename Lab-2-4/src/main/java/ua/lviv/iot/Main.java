package ua.lviv.iot;


import java.util.*;
import java.lang.*;

import ua.lviv.iot.Machine.TechInfo;
import ua.lviv.iot.Manager.impl.TechManager;
import ua.lviv.iot.Models.Cloth;
import ua.lviv.iot.Models.Seasons;
import ua.lviv.iot.Models.Size;

import static ua.lviv.iot.Models.Cloth.*;

public class Main {
    public static void main(String args[]){

        TechManager manager = new TechManager();
        List<TechInfo> availableEquipment = new LinkedList<TechInfo>();

        TechInfo atlas = new TechInfo(
                Seasons.summer, Cloth.Atlas,
                "cute", 50, Size.S);

        TechInfo gabarine  = new TechInfo(
                Seasons.winter, Gabarine,
                "warm",
                100, Size.L );

        TechInfo bastine = new TechInfo(
                Seasons.summer, Bastine,
                "silks", 40, Size.M );

        availableEquipment.add(atlas);
        availableEquipment.add(gabarine);
        availableEquipment.add(bastine);

        manager.addEquipment(availableEquipment);


        System.out.println("available equipment");
        System.out.println(availableEquipment);
        manager.getEquipmentSortedByPrice(availableEquipment, true);
        System.out.println("available equipment sorted by price ");
        System.out.println(availableEquipment);
        List<TechInfo> equipmentChoosenBySeasonAndGender = manager.findEquipmentBySeasonsAndSizes(Size.S, Seasons.summer);
        System.out.println("summer equipment of size S");
        System.out.println(equipmentChoosenBySeasonAndGender);
        manager.getEquipmentSortedBySize(equipmentChoosenBySeasonAndGender, true);
        System.out.println("sorted by size equipment");
        System.out.println(equipmentChoosenBySeasonAndGender);

    }
}
