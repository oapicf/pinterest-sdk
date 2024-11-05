package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * A request to receive a client token.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OauthAccessTokenRequestClientCredentials   {
  


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
  private String scope;

  public OauthAccessTokenRequestClientCredentials () {

  }

  public OauthAccessTokenRequestClientCredentials (GrantTypeEnum grantType, String scope) {
    this.grantType = grantType;
    this.scope = scope;
  }

    
  @JsonProperty("grant_type")
  public GrantTypeEnum getGrantType() {
    return grantType;
  }
  public void setGrantType(GrantTypeEnum grantType) {
    this.grantType = grantType;
  }

    
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
    OauthAccessTokenRequestClientCredentials oauthAccessTokenRequestClientCredentials = (OauthAccessTokenRequestClientCredentials) o;
    return Objects.equals(grantType, oauthAccessTokenRequestClientCredentials.grantType) &&
        Objects.equals(scope, oauthAccessTokenRequestClientCredentials.scope);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
