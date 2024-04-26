package StorageFacility;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.ArrayList;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> unit;
    private ArrayList<String> items;

    public StorageFacility(){
        this.unit = new HashMap<>();
        this.items = new ArrayList<>();
   }
    public void add(String unit, String item){
        this.unit.putIfAbsent(unit, new ArrayList<>());
        this.unit.get(unit).add(item);
    }
    public ArrayList<String> contents(String storageUnit){
        ArrayList<String> item = unit.getOrDefault(storageUnit, new ArrayList<>());
        return new ArrayList<>(item);
    }
    public void remove(String storageUnit, String item) {
        // Check if the storage unit exists in the facility
        if (unit.containsKey(storageUnit)) {
            // Get the list of items in the specified storage unit
            ArrayList<String> itemsList = unit.get(storageUnit);
            // Remove the specified item from the list
            itemsList.remove(item);
            // Check if the list is empty after removing the item
            if (itemsList.isEmpty()) {
                // If the list is empty, remove the storage unit from the facility
                unit.remove(storageUnit);
            }
        } else {
            // If the storage unit doesn't exist, print an error message
            System.out.println("Can't remove");
        }
    }

    public ArrayList<String> storageUnits(){
        ArrayList<String> storageName = new ArrayList<>();
        for(String items : unit.keySet()){
            if(!(items.isEmpty())){
            storageName.add(items);
            }
        }
        return storageName;
    }
    public static void main(String[] args){
        StorageFacility facility = new StorageFacility();
        facility.add("a14", "ice skates");
        facility.add("a14", "ice hockey stick");
        facility.add("a14", "ice skates");

        facility.add("f156", "rollerblades");
        facility.add("f156", "rollerblades");

        facility.add("g63", "six");
        facility.add("g63", "pi");

        facility.remove("f156", "rollerblades");

        System.out.println(facility.contents("f156"));

        facility.remove("f156", "rollerblades");

        System.out.println(facility.storageUnits());

    }

}
