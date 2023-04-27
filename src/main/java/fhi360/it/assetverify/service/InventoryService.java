package fhi360.it.assetverify.service;

import fhi360.it.assetverify.model.Inventory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface InventoryService {

    Inventory addInventory(Inventory inventory);
    List<Inventory> getInventories();

}