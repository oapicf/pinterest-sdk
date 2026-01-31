package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OauthAccessTokenRequestRefresh   {
  
  private String refreshToken;
  private String scope;
  private Boolean refreshOn;


  public enum GrantTypeEnum {
    AUTHORIZATION_CODE("authorization_code"),
    REFRESH_TOKEN("refresh_token"),
    CLIENT_CREDENTIALS("client_credentials");

    private String value;

    GrantTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private GrantTypeEnum grantType;

  public OauthAccessTokenRequestRefresh () {

  }

  public OauthAccessTokenRequestRefresh (String refreshToken, String scope, Boolean refreshOn, GrantTypeEnum grantType) {
    this.refreshToken = refreshToken;
    this.scope = scope;
    this.refreshOn = refreshOn;
    this.grantType = grantType;
  }

    
  @JsonProperty("refresh_token")
  public String getRefreshToken() {
    return refreshToken;
  }
  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }

    
  @JsonProperty("scope")
  public String getScope() {
    return scope;
  }
  public void setScope(String scope) {
    this.scope = scope;
  }

    
  @JsonProperty("refresh_on")
  public Boolean getRefreshOn() {
    return refreshOn;
  }
  public void setRefreshOn(Boolean refreshOn) {
    this.refreshOn = refreshOn;
  }

    
  @JsonProperty("grant_type")
  public GrantTypeEnum getGrantType() {
    return grantType;
  }
  public void setGrantType(GrantTypeEnum grantType) {
    this.grantType = grantType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OauthAccessTokenRequestRefresh oauthAccessTokenRequestRefresh = (OauthAccessTokenRequestRefresh) o;
    return Objects.equals(refreshToken, oauthAccessTokenRequestRefresh.refreshToken) &&
        Objects.equals(scope, oauthAccessTokenRequestRefresh.scope) &&
        Objects.equals(refreshOn, oauthAccessTokenRequestRefresh.refreshOn) &&
        Objects.equals(grantType, oauthAccessTokenRequestRefresh.grantType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refreshToken, scope, refreshOn, grantType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OauthAccessTokenRequestRefresh {\n");
    
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    refreshOn: ").append(toIndentedString(refreshOn)).append("\n");
    sb.append("    grantType: ").append(toIndentedString(grantType)).append("\n");
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
