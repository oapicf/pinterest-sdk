package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UserWebsite  {
  
 /**
  * Status of the verification process
  */
  @ApiModelProperty(value = "Status of the verification process")
  private String status;

 /**
  * UTC timestamp when the verification happened - sometimes missing
  */
  @ApiModelProperty(value = "UTC timestamp when the verification happened - sometimes missing")
  private String verifiedAt;

 /**
  * Website with path or domain only
  */
  @ApiModelProperty(value = "Website with path or domain only")
  private String website;
 /**
  * Status of the verification process
  * @return status
  */
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Sets the <code>status</code> property.
   * <br><em>N.B. <code>status</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Sets the <code>status</code> property.
   * <br><em>N.B. <code>status</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public UserWebsite status(String status) {
    this.status = status;
    return this;
  }

 /**
  * UTC timestamp when the verification happened - sometimes missing
  * @return verifiedAt
  */
  @JsonProperty("verified_at")
  public String getVerifiedAt() {
    return verifiedAt;
  }

  /**
   * Sets the <code>verifiedAt</code> property.
   * <br><em>N.B. <code>verifiedAt</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setVerifiedAt(String verifiedAt) {
    this.verifiedAt = verifiedAt;
  }

  /**
   * Sets the <code>verifiedAt</code> property.
   * <br><em>N.B. <code>verifiedAt</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public UserWebsite verifiedAt(String verifiedAt) {
    this.verifiedAt = verifiedAt;
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
  public UserWebsite website(String website) {
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

