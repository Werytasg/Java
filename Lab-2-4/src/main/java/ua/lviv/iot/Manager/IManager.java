package ua.lviv.iot.Manager;

import java.util.List;

import ua.lviv.iot.Machine.TechInfo;
import ua.lviv.iot.Models.*;


public interface IManager {
    List<TechInfo> findEquipmentBySeasonsAndSizes(Size Size, Seasons season);
    void getEquipmentSortedByPrice(List<TechInfo> equipmentList, boolean isReversed);
    void getEquipmentSortedBySize(List<TechInfo> equipmentList, boolean isReversed);
    void addEquipment(List<TechInfo> equipmentList);
}
