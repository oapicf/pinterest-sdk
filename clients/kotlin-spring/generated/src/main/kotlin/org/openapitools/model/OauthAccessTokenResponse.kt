package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.fasterxml.jackson.annotation.JsonValue
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * A successful OAuth access token response.
 * @param accessToken 
 * @param tokenType 
 * @param expiresIn 
 * @param scope 
 * @param responseType 
 */

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "response_type", visible = true)
@JsonSubTypes(
      JsonSubTypes.Type(value = OauthAccessTokenResponseCode::class, name = "authorization_code"),
      JsonSubTypes.Type(value = OauthAccessTokenResponseClientCredentials::class, name = "client_credentials"),
      JsonSubTypes.Type(value = OauthAccessTokenResponseEverlastingRefresh::class, name = "everlasting_refresh"),
      JsonSubTypes.Type(value = OauthAccessTokenResponseIntegrationRefresh::class, name = "integration_refresh"),
      JsonSubTypes.Type(value = OauthAccessTokenResponseRefresh::class, name = "refresh_token")
)

interface OauthAccessTokenResponse{
                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val accessToken: kotlin.String

                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val tokenType: kotlin.String

                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val expiresIn: kotlin.Int

                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val scope: kotlin.String

                @get:Schema(example = "null", description = "")
        val responseType: OauthAccessTokenResponse.ResponseType? 


    /**
    * 
    * Values: authorization_code,refresh_token,client_credentials
    */
    enum class ResponseType(@get:JsonValue val value: kotlin.String) {

        authorization_code("authorization_code"),
        refresh_token("refresh_token"),
        client_credentials("client_credentials");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): ResponseType {
                return values().first{it -> it.value == value}
            }
        }
    }

}

