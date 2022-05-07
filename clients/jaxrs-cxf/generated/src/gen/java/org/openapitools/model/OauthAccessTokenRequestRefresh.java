package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import org.openapitools.model.OauthAccessTokenRequest;
import org.openapitools.model.OauthAccessTokenRequestRefreshAllOf;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
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


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OauthAccessTokenRequestRefresh {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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

