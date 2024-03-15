package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserWebsiteSummary   {
  
  private String website;
  private String status;
  private String verifiedAt;

  public UserWebsiteSummary () {

  }

  public UserWebsiteSummary (String website, String status, String verifiedAt) {
    this.website = website;
    this.status = status;
    this.verifiedAt = verifiedAt;
  }

    
  @JsonProperty("website")
  public String getWebsite() {
    return website;
  }
  public void setWebsite(String website) {
    this.website = website;
  }

    
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

    
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
    return Objects.equals(website, userWebsiteSummary.website) &&
        Objects.equals(status, userWebsiteSummary.status) &&
        Objects.equals(verifiedAt, userWebsiteSummary.verifiedAt);
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
