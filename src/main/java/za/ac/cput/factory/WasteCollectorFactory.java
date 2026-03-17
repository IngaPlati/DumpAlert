package za.ac.cput.factory;
import za.ac.cput.domain.WasteCollector;

public class WasteCollectorFactory
{

    public static WasteCollector CreateFactory(String collectorId,String name,long contactNumber,String assignedArea){
        return new WasteCollector.Builder().
                CollectorId(collectorId).
                Name(name).
                ContactNumber(contactNumber).
                AssignedArea(assignedArea).build();
    }
}
