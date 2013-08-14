package securityreceiver.domain.repository

import org.bson.types.ObjectId
import org.springframework.data.repository.CrudRepository
import securityreceiver.domain.Snapshot

interface SnapshotRepository extends CrudRepository<Snapshot, ObjectId> {

}
