package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * A successful OAuth access token response.
 **/
@ApiModel(description="A successful OAuth access token response.")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "response_type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = OauthAccessTokenResponseCode.class, name = "authorization_code"),
  @JsonSubTypes.Type(value = OauthAccessTokenResponseEverlastingRefresh.class, name = "everlasting_refresh"),
  @JsonSubTypes.Type(value = OauthAccessTokenResponseIntegrationRefresh.class, name = "integration_refresh"),
  @JsonSubTypes.Type(value = OauthAccessTokenResponseRefresh.class, name = "refresh_token"),
})

public class OauthAccessTokenResponse  {
  
public enum ResponseTypeEnum {

AUTHORIZATION_CODE(String.valueOf("authorization_code")), REFRESH_TOKEN(String.valueOf("refresh_token"));


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

  @ApiModelProperty(value = "")
  private ResponseTypeEnum responseType;

  @ApiModelProperty(required = true, value = "")
  private String accessToken;

  @ApiModelProperty(required = true, value = "")
  private String tokenType = "bearer";

  @ApiModelProperty(required = true, value = "")
  private Integer expiresIn;

  @ApiModelProperty(required = true, value = "")
  private String scope;
 /**
   * Get responseType
   * @return responseType
  **/
  @JsonProperty("response_type")
  public String getResponseType() {
    if (responseType == null) {
      return null;
    }
    return responseType.value();
  }

  public void setResponseType(ResponseTypeEnum responseType) {
    this.responseType = responseType;
  }

  public OauthAccessTokenResponse responseType(ResponseTypeEnum responseType) {
    this.responseType = responseType;
    return this;
  }

 /**
   * Get accessToken
   * @return accessToken
  **/
  @JsonProperty("access_token")
  @NotNull
  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public OauthAccessTokenResponse accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

 /**
   * Get tokenType
   * @return tokenType
  **/
  @JsonProperty("token_type")
  @NotNull
  public String getTokenType() {
    return tokenType;
  }

  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }

  public OauthAccessTokenResponse tokenType(String tokenType) {
    this.tokenType = tokenType;
    return this;
  }

 /**
   * Get expiresIn
   * @return expiresIn
  **/
  @JsonProperty("expires_in")
  @NotNull
  public Integer getExpiresIn() {
    return expiresIn;
  }

  public void setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
  }

  public OauthAccessTokenResponse expiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }

 /**
   * Get scope
   * @return scope
  **/
  @JsonProperty("scope")
  @NotNull
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public OauthAccessTokenResponse scope(String scope) {
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
    OauthAccessTokenResponse oauthAccessTokenResponse = (OauthAccessTokenResponse) o;
    return Objects.equals(this.responseType, oauthAccessTokenResponse.responseType) &&
        Objects.equals(this.accessToken, oauthAccessTokenResponse.accessToken) &&
        Objects.equals(this.tokenType, oauthAccessTokenResponse.tokenType) &&
        Objects.equals(this.expiresIn, oauthAccessTokenResponse.expiresIn) &&
        Objects.equals(this.scope, oauthAccessTokenResponse.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseType, accessToken, tokenType, expiresIn, scope);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OauthAccessTokenResponse {\n");
    
    sb.append("    responseType: ").append(toIndentedString(responseType)).append("\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
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

