package org.openapitools.model;

import org.openapitools.model.WebsiteVerificationMethod;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Resource create operation model.
 */
public class UserWebsiteCreate implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Method used to verify website ownership.
   */
  @JsonProperty("verification_method")
  private WebsiteVerificationMethod verificationMethod;

  /**
   * Website with path or domain only
   */
  @JsonProperty("website")
  private String website;

  /**
   * Method used to verify website ownership.
   * @return verificationMethod
   */
  public WebsiteVerificationMethod getVerificationMethod() {
    return verificationMethod;
  }

  public void setVerificationMethod(WebsiteVerificationMethod verificationMethod) {
    this.verificationMethod = verificationMethod;
  }

  /**
   * Website with path or domain only
   * @return website
   */
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
