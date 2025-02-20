/*
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * A successful OAuth access token response.
 */
@JsonPropertyOrder({
  OauthAccessTokenResponse.JSON_PROPERTY_RESPONSE_TYPE,
  OauthAccessTokenResponse.JSON_PROPERTY_ACCESS_TOKEN,
  OauthAccessTokenResponse.JSON_PROPERTY_TOKEN_TYPE,
  OauthAccessTokenResponse.JSON_PROPERTY_EXPIRES_IN,
  OauthAccessTokenResponse.JSON_PROPERTY_SCOPE
})
@JsonTypeName("OauthAccessTokenResponse")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-11-05T02:02:57.601423453Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@JsonIgnoreProperties(
  value = "response_type", // ignore manually set response_type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the response_type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "response_type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = OauthAccessTokenResponseCode.class, name = "authorization_code"),
  @JsonSubTypes.Type(value = OauthAccessTokenResponseClientCredentials.class, name = "client_credentials"),
  @JsonSubTypes.Type(value = OauthAccessTokenResponseEverlastingRefresh.class, name = "everlasting_refresh"),
  @JsonSubTypes.Type(value = OauthAccessTokenResponseIntegrationRefresh.class, name = "integration_refresh"),
  @JsonSubTypes.Type(value = OauthAccessTokenResponseRefresh.class, name = "refresh_token"),
})

@Introspected
public class OauthAccessTokenResponse {
    /**
     * Gets or Sets responseType
     */
    public enum ResponseTypeEnum {
        AUTHORIZATION_CODE("authorization_code"),
        REFRESH_TOKEN("refresh_token"),
        CLIENT_CREDENTIALS("client_credentials");

        private String value;

        ResponseTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ResponseTypeEnum fromValue(String value) {
            for (ResponseTypeEnum b : ResponseTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }
    public static final String JSON_PROPERTY_RESPONSE_TYPE = "response_type";
    protected ResponseTypeEnum responseType;

    public static final String JSON_PROPERTY_ACCESS_TOKEN = "access_token";
    private String accessToken;

    public static final String JSON_PROPERTY_TOKEN_TYPE = "token_type";
    private String tokenType = "bearer";

    public static final String JSON_PROPERTY_EXPIRES_IN = "expires_in";
    private Integer expiresIn;

    public static final String JSON_PROPERTY_SCOPE = "scope";
    private String scope;

    public OauthAccessTokenResponse(String accessToken, String tokenType, Integer expiresIn, String scope) {
        this.accessToken = accessToken;
        this.tokenType = tokenType;
        this.expiresIn = expiresIn;
        this.scope = scope;
    }

    public OauthAccessTokenResponse responseType(ResponseTypeEnum responseType) {
        this.responseType = responseType;
        return this;
    }

    /**
     * Get responseType
     * @return responseType
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_RESPONSE_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public ResponseTypeEnum getResponseType() {
        return responseType;
    }

    @JsonProperty(JSON_PROPERTY_RESPONSE_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setResponseType(ResponseTypeEnum responseType) {
        this.responseType = responseType;
    }

    public OauthAccessTokenResponse accessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    /**
     * Get accessToken
     * @return accessToken
     */
    @NotNull
    @JsonProperty(JSON_PROPERTY_ACCESS_TOKEN)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getAccessToken() {
        return accessToken;
    }

    @JsonProperty(JSON_PROPERTY_ACCESS_TOKEN)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public OauthAccessTokenResponse tokenType(String tokenType) {
        this.tokenType = tokenType;
        return this;
    }

    /**
     * Get tokenType
     * @return tokenType
     */
    @NotNull
    @JsonProperty(JSON_PROPERTY_TOKEN_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getTokenType() {
        return tokenType;
    }

    @JsonProperty(JSON_PROPERTY_TOKEN_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public OauthAccessTokenResponse expiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
        return this;
    }

    /**
     * Get expiresIn
     * @return expiresIn
     */
    @NotNull
    @JsonProperty(JSON_PROPERTY_EXPIRES_IN)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Integer getExpiresIn() {
        return expiresIn;
    }

    @JsonProperty(JSON_PROPERTY_EXPIRES_IN)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
    }

    public OauthAccessTokenResponse scope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Get scope
     * @return scope
     */
    @NotNull
    @JsonProperty(JSON_PROPERTY_SCOPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getScope() {
        return scope;
    }

    @JsonProperty(JSON_PROPERTY_SCOPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setScope(String scope) {
        this.scope = scope;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OauthAccessTokenResponse oauthAccessTokenResponse = (OauthAccessTokenResponse) o;
        return Objects.equals(this.responseType, oauthAccessTokenResponse.responseType) &&
            Objects.equals(this.accessToken, oauthAccessTokenResponse.accessToken) &&
            Objects.equals(this.tokenType, oauthAccessTokenResponse.tokenType) &&
            Objects.equals(this.expiresIn, oauthAccessTokenResponse.expiresIn) &&
            Objects.equals(this.scope, oauthAccessTokenResponse.scope);
    }

    @Override
    public int hashCode() {
        return Objects.hash(responseType, accessToken, tokenType, expiresIn, scope);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OauthAccessTokenResponse {\n");
        sb.append("    responseType: ").append(toIndentedString(responseType)).append("\n");
        sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
        sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
        sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

