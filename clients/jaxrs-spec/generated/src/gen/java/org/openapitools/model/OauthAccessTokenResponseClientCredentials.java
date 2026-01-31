package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * A successful OAuth client token response for the client token flow.
 **/
@ApiModel(description = "A successful OAuth client token response for the client token flow.")
@JsonTypeName("OauthAccessTokenResponseClientCredentials")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-31T04:55:24.841422791Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class OauthAccessTokenResponseClientCredentials   {
  private String accessToken;
  private Integer expiresIn;
  public enum ResponseTypeEnum {

    AUTHORIZATION_CODE(String.valueOf("authorization_code")), REFRESH_TOKEN(String.valueOf("refresh_token")), CLIENT_CREDENTIALS(String.valueOf("client_credentials"));


    private String value;

    ResponseTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static ResponseTypeEnum fromString(String s) {
        for (ResponseTypeEnum b : ResponseTypeEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

    @JsonCreator
    public static ResponseTypeEnum fromValue(String value) {
        for (ResponseTypeEnum b : ResponseTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private ResponseTypeEnum responseType;
  private String scope;
  private String tokenType = "bearer";

  public OauthAccessTokenResponseClientCredentials() {
  }

  @JsonCreator
  public OauthAccessTokenResponseClientCredentials(
    @JsonProperty(required = true, value = "access_token") String accessToken,
    @JsonProperty(required = true, value = "expires_in") Integer expiresIn,
    @JsonProperty(required = true, value = "scope") String scope,
    @JsonProperty(required = true, value = "token_type") String tokenType
  ) {
    this.accessToken = accessToken;
    this.expiresIn = expiresIn;
    this.scope = scope;
    this.tokenType = tokenType;
  }

  /**
   **/
  public OauthAccessTokenResponseClientCredentials accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "access_token")
  @NotNull public String getAccessToken() {
    return accessToken;
  }

  @JsonProperty(required = true, value = "access_token")
  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  /**
   **/
  public OauthAccessTokenResponseClientCredentials expiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "expires_in")
  @NotNull public Integer getExpiresIn() {
    return expiresIn;
  }

  @JsonProperty(required = true, value = "expires_in")
  public void setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
  }

  /**
   **/
  public OauthAccessTokenResponseClientCredentials responseType(ResponseTypeEnum responseType) {
    this.responseType = responseType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("response_type")
  public ResponseTypeEnum getResponseType() {
    return responseType;
  }

  @JsonProperty("response_type")
  public void setResponseType(ResponseTypeEnum responseType) {
    this.responseType = responseType;
  }

  /**
   **/
  public OauthAccessTokenResponseClientCredentials scope(String scope) {
    this.scope = scope;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "scope")
  @NotNull public String getScope() {
    return scope;
  }

  @JsonProperty(required = true, value = "scope")
  public void setScope(String scope) {
    this.scope = scope;
  }

  /**
   **/
  public OauthAccessTokenResponseClientCredentials tokenType(String tokenType) {
    this.tokenType = tokenType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "token_type")
  @NotNull public String getTokenType() {
    return tokenType;
  }

  @JsonProperty(required = true, value = "token_type")
  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OauthAccessTokenResponseClientCredentials oauthAccessTokenResponseClientCredentials = (OauthAccessTokenResponseClientCredentials) o;
    return Objects.equals(this.accessToken, oauthAccessTokenResponseClientCredentials.accessToken) &&
        Objects.equals(this.expiresIn, oauthAccessTokenResponseClientCredentials.expiresIn) &&
        Objects.equals(this.responseType, oauthAccessTokenResponseClientCredentials.responseType) &&
        Objects.equals(this.scope, oauthAccessTokenResponseClientCredentials.scope) &&
        Objects.equals(this.tokenType, oauthAccessTokenResponseClientCredentials.tokenType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, expiresIn, responseType, scope, tokenType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OauthAccessTokenResponseClientCredentials {\n");
    
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
    sb.append("    responseType: ").append(toIndentedString(responseType)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
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

