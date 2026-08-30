package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * UserWebsite
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class UserWebsite   {
  @JsonProperty("status")
  
  private String status;

  @JsonProperty("verified_at")
  
  private String verifiedAt;

  @JsonProperty("website")
  
  private String website;

  public UserWebsite status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the verification process
   * @return status
  **/
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public UserWebsite verifiedAt(String verifiedAt) {
    this.verifiedAt = verifiedAt;
    return this;
  }

   /**
   * UTC timestamp when the verification happened - sometimes missing
   * @return verifiedAt
  **/
  public String getVerifiedAt() {
    return verifiedAt;
  }

  public void setVerifiedAt(String verifiedAt) {
    this.verifiedAt = verifiedAt;
  }

  public UserWebsite website(String website) {
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
    UserWebsite userWebsite = (UserWebsite) o;
    return Objects.equals(status, userWebsite.status) &&
        Objects.equals(verifiedAt, userWebsite.verifiedAt) &&
        Objects.equals(website, userWebsite.website);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, verifiedAt, website);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserWebsite {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    verifiedAt: ").append(toIndentedString(verifiedAt)).append("\n");
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

