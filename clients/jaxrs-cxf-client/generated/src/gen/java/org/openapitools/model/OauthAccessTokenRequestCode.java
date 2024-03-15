package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.OauthAccessTokenRequest;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * A request to exchange an authorization code for an access token.
 **/
@ApiModel(description="A request to exchange an authorization code for an access token.")

public class OauthAccessTokenRequestCode extends OauthAccessTokenRequest {
  
  @ApiModelProperty(required = true, value = "")
  private String code;

  @ApiModelProperty(required = true, value = "")
  private String redirectUri;
 /**
   * Get code
   * @return code
  **/
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public OauthAccessTokenRequestCode code(String code) {
    this.code = code;
    return this;
  }

 /**
   * Get redirectUri
   * @return redirectUri
  **/
  @JsonProperty("redirect_uri")
  public String getRedirectUri() {
    return redirectUri;
  }

  public void setRedirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
  }

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
    return Objects.equals(this.code, oauthAccessTokenRequestCode.code) &&
        Objects.equals(this.redirectUri, oauthAccessTokenRequestCode.redirectUri) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, redirectUri, super.hashCode());
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

