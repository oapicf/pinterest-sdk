package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class OauthAccessTokenRequestClientCredentials   {
  
  private String scope;


public enum GrantTypeEnum {

    @JsonProperty("authorization_code") AUTHORIZATION_CODE(String.valueOf("authorization_code")), @JsonProperty("refresh_token") REFRESH_TOKEN(String.valueOf("refresh_token")), @JsonProperty("client_credentials") CLIENT_CREDENTIALS(String.valueOf("client_credentials"));


    private String value;

    GrantTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static GrantTypeEnum fromValue(String value) {
        for (GrantTypeEnum b : GrantTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private GrantTypeEnum grantType;

  /**
   **/
  public OauthAccessTokenRequestClientCredentials scope(String scope) {
    this.scope = scope;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("scope")
  @NotNull
  public String getScope() {
    return scope;
  }
  public void setScope(String scope) {
    this.scope = scope;
  }


  /**
   **/
  public OauthAccessTokenRequestClientCredentials grantType(GrantTypeEnum grantType) {
    this.grantType = grantType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("grant_type")
  @NotNull
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
    return Objects.equals(this.scope, oauthAccessTokenRequestClientCredentials.scope) &&
        Objects.equals(this.grantType, oauthAccessTokenRequestClientCredentials.grantType);
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

