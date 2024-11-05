package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * A request to exchange an authorization code for an access token.
 */
@ApiModel(description="A request to exchange an authorization code for an access token.")

public class OauthAccessTokenRequestCode  {
  
public enum GrantTypeEnum {

    @JsonProperty("authorization_code") AUTHORIZATION_CODE(String.valueOf("authorization_code")),
    @JsonProperty("refresh_token") REFRESH_TOKEN(String.valueOf("refresh_token")),
    @JsonProperty("client_credentials") CLIENT_CREDENTIALS(String.valueOf("client_credentials"));

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
  private String code;

  @ApiModelProperty(required = true, value = "")
  private String redirectUri;
 /**
  * Get grantType
  * @return grantType
  */
  @JsonProperty("grant_type")
  @NotNull
  public String getGrantType() {
    return grantType == null ? null : grantType.value();
  }

  /**
   * Sets the <code>grantType</code> property.
   */
 public void setGrantType(GrantTypeEnum grantType) {
    this.grantType = grantType;
  }

  /**
   * Sets the <code>grantType</code> property.
   */
  public OauthAccessTokenRequestCode grantType(GrantTypeEnum grantType) {
    this.grantType = grantType;
    return this;
  }

 /**
  * Get code
  * @return code
  */
  @JsonProperty("code")
  @NotNull
  public String getCode() {
    return code;
  }

  /**
   * Sets the <code>code</code> property.
   */
 public void setCode(String code) {
    this.code = code;
  }

  /**
   * Sets the <code>code</code> property.
   */
  public OauthAccessTokenRequestCode code(String code) {
    this.code = code;
    return this;
  }

 /**
  * Get redirectUri
  * @return redirectUri
  */
  @JsonProperty("redirect_uri")
  @NotNull
  public String getRedirectUri() {
    return redirectUri;
  }

  /**
   * Sets the <code>redirectUri</code> property.
   */
 public void setRedirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
  }

  /**
   * Sets the <code>redirectUri</code> property.
   */
  public OauthAccessTokenRequestCode redirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
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
    OauthAccessTokenRequestCode oauthAccessTokenRequestCode = (OauthAccessTokenRequestCode) o;
    return Objects.equals(this.grantType, oauthAccessTokenRequestCode.grantType) &&
        Objects.equals(this.code, oauthAccessTokenRequestCode.code) &&
        Objects.equals(this.redirectUri, oauthAccessTokenRequestCode.redirectUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grantType, code, redirectUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OauthAccessTokenRequestCode {\n");
    
    sb.append("    grantType: ").append(toIndentedString(grantType)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    redirectUri: ").append(toIndentedString(redirectUri)).append("\n");
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

