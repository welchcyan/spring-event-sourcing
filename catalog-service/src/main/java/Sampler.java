import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by chenw13 on 27/10/2016.
 */
@Configuration
public class Sampler {
    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public AlwaysSampler alwaysSampler() {
        return new AlwaysSampler();
    }
}
