package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
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

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "response_type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = OauthAccessTokenResponseCode.class, name = "authorization_code"),
  @JsonSubTypes.Type(value = OauthAccessTokenResponseRefresh.class, name = "refresh_token"),
})
/**
 * A successful OAuth access token response.
 **/
@ApiModel(description = "A successful OAuth access token response.")
@JsonTypeName("OauthAccessTokenResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-07-01T12:01:13.464712Z[Etc/UTC]")public class OauthAccessTokenResponse   {
  

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

  private @Valid ResponseTypeEnum responseType;
  private @Valid String accessToken;
  private @Valid String tokenType = "bearer";
  private @Valid Integer expiresIn;
  private @Valid String scope;

  /**
   **/
  public OauthAccessTokenResponse responseType(ResponseTypeEnum responseType) {
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
  public OauthAccessTokenResponse accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

  

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("access_token")
  @NotNull
  public String getAccessToken() {
    return accessToken;
  }

  @JsonProperty("access_token")
  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

/**
   **/
  public OauthAccessTokenResponse tokenType(String tokenType) {
    this.tokenType = tokenType;
    return this;
  }

  

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("token_type")
  @NotNull
  public String getTokenType() {
    return tokenType;
  }

  @JsonProperty("token_type")
  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }

/**
   **/
  public OauthAccessTokenResponse expiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }

  

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("expires_in")
  @NotNull
  public Integer getExpiresIn() {
    return expiresIn;
  }

  @JsonProperty("expires_in")
  public void setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
  }

/**
   **/
  public OauthAccessTokenResponse scope(String scope) {
    this.scope = scope;
    return this;
  }

  

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("scope")
  @NotNull
  public String getScope() {
    return scope;
  }

  @JsonProperty("scope")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

