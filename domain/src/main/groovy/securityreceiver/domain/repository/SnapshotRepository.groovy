package securityreceiver.domain.repository;

import securityreceiver.domain.Snapshot

interface SnapshotRepository {

    Snapshot save(Snapshot snapshot)

    Iterable<Snapshot> findAll()

}
