Ext.define('SR.store.GroceryList', {
    extend: 'Ext.data.Store',
    model: 'SR.model.GroceryListItem',
    proxy: {
        type: 'rest',
        url : 'data/grocerylist',
        writer: { allowSingle: false },
        pageParam: undefined,
        limitParam: undefined,
        startParam: undefined
    }
});
