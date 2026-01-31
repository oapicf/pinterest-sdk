/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.14.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-01-26T05:36:38.375136112Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class OauthAccessTokenRequestClientCredentials   {
  
  private String scope;


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

  /**
   */
  public OauthAccessTokenRequestClientCredentials scope(String scope) {
    this.scope = scope;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("scope")
  public String getScope() {
    return scope;
  }
  public void setScope(String scope) {
    this.scope = scope;
  }

  /**
   */
  public OauthAccessTokenRequestClientCredentials grantType(GrantTypeEnum grantType) {
    this.grantType = grantType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
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
    OauthAccessTokenRequestClientCredentials oauthAccessTokenRequestClientCredentials = (OauthAccessTokenRequestClientCredentials) o;
    return Objects.equals(scope, oauthAccessTokenRequestClientCredentials.scope) &&
        Objects.equals(grantType, oauthAccessTokenRequestClientCredentials.grantType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scope, grantType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OauthAccessTokenRequestClientCredentials {\n");
    
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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

