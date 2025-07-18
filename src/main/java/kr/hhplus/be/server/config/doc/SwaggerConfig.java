package kr.hhplus.be.server.config.doc;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .components(new io.swagger.v3.oas.models.Components())
                .info(new Info()
                        .title("Order System Backend API")
                        .version("1.0.0")
                        .description("API documentation for the Order System backend service"));
    }
}
