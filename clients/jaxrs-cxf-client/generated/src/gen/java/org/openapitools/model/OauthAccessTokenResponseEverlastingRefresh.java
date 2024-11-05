package org.openapitools.model;

import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * A successful OAuth access token response for the refresh token flow, with an added everlasting refresh token.
 **/
@ApiModel(description="A successful OAuth access token response for the refresh token flow, with an added everlasting refresh token.")

public class OauthAccessTokenResponseEverlastingRefresh  {
  
public enum ResponseTypeEnum {

AUTHORIZATION_CODE(String.valueOf("authorization_code")), REFRESH_TOKEN(String.valueOf("refresh_token")), CLIENT_CREDENTIALS(String.valueOf("client_credentials"));


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
  private String accessToken;

  @ApiModelProperty(required = true, value = "")
  private String tokenType = "bearer";

  @ApiModelProperty(required = true, value = "")
  private Integer expiresIn;

  @ApiModelProperty(required = true, value = "")
  private String scope;

  @ApiModelProperty(required = true, value = "")
  private String refreshToken;

  @ApiModelProperty(required = true, value = "")
  private Integer refreshTokenExpiresIn;

  @ApiModelProperty(required = true, value = "")
  private Integer refreshTokenExpiresAt;
 /**
   * Get responseType
   * @return responseType
  **/
  @JsonProperty("response_type")
  public String getResponseType() {
    if (responseType == null) {
      return null;
    }
    return responseType.value();
  }

  public void setResponseType(ResponseTypeEnum responseType) {
    this.responseType = responseType;
  }

  public OauthAccessTokenResponseEverlastingRefresh responseType(ResponseTypeEnum responseType) {
    this.responseType = responseType;
    return this;
  }

 /**
   * Get accessToken
   * @return accessToken
  **/
  @JsonProperty("access_token")
  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public OauthAccessTokenResponseEverlastingRefresh accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

 /**
   * Get tokenType
   * @return tokenType
  **/
  @JsonProperty("token_type")
  public String getTokenType() {
    return tokenType;
  }

  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }

  public OauthAccessTokenResponseEverlastingRefresh tokenType(String tokenType) {
    this.tokenType = tokenType;
    return this;
  }

 /**
   * Get expiresIn
   * @return expiresIn
  **/
  @JsonProperty("expires_in")
  public Integer getExpiresIn() {
    return expiresIn;
  }

  public void setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
  }

  public OauthAccessTokenResponseEverlastingRefresh expiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
    return this;
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

  public OauthAccessTokenResponseEverlastingRefresh scope(String scope) {
    this.scope = scope;
    return this;
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

  public OauthAccessTokenResponseEverlastingRefresh refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

 /**
   * Get refreshTokenExpiresIn
   * @return refreshTokenExpiresIn
  **/
  @JsonProperty("refresh_token_expires_in")
  public Integer getRefreshTokenExpiresIn() {
    return refreshTokenExpiresIn;
  }

  public void setRefreshTokenExpiresIn(Integer refreshTokenExpiresIn) {
    this.refreshTokenExpiresIn = refreshTokenExpiresIn;
  }

  public OauthAccessTokenResponseEverlastingRefresh refreshTokenExpiresIn(Integer refreshTokenExpiresIn) {
    this.refreshTokenExpiresIn = refreshTokenExpiresIn;
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

  public void setRefreshTokenExpiresAt(Integer refreshTokenExpiresAt) {
    this.refreshTokenExpiresAt = refreshTokenExpiresAt;
  }

  public OauthAccessTokenResponseEverlastingRefresh refreshTokenExpiresAt(Integer refreshTokenExpiresAt) {
    this.refreshTokenExpiresAt = refreshTokenExpiresAt;
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
    OauthAccessTokenResponseEverlastingRefresh oauthAccessTokenResponseEverlastingRefresh = (OauthAccessTokenResponseEverlastingRefresh) o;
    return Objects.equals(this.responseType, oauthAccessTokenResponseEverlastingRefresh.responseType) &&
        Objects.equals(this.accessToken, oauthAccessTokenResponseEverlastingRefresh.accessToken) &&
        Objects.equals(this.tokenType, oauthAccessTokenResponseEverlastingRefresh.tokenType) &&
        Objects.equals(this.expiresIn, oauthAccessTokenResponseEverlastingRefresh.expiresIn) &&
        Objects.equals(this.scope, oauthAccessTokenResponseEverlastingRefresh.scope) &&
        Objects.equals(this.refreshToken, oauthAccessTokenResponseEverlastingRefresh.refreshToken) &&
        Objects.equals(this.refreshTokenExpiresIn, oauthAccessTokenResponseEverlastingRefresh.refreshTokenExpiresIn) &&
        Objects.equals(this.refreshTokenExpiresAt, oauthAccessTokenResponseEverlastingRefresh.refreshTokenExpiresAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseType, accessToken, tokenType, expiresIn, scope, refreshToken, refreshTokenExpiresIn, refreshTokenExpiresAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OauthAccessTokenResponseEverlastingRefresh {\n");
    
    sb.append("    responseType: ").append(toIndentedString(responseType)).append("\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    refreshTokenExpiresIn: ").append(toIndentedString(refreshTokenExpiresIn)).append("\n");
    sb.append("    refreshTokenExpiresAt: ").append(toIndentedString(refreshTokenExpiresAt)).append("\n");
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

