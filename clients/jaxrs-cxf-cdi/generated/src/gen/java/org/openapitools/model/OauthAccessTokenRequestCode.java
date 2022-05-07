package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OauthAccessTokenRequest;
import org.openapitools.model.OauthAccessTokenRequestCodeAllOf;
import javax.validation.constraints.*;

/**
 * A request to exchange an authorization code for an access token.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "A request to exchange an authorization code for an access token.")
public class OauthAccessTokenRequestCode extends OauthAccessTokenRequest  {
  
  private String code;

  private String redirectUri;


  /**
   **/
  public OauthAccessTokenRequestCode code(String code) {
    this.code = code;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("code")
  @NotNull
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }


  /**
   **/
  public OauthAccessTokenRequestCode redirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("redirect_uri")
  @NotNull
  public String getRedirectUri() {
    return redirectUri;
  }
  public void setRedirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
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
    return Objects.equals(code, oauthAccessTokenRequestCode.code) &&
        Objects.equals(redirectUri, oauthAccessTokenRequestCode.redirectUri) &&
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

