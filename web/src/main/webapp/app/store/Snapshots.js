Ext.define('SR.store.Snapshots', {
    extend: 'Ext.data.Store',
    model: 'SR.model.Snapshot',
    proxy: {
        type: 'rest',
        url : 'data/snapshots',
        pageParam: undefined,
        limitParam: undefined,
        startParam: undefined
    }
});
