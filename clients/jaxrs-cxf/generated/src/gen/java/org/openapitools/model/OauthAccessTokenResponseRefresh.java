package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A successful OAuth access token response for the refresh token flow.
 */
@ApiModel(description="A successful OAuth access token response for the refresh token flow.")

public class OauthAccessTokenResponseRefresh  {
  
  @ApiModelProperty(required = true, value = "")

  private String accessToken;

  @ApiModelProperty(required = true, value = "")

  private Integer expiresIn;

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
    @JsonValue
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

  @ApiModelProperty(value = "")

  private ResponseTypeEnum responseType;

  @ApiModelProperty(required = true, value = "")

  private String scope;

  @ApiModelProperty(required = true, value = "")

  private String tokenType = "bearer";

  @ApiModelProperty(required = true, value = "")

  private String refreshToken;

  @ApiModelProperty(required = true, value = "")

  private Integer refreshTokenExpiresAt;

  @ApiModelProperty(required = true, value = "")

  private Integer refreshTokenExpiresIn;
 /**
   * Get accessToken
   * @return accessToken
  **/
  @JsonProperty("access_token")
  @NotNull
  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public OauthAccessTokenResponseRefresh accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
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

  public void setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
  }

  public OauthAccessTokenResponseRefresh expiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }

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

  public OauthAccessTokenResponseRefresh responseType(ResponseTypeEnum responseType) {
    this.responseType = responseType;
    return this;
  }

 /**
   * Get scope
   * @return scope
  **/
  @JsonProperty("scope")
  @NotNull
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public OauthAccessTokenResponseRefresh scope(String scope) {
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

  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }

  public OauthAccessTokenResponseRefresh tokenType(String tokenType) {
    this.tokenType = tokenType;
    return this;
  }

 /**
   * Get refreshToken
   * @return refreshToken
  **/
  @JsonProperty("refresh_token")
  @NotNull
  public String getRefreshToken() {
    return refreshToken;
  }

  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }

  public OauthAccessTokenResponseRefresh refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

 /**
   * Get refreshTokenExpiresAt
   * @return refreshTokenExpiresAt
  **/
  @JsonProperty("refresh_token_expires_at")
  @NotNull
  public Integer getRefreshTokenExpiresAt() {
    return refreshTokenExpiresAt;
  }

  public void setRefreshTokenExpiresAt(Integer refreshTokenExpiresAt) {
    this.refreshTokenExpiresAt = refreshTokenExpiresAt;
  }

  public OauthAccessTokenResponseRefresh refreshTokenExpiresAt(Integer refreshTokenExpiresAt) {
    this.refreshTokenExpiresAt = refreshTokenExpiresAt;
    return this;
  }

 /**
   * Get refreshTokenExpiresIn
   * @return refreshTokenExpiresIn
  **/
  @JsonProperty("refresh_token_expires_in")
  @NotNull
  public Integer getRefreshTokenExpiresIn() {
    return refreshTokenExpiresIn;
  }

  public void setRefreshTokenExpiresIn(Integer refreshTokenExpiresIn) {
    this.refreshTokenExpiresIn = refreshTokenExpiresIn;
  }

  public OauthAccessTokenResponseRefresh refreshTokenExpiresIn(Integer refreshTokenExpiresIn) {
    this.refreshTokenExpiresIn = refreshTokenExpiresIn;
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
    OauthAccessTokenResponseRefresh oauthAccessTokenResponseRefresh = (OauthAccessTokenResponseRefresh) o;
    return Objects.equals(this.accessToken, oauthAccessTokenResponseRefresh.accessToken) &&
        Objects.equals(this.expiresIn, oauthAccessTokenResponseRefresh.expiresIn) &&
        Objects.equals(this.responseType, oauthAccessTokenResponseRefresh.responseType) &&
        Objects.equals(this.scope, oauthAccessTokenResponseRefresh.scope) &&
        Objects.equals(this.tokenType, oauthAccessTokenResponseRefresh.tokenType) &&
        Objects.equals(this.refreshToken, oauthAccessTokenResponseRefresh.refreshToken) &&
        Objects.equals(this.refreshTokenExpiresAt, oauthAccessTokenResponseRefresh.refreshTokenExpiresAt) &&
        Objects.equals(this.refreshTokenExpiresIn, oauthAccessTokenResponseRefresh.refreshTokenExpiresIn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, expiresIn, responseType, scope, tokenType, refreshToken, refreshTokenExpiresAt, refreshTokenExpiresIn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OauthAccessTokenResponseRefresh {\n");
    
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
    sb.append("    responseType: ").append(toIndentedString(responseType)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    refreshTokenExpiresAt: ").append(toIndentedString(refreshTokenExpiresAt)).append("\n");
    sb.append("    refreshTokenExpiresIn: ").append(toIndentedString(refreshTokenExpiresIn)).append("\n");
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

