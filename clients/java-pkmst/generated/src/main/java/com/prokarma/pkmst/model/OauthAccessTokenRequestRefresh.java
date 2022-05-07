package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.OauthAccessTokenRequest;
import com.prokarma.pkmst.model.OauthAccessTokenRequestRefreshAllOf;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * A request to exchange a refresh token for a new access token.
 */
@ApiModel(description = "A request to exchange a refresh token for a new access token.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2022-05-07T06:39:36.253940Z[Etc/UTC]")
public class OauthAccessTokenRequestRefresh extends OauthAccessTokenRequest  {
  @JsonProperty("refresh_token")
  private String refreshToken;

  @JsonProperty("scope")
  private String scope;

  public OauthAccessTokenRequestRefresh refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

   /**
   * Get refreshToken
   * @return refreshToken
  **/
  @ApiModelProperty(required = true, value = "")
  public String getRefreshToken() {
    return refreshToken;
  }

  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }

  public OauthAccessTokenRequestRefresh scope(String scope) {
    this.scope = scope;
    return this;
  }

   /**
   * Get scope
   * @return scope
  **/
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.refreshToken, oauthAccessTokenRequestRefresh.refreshToken) &&
        Objects.equals(this.scope, oauthAccessTokenRequestRefresh.scope) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refreshToken, scope, super.hashCode());
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

