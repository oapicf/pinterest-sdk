package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2022-05-08T00:27:15.493537Z[Etc/UTC]")
public class OauthAccessTokenRequestCodeAllOf   {
  @JsonProperty("code")
  private String code;

  @JsonProperty("redirect_uri")
  private String redirectUri;

  /**
   **/
  public OauthAccessTokenRequestCodeAllOf code(String code) {
    this.code = code;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("code")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  /**
   **/
  public OauthAccessTokenRequestCodeAllOf redirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("redirect_uri")
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
    OauthAccessTokenRequestCodeAllOf oauthAccessTokenRequestCodeAllOf = (OauthAccessTokenRequestCodeAllOf) o;
    return Objects.equals(code, oauthAccessTokenRequestCodeAllOf.code) &&
        Objects.equals(redirectUri, oauthAccessTokenRequestCodeAllOf.redirectUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, redirectUri);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

