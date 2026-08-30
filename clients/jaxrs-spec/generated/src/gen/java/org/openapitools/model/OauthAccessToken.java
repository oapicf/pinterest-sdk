package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.TokenGrantType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Describes the valid schema for possible OAuth access token requests.
 **/
@ApiModel(description = "Describes the valid schema for possible OAuth access token requests.")
@JsonTypeName("OauthAccessToken")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OauthAccessToken   {
  private String accessToken;
  private Integer expiresIn;
  private String refreshToken;
  private Integer refreshTokenExpiresAt;
  private Integer refreshTokenExpiresIn;
  private TokenGrantType responseType;
  private String scope;
  private String tokenType = "bearer";

  public OauthAccessToken() {
  }

  @JsonCreator
  public OauthAccessToken(
    @JsonProperty(required = true, value = "access_token") String accessToken,
    @JsonProperty(required = true, value = "expires_in") Integer expiresIn,
    @JsonProperty(required = true, value = "token_type") String tokenType
  ) {
    this.accessToken = accessToken;
    this.expiresIn = expiresIn;
    this.tokenType = tokenType;
  }

  /**
   **/
  public OauthAccessToken accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "access_token")
  public String getAccessToken() {
    return accessToken;
  }

  @JsonProperty(required = true, value = "access_token")
  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  /**
   **/
  public OauthAccessToken expiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "expires_in")
  public Integer getExpiresIn() {
    return expiresIn;
  }

  @JsonProperty(required = true, value = "expires_in")
  public void setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
  }

  /**
   **/
  public OauthAccessToken refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("refresh_token")
  public String getRefreshToken() {
    return refreshToken;
  }

  @JsonProperty("refresh_token")
  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }

  /**
   **/
  public OauthAccessToken refreshTokenExpiresAt(Integer refreshTokenExpiresAt) {
    this.refreshTokenExpiresAt = refreshTokenExpiresAt;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("refresh_token_expires_at")
  public Integer getRefreshTokenExpiresAt() {
    return refreshTokenExpiresAt;
  }

  @JsonProperty("refresh_token_expires_at")
  public void setRefreshTokenExpiresAt(Integer refreshTokenExpiresAt) {
    this.refreshTokenExpiresAt = refreshTokenExpiresAt;
  }

  /**
   **/
  public OauthAccessToken refreshTokenExpiresIn(Integer refreshTokenExpiresIn) {
    this.refreshTokenExpiresIn = refreshTokenExpiresIn;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("refresh_token_expires_in")
  public Integer getRefreshTokenExpiresIn() {
    return refreshTokenExpiresIn;
  }

  @JsonProperty("refresh_token_expires_in")
  public void setRefreshTokenExpiresIn(Integer refreshTokenExpiresIn) {
    this.refreshTokenExpiresIn = refreshTokenExpiresIn;
  }

  /**
   **/
  public OauthAccessToken responseType(TokenGrantType responseType) {
    this.responseType = responseType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("response_type")
  public TokenGrantType getResponseType() {
    return responseType;
  }

  @JsonProperty("response_type")
  public void setResponseType(TokenGrantType responseType) {
    this.responseType = responseType;
  }

  /**
   **/
  public OauthAccessToken scope(String scope) {
    this.scope = scope;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("scope")
  public String getScope() {
    return scope;
  }

  @JsonProperty("scope")
  public void setScope(String scope) {
    this.scope = scope;
  }

  /**
   **/
  public OauthAccessToken tokenType(String tokenType) {
    this.tokenType = tokenType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "token_type")
  public String getTokenType() {
    return tokenType;
  }

  @JsonProperty(required = true, value = "token_type")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
