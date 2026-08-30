package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.TokenGrantType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the valid schema for possible OAuth access token requests.
 */
@ApiModel(description="Describes the valid schema for possible OAuth access token requests.")

public class OauthAccessToken  {
  
  @ApiModelProperty(required = true, value = "")

  private String accessToken;

  @ApiModelProperty(required = true, value = "")

  private Integer expiresIn;

  @ApiModelProperty(value = "")

  private String refreshToken;

  @ApiModelProperty(value = "")

  private Integer refreshTokenExpiresAt;

  @ApiModelProperty(value = "")

  private Integer refreshTokenExpiresIn;

  @ApiModelProperty(value = "")

  @Valid

  private TokenGrantType responseType;

  @ApiModelProperty(value = "")

  private String scope;

  @ApiModelProperty(required = true, value = "")

  private String tokenType = "bearer";
 /**
   * Get accessToken
   * @return accessToken
  **/
  @JsonProperty("access_token")
  @NotNull
  public String getAccessToken() {
    return accessToken;
  }


 /**
   * Get expiresIn
   * @return expiresIn
  **/
  @JsonProperty("expires_in")
  @NotNull
  public Integer getExpiresIn() {
    return expiresIn;
  }


 /**
   * Get refreshToken
   * @return refreshToken
  **/
  @JsonProperty("refresh_token")
  public String getRefreshToken() {
    return refreshToken;
  }

  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }

  public OauthAccessToken refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

 /**
   * Get refreshTokenExpiresAt
   * @return refreshTokenExpiresAt
  **/
  @JsonProperty("refresh_token_expires_at")
  public Integer getRefreshTokenExpiresAt() {
    return refreshTokenExpiresAt;
  }


 /**
   * Get refreshTokenExpiresIn
   * @return refreshTokenExpiresIn
  **/
  @JsonProperty("refresh_token_expires_in")
  public Integer getRefreshTokenExpiresIn() {
    return refreshTokenExpiresIn;
  }


 /**
   * Get responseType
   * @return responseType
  **/
  @JsonProperty("response_type")
  public TokenGrantType getResponseType() {
    return responseType;
  }


 /**
   * Get scope
   * @return scope
  **/
  @JsonProperty("scope")
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public OauthAccessToken scope(String scope) {
    this.scope = scope;
    return this;
  }

 /**
   * Get tokenType
   * @return tokenType
  **/
  @JsonProperty("token_type")
  @NotNull
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

