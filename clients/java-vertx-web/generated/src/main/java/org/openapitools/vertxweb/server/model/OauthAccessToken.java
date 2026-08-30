package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.TokenGrantType;

/**
 * Describes the valid schema for possible OAuth access token requests.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OauthAccessToken   {
  
  private String accessToken;
  private Integer expiresIn;
  private String refreshToken;
  private Integer refreshTokenExpiresAt;
  private Integer refreshTokenExpiresIn;
  private TokenGrantType responseType;
  private String scope;
  private String tokenType = "bearer";

  public OauthAccessToken () {

  }

  public OauthAccessToken (String accessToken, Integer expiresIn, String refreshToken, Integer refreshTokenExpiresAt, Integer refreshTokenExpiresIn, TokenGrantType responseType, String scope, String tokenType) {
    this.accessToken = accessToken;
    this.expiresIn = expiresIn;
    this.refreshToken = refreshToken;
    this.refreshTokenExpiresAt = refreshTokenExpiresAt;
    this.refreshTokenExpiresIn = refreshTokenExpiresIn;
    this.responseType = responseType;
    this.scope = scope;
    this.tokenType = tokenType;
  }

    
  @JsonProperty("access_token")
  public String getAccessToken() {
    return accessToken;
  }
  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

    
  @JsonProperty("expires_in")
  public Integer getExpiresIn() {
    return expiresIn;
  }
  public void setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
  }

    
  @JsonProperty("refresh_token")
  public String getRefreshToken() {
    return refreshToken;
  }
  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }

    
  @JsonProperty("refresh_token_expires_at")
  public Integer getRefreshTokenExpiresAt() {
    return refreshTokenExpiresAt;
  }
  public void setRefreshTokenExpiresAt(Integer refreshTokenExpiresAt) {
    this.refreshTokenExpiresAt = refreshTokenExpiresAt;
  }

    
  @JsonProperty("refresh_token_expires_in")
  public Integer getRefreshTokenExpiresIn() {
    return refreshTokenExpiresIn;
  }
  public void setRefreshTokenExpiresIn(Integer refreshTokenExpiresIn) {
    this.refreshTokenExpiresIn = refreshTokenExpiresIn;
  }

    
  @JsonProperty("response_type")
  public TokenGrantType getResponseType() {
    return responseType;
  }
  public void setResponseType(TokenGrantType responseType) {
    this.responseType = responseType;
  }

    
  @JsonProperty("scope")
  public String getScope() {
    return scope;
  }
  public void setScope(String scope) {
    this.scope = scope;
  }

    
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
    OauthAccessToken oauthAccessToken = (OauthAccessToken) o;
    return Objects.equals(accessToken, oauthAccessToken.accessToken) &&
        Objects.equals(expiresIn, oauthAccessToken.expiresIn) &&
        Objects.equals(refreshToken, oauthAccessToken.refreshToken) &&
        Objects.equals(refreshTokenExpiresAt, oauthAccessToken.refreshTokenExpiresAt) &&
        Objects.equals(refreshTokenExpiresIn, oauthAccessToken.refreshTokenExpiresIn) &&
        Objects.equals(responseType, oauthAccessToken.responseType) &&
        Objects.equals(scope, oauthAccessToken.scope) &&
        Objects.equals(tokenType, oauthAccessToken.tokenType);
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
