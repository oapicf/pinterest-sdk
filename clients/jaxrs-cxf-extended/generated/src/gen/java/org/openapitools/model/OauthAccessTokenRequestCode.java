package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import org.openapitools.model.OauthAccessTokenRequest;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * A request to exchange an authorization code for an access token.
 */
@ApiModel(description="A request to exchange an authorization code for an access token.")

public class OauthAccessTokenRequestCode extends OauthAccessTokenRequest {
  
  @ApiModelProperty(required = true, value = "")
  private String code;

  @ApiModelProperty(required = true, value = "")
  private String redirectUri;
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
    return super.equals(o) && Objects.equals(this.code, oauthAccessTokenRequestCode.code) &&
        Objects.equals(this.redirectUri, oauthAccessTokenRequestCode.redirectUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), code, super.hashCode(), redirectUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OauthAccessTokenRequestCode {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

