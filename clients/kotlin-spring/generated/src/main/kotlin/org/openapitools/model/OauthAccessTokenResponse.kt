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
      JsonSubTypes.Type(value = OauthAccessTokenResponseRefresh::class, name = "refresh_token")
)

interface OauthAccessTokenResponse{
        
        val accessToken: kotlin.String
        
        val tokenType: kotlin.String
        
        val expiresIn: kotlin.Int
        
        val scope: kotlin.String
        
        val responseType: OauthAccessTokenResponse.ResponseType? 

    /**
    * 
    * Values: authorizationCode,refreshToken
    */
    enum class ResponseType(val value: kotlin.String) {
    
        @JsonProperty("authorization_code") authorizationCode("authorization_code"),
    
        @JsonProperty("refresh_token") refreshToken("refresh_token");
    
    }

}

