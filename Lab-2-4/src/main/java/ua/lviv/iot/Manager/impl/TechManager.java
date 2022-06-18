package ua.lviv.iot.Manager.impl;


import ua.lviv.iot.Machine.TechInfo;
import ua.lviv.iot.Manager.IManager;
import ua.lviv.iot.Models.Cloth;
import ua.lviv.iot.Models.Seasons;
import ua.lviv.iot.Models.Size;

import java.util.*;
import java.util.stream.Collectors;

public class TechManager implements IManager {
    private Map<String, List<TechInfo>> equipmentMap = new HashMap<>();

    @Override
    public List<TechInfo> findEquipmentBySeasonsAndSizes(Size Size, Seasons season) {
        List<TechInfo> tempEquipment = new LinkedList<>();
        List<Cloth> tempCloth = new LinkedList<>();
        List<TechInfo> result = new LinkedList<>();

        for (List <TechInfo> cloth : equipmentMap.values()) {
            tempEquipment.addAll(cloth.stream().filter(item -> item instanceof TechInfo).collect(Collectors.toList()));
        }
        System.out.println(tempCloth);
        for (Cloth cloth : tempCloth) {
            tempCloth.add(cloth);
        }
        System.out.println(tempEquipment);
        result.addAll(tempEquipment.stream()
                .filter(item -> ((item.getSeason().equals(season) || item.getSeason().equals(Seasons.summer)) &&
                        (item.getSize().equals(Size) || item.getSize().equals(Size.S))))
                .collect(Collectors.toList()));
        return result;
    }

    @Override
    public void addEquipment(List<TechInfo> equipmentList) {
        equipmentList.forEach(equipment -> {
            String equipmentName = equipment.getEquipmentItems();
            var existingEquipment = equipmentMap.get(equipmentName);
            if (existingEquipment == null) {
                existingEquipment = new LinkedList<TechInfo>();
                equipmentMap.put(equipmentName, existingEquipment);
            }
            existingEquipment.add(equipment);
        });
    }

    @Override
    public void getEquipmentSortedByPrice(List<TechInfo> equipmentList, boolean isReversed) {
        if (isReversed) {
            equipmentList.sort(Collections.reverseOrder(Comparator.comparing(TechInfo::getPriceInUah)));
        } else {
            equipmentList.sort(Comparator.comparing(TechInfo::getPriceInUah));
        }
    }

    @Override
    public void getEquipmentSortedBySize(List<TechInfo> equipmentList, boolean isReversed) {
        if (isReversed) {
            var desiredOrder = Arrays.asList(Size.S, Size.M, Size.L);
            Comparator<Size> sizeOrder = Comparator.comparingInt(desiredOrder::indexOf);
            equipmentList.sort(Comparator.comparing(TechInfo::getSize, sizeOrder));
        } else {
            var desiredOrder = Arrays.asList(Size.L, Size.M, Size.S);
            Comparator<Size> sizeOrder = Comparator.comparingInt(desiredOrder::indexOf);
            equipmentList.sort(Comparator.comparing(TechInfo::getSize, sizeOrder));
        }
    }
}

