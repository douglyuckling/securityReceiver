Ext.define('SR.view.SnapshotsPanel' ,{
    extend: 'Ext.grid.Panel',
    uses: ['Ext.grid.plugin.RowEditing'],
    alias: 'widget.snapshotslist',

    tools: [{
        type: 'refresh'
    }],

    columns: [{
        text: 'Snapshot ID',
        dataIndex: 'id',
        width: 150
    }, {
        text: 'Device ID',
        dataIndex: 'deviceId',
        width: 150
    }, {
        text: 'Composed',
        dataIndex: 'compositionTime',
        xtype: 'datecolumn',
        format: 'm/d/Y h:i:s',
        width: 150
    }, {
        text: 'Location',
        dataIndex: 'location',
        width: 150
    }, {
        text: 'Battery Level',
        dataIndex: 'batteryLevel',
        width: 150
    }],

    initComponent: function() {
        var me = this;

        this.addEvents('delete');

        this.columns.push({
            xtype:'actioncolumn',
            width:50,
            flex: 1,
            align: 'right',
            icon: 'resources/theme-neptune/images/tools/tool-close-dark.png',
            tooltip: 'Delete',
            handler: function() {
                var actioncolumn = this;
                me.fireEventArgs('delete', [me, actioncolumn].concat(Array.prototype.slice.call(arguments, 0)));
            }
        });

        this.callParent(arguments);
    }

});
