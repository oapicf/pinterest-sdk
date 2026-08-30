/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.28.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.WebsiteVerificationMethod;



/**
 * Resource create operation model.
 */

@ApiModel(description = "Resource create operation model.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-08-30T09:53:14.631547469Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class UserWebsiteCreate   {
  
  private WebsiteVerificationMethod verificationMethod;
  private String website;

  /**
   * Method used to verify website ownership.
   */
  public UserWebsiteCreate verificationMethod(WebsiteVerificationMethod verificationMethod) {
    this.verificationMethod = verificationMethod;
    return this;
  }

  
  @ApiModelProperty(value = "Method used to verify website ownership.")
  @JsonProperty("verification_method")
  public WebsiteVerificationMethod getVerificationMethod() {
    return verificationMethod;
  }
  public void setVerificationMethod(WebsiteVerificationMethod verificationMethod) {
    this.verificationMethod = verificationMethod;
  }

  /**
   * Website with path or domain only
   */
  public UserWebsiteCreate website(String website) {
    this.website = website;
    return this;
  }

  
  @ApiModelProperty(value = "Website with path or domain only")
  @JsonProperty("website")
  public String getWebsite() {
    return website;
  }
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
    return Objects.equals(verificationMethod, userWebsiteCreate.verificationMethod) &&
        Objects.equals(website, userWebsiteCreate.website);
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

