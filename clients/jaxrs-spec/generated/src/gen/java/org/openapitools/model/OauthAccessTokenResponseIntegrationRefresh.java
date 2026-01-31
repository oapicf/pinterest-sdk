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



@JsonTypeName("OauthAccessTokenResponseIntegrationRefresh")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-31T04:55:24.841422791Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class OauthAccessTokenResponseIntegrationRefresh   {
  private String refreshToken;
  private Integer refreshTokenExpiresIn;
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

  public OauthAccessTokenResponseIntegrationRefresh() {
  }

  @JsonCreator
  public OauthAccessTokenResponseIntegrationRefresh(
    @JsonProperty(required = true, value = "refresh_token") String refreshToken,
    @JsonProperty(required = true, value = "refresh_token_expires_in") Integer refreshTokenExpiresIn,
    @JsonProperty(required = true, value = "access_token") String accessToken,
    @JsonProperty(required = true, value = "expires_in") Integer expiresIn,
    @JsonProperty(required = true, value = "scope") String scope,
    @JsonProperty(required = true, value = "token_type") String tokenType
  ) {
    this.refreshToken = refreshToken;
    this.refreshTokenExpiresIn = refreshTokenExpiresIn;
    this.accessToken = accessToken;
    this.expiresIn = expiresIn;
    this.scope = scope;
    this.tokenType = tokenType;
  }

  /**
   **/
  public OauthAccessTokenResponseIntegrationRefresh refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "refresh_token")
  @NotNull public String getRefreshToken() {
    return refreshToken;
  }

  @JsonProperty(required = true, value = "refresh_token")
  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }

  /**
   **/
  public OauthAccessTokenResponseIntegrationRefresh refreshTokenExpiresIn(Integer refreshTokenExpiresIn) {
    this.refreshTokenExpiresIn = refreshTokenExpiresIn;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "refresh_token_expires_in")
  @NotNull public Integer getRefreshTokenExpiresIn() {
    return refreshTokenExpiresIn;
  }

  @JsonProperty(required = true, value = "refresh_token_expires_in")
  public void setRefreshTokenExpiresIn(Integer refreshTokenExpiresIn) {
    this.refreshTokenExpiresIn = refreshTokenExpiresIn;
  }

  /**
   **/
  public OauthAccessTokenResponseIntegrationRefresh accessToken(String accessToken) {
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
  public OauthAccessTokenResponseIntegrationRefresh expiresIn(Integer expiresIn) {
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
  public OauthAccessTokenResponseIntegrationRefresh responseType(ResponseTypeEnum responseType) {
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
  public OauthAccessTokenResponseIntegrationRefresh scope(String scope) {
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
  public OauthAccessTokenResponseIntegrationRefresh tokenType(String tokenType) {
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
    OauthAccessTokenResponseIntegrationRefresh oauthAccessTokenResponseIntegrationRefresh = (OauthAccessTokenResponseIntegrationRefresh) o;
    return Objects.equals(this.refreshToken, oauthAccessTokenResponseIntegrationRefresh.refreshToken) &&
        Objects.equals(this.refreshTokenExpiresIn, oauthAccessTokenResponseIntegrationRefresh.refreshTokenExpiresIn) &&
        Objects.equals(this.accessToken, oauthAccessTokenResponseIntegrationRefresh.accessToken) &&
        Objects.equals(this.expiresIn, oauthAccessTokenResponseIntegrationRefresh.expiresIn) &&
        Objects.equals(this.responseType, oauthAccessTokenResponseIntegrationRefresh.responseType) &&
        Objects.equals(this.scope, oauthAccessTokenResponseIntegrationRefresh.scope) &&
        Objects.equals(this.tokenType, oauthAccessTokenResponseIntegrationRefresh.tokenType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refreshToken, refreshTokenExpiresIn, accessToken, expiresIn, responseType, scope, tokenType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OauthAccessTokenResponseIntegrationRefresh {\n");
    
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    refreshTokenExpiresIn: ").append(toIndentedString(refreshTokenExpiresIn)).append("\n");
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

