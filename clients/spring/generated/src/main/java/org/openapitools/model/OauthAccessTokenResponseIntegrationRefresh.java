package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.OauthAccessTokenResponse;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A successful OAuth access token response for the refresh token flow, with an added refresh token.
 */

@Schema(name = "OauthAccessTokenResponseIntegrationRefresh", description = "A successful OAuth access token response for the refresh token flow, with an added refresh token.")

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T23:15:39.458648915Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class OauthAccessTokenResponseIntegrationRefresh extends OauthAccessTokenResponse {

  private String refreshToken;

  private Integer refreshTokenExpiresIn;

  public OauthAccessTokenResponseIntegrationRefresh() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OauthAccessTokenResponseIntegrationRefresh(String refreshToken, Integer refreshTokenExpiresIn, String accessToken, String tokenType, Integer expiresIn, String scope) {
    super(accessToken, tokenType, expiresIn, scope);
    this.refreshToken = refreshToken;
    this.refreshTokenExpiresIn = refreshTokenExpiresIn;
  }

  public OauthAccessTokenResponseIntegrationRefresh refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

  /**
   * Get refreshToken
   * @return refreshToken
  */
  @NotNull 
  @Schema(name = "refresh_token", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("refresh_token")
  public String getRefreshToken() {
    return refreshToken;
  }

  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }

  public OauthAccessTokenResponseIntegrationRefresh refreshTokenExpiresIn(Integer refreshTokenExpiresIn) {
    this.refreshTokenExpiresIn = refreshTokenExpiresIn;
    return this;
  }

  /**
   * Get refreshTokenExpiresIn
   * @return refreshTokenExpiresIn
  */
  @NotNull 
  @Schema(name = "refresh_token_expires_in", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("refresh_token_expires_in")
  public Integer getRefreshTokenExpiresIn() {
    return refreshTokenExpiresIn;
  }

  public void setRefreshTokenExpiresIn(Integer refreshTokenExpiresIn) {
    this.refreshTokenExpiresIn = refreshTokenExpiresIn;
  }


  public OauthAccessTokenResponseIntegrationRefresh responseType(ResponseTypeEnum responseType) {
    super.responseType(responseType);
    return this;
  }

  public OauthAccessTokenResponseIntegrationRefresh accessToken(String accessToken) {
    super.accessToken(accessToken);
    return this;
  }

  public OauthAccessTokenResponseIntegrationRefresh tokenType(String tokenType) {
    super.tokenType(tokenType);
    return this;
  }

  public OauthAccessTokenResponseIntegrationRefresh expiresIn(Integer expiresIn) {
    super.expiresIn(expiresIn);
    return this;
  }

  public OauthAccessTokenResponseIntegrationRefresh scope(String scope) {
    super.scope(scope);
    return this;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OauthAccessTokenResponseIntegrationRefresh oauthAccessTokenResponseIntegrationRefresh = (OauthAccessTokenResponseIntegrationRefresh) o;
    return Objects.equals(this.refreshToken, oauthAccessTokenResponseIntegrationRefresh.refreshToken) &&
        Objects.equals(this.refreshTokenExpiresIn, oauthAccessTokenResponseIntegrationRefresh.refreshTokenExpiresIn) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refreshToken, refreshTokenExpiresIn, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OauthAccessTokenResponseIntegrationRefresh {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    refreshTokenExpiresIn: ").append(toIndentedString(refreshTokenExpiresIn)).append("\n");
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

