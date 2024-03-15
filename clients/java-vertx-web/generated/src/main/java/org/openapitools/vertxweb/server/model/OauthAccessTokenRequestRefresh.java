package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.OauthAccessTokenRequest;

/**
 * A request to exchange a refresh token for a new access token.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OauthAccessTokenRequestRefresh extends OauthAccessTokenRequest  {
  
  private String refreshToken;
  private String scope;
  private Boolean refreshOn;

  public OauthAccessTokenRequestRefresh () {

  }

  public OauthAccessTokenRequestRefresh (String refreshToken, String scope, Boolean refreshOn) {
    this.refreshToken = refreshToken;
    this.scope = scope;
    this.refreshOn = refreshOn;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OauthAccessTokenRequestRefresh oauthAccessTokenRequestRefresh = (OauthAccessTokenRequestRefresh) o;
    return super.equals(o) && Objects.equals(refreshToken, oauthAccessTokenRequestRefresh.refreshToken) &&
        Objects.equals(scope, oauthAccessTokenRequestRefresh.scope) &&
        Objects.equals(refreshOn, oauthAccessTokenRequestRefresh.refreshOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), refreshToken, super.hashCode(), scope, super.hashCode(), refreshOn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OauthAccessTokenRequestRefresh {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    refreshOn: ").append(toIndentedString(refreshOn)).append("\n");
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
