package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * OauthAccessTokenResponseCode
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-31T05:12:58.482218752Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class OauthAccessTokenResponseCode {

  private @Nullable String refreshToken;

  private @Nullable Integer refreshTokenExpiresAt;

  private @Nullable Integer refreshTokenExpiresIn;

  private String accessToken;

  private Integer expiresIn;

  /**
   * Gets or Sets responseType
   */
  public enum ResponseTypeEnum {
    AUTHORIZATION_CODE("authorization_code"),
    
    REFRESH_TOKEN("refresh_token"),
    
    CLIENT_CREDENTIALS("client_credentials");

    private final String value;

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

  private @Nullable ResponseTypeEnum responseType;

  private String scope;

  private String tokenType = "bearer";

  public OauthAccessTokenResponseCode() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OauthAccessTokenResponseCode(String accessToken, Integer expiresIn, String scope, String tokenType) {
    this.accessToken = accessToken;
    this.expiresIn = expiresIn;
    this.scope = scope;
    this.tokenType = tokenType;
  }

  public OauthAccessTokenResponseCode refreshToken(@Nullable String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

  /**
   * Get refreshToken
   * @return refreshToken
   */
  
  @Schema(name = "refresh_token", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("refresh_token")
  public @Nullable String getRefreshToken() {
    return refreshToken;
  }

  public void setRefreshToken(@Nullable String refreshToken) {
    this.refreshToken = refreshToken;
  }

  public OauthAccessTokenResponseCode refreshTokenExpiresAt(@Nullable Integer refreshTokenExpiresAt) {
    this.refreshTokenExpiresAt = refreshTokenExpiresAt;
    return this;
  }

  /**
   * Get refreshTokenExpiresAt
   * @return refreshTokenExpiresAt
   */
  
  @Schema(name = "refresh_token_expires_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("refresh_token_expires_at")
  public @Nullable Integer getRefreshTokenExpiresAt() {
    return refreshTokenExpiresAt;
  }

  public void setRefreshTokenExpiresAt(@Nullable Integer refreshTokenExpiresAt) {
    this.refreshTokenExpiresAt = refreshTokenExpiresAt;
  }

  public OauthAccessTokenResponseCode refreshTokenExpiresIn(@Nullable Integer refreshTokenExpiresIn) {
    this.refreshTokenExpiresIn = refreshTokenExpiresIn;
    return this;
  }

  /**
   * Get refreshTokenExpiresIn
   * @return refreshTokenExpiresIn
   */
  
  @Schema(name = "refresh_token_expires_in", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("refresh_token_expires_in")
  public @Nullable Integer getRefreshTokenExpiresIn() {
    return refreshTokenExpiresIn;
  }

  public void setRefreshTokenExpiresIn(@Nullable Integer refreshTokenExpiresIn) {
    this.refreshTokenExpiresIn = refreshTokenExpiresIn;
  }

  public OauthAccessTokenResponseCode accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

  /**
   * Get accessToken
   * @return accessToken
   */
  @NotNull 
  @Schema(name = "access_token", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("access_token")
  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public OauthAccessTokenResponseCode expiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }

  /**
   * Get expiresIn
   * @return expiresIn
   */
  @NotNull 
  @Schema(name = "expires_in", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("expires_in")
  public Integer getExpiresIn() {
    return expiresIn;
  }

  public void setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
  }

  public OauthAccessTokenResponseCode responseType(@Nullable ResponseTypeEnum responseType) {
    this.responseType = responseType;
    return this;
  }

  /**
   * Get responseType
   * @return responseType
   */
  
  @Schema(name = "response_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("response_type")
  public @Nullable ResponseTypeEnum getResponseType() {
    return responseType;
  }

  public void setResponseType(@Nullable ResponseTypeEnum responseType) {
    this.responseType = responseType;
  }

  public OauthAccessTokenResponseCode scope(String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * Get scope
   * @return scope
   */
  @NotNull 
  @Schema(name = "scope", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("scope")
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public OauthAccessTokenResponseCode tokenType(String tokenType) {
    this.tokenType = tokenType;
    return this;
  }

  /**
   * Get tokenType
   * @return tokenType
   */
  @NotNull 
  @Schema(name = "token_type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("token_type")
  public String getTokenType() {
    return tokenType;
  }

  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OauthAccessTokenResponseCode oauthAccessTokenResponseCode = (OauthAccessTokenResponseCode) o;
    return Objects.equals(this.refreshToken, oauthAccessTokenResponseCode.refreshToken) &&
        Objects.equals(this.refreshTokenExpiresAt, oauthAccessTokenResponseCode.refreshTokenExpiresAt) &&
        Objects.equals(this.refreshTokenExpiresIn, oauthAccessTokenResponseCode.refreshTokenExpiresIn) &&
        Objects.equals(this.accessToken, oauthAccessTokenResponseCode.accessToken) &&
        Objects.equals(this.expiresIn, oauthAccessTokenResponseCode.expiresIn) &&
        Objects.equals(this.responseType, oauthAccessTokenResponseCode.responseType) &&
        Objects.equals(this.scope, oauthAccessTokenResponseCode.scope) &&
        Objects.equals(this.tokenType, oauthAccessTokenResponseCode.tokenType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refreshToken, refreshTokenExpiresAt, refreshTokenExpiresIn, accessToken, expiresIn, responseType, scope, tokenType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OauthAccessTokenResponseCode {\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    refreshTokenExpiresAt: ").append(toIndentedString(refreshTokenExpiresAt)).append("\n");
    sb.append("    refreshTokenExpiresIn: ").append(toIndentedString(refreshTokenExpiresIn)).append("\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
    sb.append("    responseType: ").append(toIndentedString(responseType)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
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

