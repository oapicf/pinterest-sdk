package org.openapitools.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.security.SecurityScheme;

@Configuration
public class SpringDocConfiguration {

    @Bean(name = "org.openapitools.configuration.SpringDocConfiguration.apiInfo")
    OpenAPI apiInfo() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("Pinterest REST API")
                                .description("Pinterest's REST API")
                                .termsOfService("https://developers.pinterest.com/terms/")
                                .contact(
                                        new Contact()
                                                .name("OpenAPI Clients Factory")
                                                .url("https://github.com/oapicf/pinterest-sdk")
                                                .email("blah+oapicf@cliffano.com")
                                )
                                .license(
                                        new License()
                                                .name("MIT")
                                                .url("https://spdx.org/licenses/MIT")
                                )
                                .version("5.12.0")
                )
                .components(
                        new Components()
                                .addSecuritySchemes("pinterest_oauth2", new SecurityScheme()
                                        .type(SecurityScheme.Type.OAUTH2)
                                )
                                .addSecuritySchemes("conversion_token", new SecurityScheme()
                                        .type(SecurityScheme.Type.HTTP)
                                        .scheme("bearer")
                                )
                                .addSecuritySchemes("basic", new SecurityScheme()
                                        .type(SecurityScheme.Type.HTTP)
                                        .scheme("basic")
                                )
                )
        ;
    }
}