package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.OauthAccessTokenRequest;
import com.prokarma.pkmst.model.OauthAccessTokenRequestCodeAllOf;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * A request to exchange an authorization code for an access token.
 */
@ApiModel(description = "A request to exchange an authorization code for an access token.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2022-05-07T06:39:36.253940Z[Etc/UTC]")
public class OauthAccessTokenRequestCode extends OauthAccessTokenRequest  {
  @JsonProperty("code")
  private String code;

  @JsonProperty("redirect_uri")
  private String redirectUri;

  public OauthAccessTokenRequestCode code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(required = true, value = "")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public OauthAccessTokenRequestCode redirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
    return this;
  }

   /**
   * Get redirectUri
   * @return redirectUri
  **/
  @ApiModelProperty(required = true, value = "")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

