package apimodels;

import apimodels.WebsiteVerificationMethod;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Resource create operation model.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class UserWebsiteCreate   {
  @JsonProperty("verification_method")
  @Valid

  private WebsiteVerificationMethod verificationMethod;

  @JsonProperty("website")
  
  private String website;

  public UserWebsiteCreate verificationMethod(WebsiteVerificationMethod verificationMethod) {
    this.verificationMethod = verificationMethod;
    return this;
  }

   /**
   * Method used to verify website ownership.
   * @return verificationMethod
  **/
  public WebsiteVerificationMethod getVerificationMethod() {
    return verificationMethod;
  }

  public void setVerificationMethod(WebsiteVerificationMethod verificationMethod) {
    this.verificationMethod = verificationMethod;
  }

  public UserWebsiteCreate website(String website) {
    this.website = website;
    return this;
  }

   /**
   * Website with path or domain only
   * @return website
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

