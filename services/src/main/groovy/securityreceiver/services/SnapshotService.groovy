package securityreceiver.services
import securityreceiver.domain.Snapshot

interface SnapshotService {

    Collection<Snapshot> findAll()

    Snapshot save(Snapshot snapshot)

}
