package securityreceiver.services.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import securityreceiver.domain.config.DomainConfig;
import securityreceiver.services.SnapshotService;
import securityreceiver.services.SnapshotServiceImpl;

@Configuration
@Import(DomainConfig.class)
class ServicesConfig {

    @Bean
    SnapshotService snapshotService() {
        return new SnapshotServiceImpl()
    }

}
