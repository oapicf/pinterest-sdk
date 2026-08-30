package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.TokenGrantType;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Describes the valid schema for possible OAuth access token requests.
 */

@Schema(name = "OauthAccessToken", description = "Describes the valid schema for possible OAuth access token requests.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OauthAccessToken {

  private String accessToken;

  private Integer expiresIn;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String refreshToken;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer refreshTokenExpiresAt;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer refreshTokenExpiresIn;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable TokenGrantType responseType;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String scope;

  private String tokenType = "bearer";

  public OauthAccessToken() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OauthAccessToken(String accessToken, Integer expiresIn, String tokenType) {
    this.accessToken = accessToken;
    this.expiresIn = expiresIn;
    this.tokenType = tokenType;
  }

  public OauthAccessToken accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

  /**
   * Get accessToken
   * @return accessToken
   */
  
  @Schema(name = "access_token", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("access_token")
  public String getAccessToken() {
    return accessToken;
  }

  @JsonProperty("access_token")
  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public OauthAccessToken expiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }

  /**
   * Get expiresIn
   * @return expiresIn
   */
  
  @Schema(name = "expires_in", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("expires_in")
  public Integer getExpiresIn() {
    return expiresIn;
  }

  @JsonProperty("expires_in")
  public void setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
  }

  public OauthAccessToken refreshToken(@Nullable String refreshToken) {
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

  @JsonProperty("refresh_token")
  public void setRefreshToken(@Nullable String refreshToken) {
    this.refreshToken = refreshToken;
  }

  public OauthAccessToken refreshTokenExpiresAt(@Nullable Integer refreshTokenExpiresAt) {
    this.refreshTokenExpiresAt = refreshTokenExpiresAt;
    return this;
  }

  /**
   * Get refreshTokenExpiresAt
   * @return refreshTokenExpiresAt
   */
  
  @Schema(name = "refresh_token_expires_at", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("refresh_token_expires_at")
  public @Nullable Integer getRefreshTokenExpiresAt() {
    return refreshTokenExpiresAt;
  }

  @JsonProperty("refresh_token_expires_at")
  public void setRefreshTokenExpiresAt(@Nullable Integer refreshTokenExpiresAt) {
    this.refreshTokenExpiresAt = refreshTokenExpiresAt;
  }

  public OauthAccessToken refreshTokenExpiresIn(@Nullable Integer refreshTokenExpiresIn) {
    this.refreshTokenExpiresIn = refreshTokenExpiresIn;
    return this;
  }

  /**
   * Get refreshTokenExpiresIn
   * @return refreshTokenExpiresIn
   */
  
  @Schema(name = "refresh_token_expires_in", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("refresh_token_expires_in")
  public @Nullable Integer getRefreshTokenExpiresIn() {
    return refreshTokenExpiresIn;
  }

  @JsonProperty("refresh_token_expires_in")
  public void setRefreshTokenExpiresIn(@Nullable Integer refreshTokenExpiresIn) {
    this.refreshTokenExpiresIn = refreshTokenExpiresIn;
  }

  public OauthAccessToken responseType(@Nullable TokenGrantType responseType) {
    this.responseType = responseType;
    return this;
  }

  /**
   * Get responseType
   * @return responseType
   */
  @Valid 
  @Schema(name = "response_type", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("response_type")
  public @Nullable TokenGrantType getResponseType() {
    return responseType;
  }

  @JsonProperty("response_type")
  public void setResponseType(@Nullable TokenGrantType responseType) {
    this.responseType = responseType;
  }

  public OauthAccessToken scope(@Nullable String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * Get scope
   * @return scope
   */
  
  @Schema(name = "scope", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scope")
  public @Nullable String getScope() {
    return scope;
  }

  @JsonProperty("scope")
  public void setScope(@Nullable String scope) {
    this.scope = scope;
  }

  public OauthAccessToken tokenType(String tokenType) {
    this.tokenType = tokenType;
    return this;
  }

  /**
   * Get tokenType
   * @return tokenType
   */
  
  @Schema(name = "token_type", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("token_type")
  public String getTokenType() {
    return tokenType;
  }

  @JsonProperty("token_type")
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
    OauthAccessToken oauthAccessToken = (OauthAccessToken) o;
    return Objects.equals(this.accessToken, oauthAccessToken.accessToken) &&
        Objects.equals(this.expiresIn, oauthAccessToken.expiresIn) &&
        Objects.equals(this.refreshToken, oauthAccessToken.refreshToken) &&
        Objects.equals(this.refreshTokenExpiresAt, oauthAccessToken.refreshTokenExpiresAt) &&
        Objects.equals(this.refreshTokenExpiresIn, oauthAccessToken.refreshTokenExpiresIn) &&
        Objects.equals(this.responseType, oauthAccessToken.responseType) &&
        Objects.equals(this.scope, oauthAccessToken.scope) &&
        Objects.equals(this.tokenType, oauthAccessToken.tokenType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, expiresIn, refreshToken, refreshTokenExpiresAt, refreshTokenExpiresIn, responseType, scope, tokenType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OauthAccessToken {\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    refreshTokenExpiresAt: ").append(toIndentedString(refreshTokenExpiresAt)).append("\n");
    sb.append("    refreshTokenExpiresIn: ").append(toIndentedString(refreshTokenExpiresIn)).append("\n");
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

