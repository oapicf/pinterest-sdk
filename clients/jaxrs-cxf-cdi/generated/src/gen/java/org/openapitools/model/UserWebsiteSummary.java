package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class UserWebsiteSummary   {
  
  private String website;

  private String status;

  private String verifiedAt;

  /**
   * Website with path or domain only
   **/
  public UserWebsiteSummary website(String website) {
    this.website = website;
    return this;
  }

  
  @ApiModelProperty(example = "mysite.test", value = "Website with path or domain only")
  @JsonProperty("website")
  public String getWebsite() {
    return website;
  }
  public void setWebsite(String website) {
    this.website = website;
  }


  /**
   * Status of the verification process
   **/
  public UserWebsiteSummary status(String status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(example = "success", value = "Status of the verification process")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }


  /**
   * UTC timestamp when the verification happened - sometimes missing
   **/
  public UserWebsiteSummary verifiedAt(String verifiedAt) {
    this.verifiedAt = verifiedAt;
    return this;
  }

  
  @ApiModelProperty(example = "2022-12-14T21:03:01.602000", value = "UTC timestamp when the verification happened - sometimes missing")
  @JsonProperty("verified_at")
  public String getVerifiedAt() {
    return verifiedAt;
  }
  public void setVerifiedAt(String verifiedAt) {
    this.verifiedAt = verifiedAt;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

