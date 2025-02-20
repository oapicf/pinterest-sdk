package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UserWebsiteSummary  {
  
  @ApiModelProperty(example = "mysite.test", value = "Website with path or domain only")
 /**
   * Website with path or domain only
  **/
  private String website;

  @ApiModelProperty(example = "success", value = "Status of the verification process")
 /**
   * Status of the verification process
  **/
  private String status;

  @ApiModelProperty(example = "2022-12-14T21:03:01.602000", value = "UTC timestamp when the verification happened - sometimes missing")
 /**
   * UTC timestamp when the verification happened - sometimes missing
  **/
  private String verifiedAt;
 /**
   * Website with path or domain only
   * @return website
  **/
  @JsonProperty("website")
  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }

  public UserWebsiteSummary website(String website) {
    this.website = website;
    return this;
  }

 /**
   * Status of the verification process
   * @return status
  **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public UserWebsiteSummary status(String status) {
    this.status = status;
    return this;
  }

 /**
   * UTC timestamp when the verification happened - sometimes missing
   * @return verifiedAt
  **/
  @JsonProperty("verified_at")
  public String getVerifiedAt() {
    return verifiedAt;
  }

  public void setVerifiedAt(String verifiedAt) {
    this.verifiedAt = verifiedAt;
  }

  public UserWebsiteSummary verifiedAt(String verifiedAt) {
    this.verifiedAt = verifiedAt;
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
    UserWebsiteSummary userWebsiteSummary = (UserWebsiteSummary) o;
    return Objects.equals(this.website, userWebsiteSummary.website) &&
        Objects.equals(this.status, userWebsiteSummary.status) &&
        Objects.equals(this.verifiedAt, userWebsiteSummary.verifiedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(website, status, verifiedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserWebsiteSummary {\n");
    
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    verifiedAt: ").append(toIndentedString(verifiedAt)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

