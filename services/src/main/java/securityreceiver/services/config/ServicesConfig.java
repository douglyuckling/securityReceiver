package securityreceiver.services.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import securityreceiver.domain.config.DomainConfig;
import securityreceiver.services.GroceryListService;
import securityreceiver.services.GroceryListServiceImpl;

@Configuration
@Import(DomainConfig.class)
public class ServicesConfig {

    @Bean
    public GroceryListService groceryListService() {
        return new GroceryListServiceImpl();
    }

}
