package securityreceiver.domain.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import securityreceiver.domain.repository.DummySnapshotRepositoryImpl;
import securityreceiver.domain.repository.SnapshotRepository;

@Configuration
class DomainConfig {

    @Bean
    SnapshotRepository snapshotRepository() {
        return new DummySnapshotRepositoryImpl()
    }

}
