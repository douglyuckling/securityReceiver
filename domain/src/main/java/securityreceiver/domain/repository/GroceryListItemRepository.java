package securityreceiver.domain.repository;

import securityreceiver.domain.GroceryListItem;

import java.util.Collection;

public interface GroceryListItemRepository {

    Collection<GroceryListItem> getItems();

    Collection<GroceryListItem> saveItems(Collection<GroceryListItem> items);

    void deleteItemById(String itemId);

}
