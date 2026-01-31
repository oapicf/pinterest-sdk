package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OauthAccessTokenResponseCode  {
  
  @ApiModelProperty(value = "")
  private String refreshToken;

  @ApiModelProperty(value = "")
  private Integer refreshTokenExpiresAt;

  @ApiModelProperty(value = "")
  private Integer refreshTokenExpiresIn;

  @ApiModelProperty(required = true, value = "")
  private String accessToken;

  @ApiModelProperty(required = true, value = "")
  private Integer expiresIn;

public enum ResponseTypeEnum {

    @JsonProperty("authorization_code") AUTHORIZATION_CODE(String.valueOf("authorization_code")),
    @JsonProperty("refresh_token") REFRESH_TOKEN(String.valueOf("refresh_token")),
    @JsonProperty("client_credentials") CLIENT_CREDENTIALS(String.valueOf("client_credentials"));

    private String value;

    ResponseTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ResponseTypeEnum fromValue(String value) {
        for (ResponseTypeEnum b : ResponseTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")
  private ResponseTypeEnum responseType;

  @ApiModelProperty(required = true, value = "")
  private String scope;

  @ApiModelProperty(required = true, value = "")
  private String tokenType = "bearer";
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
  public OauthAccessTokenResponseCode refreshToken(String refreshToken) {
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
   */
 public void setRefreshTokenExpiresAt(Integer refreshTokenExpiresAt) {
    this.refreshTokenExpiresAt = refreshTokenExpiresAt;
  }

  /**
   * Sets the <code>refreshTokenExpiresAt</code> property.
   */
  public OauthAccessTokenResponseCode refreshTokenExpiresAt(Integer refreshTokenExpiresAt) {
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
   */
 public void setRefreshTokenExpiresIn(Integer refreshTokenExpiresIn) {
    this.refreshTokenExpiresIn = refreshTokenExpiresIn;
  }

  /**
   * Sets the <code>refreshTokenExpiresIn</code> property.
   */
  public OauthAccessTokenResponseCode refreshTokenExpiresIn(Integer refreshTokenExpiresIn) {
    this.refreshTokenExpiresIn = refreshTokenExpiresIn;
    return this;
  }

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
   */
 public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  /**
   * Sets the <code>accessToken</code> property.
   */
  public OauthAccessTokenResponseCode accessToken(String accessToken) {
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
   */
 public void setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
  }

  /**
   * Sets the <code>expiresIn</code> property.
   */
  public OauthAccessTokenResponseCode expiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }

 /**
  * Get responseType
  * @return responseType
  */
  @JsonProperty("response_type")
  public String getResponseType() {
    return responseType == null ? null : responseType.value();
  }

  /**
   * Sets the <code>responseType</code> property.
   */
 public void setResponseType(ResponseTypeEnum responseType) {
    this.responseType = responseType;
  }

  /**
   * Sets the <code>responseType</code> property.
   */
  public OauthAccessTokenResponseCode responseType(ResponseTypeEnum responseType) {
    this.responseType = responseType;
    return this;
  }

 /**
  * Get scope
  * @return scope
  */
  @JsonProperty("scope")
  @NotNull
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
  public OauthAccessTokenResponseCode scope(String scope) {
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
   */
 public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }

  /**
   * Sets the <code>tokenType</code> property.
   */
  public OauthAccessTokenResponseCode tokenType(String tokenType) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

