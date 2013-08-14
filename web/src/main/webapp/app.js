Ext.application({
    uses: ['Ext.container.Viewport'],
    name: 'SR', // Initialism for "security receiver"

    controllers: [
        'GroceryList'
    ],

    appFolder: 'app',

    launch: function() {
        Ext.create('Ext.container.Viewport', {
            layout: 'fit',
            items: [
                {
                    xtype: 'grocerylist',
                    title: 'Grocery List',
                    store: this.getGroceryListController().getGroceryListStore()
                }
            ]
        });
    }
});
