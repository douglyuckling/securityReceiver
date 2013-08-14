package securityreceiver.services
import org.springframework.beans.factory.annotation.Autowired
import securityreceiver.domain.Snapshot
import securityreceiver.domain.repository.SnapshotRepository

class SnapshotServiceImpl implements SnapshotService {

    @Autowired
    private SnapshotRepository repository

    @Override
    Collection<Snapshot> findAll() {
        return repository.findAll() as List<Snapshot>
    }

    @Override
    Snapshot save(Snapshot snapshot) {
        return repository.save(snapshot)
    }

}
