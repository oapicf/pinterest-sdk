package org.openapitools.model;

import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class UserWebsite implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Status of the verification process
   */
  @JsonProperty("status")
  private String status;

  /**
   * UTC timestamp when the verification happened - sometimes missing
   */
  @JsonProperty("verified_at")
  private String verifiedAt;

  /**
   * Website with path or domain only
   */
  @JsonProperty("website")
  private String website;

  /**
   * Status of the verification process
   * @return status
   */
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * UTC timestamp when the verification happened - sometimes missing
   * @return verifiedAt
   */
  public String getVerifiedAt() {
    return verifiedAt;
  }

  public void setVerifiedAt(String verifiedAt) {
    this.verifiedAt = verifiedAt;
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
    UserWebsite userWebsite = (UserWebsite) o;
    return Objects.equals(this.status, userWebsite.status) &&
        Objects.equals(this.verifiedAt, userWebsite.verifiedAt) &&
        Objects.equals(this.website, userWebsite.website);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, verifiedAt, website);
  }

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
