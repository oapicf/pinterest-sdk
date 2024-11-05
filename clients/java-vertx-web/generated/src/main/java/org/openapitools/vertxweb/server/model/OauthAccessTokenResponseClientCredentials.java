package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * A successful OAuth client token response for the client token flow.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OauthAccessTokenResponseClientCredentials   {
  


  public enum ResponseTypeEnum {
    AUTHORIZATION_CODE("authorization_code"),
    REFRESH_TOKEN("refresh_token"),
    CLIENT_CREDENTIALS("client_credentials");

    private String value;

    ResponseTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private ResponseTypeEnum responseType;
  private String accessToken;
  private String tokenType = "bearer";
  private Integer expiresIn;
  private String scope;

  public OauthAccessTokenResponseClientCredentials () {

  }

  public OauthAccessTokenResponseClientCredentials (ResponseTypeEnum responseType, String accessToken, String tokenType, Integer expiresIn, String scope) {
    this.responseType = responseType;
    this.accessToken = accessToken;
    this.tokenType = tokenType;
    this.expiresIn = expiresIn;
    this.scope = scope;
  }

    
  @JsonProperty("response_type")
  public ResponseTypeEnum getResponseType() {
    return responseType;
  }
  public void setResponseType(ResponseTypeEnum responseType) {
    this.responseType = responseType;
  }

    
  @JsonProperty("access_token")
  public String getAccessToken() {
    return accessToken;
  }
  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

    
  @JsonProperty("token_type")
  public String getTokenType() {
    return tokenType;
  }
  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }

    
  @JsonProperty("expires_in")
  public Integer getExpiresIn() {
    return expiresIn;
  }
  public void setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
  }

    
  @JsonProperty("scope")
  public String getScope() {
    return scope;
  }
  public void setScope(String scope) {
    this.scope = scope;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OauthAccessTokenResponseClientCredentials oauthAccessTokenResponseClientCredentials = (OauthAccessTokenResponseClientCredentials) o;
    return Objects.equals(responseType, oauthAccessTokenResponseClientCredentials.responseType) &&
        Objects.equals(accessToken, oauthAccessTokenResponseClientCredentials.accessToken) &&
        Objects.equals(tokenType, oauthAccessTokenResponseClientCredentials.tokenType) &&
        Objects.equals(expiresIn, oauthAccessTokenResponseClientCredentials.expiresIn) &&
        Objects.equals(scope, oauthAccessTokenResponseClientCredentials.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseType, accessToken, tokenType, expiresIn, scope);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OauthAccessTokenResponseClientCredentials {\n");
    
    sb.append("    responseType: ").append(toIndentedString(responseType)).append("\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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
