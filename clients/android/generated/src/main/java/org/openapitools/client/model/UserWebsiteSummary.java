/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class UserWebsiteSummary {
  
  @SerializedName("website")
  private String website = null;
  @SerializedName("status")
  private String status = null;
  @SerializedName("verified_at")
  private String verifiedAt = null;

  /**
   * Website with path or domain only
   **/
  @ApiModelProperty(value = "Website with path or domain only")
  public String getWebsite() {
    return website;
  }
  public void setWebsite(String website) {
    this.website = website;
  }

  /**
   * Status of the verification process
   **/
  @ApiModelProperty(value = "Status of the verification process")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * UTC timestamp when the verification happened - sometimes missing
   **/
  @ApiModelProperty(value = "UTC timestamp when the verification happened - sometimes missing")
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
    return (this.website == null ? userWebsiteSummary.website == null : this.website.equals(userWebsiteSummary.website)) &&
        (this.status == null ? userWebsiteSummary.status == null : this.status.equals(userWebsiteSummary.status)) &&
        (this.verifiedAt == null ? userWebsiteSummary.verifiedAt == null : this.verifiedAt.equals(userWebsiteSummary.verifiedAt));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.website == null ? 0: this.website.hashCode());
    result = 31 * result + (this.status == null ? 0: this.status.hashCode());
    result = 31 * result + (this.verifiedAt == null ? 0: this.verifiedAt.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserWebsiteSummary {\n");
    
    sb.append("  website: ").append(website).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  verifiedAt: ").append(verifiedAt).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
