package prefabapp.domain.repository;

import prefabapp.domain.GroceryListItem;

import java.util.Collection;

public interface GroceryListItemRepository {

    Collection<GroceryListItem> getItems();

    void updateItems(Collection<GroceryListItem> items);

}
