package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OauthAccessTokenRequestRefreshAllOf  {
  
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

  public OauthAccessTokenRequestRefreshAllOf refreshToken(String refreshToken) {
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

  public OauthAccessTokenRequestRefreshAllOf scope(String scope) {
    this.scope = scope;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OauthAccessTokenRequestRefreshAllOf {\n");
    
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

