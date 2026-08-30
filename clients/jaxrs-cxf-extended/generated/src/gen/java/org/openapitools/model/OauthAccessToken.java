package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.TokenGrantType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
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
  */
  @JsonProperty("access_token")
  @NotNull
  public String getAccessToken() {
    return accessToken;
  }

  /**
   * Sets the <code>accessToken</code> property.
   * <br><em>N.B. <code>accessToken</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  /**
   * Sets the <code>accessToken</code> property.
   * <br><em>N.B. <code>accessToken</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public OauthAccessToken accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

 /**
  * Get expiresIn
  * @return expiresIn
  */
  @JsonProperty("expires_in")
  @NotNull
  public Integer getExpiresIn() {
    return expiresIn;
  }

  /**
   * Sets the <code>expiresIn</code> property.
   * <br><em>N.B. <code>expiresIn</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
  }

  /**
   * Sets the <code>expiresIn</code> property.
   * <br><em>N.B. <code>expiresIn</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public OauthAccessToken expiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }

 /**
  * Get refreshToken
  * @return refreshToken
  */
  @JsonProperty("refresh_token")
  public String getRefreshToken() {
    return refreshToken;
  }

  /**
   * Sets the <code>refreshToken</code> property.
   */
 public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }

  /**
   * Sets the <code>refreshToken</code> property.
   */
  public OauthAccessToken refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

 /**
  * Get refreshTokenExpiresAt
  * @return refreshTokenExpiresAt
  */
  @JsonProperty("refresh_token_expires_at")
  public Integer getRefreshTokenExpiresAt() {
    return refreshTokenExpiresAt;
  }

  /**
   * Sets the <code>refreshTokenExpiresAt</code> property.
   * <br><em>N.B. <code>refreshTokenExpiresAt</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setRefreshTokenExpiresAt(Integer refreshTokenExpiresAt) {
    this.refreshTokenExpiresAt = refreshTokenExpiresAt;
  }

  /**
   * Sets the <code>refreshTokenExpiresAt</code> property.
   * <br><em>N.B. <code>refreshTokenExpiresAt</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public OauthAccessToken refreshTokenExpiresAt(Integer refreshTokenExpiresAt) {
    this.refreshTokenExpiresAt = refreshTokenExpiresAt;
    return this;
  }

 /**
  * Get refreshTokenExpiresIn
  * @return refreshTokenExpiresIn
  */
  @JsonProperty("refresh_token_expires_in")
  public Integer getRefreshTokenExpiresIn() {
    return refreshTokenExpiresIn;
  }

  /**
   * Sets the <code>refreshTokenExpiresIn</code> property.
   * <br><em>N.B. <code>refreshTokenExpiresIn</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setRefreshTokenExpiresIn(Integer refreshTokenExpiresIn) {
    this.refreshTokenExpiresIn = refreshTokenExpiresIn;
  }

  /**
   * Sets the <code>refreshTokenExpiresIn</code> property.
   * <br><em>N.B. <code>refreshTokenExpiresIn</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public OauthAccessToken refreshTokenExpiresIn(Integer refreshTokenExpiresIn) {
    this.refreshTokenExpiresIn = refreshTokenExpiresIn;
    return this;
  }

 /**
  * Get responseType
  * @return responseType
  */
  @JsonProperty("response_type")
  public TokenGrantType getResponseType() {
    return responseType;
  }

  /**
   * Sets the <code>responseType</code> property.
   * <br><em>N.B. <code>responseType</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setResponseType(TokenGrantType responseType) {
    this.responseType = responseType;
  }

  /**
   * Sets the <code>responseType</code> property.
   * <br><em>N.B. <code>responseType</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public OauthAccessToken responseType(TokenGrantType responseType) {
    this.responseType = responseType;
    return this;
  }

 /**
  * Get scope
  * @return scope
  */
  @JsonProperty("scope")
  public String getScope() {
    return scope;
  }

  /**
   * Sets the <code>scope</code> property.
   */
 public void setScope(String scope) {
    this.scope = scope;
  }

  /**
   * Sets the <code>scope</code> property.
   */
  public OauthAccessToken scope(String scope) {
    this.scope = scope;
    return this;
  }

 /**
  * Get tokenType
  * @return tokenType
  */
  @JsonProperty("token_type")
  @NotNull
  public String getTokenType() {
    return tokenType;
  }

  /**
   * Sets the <code>tokenType</code> property.
   * <br><em>N.B. <code>tokenType</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }

  /**
   * Sets the <code>tokenType</code> property.
   * <br><em>N.B. <code>tokenType</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public OauthAccessToken tokenType(String tokenType) {
    this.tokenType = tokenType;
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

