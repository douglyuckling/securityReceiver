Ext.application({
    uses: ['Ext.container.Viewport'],
    name: 'SR', // Initialism for "security receiver"

    controllers: [
        'Snapshots'
    ],

    appFolder: 'app',

    launch: function() {
        Ext.create('Ext.container.Viewport', {
            layout: 'fit',
            items: [
                {
                    xtype: 'snapshotslist',
                    title: 'Snapshots',
                    store: this.getSnapshotsController().getSnapshotsStore()
                }
            ]
        });
    }
});
