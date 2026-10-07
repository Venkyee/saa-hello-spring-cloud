package helloworld;

import io.pivotal.cfenv.core.CfEnv;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("cloud")
public class CloudConfig {
    @Bean
    public CfEnv cfEnv() {
        return new CfEnv();
    }
}
