package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.WebsiteVerificationMethod;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Resource create operation model.
 */
@ApiModel(description="Resource create operation model.")

public class UserWebsiteCreate  {
  
 /**
  * Method used to verify website ownership.
  */
  @ApiModelProperty(value = "Method used to verify website ownership.")
  @Valid
  private WebsiteVerificationMethod verificationMethod;

 /**
  * Website with path or domain only
  */
  @ApiModelProperty(value = "Website with path or domain only")
  private String website;
 /**
  * Method used to verify website ownership.
  * @return verificationMethod
  */
  @JsonProperty("verification_method")
  public WebsiteVerificationMethod getVerificationMethod() {
    return verificationMethod;
  }

  /**
   * Sets the <code>verificationMethod</code> property.
   */
 public void setVerificationMethod(WebsiteVerificationMethod verificationMethod) {
    this.verificationMethod = verificationMethod;
  }

  /**
   * Sets the <code>verificationMethod</code> property.
   */
  public UserWebsiteCreate verificationMethod(WebsiteVerificationMethod verificationMethod) {
    this.verificationMethod = verificationMethod;
    return this;
  }

 /**
  * Website with path or domain only
  * @return website
  */
  @JsonProperty("website")
  public String getWebsite() {
    return website;
  }

  /**
   * Sets the <code>website</code> property.
   */
 public void setWebsite(String website) {
    this.website = website;
  }

  /**
   * Sets the <code>website</code> property.
   */
  public UserWebsiteCreate website(String website) {
    this.website = website;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

