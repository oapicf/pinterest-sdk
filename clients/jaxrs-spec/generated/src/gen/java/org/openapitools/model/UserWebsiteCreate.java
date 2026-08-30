package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.WebsiteVerificationMethod;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Resource create operation model.
 **/
@ApiModel(description = "Resource create operation model.")
@JsonTypeName("UserWebsiteCreate")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class UserWebsiteCreate   {
  private WebsiteVerificationMethod verificationMethod;
  private String website;

  public UserWebsiteCreate() {
  }

  /**
   * Method used to verify website ownership.
   **/
  public UserWebsiteCreate verificationMethod(WebsiteVerificationMethod verificationMethod) {
    this.verificationMethod = verificationMethod;
    return this;
  }

  
  @ApiModelProperty(value = "Method used to verify website ownership.")
  @JsonProperty("verification_method")
  public WebsiteVerificationMethod getVerificationMethod() {
    return verificationMethod;
  }

  @JsonProperty("verification_method")
  public void setVerificationMethod(WebsiteVerificationMethod verificationMethod) {
    this.verificationMethod = verificationMethod;
  }

  /**
   * Website with path or domain only
   **/
  public UserWebsiteCreate website(String website) {
    this.website = website;
    return this;
  }

  
  @ApiModelProperty(value = "Website with path or domain only")
  @JsonProperty("website")
  public String getWebsite() {
    return website;
  }

  @JsonProperty("website")
  public void setWebsite(String website) {
    this.website = website;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserWebsiteCreate userWebsiteCreate = (UserWebsiteCreate) o;
    return Objects.equals(this.verificationMethod, userWebsiteCreate.verificationMethod) &&
        Objects.equals(this.website, userWebsiteCreate.website);
  }

  @Override
  public int hashCode() {
    return Objects.hash(verificationMethod, website);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserWebsiteCreate {\n");
    
    sb.append("    verificationMethod: ").append(toIndentedString(verificationMethod)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
