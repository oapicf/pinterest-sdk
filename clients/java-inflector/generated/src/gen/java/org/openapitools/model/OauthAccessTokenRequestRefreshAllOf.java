package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2022-05-07T06:38:14.669946Z[Etc/UTC]")
public class OauthAccessTokenRequestRefreshAllOf   {
  @JsonProperty("refresh_token")
  private String refreshToken;

  @JsonProperty("scope")
  private String scope;

  /**
   **/
  public OauthAccessTokenRequestRefreshAllOf refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("refresh_token")
  public String getRefreshToken() {
    return refreshToken;
  }
  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }

  /**
   **/
  public OauthAccessTokenRequestRefreshAllOf scope(String scope) {
    this.scope = scope;
    return this;
  }

  
  @ApiModelProperty(value = "")
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
    OauthAccessTokenRequestRefreshAllOf oauthAccessTokenRequestRefreshAllOf = (OauthAccessTokenRequestRefreshAllOf) o;
    return Objects.equals(refreshToken, oauthAccessTokenRequestRefreshAllOf.refreshToken) &&
        Objects.equals(scope, oauthAccessTokenRequestRefreshAllOf.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refreshToken, scope);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

