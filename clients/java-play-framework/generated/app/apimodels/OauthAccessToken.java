package apimodels;

import apimodels.TokenGrantType;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Describes the valid schema for possible OAuth access token requests.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OauthAccessToken   {
  @JsonProperty("access_token")
  @NotNull

  private String accessToken;

  @JsonProperty("expires_in")
  @NotNull

  private Integer expiresIn;

  @JsonProperty("refresh_token")
  
  private String refreshToken;

  @JsonProperty("refresh_token_expires_at")
  
  private Integer refreshTokenExpiresAt;

  @JsonProperty("refresh_token_expires_in")
  
  private Integer refreshTokenExpiresIn;

  @JsonProperty("response_type")
  @Valid

  private TokenGrantType responseType;

  @JsonProperty("scope")
  
  private String scope;

  @JsonProperty("token_type")
  @NotNull

  private String tokenType = "bearer";

  public OauthAccessToken accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

   /**
   * Get accessToken
   * @return accessToken
  **/
  public String getAccessToken() {
    return accessToken;
  }

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
  **/
  public Integer getExpiresIn() {
    return expiresIn;
  }

  public void setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
  }

  public OauthAccessToken refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

   /**
   * Get refreshToken
   * @return refreshToken
  **/
  public String getRefreshToken() {
    return refreshToken;
  }

  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }

  public OauthAccessToken refreshTokenExpiresAt(Integer refreshTokenExpiresAt) {
    this.refreshTokenExpiresAt = refreshTokenExpiresAt;
    return this;
  }

   /**
   * Get refreshTokenExpiresAt
   * @return refreshTokenExpiresAt
  **/
  public Integer getRefreshTokenExpiresAt() {
    return refreshTokenExpiresAt;
  }

  public void setRefreshTokenExpiresAt(Integer refreshTokenExpiresAt) {
    this.refreshTokenExpiresAt = refreshTokenExpiresAt;
  }

  public OauthAccessToken refreshTokenExpiresIn(Integer refreshTokenExpiresIn) {
    this.refreshTokenExpiresIn = refreshTokenExpiresIn;
    return this;
  }

   /**
   * Get refreshTokenExpiresIn
   * @return refreshTokenExpiresIn
  **/
  public Integer getRefreshTokenExpiresIn() {
    return refreshTokenExpiresIn;
  }

  public void setRefreshTokenExpiresIn(Integer refreshTokenExpiresIn) {
    this.refreshTokenExpiresIn = refreshTokenExpiresIn;
  }

  public OauthAccessToken responseType(TokenGrantType responseType) {
    this.responseType = responseType;
    return this;
  }

   /**
   * Get responseType
   * @return responseType
  **/
  public TokenGrantType getResponseType() {
    return responseType;
  }

  public void setResponseType(TokenGrantType responseType) {
    this.responseType = responseType;
  }

  public OauthAccessToken scope(String scope) {
    this.scope = scope;
    return this;
  }

   /**
   * Get scope
   * @return scope
  **/
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public OauthAccessToken tokenType(String tokenType) {
    this.tokenType = tokenType;
    return this;
  }

   /**
   * Get tokenType
   * @return tokenType
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

