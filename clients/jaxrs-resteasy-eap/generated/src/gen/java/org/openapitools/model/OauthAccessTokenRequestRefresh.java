package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OauthAccessTokenRequest;
import org.openapitools.model.OauthAccessTokenRequestRefreshAllOf;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="A request to exchange a refresh token for a new access token.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2022-05-07T06:42:33.868481Z[Etc/UTC]")
public class OauthAccessTokenRequestRefresh extends OauthAccessTokenRequest  {
  

  private String refreshToken;

  private String scope;

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("refresh_token")
  @NotNull
  public String getRefreshToken() {
    return refreshToken;
  }
  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }

  /**
   **/
  
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
    OauthAccessTokenRequestRefresh oauthAccessTokenRequestRefresh = (OauthAccessTokenRequestRefresh) o;
    return Objects.equals(refreshToken, oauthAccessTokenRequestRefresh.refreshToken) &&
        Objects.equals(scope, oauthAccessTokenRequestRefresh.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refreshToken, scope);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

