Ext.define('SR.model.Snapshot', {
    extend: 'Ext.data.Model',
    fields: [
        {name: 'id', type: 'string'},
        {name: 'deviceId', type: 'string'},
        {name: 'compositionTime', type: 'date', dateFormat: 'time'},
        {name: 'location', type: 'string'},
        {name: 'batteryLevel', type: 'string'}
    ]
});
