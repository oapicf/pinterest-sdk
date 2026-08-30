package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.TokenGrantType;

/**
 * Describes the valid schema for possible OAuth access token requests.
 */
@ApiModel(description = "Describes the valid schema for possible OAuth access token requests.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OauthAccessToken   {
  @JsonProperty("access_token")
  private String accessToken;

  @JsonProperty("expires_in")
  private Integer expiresIn;

  @JsonProperty("refresh_token")
  private String refreshToken;

  @JsonProperty("refresh_token_expires_at")
  private Integer refreshTokenExpiresAt;

  @JsonProperty("refresh_token_expires_in")
  private Integer refreshTokenExpiresIn;

  @JsonProperty("response_type")
  private TokenGrantType responseType;

  @JsonProperty("scope")
  private String scope;

  @JsonProperty("token_type")
  private String tokenType = "bearer";

   /**
   * Get accessToken
   * @return accessToken
  **/
  @ApiModelProperty(required = true, value = "")
  public String getAccessToken() {
    return accessToken;
  }

   /**
   * Get expiresIn
   * @return expiresIn
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getExpiresIn() {
    return expiresIn;
  }

  public OauthAccessToken refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

   /**
   * Get refreshToken
   * @return refreshToken
  **/
  @ApiModelProperty(value = "")
  public String getRefreshToken() {
    return refreshToken;
  }

  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }

   /**
   * Get refreshTokenExpiresAt
   * @return refreshTokenExpiresAt
  **/
  @ApiModelProperty(value = "")
  public Integer getRefreshTokenExpiresAt() {
    return refreshTokenExpiresAt;
  }

   /**
   * Get refreshTokenExpiresIn
   * @return refreshTokenExpiresIn
  **/
  @ApiModelProperty(value = "")
  public Integer getRefreshTokenExpiresIn() {
    return refreshTokenExpiresIn;
  }

   /**
   * Get responseType
   * @return responseType
  **/
  @ApiModelProperty(value = "")
  public TokenGrantType getResponseType() {
    return responseType;
  }

  public OauthAccessToken scope(String scope) {
    this.scope = scope;
    return this;
  }

   /**
   * Get scope
   * @return scope
  **/
  @ApiModelProperty(value = "")
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

   /**
   * Get tokenType
   * @return tokenType
  **/
  @ApiModelProperty(required = true, value = "")
  public String getTokenType() {
    return tokenType;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

