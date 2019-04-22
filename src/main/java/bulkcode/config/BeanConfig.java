package bulkcode.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import bulkcode.mapper.EntityMapper;

@Configuration
public class BeanConfig {

    @Bean
    public EntityMapper getMapper() {
        return new EntityMapper();
    }
}
