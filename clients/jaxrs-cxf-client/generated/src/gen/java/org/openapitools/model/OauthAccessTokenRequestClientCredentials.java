package org.openapitools.model;

import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * A request to receive a client token.
 **/
@ApiModel(description="A request to receive a client token.")

public class OauthAccessTokenRequestClientCredentials  {
  
public enum GrantTypeEnum {

AUTHORIZATION_CODE(String.valueOf("authorization_code")), REFRESH_TOKEN(String.valueOf("refresh_token")), CLIENT_CREDENTIALS(String.valueOf("client_credentials"));


    private String value;

    GrantTypeEnum (String v) {
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

  @ApiModelProperty(required = true, value = "")
  private GrantTypeEnum grantType;

  @ApiModelProperty(required = true, value = "")
  private String scope;
 /**
   * Get grantType
   * @return grantType
  **/
  @JsonProperty("grant_type")
  public String getGrantType() {
    if (grantType == null) {
      return null;
    }
    return grantType.value();
  }

  public void setGrantType(GrantTypeEnum grantType) {
    this.grantType = grantType;
  }

  public OauthAccessTokenRequestClientCredentials grantType(GrantTypeEnum grantType) {
    this.grantType = grantType;
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

  public OauthAccessTokenRequestClientCredentials scope(String scope) {
    this.scope = scope;
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
    OauthAccessTokenRequestClientCredentials oauthAccessTokenRequestClientCredentials = (OauthAccessTokenRequestClientCredentials) o;
    return Objects.equals(this.grantType, oauthAccessTokenRequestClientCredentials.grantType) &&
        Objects.equals(this.scope, oauthAccessTokenRequestClientCredentials.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grantType, scope);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OauthAccessTokenRequestClientCredentials {\n");
    
    sb.append("    grantType: ").append(toIndentedString(grantType)).append("\n");
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

