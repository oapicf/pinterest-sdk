/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.3.0
 * Maintained by: pinterest-api@pinterest.com
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



/**
 * Describes the valid schema for possible OAuth access token requests.
 */

@ApiModel(description = "Describes the valid schema for possible OAuth access token requests.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2022-05-08T00:32:08.284608Z[Etc/UTC]")
public class OauthAccessTokenRequest   {
  


  public enum GrantTypeEnum {
    AUTHORIZATION_CODE("authorization_code"),
    REFRESH_TOKEN("refresh_token");

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
  public OauthAccessTokenRequest grantType(GrantTypeEnum grantType) {
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
    OauthAccessTokenRequest oauthAccessTokenRequest = (OauthAccessTokenRequest) o;
    return Objects.equals(grantType, oauthAccessTokenRequest.grantType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grantType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OauthAccessTokenRequest {\n");
    
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

