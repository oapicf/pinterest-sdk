package org.openapitools

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import io.swagger.v3.oas.models.info.Contact
import io.swagger.v3.oas.models.info.License
import io.swagger.v3.oas.models.Components
import io.swagger.v3.oas.models.security.SecurityScheme

@Configuration
class SpringDocConfiguration {

    @Bean
    fun apiInfo(): OpenAPI {
        return OpenAPI()
            .info(
                Info()
                    .title("Pinterest REST API")
                    .description("Pinterest's REST API")
                    .termsOfService("https://developers.pinterest.com/terms/")
                    .contact(
                        Contact()
                            .name("OpenAPI Clients Factory")
                            .url("https://github.com/oapicf/pinterest-sdk")
                            .email("blah+oapicf@cliffano.com")
                    )
                    .license(
                        License()
                            .name("MIT")
                            .url("https://spdx.org/licenses/MIT")
                    )
                    .version("5.14.0")
            )
            .components(
                Components()
                    .addSecuritySchemes("pinterest_oauth2", SecurityScheme()
                        .type(SecurityScheme.Type.OAUTH2)
                    )
                    .addSecuritySchemes("conversion_token", SecurityScheme()
                        .type(SecurityScheme.Type.HTTP)
                        .scheme("bearer")
                    )
                    .addSecuritySchemes("basic", SecurityScheme()
                        .type(SecurityScheme.Type.HTTP)
                        .scheme("basic")
                    )
                    .addSecuritySchemes("client_credentials", SecurityScheme()
                        .type(SecurityScheme.Type.OAUTH2)
                    )
            )
    }
}
