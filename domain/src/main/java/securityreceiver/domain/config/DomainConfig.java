package securityreceiver.domain.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import securityreceiver.domain.repository.DummyGroceryListItemRepositoryImpl;
import securityreceiver.domain.repository.GroceryListItemRepository;

@Configuration
public class DomainConfig {

    @Bean
    public GroceryListItemRepository groceryListItemRepository() {
        return new DummyGroceryListItemRepositoryImpl();
    }

}
