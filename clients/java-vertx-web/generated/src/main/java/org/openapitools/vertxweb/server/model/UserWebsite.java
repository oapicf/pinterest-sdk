package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserWebsite   {
  
  private String status;
  private String verifiedAt;
  private String website;

  public UserWebsite () {

  }

  public UserWebsite (String status, String verifiedAt, String website) {
    this.status = status;
    this.verifiedAt = verifiedAt;
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
