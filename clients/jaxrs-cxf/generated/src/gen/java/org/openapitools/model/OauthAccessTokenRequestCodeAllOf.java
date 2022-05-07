package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OauthAccessTokenRequestCodeAllOf  {
  
  @ApiModelProperty(required = true, value = "")
  private String code;

  @ApiModelProperty(required = true, value = "")
  private String redirectUri;
 /**
   * Get code
   * @return code
  **/
  @JsonProperty("code")
  @NotNull
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public OauthAccessTokenRequestCodeAllOf code(String code) {
    this.code = code;
    return this;
  }

 /**
   * Get redirectUri
   * @return redirectUri
  **/
  @JsonProperty("redirect_uri")
  @NotNull
  public String getRedirectUri() {
    return redirectUri;
  }

  public void setRedirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
  }

  public OauthAccessTokenRequestCodeAllOf redirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OauthAccessTokenRequestCodeAllOf {\n");
    
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

