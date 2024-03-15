package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.OauthAccessTokenRequest;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * A request to exchange a refresh token for a new access token.
 **/
@ApiModel(description="A request to exchange a refresh token for a new access token.")

public class OauthAccessTokenRequestRefresh extends OauthAccessTokenRequest {
  
  @ApiModelProperty(required = true, value = "")
  private String refreshToken;

  @ApiModelProperty(value = "")
  private String scope;

  @ApiModelProperty(value = "Setting this field to <code>true</code> will add a new refresh token to your 200 response, as well as the refresh_token_expires_in and refresh_token_expires_at fields. To see the structure of this payload, set the 200 response_type to \"everlasting_refresh\".")
 /**
   * Setting this field to <code>true</code> will add a new refresh token to your 200 response, as well as the refresh_token_expires_in and refresh_token_expires_at fields. To see the structure of this payload, set the 200 response_type to \"everlasting_refresh\".
  **/
  private Boolean refreshOn;
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

  public OauthAccessTokenRequestRefresh refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
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

  public OauthAccessTokenRequestRefresh scope(String scope) {
    this.scope = scope;
    return this;
  }

 /**
   * Setting this field to &lt;code&gt;true&lt;/code&gt; will add a new refresh token to your 200 response, as well as the refresh_token_expires_in and refresh_token_expires_at fields. To see the structure of this payload, set the 200 response_type to \&quot;everlasting_refresh\&quot;.
   * @return refreshOn
  **/
  @JsonProperty("refresh_on")
  public Boolean getRefreshOn() {
    return refreshOn;
  }

  public void setRefreshOn(Boolean refreshOn) {
    this.refreshOn = refreshOn;
  }

  public OauthAccessTokenRequestRefresh refreshOn(Boolean refreshOn) {
    this.refreshOn = refreshOn;
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
    OauthAccessTokenRequestRefresh oauthAccessTokenRequestRefresh = (OauthAccessTokenRequestRefresh) o;
    return Objects.equals(this.refreshToken, oauthAccessTokenRequestRefresh.refreshToken) &&
        Objects.equals(this.scope, oauthAccessTokenRequestRefresh.scope) &&
        Objects.equals(this.refreshOn, oauthAccessTokenRequestRefresh.refreshOn) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refreshToken, scope, refreshOn, super.hashCode());
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

