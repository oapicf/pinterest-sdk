package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.fasterxml.jackson.annotation.JsonValue
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid

/**
 * Describes the valid schema for possible OAuth access token requests.
 * @param grantType 
 */

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "grant_type", visible = true)
@JsonSubTypes(
      JsonSubTypes.Type(value = OauthAccessTokenRequestCode::class, name = "authorization_code"),
      JsonSubTypes.Type(value = OauthAccessTokenRequestRefresh::class, name = "refresh_token")
)

interface OauthAccessTokenRequest{
        
        val grantType: OauthAccessTokenRequest.GrantType

    /**
    * 
    * Values: authorizationCode,refreshToken
    */
    enum class GrantType(val value: kotlin.String) {
    
        @JsonProperty("authorization_code") authorizationCode("authorization_code"),
    
        @JsonProperty("refresh_token") refreshToken("refresh_token");
    
    }

}

