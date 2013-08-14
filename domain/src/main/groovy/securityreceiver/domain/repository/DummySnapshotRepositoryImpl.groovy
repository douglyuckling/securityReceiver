package securityreceiver.domain.repository

import securityreceiver.domain.Snapshot

class DummySnapshotRepositoryImpl implements SnapshotRepository {

    private Map<Object, Snapshot> itemsById = new LinkedHashMap<>()

    DummySnapshotRepositoryImpl() {
        storeItem(new Snapshot(id: 'snapshot1', deviceId: 'deviceId1', compositionTime: new Date(1), location: 'location1', batteryLevel: 'batteryLevel1'))
        storeItem(new Snapshot(id: 'snapshot2', deviceId: 'deviceId2', compositionTime: new Date(), location: 'location2', batteryLevel: 'batteryLevel2'))
    }

    @Override
    Collection<Snapshot> findAll() {
        return new ArrayList<>(itemsById.values())
    }

    @Override
    Snapshot save(Snapshot snapshot) {
        storeItem(snapshot)
        return snapshot
    }

    private void storeItem(Snapshot item) {
        this.itemsById.put(item.id, item)
    }

}
