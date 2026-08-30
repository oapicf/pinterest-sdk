package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class UserWebsite   {
  @JsonProperty("status")
  private String status;

  @JsonProperty("verified_at")
  private String verifiedAt;

  @JsonProperty("website")
  private String website;

  /**
   * Status of the verification process
   **/
  public UserWebsite status(String status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "Status of the verification process")
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
  public UserWebsite verifiedAt(String verifiedAt) {
    this.verifiedAt = verifiedAt;
    return this;
  }

  
  @ApiModelProperty(value = "UTC timestamp when the verification happened - sometimes missing")
  @JsonProperty("verified_at")
  public String getVerifiedAt() {
    return verifiedAt;
  }
  public void setVerifiedAt(String verifiedAt) {
    this.verifiedAt = verifiedAt;
  }

  /**
   * Website with path or domain only
   **/
  public UserWebsite website(String website) {
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
    UserWebsite userWebsite = (UserWebsite) o;
    return Objects.equals(status, userWebsite.status) &&
        Objects.equals(verifiedAt, userWebsite.verifiedAt) &&
        Objects.equals(website, userWebsite.website);
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

