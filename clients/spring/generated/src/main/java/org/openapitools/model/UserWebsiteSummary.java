package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * UserWebsiteSummary
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T23:15:39.458648915Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class UserWebsiteSummary {

  private String website;

  private String status;

  private String verifiedAt;

  public UserWebsiteSummary website(String website) {
    this.website = website;
    return this;
  }

  /**
   * Website with path or domain only
   * @return website
  */
  
  @Schema(name = "website", example = "mysite.test", description = "Website with path or domain only", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("website")
  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }

  public UserWebsiteSummary status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Status of the verification process
   * @return status
  */
  
  @Schema(name = "status", example = "success", description = "Status of the verification process", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public UserWebsiteSummary verifiedAt(String verifiedAt) {
    this.verifiedAt = verifiedAt;
    return this;
  }

  /**
   * UTC timestamp when the verification happened - sometimes missing
   * @return verifiedAt
  */
  
  @Schema(name = "verified_at", example = "2022-12-14T21:03:01.602000", description = "UTC timestamp when the verification happened - sometimes missing", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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

