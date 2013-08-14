Ext.define('SR.controller.Snapshots', {
    extend: 'Ext.app.Controller',
    stores: ['Snapshots'],
    models: ['Snapshot'],
    views: ['SnapshotsPanel'],

    init: function() {
        this.control({
            'snapshotslist tool[type=refresh]': {
                click: this.onRefreshToolClicked
            },
            'snapshotslist': {
                delete: this.onRowDelete
            }
        });

        this.refreshList();
    },

    onRefreshToolClicked: function() {
        this.refreshList();
    },

    onRowDelete: function(snapshotsPanel, actionColumn, view, rowIndex, colIndex, item, e, record, row) {
        Ext.defer(function() {
            this.getSnapshotsStore().remove(record);
            this.getSnapshotsStore().sync();
        }, 1, this);
    },

    refreshList: function() {
        this.getSnapshotsStore().load();
    }

});
